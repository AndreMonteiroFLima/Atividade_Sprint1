package atividade8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		BigDecimal salario = new BigDecimal(0);
		Boolean ta=true,nomeNulo=false;
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
			do {
				scanner.nextLine();
				System.out.println("Digite o Nome do Funcionario:");
				nome=scanner.nextLine();
				if(nome.isBlank()) {
					nomeNulo=true;
					System.out.println("Nome invalido por favor digite um nome.");
				}else
					nomeNulo=false;
			}while(nomeNulo);
			System.out.println("Digite o Salario do Funcionario");
			try {
			salario=scanner.nextBigDecimal();
				try {
					funcionarios.add(new Funcionario(nome,salario));
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}catch(InputMismatchException e) {
				System.out.println("\n\nErro na Entrada:Utilize ',' ao invés de '.' por favor\n\n");
				scanner.next();
			}
		}
		
		for(Funcionario aux: funcionarios) {
			Contabilidade.calculaSalarioLiquido(aux);
			System.out.println(aux.toString());
		}
		
		scanner.close();
	}
	
}
