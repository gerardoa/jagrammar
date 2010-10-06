/*
 *	Eccezione sollevata quando sobraggiunge
 *      un errore in fase di Early Binding, come
 *      un'illecita chiamata a metodo
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *
 */
package jagrammar.exception;


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