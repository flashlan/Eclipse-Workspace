package loianeForEach;

import java.util.Random;

public class forEach1 {

	public static void main(String[] args) {
		// loop "for" melhorado. usado muito com arrays
		// a partir do java 5
		
		int notas[] = new int[10];
		
		Random random = new Random();
		
		for (int i=0; i<notas.length; i++) {
			
			notas[i] = random.nextInt(10);
			//
		}
		
		for (int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		//mesma coisa, apenas simplificado, usar no output
		System.out.println("Usando o forEach");
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		

	}

}
