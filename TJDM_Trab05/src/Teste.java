
public class Teste {
	public static void main (String[] args) {
		Jogador       j = new Jogador ("Victor");
		Principiante  p = new Principiante("Helder");
		Profissional  f = new Profissional ("Allyson");
		Senior		  s = new Senior ("Lucas");
		
		j.imprimir();
		System.out.println("-------------");
		p.ganhar(10);
		p.perder(3);
		p.imprimir();
		System.out.println();
		System.out.println("-------------");
		f.ganhar(10);
		f.perder(3);
		f.imprimir();
		System.out.println("-------------");
		s.ganhar(10);
		s.perder(3);
		s.imprimir();
	}
}
