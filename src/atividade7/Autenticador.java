/*
 * Essa classe tira os metodos relacionados a autenticação da classe usuario
 * assim podendo ser usada por outras classes sem a necessidade da repetição de código
 * Mas sem a necessidade de herança, permitindo que essas classes posteriormente tenham
 * filhos
 * 
 */


package atividade7;

import java.time.LocalDateTime;
import java.util.ArrayList;

	public class Autenticador {
		
		private String userName;
		private String senha;		
		
		
		public Autenticador(String userName, String senha) {
			this.userName = userName;
			this.senha = senha;
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
	
		public Boolean autentica(String userName,String senha) throws LoginFailException {
			if(getSenha().equals(senha) && getUserName().equals(userName)) {
				LocalDateTime data = LocalDateTime.now();
				MsgLogin.retornaMensagem(data);
				return true;
			}else
				throw new LoginFailException("Usuário e/ou senha incorretos.");
		}
		
		public static void verificaBaseDeDados(ArrayList<Autenticavel> users, String userName,String senha) throws LoginFailException{
			for(Autenticavel aux : users) {
				if(aux.autentica(userName, senha))
					break;
			}
		}
}
