
public class Banco {
	public static void main(String[] args) {
		ContaCorrente cta01 = new ContaCorrente(123);
		ContaCorrente cta02 = new ContaCorrente(456);
		ContaCorrente cta03 = new ContaCorrente(789);
		Cliente cli01 = new Cliente ("Maria");
		Cliente cli02 = new Cliente ("Jose");
		Cliente cli03 = new Cliente ("Joao");
		cli01.setConta(cta01);
		cli02.setConta(cta02);
		cli03.setConta(cta03);
		cta01.setCliente(cli01);
		cta02.setCliente(cli02);
		cta03.setCliente(cli03);
		System.out.println("*** BANCO ***");
		System.out.println("\n\nCliente 01 - operar: ");
		cli01.operar();
		System.out.println("\n\nCliente 02 - operar: ");
		cli02.operar();
		System.out.println("\n\nCliente 03 - operar: ");
		cli03.operar();		
	}
}
