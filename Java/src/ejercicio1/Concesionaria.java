package ejercicio1;

import java.util.ArrayList;

public class Concesionaria {

	private ArrayList<Vehiculo> vehiculos;
	
	public Concesionaria() {
		vehiculos = new ArrayList<>();
	}
	
	public void agregarVehiculo(Vehiculo v) {
		this.vehiculos.add(v);
	}
	
	private double calcularPrecioPromedio() {
		
		int cantVehiculos = vehiculos.size();
		
		double acuPrecio = 0;
		
		double promedio = 0;
		
		for(Vehiculo vehiculo: this.vehiculos) {
			
			acuPrecio += vehiculo.getPrecio();
		}
		
		promedio = acuPrecio / cantVehiculos;
		
		return promedio;
	}
	
	private ArrayList<Vehiculo> vehiculosMasEconomicos(){
		ArrayList<Vehiculo> vehiculosEconomicos = new ArrayList<>();
		
		for(Vehiculo vehiculo: this.vehiculos) {
			
			if(vehiculo.getPrecio()<calcularPrecioPromedio()) {
				
				vehiculosEconomicos.add(vehiculo);
			}
		}
		return vehiculosEconomicos;
	}
	
	public int cantidadDeVehiculosSegunMarca(Marca marca) {
		
		int cantVehiculosPorMarca = 0;
		
		for(Vehiculo vehiculo: this.vehiculos) {
			
			if(vehiculo.getMarca().equals(marca)) {
				
				cantVehiculosPorMarca++;
			}
		}
		return cantVehiculosPorMarca;
	}
	public void mostrarCantDeVehiculosSegunMarca(Marca marca) {
		
		int cantVehiculosPorMarca = cantidadDeVehiculosSegunMarca(marca);
		
		System.out.println("La cantidad de vehiculos que tiene la concesionaria es: " + cantVehiculosPorMarca);
		
	}
	
	public void mostrarVehiculosMasEconomicos() {
		
		ArrayList<Vehiculo> vehiculosEconomicos = vehiculosMasEconomicos();
		
		for(Vehiculo v: vehiculosEconomicos) {
			
			System.out.println(v.getMarca() + " " + v.getPrecio());
		}
	}
}
