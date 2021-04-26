package loianeMetodosComParametros;

//definicão de metodos
//metodos simples: sem retorno ou parametro

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;
	
	//declarando metodo

	// metodos iniciam com verbo
	double obterAutonomia() {
		//acesso direto às variaveis
		System.out.println("metodo foi chamado");
		return capacCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
	

}
