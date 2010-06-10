/*
*	interfaccia cardine della gerarchia
*	dei tipi di Ja. Rappresenta un tipo del
*	linguaggio.
*
*/


public interface Type{

	public boolean isNumeric();
	
	public boolean isBasic();
	
	public boolean isArray();
	
	public boolean isNull();
	
	public boolean isVoid();
	
	public boolean isReference();
	
	public boolean isComplexType();
	
	/*
	*	ritorna TRUE se il tipo this � assegnabile
	*	a t senza ricorrere ad operazioni di cast;
	*	FALSE altrimenti
	*/
	public boolean isAssignableTo(Type t);
		
	/*
	*	ritorna TRUE se il tipo this � assegnabile
	*	a t ricorrendo ad un'operazione di cast;
	*	FALSE altrimenti
	*/
	public boolean isCastableTo(Type t);
	
	/*
	*	ritorna TRUE se il tipo this � sottotipo
	*	del tipo di t. FALSE altrimenti
	*/
	public boolean isSubtypeOf(Type t);
	
	//NULL
	public static final Type NULL = NullType.TYPE;
	
	//VOID
	public static final Type VOID = VoidType.TYPE;
	
}