package Model;

public class Elemento {
	
	private String nome;
	private String codigo;
	
	public Elemento() {
		
	}
	
	public Elemento(String nome, String codigo) {
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
		return "Elemento [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	
}
