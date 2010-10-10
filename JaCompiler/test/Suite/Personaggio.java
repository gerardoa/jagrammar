public class Personaggio{
	

	public void main(){
		Personaggio[] orda = new Personaggio[5];
		int i = 0;
		while (i < 5){
			if ((i % 2) > 0){
				orda[i++] = new Orchetto();
			}else{
				orda[i++] = new Goblin();
			}
		}
		for (Personaggio p : orda){
			if (p instanceof Goblin){
				Goblin g = (Goblin) p;
				g.faiDoppioGioco();
			}else{
				Orchetto o = (Orchetto) p;
				o.spaccaTutto();
			}
		}
	}

}