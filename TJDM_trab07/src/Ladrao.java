public abstract class Ladrao extends Vilao {
	public Ladrao(int cor) {
		super (cor);
	}
	public void atirar() {
		System.out.println("Ladrão atirando... ");

	}

	public void saltar(float z) {
		System.out.println("Ladrão saltando... "+ z);
		this.posicaoZ = z;
	}

}
