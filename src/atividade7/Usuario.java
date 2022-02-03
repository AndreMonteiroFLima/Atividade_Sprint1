package atividade7;

public class Usuario implements Autenticavel{
	private Autenticador autenticador;
	
	public Usuario(String userName,String senha) {
		autenticador = new Autenticador(userName,senha);
	}
	
	public String getUserName() {
		return this.autenticador.getUserName();
	}


	public void setUserName(String userName) {
		this.autenticador.setUserName(userName);
	}


	public String getSenha() {
		return this.autenticador.getSenha();
	}


	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public void autentica(String userName,String senha) throws LoginFailException{
		this.autenticador.autentica(userName, senha);
	}
	
	
}
