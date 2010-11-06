package jagrammar.util;

import jagrammar.exception.JaCompileException;

/**
 * Accoda gli errori per una specifica classe, generati durante la compilazione
 *
 */
public class ErrorLogger {

    private String classFileName;
    private StringBuilder exList = new StringBuilder();

    public ErrorLogger(String className) {
        classFileName = className + ".java";
    }

    public boolean isEmpty() {
        return exList.toString().equals("");
    }

    // errori durante il type checking
    public void add(JaCompileException ex) {
        exList.append("\n").append(classFileName).append(":").append(ex.getLine()).append(":").append(ex.getPosition()).append(" ").append(ex.getMessage());
    }

    // errori durante la raccolta dell'interfaccia
    public void add(Exception ex, int line, int pos) {
        exList.append("\n").append(classFileName).append(":").append(line).append(":").append(pos).append(" ").append(ex.getMessage());
    }

    // messaggi aggiunti da ANTLR
    public void add(String msg) {
        exList.append("\n").append(classFileName).append(": ANTLR ").append(msg);
    }

    @Override
    public String toString() {
        return exList.toString();
    }
}
