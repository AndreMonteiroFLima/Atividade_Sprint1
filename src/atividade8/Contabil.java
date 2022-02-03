package atividade8;

import java.math.BigDecimal;

public interface Contabil {
	
	public BigDecimal getSalario();
	
	public void setSalario(BigDecimal salario) throws Exception;
	
	public BigDecimal getBonus();
	
	public void setBonus(BigDecimal bonus);
	
	public BigDecimal getSalarioLiquido();
	
	public void setSalarioLiquido(BigDecimal salarioLiquido);
	
}
