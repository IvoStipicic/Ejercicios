package ejercicio4;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String dni;
	private double saldo;
	private ArrayList<String> peliculas;
	private TipoServicio tipo;
	
	public String getDni() {
		
		return dni;
	}

	private void setDni(String dni) {
		
		if(dni == null) {
			
			throw new IllegalArgumentException("El DNI no puede ser null");
			
		}
		
		this.dni = dni;
	}

	public TipoServicio getTipo() {
		
		return tipo;
	}

	private void setTipo(TipoServicio tipo) {
		
		this.tipo = tipo;
	}

	public double obtenerSaldo() {
		
		return this.saldo;
	}
	
	public boolean buscarPelicula(String nombrePelicula) {
		
		boolean encontrada = false;
		int i = 0;
		
		while(i < this.peliculas.size() && !encontrada) {
			
			if(this.peliculas.get(i).equalsIgnoreCase(nombrePelicula)) {
				
				encontrada = true;
				
			}
			
			i++;
		}
		
		return encontrada;
	}
	
	public boolean tieneDeuda() {
		
		boolean tieneDeuda = false;
		
		if(obtenerSaldo()>0) {
			
			tieneDeuda = true;
			
		}
		
		return tieneDeuda;
	}
	
	public boolean esPremium() {
		
		boolean esPremium = false;
		
		if(this.getTipo().equals(TipoServicio.PREMIUM)) {
			
			esPremium = true;
			
		}
		
		return esPremium;
	}
	
	public void agregarPeliculaVista(String pelicula) {
		
		this.peliculas.add(pelicula);
	}
}
