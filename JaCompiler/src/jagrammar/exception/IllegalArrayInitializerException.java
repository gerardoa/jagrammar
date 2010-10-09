/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

import jagrammar.typehierarchy.ReferenceType;

/**
 *
 * @author Gerardo
 */
public class IllegalArrayInitializerException extends JaCompileException {

        private String type;

        public IllegalArrayInitializerException(String type, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.type = type;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Illegal initializer for " + type;
	}
}
