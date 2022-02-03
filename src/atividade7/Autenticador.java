package atividade7;

import java.time.LocalDateTime;
import java.util.ArrayList;

	public class Autenticador {
	private String userName;
	private String senha;

	
	
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

	public Boolean autentica(String userName,String senha) {
		if(this.senha.equals(senha) && this.userName.equals(userName)) {
			LocalDateTime data = LocalDateTime.now();
			MsgLogin.retornaMensagem(data);
			return true;
		}
		else
			return false;
		
	}
	
	public static Boolean verificaBaseDeDados(ArrayList<Autenticavel> users, String userName,String senha) {
		for(Autenticavel aux: users) {
			if(aux.autentica(userName, senha)) {
				return true;
				
			}
		}
		return false;
	}
}
