/*
	il primo test non pu� che essere questo,
	in accordo alla tradizione. Si intende 
	verificare il comportamento del compilatore
	in presenza di commenti, sia multilinea che
	monolinea. E' presente una chiamata a metodo
	che, tuttavia, dovrebbe portare ad un errore.
*/

public class HelloWorld{

	public void main(String args[]){
		//la classe System non � definita da nessuna parte...
		System.out.println("Hello Ja Wordl!!");
	}

}