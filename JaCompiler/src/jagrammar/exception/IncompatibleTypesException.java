/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class IncompatibleTypesException extends JaCompileException {
        private String required;
        private String found;

        public IncompatibleTypesException(String required, String found, int line, int pos) {
            super(line, pos);
            this.required = required;
            this.found = found;
        }

        @Override
	public String getMessage(){
            return "Incompatible Types. Required: " + required + "; Found: " + found;
	}
}
