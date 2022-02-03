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
	public boolean responde(String resposta) {
		if(this.resposta == resposta){
			return true;
		}else {
			return false;
		}
	}
	
	
}
