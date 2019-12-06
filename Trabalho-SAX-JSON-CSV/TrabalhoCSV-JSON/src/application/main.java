package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class main {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub
		String csvArquivo = "c:\\Users\\Allisson Jardel\\Desktop\\TrabalhoPersistencia\\arquivo.csv";
		BufferedReader conteudoCSV = null;
		String linha = "";
		String csvSeparadorCampo=";";
		
		
		DocumentBuilderFactory docFactory =	DocumentBuilderFactory.newInstance();	
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();	
		
		Document doc = docBuilder.newDocument();	
		
		Element	rootElement	= doc.createElement("company");	
		doc.appendChild(rootElement);	
		
		
		
		try {
			conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
			int i = 0;
			while((linha = conteudoCSV.readLine()) != null) {
			
				if(i > 0) {
					String[] dados = linha.split(csvSeparadorCampo);
					
					Element	dado =	doc.createElement("dado");	
					rootElement.appendChild(dado);	
						
					Attr attr =	doc.createAttribute("id");	
					attr.setValue(Integer.toString(i));	
					dado.setAttributeNode(attr);
					
					//Exercicio
					
					Element exercicio = doc.createElement("exercicio");
					dado.appendChild(exercicio);
					exercicio.appendChild(doc.createTextNode(dados[0].substring(1, dados[0].length()-1)));
					
					//Orgao Superior
					
					Element orgaoSuperior =  doc.createElement("orgaoSuperior");
					dado.appendChild(orgaoSuperior);
					
					Element codigoOrgaoSuperior =  doc.createElement("codigoOrgaoSuperior");
					orgaoSuperior.appendChild(codigoOrgaoSuperior);
					codigoOrgaoSuperior.appendChild(doc.createTextNode(dados[1].substring(1, dados[1].length()-1)));
					
					Element nomeOrgaoSuperior = doc.createElement("nomeOrgaoSuperior");
					orgaoSuperior.appendChild(nomeOrgaoSuperior);
					nomeOrgaoSuperior.appendChild(doc.createTextNode(dados[2].substring(1, dados[2].length()-1)));
					
					//Orgao Subordinado
					
					Element orgaoSubordinado = doc.createElement("orgaoSubordinado");
					dado.appendChild(orgaoSubordinado);
					
					Element codigoOrgaoSubordinado = doc.createElement("codigoOrgaoSubordinado");
					orgaoSubordinado.appendChild(codigoOrgaoSubordinado);
					codigoOrgaoSubordinado.appendChild(doc.createTextNode(dados[3].substring(1, dados[3].length()-1)));
					
					Element nomeOrgaoSubordinado = doc.createElement("nomeOrgaoSubordinado");
					orgaoSubordinado.appendChild(nomeOrgaoSubordinado);
					nomeOrgaoSubordinado.appendChild(doc.createTextNode(dados[4].substring(1, dados[4].length()-1)));;
					
					//Unidade Orçamentaria
					
					Element unidadeOrcamentaria = doc.createElement("unidadeOrcamentaria");
					dado.appendChild(unidadeOrcamentaria);
					
					Element codigoUnidadeOrcamentaria = doc.createElement("codigoUnidadeOrcamentaria");
					unidadeOrcamentaria.appendChild(codigoUnidadeOrcamentaria);
					codigoUnidadeOrcamentaria.appendChild(doc.createTextNode(dados[5].substring(1, dados[5].length()-1)));
					
					Element nomeUnidadeOrcamentaria = doc.createElement("nomeUnidadeOrcamentaria");
					unidadeOrcamentaria.appendChild(nomeUnidadeOrcamentaria);
					nomeUnidadeOrcamentaria.appendChild(doc.createTextNode(dados[6].substring(1, dados[6].length()-1)));;
					
					//Função
					
					Element funcao = doc.createElement("funcao");
					dado.appendChild(funcao);
					
					Element codigoFuncao = doc.createElement("codigoFuncao");
					funcao.appendChild(codigoFuncao);
					codigoFuncao.appendChild(doc.createTextNode(dados[7].substring(1, dados[7].length()-1)));
					
					Element nomeFuncao = doc.createElement("nomeFuncao");
					funcao.appendChild(nomeFuncao);
					nomeFuncao.appendChild(doc.createTextNode(dados[8].substring(1, dados[8].length()-1)));
					
					//Subfunção
					
					Element subfuncao = doc.createElement("subfuncao");
					dado.appendChild(subfuncao);
					
					Element codigoSubfuncao = doc.createElement("codigoSubfuncao");
					subfuncao.appendChild(codigoSubfuncao);
					codigoSubfuncao.appendChild(doc.createTextNode(dados[9].substring(1, dados[9].length()-1)));
					
					Element nomeSubfuncao = doc.createElement("nomeSubfuncao");
					subfuncao.appendChild(nomeSubfuncao);
					nomeSubfuncao.appendChild(doc.createTextNode(dados[10].substring(1, dados[10].length()-1)));
					
					//Programa Orçamentário
					
					Element programaOrcamentario = doc.createElement("programaOrcamentario");
					dado.appendChild(programaOrcamentario);
					
					Element codigoProgramaOrcamentario = doc.createElement("codigoProgramaOrcamentario");
					programaOrcamentario.appendChild(codigoProgramaOrcamentario);
					codigoProgramaOrcamentario.appendChild(doc.createTextNode(dados[11].substring(1, dados[11].length()-1)));
					
					Element nomeProgramaOrcamentario = doc.createElement("nomeProgramaOrcamentario");
					programaOrcamentario.appendChild(nomeProgramaOrcamentario);
					nomeProgramaOrcamentario.appendChild(doc.createTextNode(dados[12].substring(1, dados[12].length()-1)));
					
					//Ação
					
					Element acao = doc.createElement("acao");
					dado.appendChild(acao);
					
					Element codigoAcao = doc.createElement("codigoAcao");
					acao.appendChild(codigoAcao);
					codigoAcao.appendChild(doc.createTextNode(dados[13].substring(1, dados[13].length()-1)));
					
					Element nomeAcao= doc.createElement("nomeAcao");
					acao.appendChild(nomeAcao);
					nomeAcao.appendChild(doc.createTextNode(dados[14].substring(1, dados[14].length()-1)));
					
					//Categoria Economica
					
					Element categoriaEconomica = doc.createElement("categoriaEconomica");
					dado.appendChild(categoriaEconomica);
					
					Element codigoCategoriaEconomica = doc.createElement("codigoCategoriaEconomica");
					categoriaEconomica.appendChild(codigoCategoriaEconomica);
					codigoCategoriaEconomica.appendChild(doc.createTextNode(dados[15].substring(1, dados[15].length()-1)));
					
					Element nomeCategoriaEconomica= doc.createElement("nomeCategoriaEconomica");
					categoriaEconomica.appendChild(nomeCategoriaEconomica);
					nomeCategoriaEconomica.appendChild(doc.createTextNode(dados[16].substring(1, dados[16].length()-1)));
					
					//Grupo de Despesa
					
					Element grupoDespesa = doc.createElement("grupoDeDespesa");
					dado.appendChild(grupoDespesa);
					
					Element codigoGrupoDespesa = doc.createElement("codigoGrupoDeDespesa");
					grupoDespesa.appendChild(codigoGrupoDespesa);
					codigoGrupoDespesa.appendChild(doc.createTextNode(dados[17].substring(1, dados[17].length()-1)));
					
					Element nomeGrupoDespesa = doc.createElement("nomeGrupoDeDespesa");
					grupoDespesa.appendChild(nomeGrupoDespesa);
					nomeGrupoDespesa.appendChild(doc.createTextNode(dados[18].substring(1, dados[18].length()-1)));
					
					//Elemento
					
					Element elemento = doc.createElement("elemento");
					dado.appendChild(elemento);
					
					Element codigoElemento = doc.createElement("codigoElemento");
					elemento.appendChild(codigoElemento);
					codigoElemento.appendChild(doc.createTextNode(dados[19].substring(1, dados[19].length()-1)));
					
					Element nomeElemento = doc.createElement("nomeElemento");
					elemento.appendChild(nomeElemento);
					nomeElemento.appendChild(doc.createTextNode(dados[20].substring(1, dados[20].length()-1)));

					//Orçamento
					
					Element orcamento = doc.createElement("orcamento");
					dado.appendChild(orcamento);
					
					Element orcamentoInicial = doc.createElement("orcamentoInicial");
					orcamento.appendChild(orcamentoInicial);
					orcamentoInicial.appendChild(doc.createTextNode(dados[21].substring(1, dados[21].length()-1)));
					
					Element orcamentoAtualizado = doc.createElement("orcamentoAtualizado");
					orcamento.appendChild(orcamentoAtualizado);
					orcamentoAtualizado.appendChild(doc.createTextNode(dados[22].substring(1, dados[22].length()-1)));
					
					Element orcamentoRealizado = doc.createElement("orcamentoRealizado");
					orcamento.appendChild(orcamentoRealizado);
					orcamentoRealizado.appendChild(doc.createTextNode(dados[23].substring(1, dados[23].length()-1)));
					
				}
				
				i++;
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("c:\\Users\\Allisson Jardel\\Desktop\\TrabalhoPersistencia\\file.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
