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

    private List<JaCompileException> exceptions = new LinkedList<JaCompileException>();

    public void add(JaCompileException ex) {
        exceptions.add(ex);
    }

    @Override
    public String toString() {
        StringBuilder exList = new StringBuilder();
        for(JaCompileException ex : exceptions) {
            exList.append(ex.getMessage()).append("\n");
        }
        return exList.toString();
    }

}
