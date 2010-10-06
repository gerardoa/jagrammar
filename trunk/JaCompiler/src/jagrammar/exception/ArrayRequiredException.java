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
public class ArrayRequiredException extends JaCompileException {
        private String found;

        public ArrayRequiredException(String found, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.found = found;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Array required, but " + found + " found";
	}
}
