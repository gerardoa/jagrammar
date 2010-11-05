/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagrammar.typehierarchy.exception;

/**
 *
 * @author IlianaPetrova
 */
public class CyclicInheritanceException extends RuntimeException{

        private String className;

        public CyclicInheritanceException(String className) {
            this.className = className;
        }


        @Override
	public String getMessage(){
		return "Cyclic inheritance involving class " + className;
	}
}