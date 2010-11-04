/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class InvalidMethodDeclarationException extends JaCompileException {


    public InvalidMethodDeclarationException(int line, int pos) {
        super(line, pos);
    }

    @Override
    public String getMessage() {
        return "Invalid method declaration; return type required";
    }
}
