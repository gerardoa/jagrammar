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

public class CannotFindSymbolException extends JaCompileException {

        private String symbol;
        private String location;

        public CannotFindSymbolException(String symbol, String location, int line, int pos, ReferenceType rt) {
            super(line, pos, rt);
            this.symbol = symbol;
            this.location = location;
        }

        @Override
	public String getMessage(){
            return super.getMessage() + "Cannot find symbol " + symbol + " in " + location;
	}
}