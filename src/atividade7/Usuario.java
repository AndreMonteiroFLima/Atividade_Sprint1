package atividade7;

import java.time.LocalDateTime;

public class Usuario implements Autenticavel{
	private Autenticador autenticador;
	
	public Usuario(String userName,String senha) {
		autenticador= new Autenticador();
		autenticador.setUserName(userName);
		autenticador.setSenha(senha);
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
	public Boolean autentica(String userName,String senha) {
		return this.autenticador.autentica(getUserName(), getSenha());
	}
	
	
}
