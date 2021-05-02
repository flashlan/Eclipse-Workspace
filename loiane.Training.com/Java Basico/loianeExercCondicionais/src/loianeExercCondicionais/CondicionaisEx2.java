package loianeExercCondicionais;

import java.util.Scanner;

public class CondicionaisEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor negativo ou positivo:");
		int num = scan.nextInt();
		
		if (num > 0) {
		System.out.println( "O valor é positivo");
		} else { 
			System.out.println("O valor é negativo");
		}

	}

}
