package atividade8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		BigDecimal salario = new BigDecimal(0);
		Boolean ta=true;
		int qtdFuncionarios=0;
		ArrayList<Funcionario> funcionarios= new ArrayList<>();
		
		do{
			try {
				System.out.println("Quantos Funcionarios serão cadastrados?");
				qtdFuncionarios=scanner.nextInt();
				ta=false;
			}catch(Exception e) {
				System.out.println("Numero Invalido, tente outra vez");
				ta=true;
				scanner.nextLine();
			}
		}while(ta);
		
		while(funcionarios.size()<qtdFuncionarios) {
			System.out.println("Digite o Nome do Funcionario");
			nome=scanner.next();
			System.out.println("Digite o Salario do Funcionario");
			salario=scanner.nextBigDecimal();
			try {
				funcionarios.add(new Funcionario(nome,salario));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		for(Funcionario aux: funcionarios) {
			Contabilidade.calculaSalarioLiquido(aux);
			System.out.println(aux.toString());
		}
	}
}
