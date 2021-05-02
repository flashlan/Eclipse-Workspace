package loianeLampadaLigar;

public class testeLampada {

	public static void main(String[] args) {
		lampada lamp1 = new lampada();
		System.out.println("estado da lamapada: " + lamp1.ligada);
		lamp1.ligar();
		System.out.println("estado da lamapada: " + lamp1.ligada);
		lamp1.desligar();
		System.out.println("estado da lamapada: " + lamp1.ligada);
		

	}

}
