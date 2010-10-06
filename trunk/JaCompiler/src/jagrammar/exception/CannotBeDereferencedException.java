/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.exception;

import jagrammar.typehierarchy.*;

/**
 *
 * @author IlianaPetrova
 */
public class CannotBeDereferencedException extends JaCompileException{
        private Type variableType;

        public CannotBeDereferencedException(Type variableType, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.variableType = variableType;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + variableType  + " cannot be dereferenced";
	}
}
