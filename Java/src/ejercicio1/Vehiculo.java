package ejercicio1;

import java.util.ArrayList;

public class Vehiculo {
	
	private Marca marca;
	private double precio;
	private TipoVehiculo tipo;
	private ArrayList<Persona> listaInteresados;
	
	public Vehiculo(Marca marca, double precio) {
		
		this.setMarca(marca);
		this.setPrecio(precio);
	}
	
	public double getPrecio() {
		return precio;
	}
	
	private void setPrecio(double precio) {
		
		if(precio<=0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual a 0");
		}
		this.precio = precio;
	}
	
	public Marca getMarca() {
		
		return marca;
	}
	
	private void setMarca(Marca marca) {
		
		if (marca==null) {
			throw new IllegalArgumentException("La marca no puede ser null");
		}
		this.marca = marca;
	}
}
