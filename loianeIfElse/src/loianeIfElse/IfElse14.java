package loianeIfElse;

import java.util.Scanner;

public class IfElse14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) { 
			System.out.println("� maior de idade:");
		} else {
			System.out.println("� menor de idade");
		}
		
		System.out.println("Entre com o valor do item");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		} else if (valor > 15 && valor < 17) {
			System.out.println("POde pesquisar mais");
		} if ( valor >= 17) {
			System.out.println("Esta muito caro");
		}
	}
}