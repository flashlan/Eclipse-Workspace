package loianeJavaExercicios;

import java.util.Scanner;

public class areaDoCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//double pi = 3.145;
		System.out.println("Digite a area:");
		double raio = scan.nextDouble();
		//double area = (raio * raio) * pi;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A Área do círculo é:" + area);
		

	}

}
