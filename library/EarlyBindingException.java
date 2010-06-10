import java.util.List;

public class EarlyBindingException extends RuntimeException{
	/*
	public EarlyBindingException(String name,List<Type> args){
		super ("does not exists a signature compatible with the call: " + new Call(name,args));
	}
	
	
	private static class Call{

		Call(String n,List<Type> a){
			this.n = n;
			this.a = a;
		}
	
		public String toString(){
			String call = n + "(";
			for (Type t : a)
				call += ' ' + t.toString();
			call += " )";
			return call;
		}
	
		String n;
		List<Type> a;
	}*/
}