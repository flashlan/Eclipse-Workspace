
public class operadorLogicos {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1 ) && (valor2 == 2);
		System.out.println("valor1 � 1 AND valor valor2 � 2 - resultado:" + resultado1);
		
		boolean resultado2 = (valor1 == 1 ) || (valor2 == 2);
		System.out.println("valor1 � 1 OR valor valor2 � 2 - resultado:" + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado3 = falso &
				verdadeiro;
		boolean resultado4 = falso &&
				verdadeiro; //sempre utilizado duplo em java, (chama-se curo circuito, pois se  a primeira for falsa, a segunda nem � verificada,( debugar)
		System.out.println(resultado3);
		System.out.println(resultado4);
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		//System.out.println(verdadeiro && falso);
		//System.out.println(verdadeiro && falso);
		

	}

}
