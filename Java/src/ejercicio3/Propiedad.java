package ejercicio3;

public class Propiedad {

	private String domicilio;
	private double precio;
	private Tipo tipo;
	
	public Propiedad(String domicilio, double precio, Tipo tipo) {
		this.setDomicilio(domicilio);
		this.setPrecio(precio);
		this.setTipo(tipo);
	}
	
	public String getDomicilio() {
		
		return domicilio;
		
	}
	
	private void setDomicilio(String domicilio) {
		
		if (domicilio == null) {
			
			throw new IllegalArgumentException("El domicilio no puede ser null");
			
		}
		
		this.domicilio = domicilio;
		
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	private void setPrecio(double precio) {
		
		if (precio <= 0) {
			
			throw new IllegalArgumentException("El precio no puede ser negativo ni 0");
		}
		
		this.precio = precio;
	}
	
	public Tipo getTipo() {
		
		return tipo;
	}
	
	private void setTipo(Tipo tipo) {
		
		this.tipo = tipo;
	}
}
