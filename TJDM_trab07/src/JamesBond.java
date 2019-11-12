public class JamesBond extends Heroi {

	public JamesBond(int cor) {
		super(cor);
	}

	public void atirar() {
		System.out.println("James Bond atirando... ");
	}

	public void saltar(float z) {
		System.out.println("James Bond saltando... "+ z);
		this.posicaoZ = z;
	}
	public void camuflar(int cor) {
		this.cor = cor;
		System.out.println("James Bond camuflando ... ");
	}
	public void morrer(){
		setVivo();
		System.out.println("James Bond morri ... ");
	}
}
