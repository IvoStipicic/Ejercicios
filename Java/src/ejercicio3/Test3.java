package ejercicio3;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inmobiliaria i = new Inmobiliaria();
		
		Barrio b1 = new Barrio("Palermo");
		i.agregarBarrio(b1);
		Barrio b2 = new Barrio("Belgrano");
		i.agregarBarrio(b2);
		
		Propiedad p1 = new Propiedad("Santa fe 3000",70000,Tipo.CASA);
		b1.agregarPropiedead(p1);
		Propiedad p2 = new Propiedad("Santa fe 4000",80000,Tipo.DEPARTAMENTO);
		b1.agregarPropiedead(p2);
		Propiedad p3 = new Propiedad("Cabildo 2000",90000,Tipo.CASA);
		b2.agregarPropiedead(p3);
		Propiedad p4 = new Propiedad("Cabildo 1000",100000,Tipo.CASA);
		b2.agregarPropiedead(p4);
		Propiedad p5 = new Propiedad("Cabildo 3000",120000,Tipo.CASA);
		b2.agregarPropiedead(p5);
		Propiedad p6 = new Propiedad("Cabildo 4000",150000,Tipo.DEPARTAMENTO);
		b2.agregarPropiedead(p6);
		
		i.mostrarPropiedades();
		System.out.println("----------------------------");
		b2.mostrarPropiedadesPorTipo(Tipo.CASA);
		System.out.println("----------------------------");
		i.borrarPropiedad(p1.getDomicilio());
		System.out.println("----------------------------");
		i.mostrarPropiedades();
		System.out.println("----------------------------");
		i.cambiarPropiedadDeBarrio(p2.getDomicilio(), b2);
		System.out.println("----------------------------");
		i.mostrarPropiedades();
		
	}

}
