
public class ContaCorrente {
	private int numero;
	private double saldo = 0;
	private Cliente cliente;
	
	public ContaCorrente(int numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void sacar(double valor) {
		assert this.saldo >= valor : "Erro: Saldo Insuficiente";
		this.saldo -= valor;
	}
	public double verificar() {
		return this.saldo;
	}
	public void imprimir() {
		String dadosConta = "";
		dadosConta += "Numero Conta: " + numero + "\n";
		dadosConta += "Cliente: " + this.cliente.getNome() + "\n";
		dadosConta += "Saldo: " + this.verificar();
		System.out.println(dadosConta + "\n");
	}
}
