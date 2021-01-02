package Herencia2;

public class Televisor extends Producto{

	private float pulgadas;
	private boolean esSmart;
	
	public Televisor(String marca, String modelo, double precio) {
		super(marca, modelo, precio);
		// TODO Auto-generated constructor stub
	}

	
	public float getPulgadas() {
		return pulgadas;
	}


	private void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}


	public boolean isEsSmart() {
		return esSmart;
	}


	private void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}

	public String esSmart() {
		String esSmart = "";
		if(this.esSmart) {
			esSmart = "Si";
		}else {
			esSmart = "No";
		}
		return esSmart;
	}
	@Override
	public String toString() {
		return "Televisor [pulgadas=" + pulgadas + ", esSmart=" + this.esSmart() + "]";
	}
	
	
}
