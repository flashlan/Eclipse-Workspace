package loianeThis.gettersAndSetters;

/*
 * ENCAPSULAMENTO
 */

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capacCombustivel;
	private double consumoCombustivel;
	
	//criar métodos getters
	//publico, com retorno -> get + nome do atributo
	public String getMarca() {
		// padrao
		return this.marca;
	}
	
	// set é sem retorno (void)
	// contem parametro a ser passado
	public void setMarca(String marca ) {
		//sem retorno no método
		// método atribuiçãp
		this.marca = marca;		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getnumPassageiros() {
		return this.numPassageiros;
	}
	
	public void setnumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	//auto generated -> menu -> source -> generate getters and setters
	public double getCapacCombustivel() {
		return capacCombustivel;
	}

	public void setCapacCombustivel(double capacCombustivel) {
		this.capacCombustivel = capacCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
}
