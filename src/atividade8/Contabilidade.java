/*
 * Classe com a função de tirar o que for de contabilidade do funcionario
 * já que por mais que ele seja um contabil não precisa que os metodos sejam 
 * desenvolvidos dentro dele
 * A classe utiliza BigDecimal para garantir a precisão dos valores
 * 
 */

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
	
	/*
	 * Metodos estaticos que cuidam dos valores internos da contabilidade
	 * como calcular o bonus e o salario liquido, os metodos são altamente acoplados
	 * assim sendo dependentes, mas deixando os valores seguros de alteração
	 * extrena
	 * 
	 */
	
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
