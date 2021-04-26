package loianeThis.Static;

import loianeThis.SobrecargaDeMetodos.MinhaCalculadora;

public class testeCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		//calc.soma(1,2);
		MinhaCalculadora.soma(1,2);
		
		//Staticos calc = new Staticos();
		int soma1 = Staticos.soma(1,2);
		
		System.out.println(soma1);
		
		int soma2 = Staticos.soma(1,2,3);
		
		System.out.println(soma2);
	}
	
	static int soma2valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
