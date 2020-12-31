package ejercicio1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concesionaria c = new Concesionaria();
		
		Vehiculo v1 = new Vehiculo(Marca.DEBROLET,100);
		c.agregarVehiculo(v1);
		Vehiculo v2 = new Vehiculo(Marca.DEBROLET,10000);
		c.agregarVehiculo(v2);
		Vehiculo v3 = new Vehiculo(Marca.DEBROLET,10000);
		c.agregarVehiculo(v3);
		Vehiculo v4 = new Vehiculo(Marca.GIAT,100);
		c.agregarVehiculo(v4);
		Vehiculo v5 = new Vehiculo(Marca.QEUGEOT,1);
		c.agregarVehiculo(v5);
		
		System.out.println(c.cantidadDeVehiculosSegunMarca(Marca.GIAT));
		c.mostrarVehiculosMasEconomicos();
		
		
	}

}
