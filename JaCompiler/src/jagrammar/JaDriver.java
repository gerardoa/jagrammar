/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar;

import jagrammar.typehierarchy.ReferenceType;
import jagrammar.util.LinkedSetList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Gerardo
 */
public class JaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JaParser.compilationUnit_return cuTree = null;
        System.out.println("Start...");
        Map<String, ReferenceType> myclasses = new HashMap<String, ReferenceType>();
        Queue<String> q = new LinkedSetList();
//        for (String s : args) {
//            q.add(s);
//        }
        q.add("testja/A");



        while (!q.isEmpty()) {

            String pathname = q.remove();
            // create a CharStream that reads from standard input
            ANTLRInputStream input = null;
            try {

                input = new ANTLRInputStream(new FileInputStream(pathname+".java"));
            } catch (IOException ex) {
                Logger.getLogger(JaDriver.class.getName()).log(Level.SEVERE, null, ex);
            }

            // create a lexer that feeds off of input CharStream
            JaLexer lexer = new JaLexer(input);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            JaParser parser = new JaParser(tokens);
            parser.setQueue(q);
            parser.setClassTable(myclasses);
            /*String className = pathname.substring(0, pathname.lastIndexOf('.'));
            ReferenceType rt = new ReferenceType(className);*/
            //parser.setReferenceType(rt);
            try {
                // begin parsing at rule r
                cuTree = parser.compilationUnit();
                //gia aggiunto nel parser myclasses.put(className, rt);
            } catch (RecognitionException ex) {
                Logger.getLogger(JaDriver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(((Tree) cuTree.getTree()).toStringTree());
    }
}
