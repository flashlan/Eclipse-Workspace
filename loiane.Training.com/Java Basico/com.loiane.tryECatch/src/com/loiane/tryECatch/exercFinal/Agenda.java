package com.loiane.tryECatch.exercFinal;

public class Agenda {
	
	//array de contatos
	private Contato[] contatos;
	
	//construtor
	public Agenda() {
		//criando com capacidade para 5 contatos
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) {
		boolean cheia = true;
		for (int i=0; i<contatos.length; i++) {
			if (contatos[i] != null) {
				contatos[i] = c;
				cheia = false
			}
		}
		if (cheia) {
			throw new AgendaCheiaException();
		}
	}
	
	public void consultaContatoPorNome() {
		for (int i=0; i<contatos.length; i++) {
			if (contatos[i] != null;) {
				if (contatos[i].getNome())
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			s += c.toString() + "\n";
		}
		return s;
	}

}
