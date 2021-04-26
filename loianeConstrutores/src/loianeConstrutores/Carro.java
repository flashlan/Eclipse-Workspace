package loianeConstrutores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;
	
	
	//construtor,
	Carro() {
		System.out.println("classe carro foi instanciada");
	}
	
	// pode t-se criar  quantos construtores quiser
	Carro(String marca_, String modelo_, int numPassageiros_, double capacCombustivel_, double consumoCombustivel_)  {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capacCombustivel = capacCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	// metodos iniciam com verbo
	double obterAutonomia() {
		//acesso direto às variaveis
		System.out.println("metodo foi chamado");
		return capacCombustivel * consumoCombustivel;
	}
	
	
	//
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
	

}
