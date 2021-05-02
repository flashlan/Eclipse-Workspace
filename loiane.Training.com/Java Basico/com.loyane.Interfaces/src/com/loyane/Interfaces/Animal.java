package com.loyane.Interfaces;


// no java não é possivel extender mais de uma classe, para isso é usado interfaces

// interface 
public abstract class Animal {
	private String nome;
	
	
	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
 