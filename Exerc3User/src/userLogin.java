import java.util.Scanner;

public class userLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//flag
		boolean userOk = false;
				 	
		do  {
			System.out.println("Digite um nome de usuario: ");
			String user = scan.next();
			System.out.println("Digite uma senha: ");
			String senha = scan.next();
			
			// usar equalsIgnoreCase para compara��o ( String � uma classe)
			if (user.equalsIgnoreCase(senha)) {
				System.out.println("Senha � igual ao nome de usauario! escolha outra senha:");
			} else {
				System.out.println("Registrado!");
				userOk = true;
			}
		} while (!userOk);
	}
}
