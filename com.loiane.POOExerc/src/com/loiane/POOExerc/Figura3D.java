package com.loiane.POOExerc;

public abstract  class Figura3D extends FiguraGeometrica  implements DimensaoSuperficial,DimensaoVolumetrica {
	
	private double area;
	private double volume;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
}
