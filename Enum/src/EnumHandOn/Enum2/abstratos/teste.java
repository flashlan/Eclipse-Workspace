package EnumHandOn.Enum2.abstratos;

public class teste {

	public static void main(String[] args) {


		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}
	}

}
