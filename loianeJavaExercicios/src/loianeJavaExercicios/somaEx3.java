package loianeJavaExercicios;

import java.util.Scanner;

public class somaEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite  um numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite  o pr�ximo numero: ");
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		
		
		System.out.println("A soma dos numero �: " + resultado);

	}

}
