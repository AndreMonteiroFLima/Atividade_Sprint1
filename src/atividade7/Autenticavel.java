package atividade7;

public interface Autenticavel {

	public void setUserName(String userName);
	
	public void setSenha(String senha);
	
	public void autentica(String userName,String senha) throws LoginFailException;
	
}
