package Model;

public class OrcamentoDespesa {

	private String exercicio;
	private Acao acao;
	private CategoriaEconomica categoriaEconomica;
	private Elemento elemento;
	private Funcao funcao;
	private GrupoDeDespesa grupoDeDespesa;
	private Orcamento orcamento;
	private OrgaoSubordinado orgaoSubordinado;
	private OrgaoSuperior orgaoSuperior;
	private ProgramaOrcamentario programaOrcamentario;
	private Subfuncao subfuncao;
	private UnidadeOrcamentaria unidadeOrcamentaria;

	public OrcamentoDespesa(String exercicio, Acao acao, CategoriaEconomica categoriaEconomica, Elemento elemento,
			Funcao funcao, GrupoDeDespesa grupoDeDespesa, Orcamento orcamento, OrgaoSubordinado orgaoSubordinado,
			OrgaoSuperior orgaoSuperior, ProgramaOrcamentario programaOrcamentario, Subfuncao subfuncao,
			UnidadeOrcamentaria unidadeOrcamentaria) {
		super();
		this.exercicio = exercicio;
		this.acao = acao;
		this.categoriaEconomica = categoriaEconomica;
		this.elemento = elemento;
		this.funcao = funcao;
		this.grupoDeDespesa = grupoDeDespesa;
		this.orcamento = orcamento;
		this.orgaoSubordinado = orgaoSubordinado;
		this.orgaoSuperior = orgaoSuperior;
		this.programaOrcamentario = programaOrcamentario;
		this.subfuncao = subfuncao;
		this.unidadeOrcamentaria = unidadeOrcamentaria;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public CategoriaEconomica getCategoriaEconomica() {
		return categoriaEconomica;
	}

	public void setCategoriaEconomica(CategoriaEconomica categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public GrupoDeDespesa getGrupoDeDespesa() {
		return grupoDeDespesa;
	}

	public void setGrupoDeDespesa(GrupoDeDespesa grupoDeDespesa) {
		this.grupoDeDespesa = grupoDeDespesa;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public OrgaoSubordinado getOrgaoSubordinado() {
		return orgaoSubordinado;
	}

	public void setOrgaoSubordinado(OrgaoSubordinado orgaoSubordinado) {
		this.orgaoSubordinado = orgaoSubordinado;
	}

	public OrgaoSuperior getOrgaoSuperior() {
		return orgaoSuperior;
	}

	public void setOrgaoSuperior(OrgaoSuperior orgaoSuperior) {
		this.orgaoSuperior = orgaoSuperior;
	}

	public ProgramaOrcamentario getProgramaOrcamentario() {
		return programaOrcamentario;
	}

	public void setProgramaOrcamentario(ProgramaOrcamentario programaOrcamentario) {
		this.programaOrcamentario = programaOrcamentario;
	}

	public Subfuncao getSubfuncao() {
		return subfuncao;
	}

	public void setSubfuncao(Subfuncao subfuncao) {
		this.subfuncao = subfuncao;
	}

	public UnidadeOrcamentaria getUnidadeOrcamentaria() {
		return unidadeOrcamentaria;
	}

	public void setUnidadeOrcamentaria(UnidadeOrcamentaria unidadeOrcamentaria) {
		this.unidadeOrcamentaria = unidadeOrcamentaria;
	}

	@Override
	public String toString() {
		return "OrcamentoDespesa [exercicio=" + exercicio + ", acao=" + acao + ", categoriaEconomica="
				+ categoriaEconomica + ", elemento=" + elemento + ", funcao=" + funcao + ", grupoDeDespesa="
				+ grupoDeDespesa + ", orcamento=" + orcamento + ", orgaoSubordinado=" + orgaoSubordinado
				+ ", orgaoSuperior=" + orgaoSuperior + ", programaOrcamentario=" + programaOrcamentario + ", subfuncao="
				+ subfuncao + ", unidadeOrcamentaria=" + unidadeOrcamentaria + "]";
	}
	
	
	
}
