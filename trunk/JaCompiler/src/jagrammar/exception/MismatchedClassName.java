/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class MismatchedClassName extends JaCompileException {

    private String className;
    public MismatchedClassName(String className, int line, int pos) {
        super(line, pos);
        this.className = className;
    }

    @Override
    public String getMessage() {
        return "class " + className + " is public, should be declared in a file named " + className + ".java";
    }
}
