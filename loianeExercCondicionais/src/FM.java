

import java.util.Scanner;

public class FM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M");
		// String � uma classe no java, n�o se pode usar comparadores (pointers maybe?)]
		String sex = scan.next();
		
		
		//utilizando switch Case
		
		//switch(sex) {
		//case "F": System.out.println("Feminino"); break;
		//case "M": System.out.println("Masculino"); break;
		//default: System.out.println("Sexo inv�lido"); */
		
		//utilizando m�todos da classe String e if
		
		if (sex.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (sex.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inv�lido");
		}

	}

}
