package loianeExercCondicionais;

import java.util.Scanner;

public class VOgalConsoante {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite uma letra:");
	String letra = scan.next();
		
	if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
		System.out.println("vogal");
	} else {
		System.out.println("consoante");
	}
		

}