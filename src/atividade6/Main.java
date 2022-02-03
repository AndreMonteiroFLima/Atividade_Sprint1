package atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Quiz> quiz= new ArrayList<>();
		boolean acerto;
		
		quiz.add(new Quiz("Qual a cor do céu?","Azul"));
		quiz.add(new Quiz("Quantas polegadas tem um monitor de 21'?","21"));
		quiz.add(new Quiz("Java é uma linguagem de Orientada a Objeto?(Responda com Sim ou Não)","Sim"));
		
		
		System.out.println("Digite o Seu nome:");
		
		String nome = scanner.nextLine();
		Usuario user=new Usuario(nome);
		
		for(Quiz aux: quiz) {
			System.out.println(aux.getPergunta());
			acerto=aux.responde(scanner.nextLine());
			user.incrementaAcertosErros(acerto);
			if(acerto)
				System.out.println("Acertou");
			else
				System.out.println("Errou");
		}
		
		
//		System.out.println(user.toString());
	}

}
