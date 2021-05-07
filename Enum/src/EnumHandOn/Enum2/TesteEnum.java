package EnumHandOn.Enum2;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values(); // metodo values do enum retrona um array com todos oa valores do enum

		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}

}
