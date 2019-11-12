public abstract class Personagem {

	private boolean vivo;
	protected float posicaoX;
	protected float posicaoY;
	protected float posicaoZ;
	protected int cor;

	public Personagem(int cor) {
		this.cor = cor;
	}
	public abstract void correr(float x, float y);
	public abstract void saltar(float z);
	public abstract void atirar();
	public abstract void morrer();
	public void setVivo() {
		vivo = false;
	}

}
