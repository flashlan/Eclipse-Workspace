package com.loiane.HerancaPolimorfismo.palavraFinal;

// final -> nao permite instancias
public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	// public -> visivel para outros pacotes
	// default -> somente dentro do pacote
	// private -> vizivel somente dentro da propria classe
	public String nomeVisibilidade;
	
	public Pessoa() {} 
	
	public Pessoa(String nome, String endereco, String telefone) {
		//super sempre que for usar referencia a superclasse ( igual oa this mas para a superclasse)
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//public abstract String obterEtiquetaEndereco();
	
	//public abstract void imprimirEtiquetaEndereco();
	
}

