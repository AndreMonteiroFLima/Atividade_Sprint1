package atividade8;

import java.math.BigDecimal;

public class Contabilidade {
	private BigDecimal salario;
	private BigDecimal bonus;
	private BigDecimal salarioLiquido;
	
	
	
	public Contabilidade() {
		this.salario = new BigDecimal(0);
		this.bonus = new BigDecimal(0);
		this.salarioLiquido = new BigDecimal(0);
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) throws Exception {
		if(salario.floatValue()<0)
			throw new Exception("Salario Invalido");
		else
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
	
	public static BigDecimal calculaBonus(Contabil c){
		if(c.getSalario().floatValue()<=1000) {
			c.setBonus(c.getSalario().multiply(BigDecimal.valueOf((0.20))));
		}else if(c.getSalario().floatValue()>1000 && c.getSalario().floatValue()<=2000) {
			c.setBonus(c.getSalario().multiply(BigDecimal.valueOf(0.10)));
		}else{
			c.setBonus(c.getSalario().multiply(BigDecimal.valueOf(-0.10)));
		}
		return c.getBonus();
	}
	
	public static void calculaSalarioLiquido(Contabil c){
		if(calculaBonus(c).floatValue()<0)
			c.setSalarioLiquido(c.getSalario().add(c.getBonus()));
		else
			c.setSalarioLiquido(c.getSalario().add(c.getBonus()));
	}

}
