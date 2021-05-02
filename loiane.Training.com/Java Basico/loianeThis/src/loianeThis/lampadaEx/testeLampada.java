package loianeThis.lampadaEx;

public class testeLampada {

	public static void main(String[] args) {
		lampada lamp1 = new lampada();
		System.out.println(lamp1.isLigada());
		lamp1.setLigada(true);
		System.out.println(lamp1.isLigada());

	}

}
