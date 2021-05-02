package com.loiane.HerancaPolimorfismo.modificadores;

public class Aluno extends Pessoa{
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "sesdfsdf";
		super.nomeVisibilidade = "sadfsdf";
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	//metodos
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	// sobreescrevendo metodo
	public String obterEtiquetaEndereco() {
		String s = "Endereco de aluno: ";
		//concatenando
		s += this.getEndereco();
		
		return s;
		
		//return endereco;
	}
}

