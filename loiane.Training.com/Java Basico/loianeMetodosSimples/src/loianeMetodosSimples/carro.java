package loianeMetodosSimples;

//definic�o de metodos
// metodos simples: sem retorno ou parametro

public class carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;
	
	//declarando metodo
	//void = sem retorno
	// metodos iniciam com verbo
	void exibirAutonomia() {
		//acesso direto �s variaveis
		System.out.println("A autonomia do carro � " + capacCombustivel * consumoCombustivel + " km" );
	}
	

}
