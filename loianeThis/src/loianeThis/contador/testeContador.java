package loianeThis.contador;

public class testeContador {
	
	//atributo estatic é compartilhado com todas as instancias da classe
	static void imprimirValor() {
		System.out.println(contador.obterValor());
	}

	public static void main(String[] args) {
		imprimirValor();
		contador.incrementar();
		contador.incrementar();
		imprimirValor();
		contador.zerar();
		imprimirValor();
		contador.incrementar();
		imprimirValor();

		
		contador c1 = new contador();
		contador c2 = new contador();
		contador c3 = new contador();
		
		imprimirValor();
		
		

	}

}
