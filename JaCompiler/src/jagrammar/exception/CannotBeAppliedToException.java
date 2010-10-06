/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.typehierarchy;

/**
 *
 * @author Gerardo
 */
public class CannotBeAppliedToException extends JaCompileException {

    private String operator;
    private String op1;
    private String op2;

    public CannotBeAppliedToException(String operator, String op1, String op2, int line, int pos, ReferenceType rt) {
        super(line, pos, rt);
        this.operator = operator;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Operator " + operator + " cannot be applied to " + op1 + ", " + op2;
    }
}
