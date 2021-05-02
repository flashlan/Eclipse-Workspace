package com.loiane.HerancaPolimorfismo.modificadores;

public class Professor extends Pessoa {

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String curso;
	private double salario;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	
	//sobreescrevendo metodo
	public String obterEtiquetaEndereco() {
		String s = "Endereco do professor: ";
		//concatenando
		s += this.getEndereco();
		
		return s;
		
		//return endereco;
	}
	
}


