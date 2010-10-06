/*
 *	Eccezione sollevata quando si fornisce
 *	un tipo ospite inadatto ad un ArrayType
 *	(es: VOID, NULL)
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	
 */
package jagrammar.exception;


public class BadHostTypeException extends RuntimeException{
	
        @Override
	public String getMessage(){
		return "invalid Array host type." +
				"Expected one of: ReferenceType, " +
				"ArrayType, BasicType";
	}
	
}