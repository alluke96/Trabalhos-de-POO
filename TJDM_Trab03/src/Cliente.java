import java.util.Scanner;

public class Cliente {
	private String nome;
	private ContaCorrente conta;
	public Cliente(String nome) {
		this.nome = nome;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public String getNome() {
		return this.nome;
	}
	public void operar() {
		Scanner ler = new Scanner(System.in);
		double valor;
		boolean saqueOk = false;
		System.out.println("Entre com o valor do deposito: ");
		valor = ler.nextDouble();
		conta.depositar(valor);
		while(!saqueOk) {
			try {
				System.out.println("Entre um valor de saque: ");
				valor = ler.nextDouble();
				conta.sacar(valor);
				saqueOk = true;
			} catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
		conta.imprimir();
	}
}
