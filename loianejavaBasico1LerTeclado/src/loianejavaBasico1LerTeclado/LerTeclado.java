package loianejavaBasico1LerTeclado;

// import classe Scanner
import java.util.Scanner;


// variavel tipo string de nome "nome", le uma linha inteira
//String nome = scan.nextLine(); // linha inteira
//String primeiroNome = scan.next(); // retorna string
//int idade = scan.nextInt(); // le inteiro
//double altura = scan.nextDouble(); //retorna double

public class LerTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // instanc�a
		 /*System.out.println("Digite seu nome Completo: "); //msg
		String nomeCompleto = scan.nextLine(); // variavel nomecompleto para pegar entrada
		System.out.println("Seu nome completo � : " + nomeCompleto); // printa output da variavel
		
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite sua idade");
		int suaIdade = scan.nextInt();
		System.out.println("Sua idade �: " + suaIdade + " anos"); */
		
		System.out.println("Digite o seu primero nome, idade, quantidade de filhos, altura e se tem algum animale de estima��o");
		String primeiroNome = scan.next();
		int suaIdade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean animalEstimacao = scan.nextBoolean();
		System.out.println("Seu nome: " + primeiroNome + ", Idade: " + suaIdade + ", filhos: " + qtdFilhos + ", altura: " + altura + " Animais de estima��o: " + animalEstimacao);
	}
}