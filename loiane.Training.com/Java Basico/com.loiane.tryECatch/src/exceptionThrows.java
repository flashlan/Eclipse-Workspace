
public class exceptionThrows {
	public static void main(String[] args) {
		
		int[] numeros = { 4,8,16,32,64,128};
		int[] denom = { 2, 0, 4, 8, 10};
		
		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " = " + (numeros[i]/denom[i]));
			} 
			catch(Exception e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
				
				
			/*}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posição do array inválida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			
		}*/
	}

		}


	}

}
