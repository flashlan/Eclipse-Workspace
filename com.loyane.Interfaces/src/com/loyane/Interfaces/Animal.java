package com.loyane.Interfaces;


// no java n�o � possivel extender mais de uma classe, para isso � usado interfaces

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
 