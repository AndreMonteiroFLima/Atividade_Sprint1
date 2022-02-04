package atividade7;

public class Usuario implements Autenticavel{
	private Autenticador autenticador;
	
	public Usuario(String userName,String senha) {
		autenticador = new Autenticador(userName,senha);
	}
	
	@Override
	public String getUserName() {
		return this.autenticador.getUserName();
	}

	@Override
	public void setUserName(String userName) {
		this.autenticador.setUserName(userName);
	}

	@Override
	public String getSenha() {
		return this.autenticador.getSenha();
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}
	

	@Override
	public Boolean autentica(String userName,String senha) throws LoginFailException{
		return this.autenticador.autentica(userName, senha);
	}

	
	
}
