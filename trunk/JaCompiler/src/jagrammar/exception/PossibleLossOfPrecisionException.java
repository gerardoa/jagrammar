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
public class PossibleLossOfPrecisionException extends JaCompileException {
        private String required;
        private String found;

        public PossibleLossOfPrecisionException(String required, String found, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.required = required;
            this.found = found;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Possible loss of precision. Required: " + required + "; Found: " + found;
	}
}
