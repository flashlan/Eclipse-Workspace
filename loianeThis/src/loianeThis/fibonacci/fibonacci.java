package loianeThis.fibonacci;

public class fibonacci {
	
	public static int calcFibonacci(int num) {
		if (num < 2) {
			return 1;
		}
		return calcFibonacci(num-1) + calcFibonacci(num-2);
	}
		//inicial = 1;
		
				
}
