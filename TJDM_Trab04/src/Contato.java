
public class Contato {
    private String nome;
    private Conversa conversa;

    public Contato (String nome) {
    	setNome(nome);
    	conversa = new Conversa();
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void setNome (String nome) {
    	this.nome = nome;
    }

    public Conversa getConversa() {
        return this.conversa;
    }
    
    public void setConversa (Conversa conversa) {
        this.conversa = conversa;
    }
}
