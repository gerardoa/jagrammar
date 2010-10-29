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

    private String classFileName;
    private StringBuilder exList = new StringBuilder();
    private List<JaCompileException> exceptions = new LinkedList<JaCompileException>();

    public ErrorLogger(String className) {
        classFileName = className + ".java";
    }

    public boolean isEmpty() {
        return exList.toString().equals("");
    }

    public void add(JaCompileException ex) {
        exList.append("\n").append(classFileName).append(":").append(ex.getLine()).append(":").append(ex.getPosition()).append(" ").append(ex.getMessage());
    }

    public void add (RuntimeException ex, int line, int pos) {
         exList.append("\n").append(classFileName).append(":").append(line).append(":").append(pos).append(" ").append(ex.getMessage());
    }

    @Override
    public String toString() {
        return exList.toString();
    }
}
