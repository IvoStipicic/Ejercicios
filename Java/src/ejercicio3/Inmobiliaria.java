package ejercicio3;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Barrio> propiedadesALaVentaPorBarrio;
	
	public Inmobiliaria() {
		
		propiedadesALaVentaPorBarrio = new ArrayList<>();
		
	}
	
	public void mostrarPropiedades() {
		
		for(Barrio b: this.propiedadesALaVentaPorBarrio) {
			
			System.out.println("Las propiedades a la venta que tiene a la venta en el barrio de " + b.getNombre() + " son:");
			
			b.mostrarPropiedades();
		}
	}
	
	public boolean borrarPropiedad(String domicilio) {
		
		int i = 0;
		
		boolean pudo = false;
		
		while(i<this.propiedadesALaVentaPorBarrio.size() && !pudo) {
			
			if(this.propiedadesALaVentaPorBarrio.get(i).eliminarPropiedad(domicilio)) {
				
				pudo = true;
				
				System.out.println("Se elimino la propiedad que estaba en el barrio de : " + this.propiedadesALaVentaPorBarrio.get(i).getNombre());
			}
			
			i++;
		}
		return pudo;
	}
	
	public void cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		
		Barrio barrioAnterior = buscarPropiedadEnBarrio(domicilio);
		
		
		if(barrioAnterior != null) {
			
			barrio.agregarPropiedead(barrioAnterior.buscarPropiedad(domicilio));
			
			barrioAnterior.eliminarPropiedad(domicilio);
		}
	}
	
	private Barrio buscarPropiedadEnBarrio(String domicilio) {
		
		int i = 0;
		Barrio barrioBuscado = null;
		
		while(i < this.propiedadesALaVentaPorBarrio.size() && barrioBuscado == null) {
			
			if(this.propiedadesALaVentaPorBarrio.get(i).buscarDomicilio(domicilio)) {
				
				barrioBuscado = this.propiedadesALaVentaPorBarrio.get(i);
				
			}
		}
		return barrioBuscado;
	}
	public void agregarBarrio(Barrio barrio) {
		this.propiedadesALaVentaPorBarrio.add(barrio);
	}
}
