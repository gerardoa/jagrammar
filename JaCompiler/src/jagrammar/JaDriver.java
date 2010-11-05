/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar;

import jagrammar.exception.*;
import jagrammar.typehierarchy.ReferenceType;
import jagrammar.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 *
 * @author Gerardo
 */
public class JaDriver {

    private static class ClassInfo {

        private ClassInfo(CommonTree t, CommonTokenStream tokens, ErrorLogger errorLog) {
            this.t = t;
            this.tokens = tokens;
            this.errorLog = errorLog;
        }
        private CommonTree t;
        private CommonTokenStream tokens;
        private ErrorLogger errorLog;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // percorso dove ricercare le classi java
        String pathname = ".";
        // indice di args dove iniziano i file java
        int fileIndex = 0;
        // controllo l'input dell'utente
        if (args.length == 0) {
            System.err.println("Usage: java -jar JaCompiler.jar -p [<classPath>] <Classe1.java> [<Classe2.java> ...]");
            return;
        }
        if (args[0].equals("-p")) {
            if (args.length > 2) {
                pathname = args[1];
                fileIndex = 2;
            } else {
                System.err.println("-p option: Pathname required or missing input files.");
                return;
            }
        }
        for (int i = fileIndex; i < args.length; i++) {
            String cName = args[i];
            if (!cName.matches("^[A-Za-z]+\\.java$")) {
                System.err.println(cName + " not a valid file name. Must end with .java");
                return;
            }
        }

        // AST restituito dal parser
        JaParser.compilationUnit_return cuTree = null;
        // Mappa delle classi, con chiave il nome della classe
        Map<String, ReferenceType> myClasses = new HashMap<String, ReferenceType>();
        // Mappa degli AST e delle altre strutture necessarie per la seconda fase,
        // con chiave il nome della classe
        Map<String, ClassInfo> myASTs = new HashMap<String, ClassInfo>();
        // Coda contenente i nomi delle classi ancora da analizzare
        Queue<String> todo = new LinkedSetList<String>();
        // Insieme delle classi non valide a causa di errori fatali del parser,
        // o dell'assenza del file
        Set<String> invalidClasses = new HashSet<String>();

        // Inizializzo la tabella con le classi di default
        myClasses.put("Object", ReferenceType.OBJECT);
        myClasses.put("String", ReferenceType.STRING);
        myClasses.put("Class", ReferenceType.CLASS);
        // Inizializzo la coda con i file specificati dall'utente,
        // controllando che non siano Object, String, Class
        for (int i = fileIndex; i < args.length; i++) {
            String className = args[i].substring(0, args[i].lastIndexOf("."));
            if (!myClasses.containsKey(className)) {
                todo.add(className);
            }
        }

        // PRIMA FASE: ciclo per il recupero delle interfaccie
        System.out.println("Start compilation...\n");
        while (!todo.isEmpty()) {
            String className = todo.remove();
            try {
                // Crea un CharStream che legge da un fileInputStream
                ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(pathname + "/" + className + ".java"));
                // Crea il lexer
                JaLexer lexer = new JaLexer(input);
                // Crea un buffer di token dal lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // Crea il parser passandogli il buffer di tokens
                JaParser parser = new JaParser(tokens);
                // Error Logger che memorizzerà gli errori generati sia dal parser che dal tree parser
                ErrorLogger errorLog = new ErrorLogger(className);
                parser.setErrorLogger(errorLog);
                // passo il nome del file per controllarne la coerenza col nome della classe
                parser.setFileName(className);
                // passo la coda per aggiungere referenze a nuove classi trovate
                parser.setQueue(todo);
                // passo la tabella per recuperare referenze a classi o aggiungerne di nuove
                parser.setClassTable(myClasses);
                try {
                    // Inizia il parsing alla regola compilationUnit
                    cuTree = parser.compilationUnit();
                    // recupero e stampa dell'AST
                    CommonTree t = (CommonTree) cuTree.getTree();
                    System.out.println(t.toStringTree());
                    // aggiunta dell'AST e delle altre informazioni necessarie alla fase successiva
                    myASTs.put(className, new ClassInfo(t, tokens, errorLog));
                } catch (RecognitionException ex) {
                    // eccezione fatale generata dal parser, che non è stato ingrado di riprendersi
                    parser.reportError(ex);
                    printErrorLogger(errorLog, true);
                    invalidClasses.add(className);
                }
            } catch (IOException ex) {
                // solitamente perchè il file non è stato trovato
                System.err.println(ex.getMessage());
                /* istanza che rappresenta la classe viene segnalata per la rimozione
                dalla tabella delle interfaccie in quanto tale file risulta inesistente */
                invalidClasses.add(className);
            }
        }

        // rimuovo le classi non valide, poichè non sono state analizzate,
        // oppure lo sono solo parzialmente
        for (String className : invalidClasses) {
            myClasses.remove(className);
        }

        // SECONDA FASE: analisi degli AST generati dalla prima fase: type checking
        for (String className : myASTs.keySet()) {
            ReferenceType rt = myClasses.get(className);
            ClassInfo classInfo = myASTs.get(className);

            // inizializzo le strutture dati necessarie al walker
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(classInfo.t);
            nodes.setTokenStream(classInfo.tokens);
            // inizializzo il walker
            JaWalker walker = new JaWalker(nodes);
            walker.setClassTable(myClasses);
            walker.setReferenceType(rt);
            walker.setErrorLogger(classInfo.errorLog);
            try {
                System.out.println("\n------------Tree parsing for class " + className + "------------");
                walker.compilationUnit();
            } catch (RecognitionException ex) {
                walker.reportError(ex);
            } catch (JaCompileException ex) {
                classInfo.errorLog.add(ex);
            } finally {
                printErrorLogger(classInfo.errorLog);
                System.out.println("----------End Tree Parsing for class " + className + "----------\n");
            }
        }
        System.out.println("-----------------End compilation-----------------");
    }

    private static void printErrorLogger(ErrorLogger el, boolean fatal) {
        String fatalStr = (fatal) ? "\nFatal Errors" : "";
        if (!el.isEmpty()) {
            System.out.flush();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            System.err.println("ERROR LOG:" + fatalStr + el);
            System.err.flush();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    private static void printErrorLogger(ErrorLogger el) {
        printErrorLogger(el, false);
    }
}
