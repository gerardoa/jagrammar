
public class UnacceptableConstructorException extends RuntimeException{

	public String getMessage(){
		return "an attempt was made to add an alrady defined constructor to a class";
	}
	
}