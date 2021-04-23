package loianeExercForWhile;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com uma nota:");
			
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10 ) {
				System.out.println("Voce digitou: " + nota);
				notaValida = true;
			} else {
				//notaValida = false;
				System.out.println("Nota inválida, digite novamente");
			}
		} while (!notaValida); // !notaValida é igual a notaValida = false: operaodr de negação
	}
}
