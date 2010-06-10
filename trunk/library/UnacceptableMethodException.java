
public class UnacceptableMethodException extends RuntimeException{

	public String getMessage(){
		return "an attempt was made to add an unaccettable method to a class";
	}
	
}