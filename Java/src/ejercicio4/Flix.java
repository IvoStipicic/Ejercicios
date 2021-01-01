package ejercicio4;

import java.util.ArrayList;

public class Flix {

	private ArrayList<Cliente> listaClientes;
	
	public Flix() {
		
		listaClientes = new ArrayList<>();
		
	}
	
	public Resultado verPelicula(String dni,String nombrePelicula) {
		
		Resultado resultado = Resultado.ALQUILER_OK;
		
		Cliente cliente = clienteBuscado(dni); 
		
		if(cliente != null) {
			
			if(cliente.buscarPelicula(nombrePelicula)) {
				
				if(!cliente.tieneDeuda()) {
					
					if(!cliente.esPremium()) {
						
						resultado = Resultado.CONTENIDO_NO_DISPONIBLE;
						
					}else {
					
						cliente.agregarPeliculaVista(nombrePelicula);
						
					}
					
				}else {
					
					resultado = Resultado.CLIENTE_DEUDOR;
					
				}
				
			}else {
				
				resultado = Resultado.CONTENIDO_INEXISTENTE;
				
			}
			
		}else {
			
			resultado = Resultado.CLIENTE_INEXISTENTE;
			
		}
		
		return resultado;
	}
	
	private Cliente clienteBuscado(String dni) {
		
		Cliente clienteBuscado = null;
		
		int i = 0;
		
		while(i < this.listaClientes.size() && clienteBuscado == null) {
			
			if(this.listaClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				
				clienteBuscado = this.listaClientes.get(i);
				
			}
		}
		
		return clienteBuscado;
	
	}
	
	public void darDeBaja(String dni) {
		
		Cliente cliente = clienteBuscado(dni);
		
		if(cliente != null) {
			
			this.listaClientes.remove(cliente);
			
		}
	}
}
