package Herencia2;

public class Lavarropa extends Producto{

	private int capacidadMax;
	private boolean esAutomatico;
	
	public Lavarropa(String marca, String modelo, double precio, int capacidadMax, boolean esAutomatico) {
		super(marca, modelo, precio);
		this.setCapacidadMax(capacidadMax);
		this.setEsAutomatico(esAutomatico);
	}
	
	public int getCapacidadMax() {
		
		return capacidadMax;
	}
	
	private void setCapacidadMax(int capacidadMax) {
		if(capacidadMax <= 0) {
			throw new IllegalArgumentException("La capacidad maxima no puede ser menor o igual a 0");
		}
		this.capacidadMax = capacidadMax;
	}
	
	public boolean isEsAutomatico() {
		
		return esAutomatico;
		
	}
	
	private void setEsAutomatico(boolean esAutomatico) {
	
		this.esAutomatico = esAutomatico;
		
	}
	
	public String esAutomatico() {
		
		String automatico = "";
		
		if(this.isEsAutomatico()) {
			automatico = "Si";
		}else {
			automatico = "No";
		}
		return automatico;
	}

	@Override
	public String toString() {
		return "Lavarropa: capacidad maxima " + capacidadMax + " litros, automatico: " + esAutomatico() + ", marca "
				+ getMarca() + ", modelo " + getModelo() + ", precio $" + getPrecio();
	}
	
	
}
