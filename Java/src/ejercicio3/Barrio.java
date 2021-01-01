package ejercicio3;

import java.util.ArrayList;

public class Barrio {

	private String nombre;
	private ArrayList<Propiedad> listaPropiedades;
	
	public Barrio(String nombre) {
		
		this.setNombre(nombre);
		
		listaPropiedades = new ArrayList<>();
		
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
	
	public void mostrarPropiedadesPorTipo(Tipo tipoPropiedad) {
		
		for(Propiedad p: this.listaPropiedades) {
			
			if(p.getTipo().equals(tipoPropiedad)) {
				
				System.out.println("Las propiedades a la venta que son de tipo " + tipoPropiedad + " son:");
				
				System.out.println("Domicilio: " + p.getDomicilio() + "\nPrecio: $" + p.getPrecio());
				
			}
		}
	}
	
	public void mostrarPropiedades() {
		
		for(Propiedad p: this.listaPropiedades) {
			
				System.out.println(p.getDomicilio() + " " + p.getPrecio());
				
			}
		}
	
	public int cantPropiedades() {
		
		return this.listaPropiedades.size();
	}
	
	public Propiedad buscarPropiedad(String domicilio) {
		
		Propiedad propiedadBuscada = null;
		int i = 0;
		
		while(i<this.listaPropiedades.size() && propiedadBuscada == null) {
			
			if(this.listaPropiedades.get(i).getDomicilio().equalsIgnoreCase(domicilio)) {
				
				propiedadBuscada = this.listaPropiedades.get(i);
			}
			
			i++;
		}
		
		return propiedadBuscada;
	}
	public boolean eliminarPropiedad(String domicilio) {
		
		Propiedad eliminarPropiedad = buscarPropiedad(domicilio);
		
		boolean pudo = false;
		
		if(eliminarPropiedad != null) {
			
			this.listaPropiedades.remove(eliminarPropiedad);
			
			pudo = true;
			
		}
		
		return pudo;
	}
	
	public void agregarPropiedead(Propiedad propiedad) {
		
		this.listaPropiedades.add(propiedad);
	}
	
	public boolean buscarDomicilio(String domicilio) {
		
		boolean encontrado = false;
		int i = 0;
		
		while(i<this.listaPropiedades.size() && !encontrado) {
			
			if(this.listaPropiedades.get(i).getDomicilio().equalsIgnoreCase(domicilio)) {
				
				encontrado = true;
			}
			
			i++;
		}
		
		return encontrado;
	}
}
