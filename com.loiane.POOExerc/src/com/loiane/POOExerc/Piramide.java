package com.loiane.POOExerc;

public class Piramide extends Figura3D{
	
	private int altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;
	
	private Figura2D base;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		} 
		return 0;
	}

	@Override
	public double calcularArea() {
		return (numPoliBase * ((arestaBase * apotema) / 2)) + base.calcularArea();
	}
	
	
	
	

}
