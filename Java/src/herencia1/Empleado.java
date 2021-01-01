package herencia1;

public abstract class Empleado {

	private String nombre;
	private int edad;
	private final int EDAD_MINIMA = 18;
	
	
	public Empleado(String nombre, int edad) {
		
		this.setNombre(nombre);
		
		this.setEdad(edad);
		
	}
	
	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if(nombre ==null) {
			
			throw new IllegalArgumentException("El nombre no puede ser null");
			
		}
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		
		if(edad<EDAD_MINIMA) {
			
			throw new IllegalArgumentException("La edad no puede ser menor a 18");
			
		}
		
		this.edad = edad;
	}
	
	public String toString() {
		
		return "[Nombre = " + this.nombre + ", edad = " + this.edad + "]";
	}

	public abstract float calcularPago();
}
