package EnumHandOn.Enum2;

public class teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		// proprio nome e m�todo getValor mas no DB � possivel guaradar apenas o valor
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
	}

}

/**
 * Enums extends a classe java.lang.
 * Enum Podem ser comparados usando == 
 * N�o podem ser instanciados com new 
 * Podem implementar Interfaces 
 * Podem ser decladrados separadamente ou dentro de classe
 */
