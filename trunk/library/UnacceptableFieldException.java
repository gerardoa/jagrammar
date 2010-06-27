package jagrammar.typehierarchy;

public class UnacceptableFieldException extends RuntimeException{

        @Override
	public String getMessage(){
		return "an attempt was made to add an alrady defined field to a class";
	}
	
}