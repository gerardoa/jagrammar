/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.typehierarchy;

/**
 *
 * @author Gerardo
 */
public class UnacceptableLocalVariableException extends RuntimeException {

        private String variableName;
        public UnacceptableLocalVariableException(String variableName) {
            this.variableName = variableName;
        }

        @Override
	public String getMessage(){
            return "Local variable " + variableName + " is already defined.";
	}
}
