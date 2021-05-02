package loianeThis;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;
	
	

	
	// F3 para ir para a declaração no eclipse
	// pode-se criar  quantos construtores quiser
	public Carro(String marca_, String modelo_, int numPassageiros_)  {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		System.out.println("chamando o construtor com 3 parametros");
	}

	
	// this usado como construtor
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("chamando o construto com 2 parametros");
	}
	
	
	
	
	// metodos iniciam com verbo
	double obterAutonomia() {
		//acesso direto às variaveis
		System.out.println("metodo foi chamado");
		return this.capacCombustivel * this.consumoCombustivel;
	}
	
	
	//
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}
	

}
