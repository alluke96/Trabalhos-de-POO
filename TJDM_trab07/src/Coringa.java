public class Coringa extends Ladrao {
	public Coringa(int cor){
		super (cor);
	}
	public void atirar() {
		System.out.println("Coringa atirando... ");
	}
	public void morrer(){
		setVivo();
		System.out.println("Coringa morri ... ");
	}
}
