package loianeThis.realacionamentoEntreClasses;

//realacionamento "tem um"

public  class contato {
	
	private String nome;
	//alterando tipo de variavel para seu proprio tipo
	private Endereco endereco;
	//para muitos melhor utilizar collections
	private Telefone[]  telefones;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
