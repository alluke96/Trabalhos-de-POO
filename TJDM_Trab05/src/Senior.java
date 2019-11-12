
public class Senior extends Profissional{
	private double premio = 2;
	Senior(String nome) {
		super(nome);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("premio: "+premio);
	}
	void ganhar(int p) {
		super.ganhar(p);
		premio *= 2;
	}
	void perder(int p) {
		super.perder(p);
		premio /= 2;
	}
}
