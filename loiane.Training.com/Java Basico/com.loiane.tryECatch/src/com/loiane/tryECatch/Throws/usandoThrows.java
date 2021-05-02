package com.loiane.tryECatch.Throws;

import java.util.Scanner;
//de acordo com a lingua (locale) digite 4,5 ou 4.5
public class usandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um numero decimal");
		
		try {
			double num = leNumero();
			System.out.println("Voce digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}

//dar uma mensagem amigavel .pois a saida pode dar informacaoes para uma invasao do sistema
