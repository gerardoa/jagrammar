/*
 *	Eccezione sollevata quando si fornisce
 *	un tipo ospite inadatto ad un ArrayType
 *	(es: VOID, NULL)
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *
 */


public class UnacceptableConstructorException extends RuntimeException{

        @Override
	public String getMessage(){
		return "an attempt was made to add an alrady defined constructor to a class";
	}
	
}