package Model;

public class GrupoDeDespesa {

	private String nome;
	private String codigo;
	
	public GrupoDeDespesa() {
		
	}
	
	public GrupoDeDespesa(String nome, String codigo) {
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
		return "GrupoDeDespesa [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
}
