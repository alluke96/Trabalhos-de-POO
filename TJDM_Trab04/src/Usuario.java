
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {

	// Atributos da classe Propriedades da classe
	private String nome;
	private ArrayList<Contato> contatos;

	//Construtor da classe 
	public Usuario (String nome) {
		this.nome = nome; 
		contatos = new ArrayList<Contato>();
	}

	//i. Inserir NOVO CONTATO. Parametro: nome do contato
	public void inserirContato (String nome) {
		Contato novoAmigo = new Contato(nome);
		contatos.add(novoAmigo);
	}

	//ii. iniciar CONVERSA Com m contato Parametro: nome de contato
	public void iniciarConversa (String nome) {
		Contato contato = encontraContato(nome);
		if (contato != null) {
			Conversa c = new Conversa();
			contato.setConversa(c);
		}else
			System.out.println ("Contato [" + nome +"] inexistente.");
	}

	//iii. ENVIAR MENSAGEM em uma conversa. Parâmetros: nome do contato e a mensagem
	public void enviaMensagem (String nome, String textoMensagem) {
		Contato contato = encontraContato(nome);
		if (contato != null) {
			contato.getConversa().addMensagem("Enviado: " + textoMensagem);
			System.out.println ("Mensagem enviada com sucesso!");
		}else
			System.out.println ("Contato [" + nome + "] inexistente.");
	}

	// iv. RECEBER MENSAGEM em uma conversa. Parâmetros: nome do contato e a mensagem.
	public void receberMensagem (String nome, String textoMensagem) {
		Contato contato = encontraContato(nome);
		if (contato != null) {
			contato.getConversa().addMensagem("Recebido: " + textoMensagem);;
			System.out.println("Mensagem recebida com sucesso!");
		}else
			System.out.println("Contate [" + nome +"] inexistente!");
	}
	// IMPRIMIR TODAS AS MENSAGENS DE UMA CONVERSA. Parametro: nome do contato.
	public void imprimirConversa (String nome) {
		Contato contato = encontraContato(nome);
			if (contato != null) {
				System.out.println ("-------------------------------");
				System.out.println ("Conversa com contato: " + nome);
				contato.getConversa().numeroMensagens();
			}else
				System.out.println ("Contato [" + nome + "] inexistente!");
	}
//Encontra objeto da Classe CONTATO que tem a propriedade "ne" = parametro "none" do método)

	public Contato encontraContato (String nome) {
	// Cria objeto da classe Contato INICIALIZA como NULO (garante o return)
		Contato contato = null;
	// Classe objeto atributo (Arraylist): percorre todo o ArrayList, em que he elemente atual du ArrayList
		for (Contato c : contatos) {
			if (c.getNome().equals(nome)) // encontro objeto Contato pelo atributo propriedade "nume
					contato = c;
		}
					return contato;
}
	
	public void conversar() {
		Scanner ler = new Scanner(System.in);
		boolean fim = false;
		int opcao;
		String nome;
		String msg;
		while (!fim) {
			System.out.println("----------------------");
			System.out.println("Menu");
			System.out.println("----------------------");
			System.out.println("1) Adicionar contato");
			System.out.println("2) Enviar msg para contato");
			System.out.println("3) Receber msg de contato");
			System.out.println("4) Imprimir conversas");
			System.out.println("5) Fim");
			System.out.println("\nEntre com a opcao desejada: ");
			opcao = ler.nextInt();
			ler.nextLine();
			switch(opcao) {
			case 1:
				System.out.print("Entre com o nome do contato a ser adicionado: ");
				nome = ler.nextLine();
				this.inserirContato(nome);
				System.out.println("Contato adicionado com sucesso!");
				System.out.println("\nTecle algo para prosseguir...");
				ler.hasNextLine();
				System.out.flush();
				break;
			case 2:
				System.out.print("Entre com o nome do contato para enviar mensagem: ");
				nome = ler.nextLine();
				
				System.out.println("Digite a mensagem a ser enviada: ");
				msg = ler.nextLine();
				this.enviaMensagem(nome, msg);
				System.out.println("\nTecle algo para prosseguir...");
				ler.hasNextLine();
				System.out.flush();
				break;
			case 3:
				System.out.print("Entre com o nome do contato para receber mensagem: ");
				nome = ler.nextLine();
				
				System.out.println("Digite a mensagem a ser recebida: ");
				msg = ler.nextLine();
				this.receberMensagem(nome, msg);
				System.out.println("\nTecle algo para prosseguir...");
				ler.hasNextLine();
				System.out.flush();
				break;
			case 4:
				System.out.println("**************************");
				System.out.println("Conversas de " + this.nome);
				for(Contato c : contatos) {
					System.out.println("--------------------------");
					System.out.println("Papo com: [" + c.getNome() + "] = " + c.getConversa().numeroMensagens() + " mensagen(s).");
					c.getConversa().imprimirMensagens();
				}
				System.out.println("\nTecle algo para prosseguir...");
				ler.nextLine();
				break;
			case 5:
				fim = true;
				System.out.println(". . . . finalizando!");
				break;
			default:
				System.out.println("\nOpcao incorreta. Tente novamente.\n");
			}
		}
	}
	
	public static void main(String[]args) {
		Usuario allyson = new Usuario("Allyson");
		allyson.conversar();
	}
}