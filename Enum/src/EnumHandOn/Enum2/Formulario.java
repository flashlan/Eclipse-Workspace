package EnumHandOn.Enum2;

public class Formulario {
	
	enum Genero {
		FEMINIMO('F'), MASCULINO('M');
		
		private char valor; //atributo valor
		
		Genero(char valor) { //construtor
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;

}
