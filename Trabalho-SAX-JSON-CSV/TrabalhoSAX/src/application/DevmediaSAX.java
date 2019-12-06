package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Acao;
import Model.CategoriaEconomica;
import Model.Elemento;
import Model.Funcao;
import Model.GrupoDeDespesa;
import Model.Orcamento;
import Model.OrcamentoDespesa;
import Model.OrgaoSubordinado;
import Model.OrgaoSuperior;
import Model.ProgramaOrcamentario;
import Model.Subfuncao;
import Model.UnidadeOrcamentaria;
 

 
public class DevmediaSAX extends DefaultHandler {

    private String tagAtual;
    private String tag;
    private List<OrcamentoDespesa> list = new ArrayList<>();
    
    private String exercicio = "";
    private Acao acao =  new Acao();
    private CategoriaEconomica categoriaEconomica = new CategoriaEconomica();
    private Elemento elemento = new Elemento();
    private Funcao funcao = new Funcao();
    private GrupoDeDespesa grupoDeDespesa = new GrupoDeDespesa();
    private Orcamento orcamento = new Orcamento();
    private OrgaoSubordinado orgaoSubordinado = new OrgaoSubordinado();
    private OrgaoSuperior orgaoSuperior = new OrgaoSuperior();
    private ProgramaOrcamentario programaOrcamentario = new ProgramaOrcamentario();
    private Subfuncao subfuncao = new Subfuncao();
    private UnidadeOrcamentaria unidadeOrcamentaria = new UnidadeOrcamentaria();
    
    

    public DevmediaSAX() {
        super();
    }
 

    public void fazerParsing(String pathArq) {
 
     
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser;
 
        try {
            saxParser = factory.newSAXParser();
 
      
            saxParser.parse(pathArq, this); 
 
       
        } catch (ParserConfigurationException | SAXException | IOException e) {
            StringBuffer msg = new StringBuffer();
            msg.append("Erro:\n");
            msg.append(e.getMessage() + "\n");
            msg.append(e.toString());
            System.out.println(msg);
        }
    }
 

    public void startDocument() {
        System.out.println("\nIniciando o Parsing...\n");
       
    }
 
 
    public void endDocument() {
    	
    	list.add(new OrcamentoDespesa(exercicio, acao, categoriaEconomica, elemento,
   			   	funcao, grupoDeDespesa, orcamento, orgaoSubordinado,
   				orgaoSuperior, programaOrcamentario, subfuncao, unidadeOrcamentaria));
    	
    	ObjectMapper mapper = new ObjectMapper();
        String homeDir = System.getProperty("user.home");
        
        try {
			mapper.writeValue(new File(homeDir + "\\Desktop\\TrabalhoPersistencia\\result.json"), list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("\nFim do Parsing...");
    }
 
  
    public void startElement(String uri, String localName, String qName,
            Attributes atts) {

        // recupera o nome da tag atual
    	

	 
        tagAtual = qName;
 
        // se a tag for "<pais>", recupera o valor do atributo "sigla"
        


        if (tagAtual.compareTo("exercicio") == 0) {
        	tag = "exercicio";
        	
  
        	   if(exercicio != "") {
        		   list.add(new OrcamentoDespesa(exercicio, 
        				   new Acao(acao.getNome(), acao.getCodigo()), 
        				   new CategoriaEconomica(categoriaEconomica.getCodigo(), categoriaEconomica.getNome()), 
        				   new Elemento(elemento.getNome(), elemento.getCodigo()),
        				   new Funcao(funcao.getNome(), funcao.getCodigo()), 
        				   new GrupoDeDespesa(grupoDeDespesa.getNome(), grupoDeDespesa.getCodigo()), 
        				   new Orcamento(orcamento.getOrcamentoInicial(), orcamento.getOrcamentoAtualizado(), orcamento.getOrcamentoRealizado()), 
        				   new OrgaoSubordinado(orgaoSubordinado.getNome(), orgaoSubordinado.getCodigo()),
	           			   new OrgaoSuperior(orgaoSuperior.getCodigo(), orgaoSuperior.getNome()), 
	           			   new ProgramaOrcamentario(programaOrcamentario.getNome(), programaOrcamentario.getCodigo()), 
	           			   new Subfuncao(subfuncao.getNome(), subfuncao.getCodigo()), 
        				   new UnidadeOrcamentaria(unidadeOrcamentaria.getNome(), unidadeOrcamentaria.getCodigo())));
        	   }
          
        }
        if (tagAtual.compareTo("orgaoSuperior") == 0) {
        	tag = "orgaoSuperior";
            
        }
        if (tagAtual.compareTo("orgaoSubordinado") == 0) {
        	tag = "orgaoSubordinado";
        }
        if (tagAtual.compareTo("unidadeOrcamentaria") == 0) {
        	tag = "unidadeOrcamentaria";
        }
        if (tagAtual.compareTo("funcao") == 0) {
        	tag = "funcao";
        }
        if (tagAtual.compareTo("subfuncao") == 0) {
        	tag = "subfuncao";
        }
        if (tagAtual.compareTo("programaOrcamentario") == 0) {
        	tag = "programaOrcamentario";
        }
        if (tagAtual.compareTo("acao") == 0) {
        	tag = "acao";
        }
        if (tagAtual.compareTo("categoriaEconomica") == 0) {
        	tag = "categoriaEconomica";
        }
        if (tagAtual.compareTo("grupoDeDespesa") == 0) {
        	tag = "grupoDeDespesa";
        }
        if (tagAtual.compareTo("elemento") == 0) {
        	tag = "elemento";
        }
        if (tagAtual.compareTo("orcamento") == 0) {
        	tag = "orcamento";
        }
 } 
//        
//        if (qName.compareTo("pais") == 0) {
//            siglaAtual = atts.getValue(0);
//        }
   
 

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
 
        tagAtual = "";
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
 
        String texto = new String(ch, start, length);
 
        // ------------------------------------------------------------
        // --- TRATAMENTO DAS INFORMAÇÕES DE ACORDO COM A TAG ATUAL ---
        // ------------------------------------------------------------

        if (tag.compareTo("exercicio") == 0) {
        	 exercicio = texto;
        }
        if (tag.compareTo("orgaoSuperior") == 0) {
        	
        	if (tagAtual.compareTo("codigoOrgaoSuperior") == 0) {
           	 	orgaoSuperior.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeOrgaoSuperior") == 0) {
              	orgaoSuperior.setNome(texto);
           	}
        	 
        
        }
        if (tag.compareTo("orgaoSubordinado") == 0) {
        	
        	if (tagAtual.compareTo("codigoOrgaoSubordinado") == 0) {
           	 	orgaoSubordinado.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeOrgaoSubordinado") == 0) {
              	orgaoSubordinado.setNome(texto);
           	}
        	
        }
        if (tag.compareTo("unidadeOrcamentaria") == 0) {
        	
        	if (tagAtual.compareTo("codigoUnidadeOrcamentaria") == 0) {
           	 	unidadeOrcamentaria.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeUnidadeOrcamentaria") == 0) {
        		unidadeOrcamentaria.setNome(texto);
           	}
        	
        }
        if (tag.compareTo("funcao") == 0) {
        	
        	if (tagAtual.compareTo("codigoFuncao") == 0) {
           	 	funcao.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeFuncao") == 0) {
        		funcao.setNome(texto);
           	}
        	
        }
        if (tag.compareTo("subfuncao") == 0) {
        	
        	if (tagAtual.compareTo("codigoSubfuncao") == 0) {
       
           	 	subfuncao.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeSubfuncao") == 0) {
        		subfuncao.setNome(texto);
           	}
        	
        }
        if (tag.compareTo("programaOrcamentario") == 0) {
        	if (tagAtual.compareTo("codigoProgramaOrcamentario") == 0) {
           	 	programaOrcamentario.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeProgramaOrcamentario") == 0) {
        		programaOrcamentario.setNome(texto);
           	}
        }
        if (tag.compareTo("acao") == 0) {
        	if (tagAtual.compareTo("codigoAcao") == 0) {
           	 	acao.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeAcao") == 0) {
        		acao.setNome(texto);
           	}
        }
        if (tag.compareTo("categoriaEconomica") == 0) {
        	if (tagAtual.compareTo("codigoCategoriaEconomica") == 0) {
           	 	categoriaEconomica.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeCategoriaEconomica") == 0) {
        		categoriaEconomica.setNome(texto);
           	}
        }
        if (tag.compareTo("grupoDeDespesa") == 0) {
        	if (tagAtual.compareTo("codigoGrupoDeDespesa") == 0) {
           	 	grupoDeDespesa.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeGrupoDeDespesa") == 0) {
        		grupoDeDespesa.setNome(texto);
           	}
        }
        if (tag.compareTo("elemento") == 0) {
        	if (tagAtual.compareTo("codigoElemento") == 0) {
           	 	elemento.setCodigo(texto);
        	}
        	if (tagAtual.compareTo("nomeElemento") == 0) {
        		elemento.setNome(texto);
           	}
        	
        }
        if (tag.compareTo("orcamento") == 0) {
        	if (tagAtual.compareTo("orcamentoInicial") == 0) {       		
           	 	orcamento.setOrcamentoInicial(texto);
        	}
        	if (tagAtual.compareTo("orcamentoAtualizado") == 0) {
        		orcamento.setOrcamentoAtualizado(texto);
           	}
        	if (tagAtual.compareTo("orcamentoRealizado") == 0) {
        		orcamento.setOrcamentoRealizado(texto);
        	}
        }
          
    }
 
    /**
     * Este é o saque inicial do jogo!! Recebe o nome o nome do arquivo XML de
     * entrada, instancia um objeto da classe DevmediaSAX (myDevSax) e chama o
     * método “fazerParsing” deste objeto
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
 
 
        DevmediaSAX myDevSax = new DevmediaSAX();
        myDevSax.fazerParsing("c:\\Users\\Allisson Jardel\\Desktop\\TrabalhoPersistencia\\file.xml");
    }
 
}
