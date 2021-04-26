package loianeMetodosComParametros;

//import loianeMetodosComRetorno.Carro;

public class testeCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.marca = "volkswagen";
		fusca.modelo = "antigo";
		fusca.capacCombustivel = 50;
		fusca.consumoCombustivel = 20;
		
		System.out.println(fusca.marca);

		//fusca.obterAutonomia();
		 System.out.println(fusca.obterAutonomia());
		
		 //double autonomia = fusca


	}

}