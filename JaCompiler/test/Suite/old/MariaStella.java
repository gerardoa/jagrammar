/*
	Primo semplice test per il Compilatore Ja.
	Verifichiamo se il lexer salta i commenti (questo è multilinea, 
	più avanti ce ne saranno alcuni monolinea), c'è qualche metodo,
	e qualche campo istanza, 
*/

public class ParlamentareItaliano{

	public Parlamentare(String n,String c,String q){
		nome = n;
		cognome = c;
		quota = q;
		/*
			percentuale che un parlamentare risulti
			pregiudicato nell'anno del Signore 2010: 
			15% (Scampia ha il 10% sulla sua popolazione)
		*/
		pregiudicato = (cas % 100) < 15;
	}
	
	public boolean ePregiudicato(){
		return pregiudicato;
	}
	
	public boolean eElettoDalPopolo(){
		//essendo nominato dai partiti
		return false;
	}
	
	public String toString(){
		return nome + " " + cognome + " [" + quota + "]";
	}
	

	//è un parlamentare pregiudicato?
	private boolean pregiudicato;
	//da che partito viene nominato
	private String quota;
	//nome
	private String nome;
	//cognome
	private String cognome;
}
