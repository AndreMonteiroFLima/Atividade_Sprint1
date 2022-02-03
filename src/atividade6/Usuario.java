package atividade6;

public class Usuario {
	private String nomeUsuario;
	private int acertos;
	private int erros;
	
	public Usuario(){
		
	}
	
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
	
	public void incrementaAcertosErros(Boolean teste) {
		if(teste)
			this.acertos++;
		else
			this.erros++;
	}
	
	public int getErros() {
		return erros;
	}
	
	@Override
	public String toString() {
		return("\nUsuario " + getNomeUsuario() + "\n Acertos: " + getAcertos() + "\n Erros: " + getErros());
	}
	
}
