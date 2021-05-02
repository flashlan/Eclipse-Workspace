package com.loiane.POOExerc;

public class Cubo extends Figura3D {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
		// return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * (lado*lado);
		
	}

}
