/*
*	il tipo VOID di Ja.
*/

public class VoidType implements Type{

	private VoidType(){}

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
		return false;
	}
	
	public boolean isVoid(){
		return true;
	}
	
	public boolean isReference(){
		return false;
	}
	
	public boolean isComplexType(){
		return false;
	}
	
	public boolean isAssignableTo(Type t){
		return false;
	}
	
	public boolean isCastableTo(Type t){
		return false;
	}
	
	public boolean isSubtypeOf(Type t){
		return false;
	}
	
	public static final VoidType TYPE = new VoidType();
}