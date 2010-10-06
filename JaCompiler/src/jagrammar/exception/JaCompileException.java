/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.exception;

import jagrammar.typehierarchy.*;
/**
 *
 * @author IlianaPetrova
 */
public class JaCompileException extends RuntimeException {

    protected int line;
    protected int pos;
    protected ReferenceType rt;

    public JaCompileException() {
    }

    public JaCompileException(int line, int pos, ReferenceType rt) {
        this.line = line;
        this.pos = pos;
        this.rt = rt;
    }

    @Override
    public String getMessage() {
        return rt + ".java:" + line + ":" + pos + "  ";
    }
}
