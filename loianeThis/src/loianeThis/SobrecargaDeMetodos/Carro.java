package loianeThis.SobrecargaDeMetodos;




public class MinhaCalculadora {
	//declarar mais métodos com o mesmo nome, mas com assinaturas diferentes ( retorno com 
	//tipos diferentes ou quantidade de parametros  diferentes
	 public int soma(int num1, int num2) { 
		 return num1 + num2; 
	}
	 
	 public int soma(int num1, int num2, int num3) { 
		 return num1 + num2 + num3; 
	}
	 
	 public double soma(double num1, double num2) { 
		 return num1 + num2; 
	}
	 
	 public int soma(int[] vetorInteiros) {
		 int total = 0;
		 for (int i=0; i<vetorInteiros.length; i++ ) {
			 total += vetorInteiros[i];
		 }
		 return total;
	 }
}

public class Carro {

}
