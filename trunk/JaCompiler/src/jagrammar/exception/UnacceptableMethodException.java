package jagrammar.exception;


public class UnacceptableMethodException extends JaCompileException {

        @Override
	public String getMessage(){
		return "an attempt was made to add an unaccettable method to a class";
	}
	
}