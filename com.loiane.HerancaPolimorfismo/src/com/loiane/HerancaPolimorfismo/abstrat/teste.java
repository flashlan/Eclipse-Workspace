package com.loiane.HerancaPolimorfismo.abstrat;


public class teste {

	public static void main(String[] args) {
		// polimorfismo em tempo de execução
		//Pessoa pessoa = new Pessoa(); //chama o método da clase pessoa
		Pessoa aluno = new Aluno(); //chama o método da classe aluno
		Pessoa professor = new Professor(); //chama o metodo da classe professor

		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2 , num 2 ");
		professor.setEndereco("Rua 3, num 3");

		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
	}

}
