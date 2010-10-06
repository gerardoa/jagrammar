/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.typehierarchy;

/**
 *
 * @author Gerardo
 */
public class InconvertibleTypesException extends JaCompileException {

    private String required;
    private String found;

    public InconvertibleTypesException(String required, String found, int line, int pos, ReferenceType rt) {
        super(line, pos, rt);
        this.required = required;
        this.found = found;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Inconvertible types. Required: " + required + "; Found: " + found;
    }
}
