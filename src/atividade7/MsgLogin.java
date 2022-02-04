/*
 * Essa classe cuida exclusivamente de mostrar a mensagem do login
 *  
 */


package atividade7;

import java.time.LocalDateTime;

public abstract class MsgLogin {

	public static void retornaMensagem(LocalDateTime data) {
		if(data.getHour()>=6 && data.getHour()<12)
			System.out.println("Bom dia,você se logou ao nosso sistema");
		else if(data.getHour()>=12 && data.getHour()<18)
			System.out.println("Boa tarde,você se logou ao nosso sistema");
		else if(data.getHour()>=18 && (data.getHour()<=23 && data.getMinute()<=59))
			System.out.println("Boa noite,você se logou ao nosso sistema");
		else
			System.out.println("Boa madrugada,você se logou ao nosso sistema");
		
	}
}
