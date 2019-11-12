public class ContaCorrente {

	private int numero;
	private String senha;
	private double saldo;

	public ContaCorrente(int numero, String senha, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}
	public String toString() {
		return "ContaCorrente [Número da conta= " + numero + ", Senha= " + senha + ", Saldo= " + saldo + "]";
	}
	public void retirar(int numero, String senha, double valor, int horas) 
			throws ExcecaoContaInvalida, ExcecaoSenhaInvalida,
			ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido
	{
		if(this.numero != numero)
			throw new ExcecaoContaInvalida	("Conta invalida.");
		if(this.senha != senha)
			throw new ExcecaoSenhaInvalida	("Senha invalida.");
		if(this.saldo < valor)
			throw new ExcecaoSaldoInsuficiente	("Saldo insuficiente.");
		if(horas > 22 || horas < 6)
			throw new ExcecaoHorarioInvalido	("Fora do horario de atendimento.");
		this.saldo -= valor;
	}
}
