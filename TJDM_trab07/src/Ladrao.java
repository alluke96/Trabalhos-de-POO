public abstract class Ladrao extends Vilao {
	public Ladrao(int cor) {
		super (cor);
	}
	public void atirar() {
		System.out.println("Ladr�o atirando... ");

	}

	public void saltar(float z) {
		System.out.println("Ladr�o saltando... "+ z);
		this.posicaoZ = z;
	}

}
