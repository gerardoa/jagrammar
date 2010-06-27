/*
 *	interfaccia cardine della gerarchia
 *	dei tipi di Ja. Rappresenta un tipo del
 *	linguaggio.
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see BasicType
 *      @see ComplexType
 *      @see ArrayType
 *      @see ReferenceType
 *      @see NullType
 *      @see VoidType
 */
package jagrammar.typehierarchy;

public interface Type{

	public boolean isNumeric();
	
	public boolean isBasic();
	
	public boolean isArray();
	
	public boolean isNull();
	
	public boolean isVoid();
	
	public boolean isReference();
	
	public boolean isComplexType();
	
	/*
	*	ritorna TRUE se il tipo this è assegnabile
	*	a t senza ricorrere ad operazioni di cast;
	*	FALSE altrimenti
	*/
	public boolean isAssignableTo(Type t);
		
	/*
	*	ritorna TRUE se il tipo this è assegnabile
	*	a t ricorrendo ad un'operazione di cast;
	*	FALSE altrimenti
	*/
	public boolean isCastableTo(Type t);
	
	/*
	*	ritorna TRUE se il tipo this è sottotipo
	*	del tipo di t. FALSE altrimenti
	*/
	public boolean isSubtypeOf(Type t);
	
	//NULL
	public static final Type NULL = NullType.TYPE;
	
	//VOID
	public static final Type VOID = VoidType.TYPE;
	
}