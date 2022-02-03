package atividade8;

import java.math.BigDecimal;

public class Funcionario {
	private String nome;
	private BigDecimal salario;
	private BigDecimal bonus;
	private BigDecimal salarioLiquido;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public BigDecimal getBonus() {
		return bonus;
	}
	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	public BigDecimal getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(BigDecimal salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	@Override
	public String toString() {
		return "Funcionario " + nome + "\nSalário=" + salario + "\nBonus: " + bonus + "\nSalário Liquido: "
				+ salarioLiquido;
	}
	
	
}
