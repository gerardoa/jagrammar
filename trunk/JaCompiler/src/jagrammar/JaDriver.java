/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar;

import jagrammar.exception.*;
import jagrammar.typehierarchy.ReferenceType;
import jagrammar.util.LinkedSetList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
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

    private static class TreeTokensPair {

        private TreeTokensPair(CommonTree t, CommonTokenStream tokens) {
            this.t = t;
            this.tokens = tokens;
        }
        private CommonTree t;
        private CommonTokenStream tokens;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        args = new String[]{"Test"}; //DEBUG purpose
        String pathname = "testja";
        JaParser.compilationUnit_return cuTree = null;
        System.out.println("Start compilation...\n");
        // Mappa delle classi, con chiave il nome della classe
        Map<String, ReferenceType> myclasses = new HashMap<String, ReferenceType>();
        // Mappa degli AST generati con chiave il nome della classe
        Map<String, TreeTokensPair> myASTs = new HashMap<String, TreeTokensPair>();
        // Coda contenente i percorsi ai file delle classi da analizzare
        Queue<String> todo = new LinkedSetList<String>();
        todo.addAll(Arrays.asList(args));

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
                myASTs.put(className, new TreeTokensPair(t, tokens));

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
            TreeTokensPair pair = myASTs.get(className);
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(pair.t);
            nodes.setTokenStream(pair.tokens);

            JaWalker walker = new JaWalker(nodes);
            walker.setClassTable(myclasses);
            walker.setReferenceType(rt);
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
