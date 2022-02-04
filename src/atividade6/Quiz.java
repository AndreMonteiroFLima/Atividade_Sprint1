/*
 * A classe Quiz possui 2 atributos Pergunta e Resposta
 * Com exce��o de 1 os outros metodos s�o padr�o * 
 */


package atividade6;

public class Quiz {
	private String pergunta;
	private String resposta;
	
	public Quiz(String pergunta,String resposta) {
		this.pergunta=pergunta;
		this.resposta=resposta;
	}
	
	public String getPergunta() {
		return pergunta;
	}
	
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	//A resposta � comparada assim que chega a resposta externa e retorna true ou false
	public boolean responde(String resposta) {
		if(this.resposta.equalsIgnoreCase(resposta)){
			return true;
		}else {
			return false;
		}
	}
	
	
}
