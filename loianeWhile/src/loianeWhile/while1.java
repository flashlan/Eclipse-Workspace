package loianeWhile;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 1; //count
		int max = 10;
		
		System.out.println("contando até " + max);
		
		while(i <= max ) {
			System.out.println("O valor de i: " + i);
			i++; // i = i +1; ou i += 1;
		}
		
		//fora ( print esta antes na ultima fica sem imprimir
		//do while (ele executa  e somente depois avalia a expressao
		System.out.println(i);
		
		do {
			i++;
			System.out.println("valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
	}

}
