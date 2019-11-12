
public class Principiante extends Jogador{
	private double bonus;
	Principiante(String nome) {
		super(nome);
	}
	public void imprimir() {
		super.imprimir();
		System.out.print("bonus: "+bonus);
	}
	void ganhar(int p) {
		score += p;
		bonus += p * 0.1;
	}
	void perder(int p) {
		score -= p;
		bonus -= p * 0.1;
	}
}
