package EnumHandOn.Enum2;

public enum DiaSemana {

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7); //enumeradores com valores
	
	private int valor; // atributo (de acordo com o design)
	
	private DiaSemana(int valor) { // construtor
		this.valor  = valor;
	}
	
	public int getValor() { // método para obter os atributos
		return this.valor;
	}
	
	
	
	

}
