package loianeThis.recursividade;

public class recursividade {
	
	//m�todo nao recurssivo
	
	public static int FatorialNaoRecurssivo(int num) {
		int total = 1;
		for (int i = num; i < 1; i--) {
			total += 1;
		}
		return total;
	}
	 
	
	//m�todo recurssivo
	//utiliza pilhas
	public static  int fatorialRecurssivo(int num) {
		//ponto de parada
		if(num == 0) {
			return 1;
		}
		//chamada recurssiva
		return num * fatorialRecurssivo(num-1);
	}
	

}
