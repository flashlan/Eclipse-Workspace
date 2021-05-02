package loianeThis.realacionamentoEntreClasses;


// tem-um e tem-muitos


public class testeContato {

	public static void main(String[] args) {
		
		contato Contato1 = new contato();
		Contato1.setNome("User1");
		//Contato1.setEndereco("Algum lugar");
		//Contato1.setTelefone("42 9999909999");
		
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumRua("n/a");
		end.setEstado("Parana");
		end.setCep("84570-000");
		end.setCidade("Mallet");

		Telefone tel2 = new Telefone();
		tel2.setTipo("Celular"); 
		tel2.setDdd("42"); 
		tel2.setNumero("98878-0999");

		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("42");
		tel.setNumero("98878-0999");
		
		//tem-muitos ( com array)
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		Contato1.setTelefones(telefones);

		Contato1.setEndereco(end);
		//relacionamento tem-um telefone
		//Contato1.setTelefones(tel);
		
		System.out.println(Contato1.getNome());
		System.out.println(Contato1.getTelefones());
		//senao passa endereco na memoria
		//passivel de dar null pointer exception (use if)(ver null safe operator)
		if (Contato1.getEndereco() != null) {
			System.out.println(Contato1.getEndereco().getCidade());
		}
		/*if (Contato1.getTelefones() != null) {
			System.out.println(Contato1.getTelefones().getNumero()); */
		if (Contato1 != null && Contato1.getTelefones() != null) {
			for (Telefone t  : Contato1.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
