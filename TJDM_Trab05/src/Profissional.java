
public class Profissional extends Jogador{
	private double capital;
	Profissional(String nome) {
		super(nome);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("capital: "+getCapital());
	}
	void ganhar(int p) {
		score += p;
		setCapital(getCapital() + p * 4);
	}
	void perder(int p) {
		score -= p;
		setCapital(getCapital() - p * 4);
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
}
