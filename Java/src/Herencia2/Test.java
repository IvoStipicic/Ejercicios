package Herencia2;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CasaElectrodomesticos casa = new CasaElectrodomesticos();
		
		Heladera heladera = new Heladera("Whirlpool","H2745",14999,250,false);
		casa.agregarProductos(heladera);
		Televisor tv = new Televisor("Philips","49PGFS",14370,49,true);
		casa.agregarProductos(tv);
		Lavarropa lavarropa = new Lavarropa("Drean","CONCEPT 5.05",6799,6,false);
		casa.agregarProductos(lavarropa);
		
		casa.ofrecerProductos();
	}

}
