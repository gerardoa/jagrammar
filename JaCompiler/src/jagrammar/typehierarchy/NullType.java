/*
 *	il tipo NULL di Ja.
 *
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see Type
 *
 */
package jagrammar.typehierarchy;

public class NullType implements Type{

	private NullType(){}
	
	public boolean isNumeric(){
		return false;
	}
	
	public boolean isBasic(){
		return false;
	}
	
	public boolean isArray(){
		return false;
	}
	
	public boolean isNull(){
		return true;
	}
	
	public boolean isVoid(){
		return false;
	}
	
	public boolean isReference(){
		return false;
	}
	
	public boolean isComplexType(){
		return false;
	}
	
	public boolean isAssignableTo(Type t){
		if (t.isBasic()) return false;
		if (t.isNull()) return false;
		if (t.isVoid()) return false;
		return true;
	}
	
	public boolean isCastableTo(Type t){
		//null � castabile agli stessi tipi ai quali � assegnabile
		return isAssignableTo(t);
	}
	
	public boolean isSubtypeOf(Type t){
		return false;
	}

        //unica istanza di questa classe
	public static final NullType TYPE = new NullType();
}