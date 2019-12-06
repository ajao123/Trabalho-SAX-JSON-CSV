package Model;

public class Acao {
	
	private String nome;
	private String codigo;
	
	public Acao(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public Acao() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Acao [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
}