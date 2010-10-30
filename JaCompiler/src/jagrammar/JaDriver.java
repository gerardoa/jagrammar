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
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        //args = new String[]{"Test"}; //DEBUG purpose
        String pathname = ".";
        int fileIndex = 0;
        if( args.length == 0 ) {
            System.err.println("Usage: java -jar JaCompiler.jar -p [<classPath>] <Classe1.java> [<Classe2.java> ...]");
            return;
        }

        if (args[0].equals("-p")) {
            if(args.length > 2) {
                pathname = args[1];
                fileIndex = 2;
            } else {
               System.err.println("-p option: Pathname required or missing input files.");
               return;
            }
        }
        for(int i = fileIndex; i < args.length; i++) {
            String cName = args[i];
            if (!cName.matches("^[A-Za-z]+\\.java$")) {
                System.err.println(cName + " not a valid file name. Must end with .java");
                return;
            }
        }

        JaParser.compilationUnit_return cuTree = null;
        System.out.println("Start compilation...\n");
        // Mappa delle classi, con chiave il nome della classe
        Map<String, ReferenceType> myclasses = new HashMap<String, ReferenceType>();
        myclasses.put("Object", ReferenceType.OBJECT);
        myclasses.put("String", ReferenceType.STRING);
        myclasses.put("Class", ReferenceType.CLASS);
        // Mappa degli AST generati con chiave il nome della classe
        Map<String, ClassInfo> myASTs = new HashMap<String, ClassInfo>();
        // Coda contenente i percorsi ai file delle classi da analizzare
        Queue<String> todo = new LinkedSetList<String>();
        // Controllo se i file da analizzare non sono Object, String, Class
        for(int i = fileIndex; i < args.length; i++) {
            String cName = args[i];
            cName = cName.substring(0, cName.lastIndexOf("."));
            if (!myclasses.containsKey(cName))
                todo.add(cName);
        }

        // PRIMA FASE: ciclo per il recupero delle interfaccie
        while (!todo.isEmpty()) {
            String className = todo.remove();
            // Crea un CharStream che legge da un fileInputStream
            ANTLRInputStream input = null;
            try {
                input = new ANTLRInputStream(new FileInputStream(pathname + "/" + className + ".java"));

                // Crea il lexer
                JaLexer lexer = new JaLexer(input);
                // Crea un buffer di token dal lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                // Crea il parser passandogli il buffer di tokens
                JaParser parser = new JaParser(tokens);
                parser.setQueue(todo);
                parser.setClassTable(myclasses);
                try {
                    // Inizia il parsing alla regola compilationUnit
                    cuTree = parser.compilationUnit();
                } catch (RecognitionException ex) {
                    Logger.getLogger(JaDriver.class.getName()).log(Level.SEVERE, null, ex);
                }
                // recupero e stampa dell'AST
                CommonTree t = (CommonTree) cuTree.getTree();
                System.out.println(t.toStringTree());
                myASTs.put(className, new ClassInfo(t, tokens, parser.getErrorLogger()));

            } catch (IOException ex) {
                //Logger.getLogger(JaDriver.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println(ex.getMessage());
                /* istanza che rappresenta la classe viene rimossa dalla tabella
                   delle interfaccie in quanto tale file risulta inesistente */
                myclasses.remove(className);
            }
        }


        // SECONDA FASE: analisi degli AST generati dalla prima fase; type checking
        for (String className : myASTs.keySet()) {
            ReferenceType rt = myclasses.get(className);
            ClassInfo pair = myASTs.get(className);
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(pair.t);
            nodes.setTokenStream(pair.tokens);

            JaWalker walker = new JaWalker(nodes);
            walker.setClassTable(myclasses);
            walker.setReferenceType(rt);
            walker.setErrorLogger(pair.errorLog);
            try {
                System.out.println("\n------------Tree parsing for class " + className + "------------");
                walker.compilationUnit();
                System.out.println("----------End Tree Parsing for class " + className + "----------\n");
            } catch (RecognitionException ex) {
                Logger.getLogger(JaDriver.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JaCompileException ex) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.println("-----------------End compilation-----------------");
    }
}