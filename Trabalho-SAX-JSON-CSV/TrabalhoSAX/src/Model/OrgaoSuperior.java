package Model;

public class OrgaoSuperior {
	
	private String codigo;
	private String nome;
	
	public OrgaoSuperior() {
		
	}


	public OrgaoSuperior(String codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "OrgaoSuperior [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
}
