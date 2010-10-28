/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.util;

import jagrammar.exception.JaCompileException;
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

    public ErrorLogger(String className) {
        classFileName = className + ".java";
    }

    public boolean isEmpty() {
        return exceptions.isEmpty();
    }

    public void add(JaCompileException ex) {
        exceptions.add(ex);
    }


    @Override
    public String toString() {
        StringBuilder exList = new StringBuilder();
        for (JaCompileException ex : exceptions) {
            exList.append("\n").append(classFileName).append(":").append(ex.getLine()).append(":").append(ex.getPosition()).append(" ").append(ex.getMessage());
        }
        return exList.toString();
    }
}
