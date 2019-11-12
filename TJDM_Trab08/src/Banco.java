import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<ContaCorrente> contas;

	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList <ContaCorrente>();
	}
	public void addConta(ContaCorrente c) {
		contas.add(c);
	}
	public void operacoes() {
		int cont = 1;
		System.out.println("OPERAÇÕES NO BANCO: "+ nome);
		for (ContaCorrente c : contas) {
			System.out.println("\n##################################################");
			System.out.println("ANTES DA OPERAÇÃO:");
			imprimeConta(c);
			try {
				c.retirar(cont, "POO", 100, 6+cont);
				System.out.println("Saque OK");
			}catch(ExcecaoContaInvalida e) {
				System.out.println("*** Erro de auntenticação: "+ e.getMessage());
			}catch(ExcecaoSenhaInvalida e) {
				System.out.println("*** Erro de auntenticação: "+ e.getMessage());
			}catch(ExcecaoHorarioInvalido e) {
				System.out.println("*** Erro de segurança: "+ e.getMessage());
			}catch(ExcecaoSaldoInsuficiente e) {
				System.out.println("*** Erro: "+ e.getMessage());
			}finally {
				System.out.println("\nAPOS A OPERAÇAO: ");
				imprimeConta(c);
				cont ++;
			}
		}
	}
	public void imprimeConta(ContaCorrente c) {
		System.out.println(c.toString());
	}
	public static void main(String[] args) {
		Banco banco = new Banco ("ITAÚ");
		banco.addConta(new ContaCorrente(1,"POO",500.0));
		banco.addConta(new ContaCorrente(20,"POO",400.0));
		banco.addConta(new ContaCorrente(3,"OOP",300.0));
		banco.addConta(new ContaCorrente(4,"POO",10.0));
		banco.addConta(new ContaCorrente(5,"POO",200.0));
		banco.operacoes();
	}
}
