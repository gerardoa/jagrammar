/*
*	Eccezione sollevata quando si fornisce
*	un tipo ospite inadatto ad un ArrayType
*	(es: VOID, NULL)
*/

public class BadHostTypeException extends RuntimeException{
	
	public String getMessage(){
		return "invalid Array host type." +
				"Expected one of: ReferenceType, " +
				"ArrayType, BasicType";
	}
	
}