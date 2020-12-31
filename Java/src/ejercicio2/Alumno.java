package ejercicio2;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String dni;
	private ArrayList<Evaluacion> evaluacionesRendidas;
	
	public Alumno(String nombre) {
		this.setNombre(nombre);
		evaluacionesRendidas = new ArrayList<>();
	}

	public String getNombre() {
		
		return nombre;
	}



	private void setNombre(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser null");
		}
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}
	
	private void setDni(String dni) {
		if (dni == null) {
			throw new IllegalArgumentException("El dni no puede ser null");
		}
		this.dni = dni;
	}

	public double calcularPromedio() {
		
		int acuNotas = 0;
		int cantEvaluaciones = this.evaluacionesRendidas.size();
		double promedio = 0;
		
		for(Evaluacion nota: this.evaluacionesRendidas) {
			acuNotas += nota.getNota();
		}
		promedio = acuNotas / cantEvaluaciones;
		
		return promedio;
	}
	
	public void mostrarPromedio() {
		
		System.out.println("El promedio de " + this.nombre + " es: " + calcularPromedio());
	}
	public int cantEvaluacionesRealizadas() {
		
		return this.evaluacionesRendidas.size();
	}
	
	public void agregarEvaluacion(Evaluacion evaluacion) {
		
		this.evaluacionesRendidas.add(evaluacion);
	}
}
