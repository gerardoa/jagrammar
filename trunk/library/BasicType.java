/*
 *	classe astratta che rappresenta un Tipo Base di Ja
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see Type
 * 
 */


public enum BasicType implements Type{

	INT		{
		
		public boolean isNumeric(){
			return true;
		}
		
		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return ((t == LONG) || (t == FLOAT) || (t == DOUBLE));
		}
		
	},
	LONG	{
	
		public boolean isNumeric(){
			return true;
		}
		
		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return ((t == FLOAT) || (t == DOUBLE));
		}
		
	},
	BYTE	{
	
		public boolean isNumeric(){
			return true;
		}

		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return ((t == LONG) || (t == FLOAT) || (t == DOUBLE) || (t == SHORT) || (t == INT));
		}
	
	},
	SHORT	{
	
		public boolean isNumeric(){
			return true;
		}	

		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return ((t == LONG) || (t == FLOAT) || (t == DOUBLE) || (t == INT));
		}
		
	},
	CHAR	{
	
		public boolean isNumeric(){
			return false;
		}
	
		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return ((t == LONG) || (t == FLOAT) || (t == DOUBLE) || (t == INT));
		}
		
	},
	BOOLEAN	{
	
		public boolean isNumeric(){
			return false;
		}

		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			return false;
		}
		
	},
	DOUBLE	{
	
		public boolean isNumeric(){
			return true;
		}	
		
		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			return false;
		}
		
	},
	FLOAT	{
	
		public boolean isNumeric(){
			return true;
		}

		public boolean isAssignableTo(Type t){
			if (this == t) return true;
			if (!t.isBasic()) return false;
			return t == DOUBLE;
		}
		
	};
	
	
	public abstract boolean isNumeric();
	
	public abstract boolean isAssignableTo(Type t);
	
	public boolean isBasic(){
		return true;
	};
	
	public boolean isArray(){
		return false;
	}
	
	public boolean isNull(){
		return false;
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
	
	public boolean isCastableTo(Type t){
		return (isAssignableTo(t) || t.isAssignableTo(this));
	}
	
	public boolean isSubtypeOf(Type t){
		return false;
	}

	//Mappa delle conversioni implicite
	//EDIT: portare i set nelle istanze della enum
	//private static Map<BasicType,Set<BasicType>> conversions = new HashMap<BasicType,Set<BasicType>>();
	
	/*static{
		Set<BasicType> s1;
				
		//int
		//s1 = new HashSet<BasicType>();
		//s1.add(LONG);
		//s1.add(FLOAT);
		//s1.add(DOUBLE);
		//conversions.put(INT,s1);
		
		//char
		s1 = new HashSet<BasicType>();
		s1.add(LONG);
		s1.add(FLOAT);
		s1.add(DOUBLE);
		s1.add(INT);
		conversions.put(CHAR,s1);
		
		//short
		s1 = new HashSet<BasicType>();
		s1.add(LONG);
		s1.add(FLOAT);
		s1.add(DOUBLE);
		s1.add(INT);
		conversions.put(SHORT,s1);
		
		//byte
		s1 = new HashSet<BasicType>();
		s1.add(SHORT);
		s1.add(LONG);
		s1.add(FLOAT);
		s1.add(DOUBLE);
		s1.add(INT);
		conversions.put(BYTE,s1);
		
		//long
		s1 = new HashSet<BasicType>();
		s1.add(FLOAT);
		s1.add(DOUBLE);
		conversions.put(LONG,s1);
		
		//float
		s1 = new HashSet<BasicType>();
		s1.add(DOUBLE);
		conversions.put(FLOAT,s1);
		
	}*/

}