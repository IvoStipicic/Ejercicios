package herencia1;

public class Vendedor extends Subcontratado{

	private float porcentaje;
	
	
	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		if(porcentaje < 0) {
			throw new IllegalArgumentException("El porcentaje no puede ser negativo");
		}
		this.porcentaje = porcentaje;
	}

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.setPorcentaje(porcentaje);
	}
	
	@Override 
	public float calcularPago() {
		
		return (super.getCantHoras() * super.getPrecioHora()) * (1 + this.porcentaje/100);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Sueldo: $" + this.calcularPago();
	}

}
