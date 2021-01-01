package herencia1;

public class TestH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asalariado e1 = new Asalariado("Jose",30,10000);
		Subcontratado e2 = new Subcontratado("Carlos",23,50,100);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

}
