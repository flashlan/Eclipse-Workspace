package loianeConstrutores;

public class Carro2 {
	public Carro2(String marca, String modelo, int numPassageiros, double capacCombustivel, double consumoCombustivel) {
		super();
		//"this.marca" referencia o atributo e o "marca" regferencia o parametro
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacCombustivel = capacCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	String marca;
	String modelo;
	int numPassageiros;
	double capacCombustivel;
	double consumoCombustivel;

}

//hybernate semrpe precisa de ao menos um construtor vasio
