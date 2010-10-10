/*
	Questo test presenta una classe un poco
	più complessa. Dispone di due costruttori,
	un campo privato, e di un metodo accessore.
	Nel main vengono provati un costrutto for,
	ed un if.
*/

public class MinistroIstruzione{
	
	private Riforma riformaIstruzione;
	
	
	public MinistroIstruzione(){
		riformaIstruzione = new Riforma();
	}
	
	public MinistroIstruzione(Riforma r){
		riformaIstruzione = r;
	}
	

	public Riforma progettaRiforma(){
		return riformaIstruzione;
	}


	public void main(String[] args){
		//quest'anno la protesta si è fatta vibrante contro la riforma Gelmini...
		mariaStella = new MinistroIstruzione();
		Riforma gelmini = mariaStella.progettaRiforma();
		if (gelmini.eIniqua()){
			Ricercatore[] precari = new Ricercatore[300];
			for (int i = 0; i < 300; i++){}
				precari[i] = new Ricercatore();
				precari[i].protesta();
			}
		}
	}

}