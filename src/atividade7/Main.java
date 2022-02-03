package atividade7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Autenticavel> users= new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		String userName,senha;
		
		users.add(new Usuario("Andre","123"));
		users.add(new Usuario("Gionni","12345"));
		users.add(new Usuario("Renan","12345"));
		users.add(new Usuario("Thauany","12346"));
		
		System.out.println("Usuario:");
		userName=scanner.nextLine();
		System.out.println("Senha:");
		senha=scanner.nextLine();
		
		if(Autenticador.verificaBaseDeDados(users, userName, senha)==false)
			System.out.println("Usuário e/ou senha incorretos.");
		
		
		scanner.close();
	}

}
