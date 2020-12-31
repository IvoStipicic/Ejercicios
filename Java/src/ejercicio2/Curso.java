package ejercicio2;

import java.util.ArrayList;

public class Curso {

	private String codigo;
	private String titulo;
	private int cantHoras;
	private ArrayList<Alumno> alumnos;
	
	public Curso(String codigo) {
		this.setCodigo(codigo);
		this.alumnos = new ArrayList<>();
	}

	public String getCodigo() {
		
		return codigo;
	}

	private void setCodigo(String codigo) {
		if (codigo == null) {
			throw new IllegalArgumentException("El codigo no puede ser null");
		}
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		if (titulo == null) {
			throw new IllegalArgumentException("El titulo no puede ser null");
		}
		this.titulo = titulo;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	private void setCantHoras(int cantHoras) {
		if (cantHoras <= 0) {
			throw new IllegalArgumentException("La cantidad de horas no puede ser menores o iguales a 0");
		}
		this.cantHoras = cantHoras;
	}
	
	public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double promedio){
		
		ArrayList<Alumno> alumnosPorEncimaDe = new ArrayList<>();
		
		final int CANT_EVAL_MIN = 2;
		
		for(Alumno a: this.alumnos) {
			
			if(a.calcularPromedio()>promedio && a.cantEvaluacionesRealizadas()>=CANT_EVAL_MIN) {
				
				alumnosPorEncimaDe.add(a);
			}
		}
		
		return alumnosPorEncimaDe;
	}
	
	public void mostrarAlumnosConMejoresPromedios(double promedio) {
		
		ArrayList<Alumno> mejoresAlumnos = buscarAlumnosPorEncimaDe(promedio);
		
		System.out.println("Los mejores alumnos son:");
		
		for(Alumno a: mejoresAlumnos) {
			
			System.out.println(a.getNombre() + " " + a.calcularPromedio());
			
		}
	}
	
	public void agregarAlumnoAlCurso(Alumno a) {
		this.alumnos.add(a);
	}
}
