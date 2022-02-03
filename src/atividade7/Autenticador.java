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
	
		public void autentica(String userName,String senha) throws LoginFailException {
			if(this.senha.equals(senha) && this.userName.equals(userName)) {
				LocalDateTime data = LocalDateTime.now();
				MsgLogin.retornaMensagem(data);
			}else
				throw new LoginFailException("Usuário e/ou senha incorretos.");
		}
		
		public static void verificaBaseDeDados(ArrayList<Usuario> users, String userName,String senha) throws LoginFailException{
			for(Usuario aux : users) {
				aux.autentica(userName, senha);
			}
		}
}
