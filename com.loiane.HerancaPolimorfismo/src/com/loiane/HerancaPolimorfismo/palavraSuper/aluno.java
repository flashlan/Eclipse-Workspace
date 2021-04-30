package com.loiane.HerancaPolimorfismo.palavraSuper;

public class aluno extends Pessoa {

	private String curso;
	private double[] notas;
	
	//super
	public aluno() {
		super();
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


}

