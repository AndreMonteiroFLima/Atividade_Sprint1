/*
*
*Funcionario implementa contabil e tem a classe contabilidade dentro de si
*assim deixando que os metodos sejam executados por essa classe alinhada
*
*
*/

package atividade8;

import java.math.BigDecimal;

public class Funcionario implements Contabil{
	private String nome;
	private Contabilidade contabilidade;
	
	
	public Funcionario(String nome, BigDecimal Salario) throws Exception {
		this.nome=nome;
		contabilidade= new Contabilidade();
		contabilidade.setSalario(Salario);
	}
	public Contabilidade getContabilidade() {
		return contabilidade;
	}
	public void setContabilidade() {
		this.contabilidade = new Contabilidade();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return contabilidade.getSalario();
	}
	public void setSalario(BigDecimal salario) throws Exception{
		contabilidade.setSalario(salario);
	}
	public BigDecimal getBonus() {
		return contabilidade.getBonus();
	}
	
	public void setBonus(BigDecimal bonus) {
		this.contabilidade.setBonus(bonus);;
	}
	
	public BigDecimal getSalarioLiquido() {
		return contabilidade.getSalarioLiquido();
	}
	
	public void setSalarioLiquido(BigDecimal salarioLiquido) {
		this.contabilidade.setSalarioLiquido(salarioLiquido);
	}
	
	@Override
	public String toString() {
		if(contabilidade.getBonus().floatValue()<0)
			return "Funcionario " + nome + "\nSal�rio: " + contabilidade.getSalario() + "\nDesconto: " + contabilidade.getBonus().multiply(BigDecimal.valueOf(-1)) + "\nSal�rio Liquido: "
				+ contabilidade.getSalarioLiquido();
		else
			return "Funcionario " + nome + "\nSal�rio: " + contabilidade.getSalario() + "\nBonus: " + contabilidade.getBonus() + "\nSal�rio Liquido: "
			+ contabilidade.getSalarioLiquido();
	}
	

	
}
