/*
*	Generico tipo complesso del linguaggio Ja
*/
package jagrammar.typehierarchy;

public abstract class ComplexType implements Type{
	
	public boolean isNumeric(){
		return false;
	}
	
	public boolean isBasic(){
		return false;
	}
	
	public abstract boolean isArray();
	
	public boolean isNull(){
		return false;
	}
	
	public boolean isVoid(){
		return false;
	}
	
	public abstract boolean isReference();
	
	public boolean isComplexType(){
		return true;
	}
		
	public boolean isAssignableTo(Type t){
		return isSubtypeOf(t);
	}
	
	public boolean isCastableTo(Type t){
		if (!t.isComplexType())
			return false;
		ComplexType c = (ComplexType) t;
		return ((isSubtypeOf(c)) || (c.isSubtypeOf(this))); 
	}
	
	public abstract boolean isSubtypeOf(Type t);

}