
public class Jogador {
	private String nome;
	protected int score;
	Jogador(String nome) {
		this.setNome(nome);
	}
	public void imprimir() {
		System.out.println("nome: "+getNome());
		System.out.println("score: "+score);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
