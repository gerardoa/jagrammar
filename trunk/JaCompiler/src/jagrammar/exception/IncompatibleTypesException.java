/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

import jagrammar.typehierarchy.*;

/**
 *
 * @author Gerardo
 */
public class IncompatibleTypesException extends JaCompileException {
        private String required;
        private String found;

        public IncompatibleTypesException(String required, String found, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.required = required;
            this.found = found;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Incompatible Types. Required: " + required + "; Found: " + found;
	}
}
