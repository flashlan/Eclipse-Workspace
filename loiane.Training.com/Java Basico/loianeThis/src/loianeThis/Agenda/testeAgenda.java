package loianeThis.Agenda;

import java.util.Scanner;

public class testeAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o nome do contato");
		String nome = scan.nextLine();
		
		
;		Agenda agenda = new Agenda(nome);
		//agenda.setNome("Fulano");

	}

}
