package loianeLoopFor;

// for (inicialização; condição; atualização) {
//		bloco de codigo
//}

public class LoopFor {

	public static void main(String[] args) {
		for (int i=0; i < 5000; i++) {
			System.out.println("i tem o valor de " + i);
		}
		
		for (int i = 5; i > 0 ; i--) {
			System.out.println("i tem o valor de " + i);
		}
		
		for (int i=0, j=10; i < j ; i++, j-- ) {
			System.out.println("i= " + i + ", j: " + j);
		}
		
		// partes ausentes
		
		//int i = 0;
		//for ( ; i < 5 ; ) {
		//	System.out.println("i tem o valor: " + i);
		//	i++;
		//}
	}
}
