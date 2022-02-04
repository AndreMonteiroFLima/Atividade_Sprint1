/*
 * A classe Autenticavel foi uma classe feita pensando no posterior
 * crescimento do projeto, assim se necessario outras classes periam ser
 * autenticaveis
 */

package atividade7;

public interface Autenticavel {

	public void setUserName(String userName);
	
	public void setSenha(String senha);
	
	public String getUserName();
	
	public String getSenha();
	
	
	public Boolean autentica(String userName,String senha) throws LoginFailException;
	
}
