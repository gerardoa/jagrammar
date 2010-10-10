/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class ArrayRequiredException extends JaCompileException {
        private String found;

        public ArrayRequiredException(String found, int line, int pos) {
            super(line, pos);
            this.found = found;
        }

        @Override
	public String getMessage(){
            return "Array required, but " + found + " found";
	}
}
