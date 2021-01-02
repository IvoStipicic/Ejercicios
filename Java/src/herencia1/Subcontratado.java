package herencia1;

public class Subcontratado extends Empleado{

	private float cantHoras;
	private float precioHora;
	
	public Subcontratado(String nombre, int edad,float cantHoras,float precioHora) {
		
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.setPrecioHora(precioHora);
		
	}
	
	public float getCantHoras() {
		return cantHoras;
	}

	private void setCantHoras(float cantHoras) {
		if(cantHoras < 0) {
			throw new IllegalArgumentException("Las cantidad de horas no pueden ser menores a 0");
		}
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	private void setPrecioHora(float precioHora) {
		if(precioHora <= 0) {
			throw new IllegalArgumentException("el precio de las horas no pueden ser menores o iguales a 0");
		}
		this.precioHora = precioHora;
	}

	@Override
	public float calcularPago() {
		// TODO Auto-generated method stub
		return this.cantHoras * this.precioHora;
	}

	@Override
	public String toString() {
		
		return super.toString() + " Sueldo: $" + this.calcularPago();
	}
}
