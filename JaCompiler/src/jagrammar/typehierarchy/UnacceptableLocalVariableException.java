/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.typehierarchy;


/**
 *
 * @author Gerardo
 */
public class UnacceptableLocalVariableException extends JaCompileException {

        private String variableName;
        private String methodName;

        public UnacceptableLocalVariableException(String variableName, String methodName, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.variableName = variableName;
            this.methodName = methodName;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Local variable " + variableName + " is already defined in " + methodName + ".";
	}
}
