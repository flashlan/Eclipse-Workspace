package loianeOOPExerc1;

import java.util.Date;

public class exercOOPLivros {

	public static void main(String[] args) {
		livroBiblioteca livro = new livroBiblioteca();
		livro.titulo = "Livor teste";
		livro.autor = "random";
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadpPara = "Everton";
		
		System.out.println("título do livro: " + livro.titulo);
	}

}
