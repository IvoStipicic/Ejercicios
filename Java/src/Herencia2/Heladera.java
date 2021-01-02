package Herencia2;

public class Heladera extends Producto{

	private int capacidadLitros;
	private boolean esFrost;
	
	public Heladera(String marca, String modelo, double precio,int capacidadLitros,boolean esFrost) {
		super(marca, modelo, precio);
		this.setCapacidadLitros(capacidadLitros);
		this.setEsFrost(esFrost);
	}
	
	public int getCapacidadLitros() {
		
		return capacidadLitros;
	}
	
	public void setCapacidadLitros(int capacidadLitros) {
		if(capacidadLitros <= 0) {
			throw new IllegalArgumentException("La capacidad no puede ser menor o igual a 0");
		}
		this.capacidadLitros = capacidadLitros;
	}
	
	public boolean isEsFrost() {
		
		return esFrost;
	}
	
	public void setEsFrost(boolean esFrost) {
		
		this.esFrost = esFrost;
	}

	public String esFrost() {
		
		String esFrost = "";
		
		if(this.isEsFrost()) {
			
			esFrost = "Si";
			
		}else {
			
			esFrost = "No";
			
		}
		
		return esFrost;
	}
	@Override
	public String toString() {
		return "Heladera: capacidad de Litros " + capacidadLitros + ", Frost: " + esFrost() + ", marca " + getMarca()
				+ ", modelo " + getModelo() + ", precio $" + getPrecio();
	}

	
	
	
}
