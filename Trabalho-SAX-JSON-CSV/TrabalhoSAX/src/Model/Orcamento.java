package Model;

public class Orcamento {
	
	private String orcamentoInicial;
	private String orcamentoAtualizado;
	private String orcamentoRealizado;
	
	public Orcamento() {
		
	}
	
	public Orcamento(String orcamentoInicial, String orcamentoAtualizado, String orcamentoRealizado) {
		super();
		this.orcamentoInicial = orcamentoInicial;
		this.orcamentoAtualizado = orcamentoAtualizado;
		this.orcamentoRealizado = orcamentoRealizado;
	}

	public String getOrcamentoInicial() {
		return orcamentoInicial;
	}

	public void setOrcamentoInicial(String orcamentoInicial) {
		this.orcamentoInicial = orcamentoInicial;
	}

	public String getOrcamentoAtualizado() {
		return orcamentoAtualizado;
	}

	public void setOrcamentoAtualizado(String orcamentoAtualizado) {
		this.orcamentoAtualizado = orcamentoAtualizado;
	}

	public String getOrcamentoRealizado() {
		return orcamentoRealizado;
	}

	public void setOrcamentoRealizado(String orcamentoRealizado) {
		this.orcamentoRealizado = orcamentoRealizado;
	}

	@Override
	public String toString() {
		return "Orcamento [orcamentoInicial=" + orcamentoInicial + ", orcamentoAtualizado=" + orcamentoAtualizado
				+ ", orcamentoRealizado=" + orcamentoRealizado + "]";
	}
	
	
	
}
