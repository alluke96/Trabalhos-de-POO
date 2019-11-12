public class Goldfinger extends Terrorista implements Personificacao {
	
	private Heroi heroi;
	public Goldfinger (int cor) {
		super(cor);
	}
	public void saltar(float z) {
		System.out.println("Goldfinger saltando... "+ z);
		this.posicaoZ = z;
	}

	public void personificar(Heroi h) {
		heroi = h;
		System.out.println("Goldfinger personificando " +heroi.getClass().getName()+ " ...");
	}
	
	public void camuflar(int cor) {
		System.out.println("Goldfinger camuflando... ");	
	}
	public void morrer(){
		setVivo();
		System.out.println("Goldfinger morri ... ");
	}

}
