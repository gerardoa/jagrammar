/*
	test per operatori di confronto ed aritmetici. 
	Inoltre, nel main, viene usato un loop di tipo
	do/while
*/

public class Integer{

	private int val;
	
	public Integer(int val){
		//uso THIS come riferimento per accedere ad un campo
		this.val = val;
	}
	
	public Integer(){
		this(0);//uso THIS per invocare un costruttore
	}
	
	
	public boolean minus(Integer i){
		return val < i.val;
	}
	
	public boolean plus(Integer i){
		return val > i.val;
	}
	
	public boolean equal(Integer i){
		return val == i.val
	}
	
	public boolean minusEqual(Integer i){
		return val <= i.val;
	}
	
	public boolean plusEqual(Integer i){
		return val >= i.val;
	}
	
	public Integer add(Integer i){
		return new Integer(val + i.val);
	}
	
	public boolean prod(Integer i){
		return new Integer(val * i.val);
	}
	
	public boolean div(Integer i){
		return new Integer(val / i.val);
	}
	
	public boolean mod(Integer i){
		return new Integer(val % i.val);
	}
	
	public void main(){
		Integer i = new Integer(1);
		Integer i = new Integer(10);//errore: due variabili con lo stesso nome...
		Integer j = new Integer();
		Integer k = new Integer(10);
		do{
			j.add(i);
			i = new Integer(i.add(new Integer(1)));
		}while(i.equal(k));
	}
	
}