package Herencia2;

public class Licuadora extends Producto{

	private int potencia;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, double precio, int potencia, int cantVelocidades) {
		super(marca, modelo, precio);
		this.setPotencia(potencia);
		this.setCantVelocidades(cantVelocidades);
	}
	
	
	public int getPotencia() {
		
		return potencia;
		
	}
	
	private void setPotencia(int potencia) {
		
		if(potencia <= 0) {
			
			throw new IllegalArgumentException("La potencia no puede ser menor o igual a 0");
			
		}
		this.potencia = potencia;
		
	}
	
	public int getCantVelocidades() {
		
		return cantVelocidades;
		
	}
	
	private void setCantVelocidades(int cantVelocidades) {
		
		if(cantVelocidades <= 0) {
			
			throw new IllegalArgumentException("Las velocidades no puede ser menor o igual a 0");
			
		}
		this.cantVelocidades = cantVelocidades;
		
	}


	@Override
	public String toString() {
		return "Licuadora [potencia=" + potencia + ", cantVelocidades=" + cantVelocidades + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
}
