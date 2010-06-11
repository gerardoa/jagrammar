/*
 *	il tipo VOID di Ja.
 *
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see Type
 *
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

        //unica istanza di questa classe
	public static final VoidType TYPE = new VoidType();
}