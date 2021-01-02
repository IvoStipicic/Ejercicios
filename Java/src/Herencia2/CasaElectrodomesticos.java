package Herencia2;

import java.util.ArrayList;

public class CasaElectrodomesticos {

	private ArrayList<Producto> listaProductos;
	
	public CasaElectrodomesticos() {
		
		listaProductos = new ArrayList<>();
	}
	
	public void agregarProductos(Producto producto) {
		
		this.listaProductos.add(producto);
	}
	
}
