/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class IllegalArrayInitializerException extends JaCompileException {

        private String type;

        public IllegalArrayInitializerException(String type, int line, int pos) {
            super(line, pos);
            this.type = type;
        }

        @Override
	public String getMessage(){
            return "Illegal initializer for " + type;
	}
}
