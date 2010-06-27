package jagrammar.typehierarchy;

public class UnacceptableMethodException extends RuntimeException{

        @Override
	public String getMessage(){
		return "an attempt was made to add an unaccettable method to a class";
	}
	
}