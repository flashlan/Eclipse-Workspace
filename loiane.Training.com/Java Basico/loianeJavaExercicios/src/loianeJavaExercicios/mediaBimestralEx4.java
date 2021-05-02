package loianeJavaExercicios;
import java.util.Scanner;


public class mediaBimestralEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite suas 4 notas:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media é: " + media);
		
	}

}
