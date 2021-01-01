package herencia1;

public class Asalariado extends Empleado{

	private float sueldo;
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
	}
	
	public float getSueldo() {
		return sueldo;
	}

	private void setSueldo(float sueldo) {
		if(sueldo <= 0) {
			throw new IllegalArgumentException("El sueldo no puede ser menor o igual a 0");
		}
		this.sueldo = sueldo;
	}

	@Override
	public float calcularPago() {
		// TODO Auto-generated method stub
		return this.getSueldo();
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Sueldo: $" + this.calcularPago();
	}
}
