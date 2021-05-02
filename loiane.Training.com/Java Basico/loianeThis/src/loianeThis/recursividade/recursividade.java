package loianeThis.recursividade;

public class recursividade {
	
	//método nao recurssivo
	
	public static int FatorialNaoRecurssivo(int num) {
		int total = 1;
		for (int i = num; i < 1; i--) {
			total += 1;
		}
		return total;
	}
	 
	
	//método recurssivo
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
