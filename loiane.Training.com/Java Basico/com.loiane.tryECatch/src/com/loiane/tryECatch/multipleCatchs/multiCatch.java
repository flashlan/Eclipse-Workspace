package com.loiane.tryECatch.multipleCatchs;

public class multiCatch {
	public static void main(String[] args) {
		
		int[] numeros = { 4,8,16,32,64,128};
		int[] denom = { 2, 0, 4, 8, 10};
		
		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " = " + (numeros[i]/denom[i]));
			} 
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posição do array inválida");
			}
			
		}
	}

}
