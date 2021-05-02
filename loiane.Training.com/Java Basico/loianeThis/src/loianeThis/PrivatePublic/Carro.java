package loianeThis.PrivatePublic;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;
	
	
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
