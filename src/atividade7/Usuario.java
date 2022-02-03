package atividade7;

import java.time.LocalDateTime;

public class Usuario implements Autenticavel{
	private String userName;
	private String senha;
	
	public Usuario(String userName,String senha) {
		this.userName=userName;
		this.senha=senha;
	}
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public Boolean autentica(String userName,String senha) {
		if(this.senha.equals(senha) && this.equals(userName)) {
			LocalDateTime data = LocalDateTime.now();
			MsgLogin msg = new MsgLogin();
			msg.retornaMensagem(data);
			return true;
		}
		else
			return false;
		
	}
	
	
}
