package atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Quiz> quiz= new ArrayList<>();
		boolean acerto,nomeNulo=false;
		String nome;
		Usuario user = new Usuario();
		
		//Inicializando Perguntas e Respostas
		quiz.add(new Quiz("Qual a cor do céu?","Azul"));
		quiz.add(new Quiz("Quantas polegadas tem um monitor de 21'?","21"));
		quiz.add(new Quiz("Java é uma linguagem de Orientada a Objeto?(Responda com Sim ou Não)","Sim"));
		
		//Cuidando do nome Vazio
		do {
			System.out.println("Digite o Seu nome:");
			nome=scanner.nextLine();
			if(nome.equals("")) {
				nomeNulo=true;
				System.out.println("Nome invalido por favor digite um nome.");
			}
			else
				user=new Usuario(nome);
		}while(nomeNulo);
		//
		
		//Para cada quiz dentro da collection quiz ele vai mostrar a pergunta e receber a resposta
		for(Quiz aux: quiz) {
			System.out.println(aux.getPergunta());
			acerto=aux.responde(scanner.nextLine());
			user.incrementaAcertosErros(acerto);
			if(acerto)
				System.out.println("Acertou");
			else
				System.out.println("Errou");
		}
		
		System.out.println(user.toString());

//		System.out.println(user.toString());
	}

}
