package com.loiane.tryECatch;

public class excecao {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			vetor[4] = 1;	
			System.out.println("Esse texto nao sera impresso");
			
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excecao ao acessar indice do vetor que não existe");
		}

		System.out.println("Esse texto sera impresso apos a exception");


	}

}
