package Model;

public class Funcao {

	private String nome;
	private String codigo;
	
	
	
	public Funcao() {
		
	}

	public Funcao(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
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
		return "Funcao [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	
}
