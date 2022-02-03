package atividade6;

public class Usuario {
	private String nomeUsuario;
	private int acertos;
	private int erros;
	
	public Usuario(String nomeUsuario){
		this.nomeUsuario=nomeUsuario;		
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}
	
	@Override
	public String toString() {
		return("Usuario " + nomeUsuario + "\n Acertos: " + acertos + "\n Erros: " + erros);
	}
	
}
