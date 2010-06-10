/*
*	il tipo NULL di Ja.
*/

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
		//null è castabile agli stessi tipi ai quali è assegnabile
		return isAssignableTo(t);
	}
	
	public boolean isSubtypeOf(Type t){
		return false;
	}
	
	public static final NullType TYPE = new NullType();
}