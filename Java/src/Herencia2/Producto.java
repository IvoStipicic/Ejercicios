package Herencia2;

public class Producto {

	private String marca;
	private String modelo;
	private String nroSerie;
	private int voltaje;
	private boolean estado;
	private double precio;
	
	public Producto(String marca, String modelo,double precio) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPrecio(precio);
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		
		if(marca == null) {
			
			throw new IllegalArgumentException("La marca no puede estar vacia");
			
		}
		
		this.marca = marca;
	}

	private String getModelo() {
		
		return modelo;
	}

	public void setModelo(String modelo) {
		
		if(modelo == null) {
			
			throw new IllegalArgumentException("El modelo no puede estar vacio");
			
		}
		
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		
		if(precio <= 0) {
			
			throw new IllegalArgumentException("El precio no puede ser negativo ni igual a 0");
			
		}
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
}
