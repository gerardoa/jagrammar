/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.util;

import jagrammar.exception.JaCompileException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author IlianaPetrova
 */
public class ErrorLogger {

    private static class StmtText {
        private StmtText(String text, int exEnd) {
            this.text = text;
            this.exEnd = exEnd;
        }
        private String text;
        private int exEnd;
    }
    private String classFileName;
    private List<JaCompileException> exceptions = new LinkedList<JaCompileException>();
    private List<StmtText> statements = new LinkedList<StmtText>();
    private boolean textRequired = false;

    public ErrorLogger(String className) {
        classFileName = className + ".java";
    }

    public void add(JaCompileException ex) {
        exceptions.add(ex);
        textRequired = true;
    }

    public boolean isTextRequired() {
        return textRequired;
    }

    public void setStmtText(String stmtText) {
        if(textRequired) {
            textRequired = false;
            statements.add(new StmtText(stmtText, exceptions.size()));
        }
    }

    @Override
    public String toString() {
        StringBuilder exList = new StringBuilder();
//        Iterator<StmtText> iterator = statements.iterator();
//        StmtText st = iterator.hasNext()?iterator.next():null;
//        int i = 1;
        for(JaCompileException ex : exceptions) {
//            if (i > st.exEnd) {
//                st = iterator.next();
//            }
            exList.append(classFileName).append(":").append(ex.getLine()).append(":").append(ex.getPosition()).append(" ").append(ex.getMessage()).append("\n");
            //i++;
        }
        return exList.toString();
    }

}
