package loianeExercArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercArrays3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valor da posição:" + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		//formatar decimais no vetor B1
		DecimalFormat df = new DecimalFormat("###,###.###");
			
		System.out.println("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(df.format(vetorB[i]) + " ");
		}
		System.out.println();

	}

}
