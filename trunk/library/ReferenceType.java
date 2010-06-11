/*
*	Un tipo reference del linguaggio Ja
*	
*	@author Gaetano Pellegrino
*	@version 1.0 11/06/2010
*	@see Type
*	@see ComplexType
*
*/


import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class ReferenceType extends ComplexType{

	public ReferenceType(String n){
		if (!n.equals("Object")) 
			superClass = OBJECT;
		name = n;
		methods = new HashMap<String, Set<Method>>();
		fields = new HashMap<String,Field>();
		constructors = new LinkedList<Constructor>();
	}
	
	public ReferenceType(String n, ReferenceType sClass){
		this(n);
		superClass = sClass;
	}
	
	public boolean isArray(){
		return false;
	}
	
	public boolean isReference(){
		return true;
	}
	
	public boolean isSubtypeOf(Type t){
		if (equals(t)) return true;
		if (!t.isReference())
			return false;
		return superClass.isSubtypeOf(t);
	}
	
	public ReferenceType getSuperClass(){
		return superClass;
	}
	
	public void setSuperClass(ReferenceType r){
		superClass = r;
	}
	
	//gestione metodi
	//un method è iterabile sul tipo dei suoi parametri
	private class Method implements Iterable<Type>{
	
		//JAVADOC: uso l'arraylist perché ho bisogno dell'accesso posizionale
		private Method(boolean v, String n, Type r, ArrayList<Type> p){
			isPublic = v;
			name = n;
			returnType = r;
			arguments = p;
		}
		
		//JAVADOC: specificare che equals ed hashcode considerano solo
		//nome del metodo e lista dei parametrici
		public boolean equals(Object x){
			if (x == null) return false;
			if (this == x) return true;
			if (!(x instanceof Method)) return false;
			Method m = (Method) x;
			if (!m.name.equals(name))
				return false;
			int i = 0;
			for (Type t : m)
				if (!t.equals(arguments.get(i++)))
					return false;
			return true;
		}
		
		public Iterator<Type> iterator(){
			return arguments.iterator();
		}
		
		public int hashCode(){
			int res = name.hashCode();
			int pos = 1;
			for (Type t : arguments){
				res ^= t.hashCode();
				//hashCode deve tenere presente la posizione del parametro!
				//shiftiamo circolarmente in base alla posizione
				res = (res >> pos) | (res << (32 - pos));
				pos++;
			}
			return res; 
		}
		
		//JAVADOC: 	call deve essere sempre istanziata (all'occorrenza essere senza elementi)
		//			inoltre call deve essere un ArrayList per avere l'accesso posizionale
		private boolean isCompatibleWith(ArrayList<Type> call){
			if (call.isEmpty())
				return (arguments.isEmpty());
			int i = 0;
			for (Type t : call)
				if (!t.isAssignableTo(arguments.get(i++)))//assignableTo deve essere riflessivo
					return false;
			return true;
		}
		
		private final boolean isPublic;
		private final String name;
		private final Type returnType;
		private ArrayList<Type> arguments;
	}
	
	//EDIT: javadoc
	public void addMethod(boolean pub, Type ret, String name, ArrayList<Type> args){			
		Method m = new Method(pub,name,ret,args);
		if (superClass != null) 
			//parto dalla superclasse diretta. Il controllo locale lo faccio dopo
			superClass.checksOverriding(m);
		Set<Method> s = methods.get(name);
		if (s == null){
			s = new HashSet<Method>();
			s.add(m);
			methods.put(name,s);
			return;
		}
		if (s.contains(m))
			throw new UnacceptableMethodException();
		s.add(m);
	}
	
	
	private void checksOverriding(Method m){
		Set<Method> l = methods.get(m.name);
		if (l == null)
			return;
		for (Method am : l)
			if (am.equals(m)){
				//verifica le visibilità
				if ((am.isPublic) && (!m.isPublic))
					throw new VisibilityOverridingException();
				//verifica il tipo di ritorno
				if (!m.returnType.isSubtypeOf(am.returnType))
					throw new ReturnTypeOverridingException();
				//mi posso fermare perché in una classe non ci possono essere altri
				//metodi con questa firma
				return;
			}
		if (this != OBJECT) 
			superClass.checksOverriding(m);
	}
	
	//scrivere in JAVADOC cosa succede in questo metodo, cosa restituisce
	//se non c'è nessuna firma candidata
	private List<Method> getCandidateSignatures(boolean isSameClass, String name, ArrayList<Type> args){
		List<Method> ret = new LinkedList<Method>();
		Set<Method> l = methods.get(name);
		if (l == null)
			return ret;
		for (Method am : l)
			if ((am.isPublic || isSameClass) && (am.isCompatibleWith(args)))
				ret.add(am);
		if (this != OBJECT)
			ret.addAll(superClass.getCandidateSignatures(false,name,args));
		return ret;
	}
	
	//JAVADOC
	public void bindMethod(boolean isSameClass, String name, ArrayList<Type> args){
		//genero la lista delle firme candidate
		//se c'è una firma più specifica delle altre ritorno.
		//altrimenti lancio un'eccezione
		List<Method> candL = getCandidateSignatures(isSameClass,name,args);
		//OTTIMIZZAZIONI:
		//se la lista è vuota o ha un solo elemento siamo in un caso base
		//se è vuota, lancio un'eccezione
		//se c'è un elemento ritorno semplicemente
		if (candL.isEmpty())
			throw new EarlyBindingException(/*name,args*/);
		if (candL.size() == 1)
			return;
		//CASO GENERICO:
		Method[] candA = (Method[]) candL.toArray();
		boolean[] skip = new boolean[candA.length];
		boolean mostSpecific = false;
		for (int i = 0; i < candA.length; i++){
			int count = 0;
			if (skip[i])
				continue;
			for (int j = 0; j < candA.length; j++){
				//se I NON è più specifico di J allora sicuramente
				//non è la firma più specifica, quindi esco dall'iteratac
				//corrente
				if (!candA[i].isCompatibleWith(candA[j].arguments))
					break;
				//se I è più specifico di J allora J non deve essere 
				//più considerabile come possibile firma più specifica
				//per questo verrà skippata dal for più esterno
				skip[j] = true;
				//condizione che esprime il test
				//di avvenuta ricerca di una firma più specifica delle altre
				if (j == (candA.length - 1))
					return;
			}
		}
		//se arrivo quà vuol dire che non è stata trovata alcuna firma
		//più specifica delle altre, quindi sollevo un'eccezione di Early Binding
		throw new EarlyBindingException(/*name,args*/);
	}

	
	//gestione campi
	private class Field{
		
		private Field(String n, Type t, boolean p){
			name = n;
			type = t;
			isPublic = p;
		}
		
		public int hashCode(){
			return name.hashCode();
		}		
		
		private final Type type;
		private final String name;
		private final boolean isPublic;
		
	}
	
	public void addField(String n, Type t, boolean v){
		Field f = fields.get(n);
		if (f != null)
			throw new UnacceptableFieldException();
		f = new Field(n,t,v);
		fields.put(n,f);
	}
	
	//gestione costruttori
	//un costruttore è iterabile sul tipo dei suoi parametri
	private class Constructor implements Iterable<Type>{
		
		private Constructor(boolean b, List<Type> a){
			arguments = a;
			isPublic = b;
		}
		
		public int hashCode(){
			int res = 0;
			int pos = 1;
			for (Type t : arguments){
				res ^= t.hashCode();
				//hashcode deve tenere presente la posizione del parametro!
				//shiftiamo circolarmente in base alla posizione
				res = (res >> pos) | (res << (32 - pos));
				pos++;
			}	
			return res;
		}
		
		public Iterator<Type> iterator(){
			return arguments.iterator();
		}
		
		private boolean isCompatibleWith(List<Type> call){
			if (call == null)
				return (arguments == null);
			int i = 0;
			for (Type t : call)
				if (!t.isAssignableTo(arguments.get(i++)))
					return false;
			return true;
		}
		
		
		private final boolean isPublic;
		private List<Type> arguments;
	}
	
	public void addConstructor(boolean v, List<Type> a){
		Constructor c = new Constructor(v,a);
		if (constructors.contains(c))
			throw new UnacceptableConstructorException();
		constructors.add(c);
	}
	
	public void bindConstructor(List<Type> call){
		for (Constructor c : constructors){
			if (c.isCompatibleWith(call))
				return;
		}
		throw new EarlyBindingException(/*name,args*/);
	}
	
	
	private final String name;
	private ReferenceType superClass;
	private Map<String,Set<Method>> methods;
	private Map<String,Field> fields;
	private List<Constructor> constructors;
	//i referenceType di String ed Object hanno particolare dignità, 
	//quindi divengono delle costanti di classe
	public static final ReferenceType OBJECT = new ReferenceType("Object");
	public static final ReferenceType STRING = new ReferenceType("String");
}
