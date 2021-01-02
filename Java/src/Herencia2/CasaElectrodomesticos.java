package Herencia2;

import java.util.ArrayList;
import java.util.Scanner;

public class CasaElectrodomesticos {
	final Scanner input = new Scanner(System.in);
	private ArrayList<Producto> listaProductos;
	
	public CasaElectrodomesticos() {
		
		listaProductos = new ArrayList<>();
	}
	
	public void agregarProductos(Producto producto) {
		
		this.listaProductos.add(producto);
	}
	public void ofrecerProductos() {
		
		int i = 0; 
		double total = 0;
		
		System.out.println("Estos productos son lo que tenemos para ofrecerle, en caso de no estar interesado presione cero (0). Si desea continuar presione 1");
		
		int numeroIngresado = input.nextInt();
		
		while(numeroIngresado != 0 && i < this.listaProductos.size()) {
			
			mostrarProducto(this.listaProductos.get(i));
			
			total = total + this.listaProductos.get(i).getPrecio();
			
			System.out.println("Desea seguir con la compra. Presione 1 para continuar o 0 para terminar la compra");
			
			numeroIngresado = input.nextInt();
			
			i++;
			
		}
		mostrarTicket(total);
	}
	
	public void mostrarProducto(Producto p) {
		
		System.out.println(p.toString());
		
	}
	public void mostrarTicket(double total) {
		
		System.out.println("Ticket: $" + total);
		
	}
}
