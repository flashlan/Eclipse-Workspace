package loianeBreak;

import java.util.Scanner;

public class continue1 {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			//sysout e ctrl+space
			System.out.println("Entre com um numero");
			int num = scan.nextInt();
			
			System.out.println("Entre com um limite");
			int max = scan.nextInt();
			
			for (int i=num; i <= max; i++) {
				// se for divizivel por 7, sai e imprime o valor de i
				if (i % 7 == 0) {
					//System.out.println("O valor de i �: " + i);
					//para uso com for aninhados, usado comumente  para nao entrar no "for" interno
					continue;
				}
			}

		}


	

}
