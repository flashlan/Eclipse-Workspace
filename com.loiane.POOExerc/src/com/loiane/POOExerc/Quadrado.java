package com.loiane.POOExerc;

public class Quadrado extends Figura2D {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// int area = 0;
		//area area = new area;
		//area = lado * lado;
		//return lado * lado;
		 return Math.pow(lado,  2);
	}
	
	
	
}
