package loianeConstrutorComParametro;

//import loianeConstrutores.Carro;

public class testeCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		
		
		//instanciando classe 
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2 );
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capacCombustivel);
		System.out.println(van2.consumoCombustivel);
		
	}

}
