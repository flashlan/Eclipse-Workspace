package loianeJavaExercicios;


import java.util.Scanner;

public class metrosParaCentimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a medida em metros: ");
		double medida = scan.nextDouble();
		double converte = medida * 100;
		System.out.println("A medida convertida para centimetros ficaria: " + converte + " centimetros");

	}

}
