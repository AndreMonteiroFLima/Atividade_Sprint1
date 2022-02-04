package atividade7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Autenticavel> users= new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		String userName,senha;
		boolean again= true;
		
		users.add(new Usuario("Andre","123"));
		users.add(new Usuario("Gionni","12345"));
		users.add(new Usuario("Renan","12345"));
		users.add(new Usuario("Thauany","12346"));
		
		do {
			System.out.println("Usuario:");
			userName=scanner.nextLine();
			System.out.println("Senha:");
			senha=scanner.nextLine();
			
			try{
				Autenticador.verificaBaseDeDados(users, userName, senha);
				again=false;
			}catch(LoginFailException e) {
				System.out.println(e.getMessage());
				again=true;
			}
		}while(again);
		scanner.close();
	}

}
