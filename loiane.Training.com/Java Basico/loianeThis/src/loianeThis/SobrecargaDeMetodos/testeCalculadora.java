package loianeThis.SobrecargaDeMetodos;

public class testeCalculadora {
	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		//chama o metodo automaticamente presumindo que são 2 inteiros
		calc.soma(1, 2);
		
		calc.soma(1.0, 2.0);
	}

}
