package atividade7;

public interface Autenticavel {

	public void setUserName(String userName);
	
	public void setSenha(String senha);
	
	public Boolean autentica(String userName,String senha);
	
}
