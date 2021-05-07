package comloiane.EscopoVariaveis;

public class EscopoVariaveis {

		private int valor;
		
		public int getValor() {
			return valor;
		}
		
		public void setValor(int valor) { 
			this.valor = valor;//referencia ao atributo "da classe" (this) recebe parametro
		}
		
		public int calculaValor(int valor) {
			valor = valor + 10; //referencia ao parametro
			return valor;
		}
		
		public int teste() {
			
			int valor = 5; //variavel local com escopo somente dentro do metodo
			
			if (true) {
				valor--;
			}
			//this.valor = valor; // referencia valor global/atributos da classe
			return valor;
		}
		
		public void outroTeste() {
			
			for (int i = 0; i < 10; i++) { //observe int declarando tipo
				System.out.println(i);
			}
			
			//i++; //erro de compilacao// fora do bloco for
			
			int j;
			for (j = 0; j < 10; j++) {
				System.out.println(j);
			}
			
			System.out.println(j); //j tem valor de 10
		}
		
		public void maisUmTeste() {
			
			boolean flag = true;
			
			if (flag) {
				
				int umaVariavel = 10;
				umaVariavel++;
				System.out.println(umaVariavel);
			}
			
			// System.out.println(umaVariavel); //erro de comilacao

		}
		public void maisUmOutroTeste (int num) {
			
			int total = 0;
			
			try {
				int outroNum = 0;
				
				total = num/outroNum;
			} catch (Exception e) {
				e.printStackTrace(); //variavel "e" visivel apenas dentro do bloco
			} finally {
				
				total++;
				//outronum++;
				//e.printStackTrace(); //erro de compilacao
			}
		}

}
