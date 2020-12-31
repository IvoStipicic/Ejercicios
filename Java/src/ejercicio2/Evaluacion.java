package ejercicio2;

public class Evaluacion {

	private TipoExamen tipo;
	private int nota;
	
	public Evaluacion(TipoExamen tipo, int nota) {
		this.setNota(nota);
	}
	public int getNota() {
		return nota;
	}
	
	private void setNota(int nota) {
		
		if (nota <= 0) {
			
			throw new IllegalArgumentException("La nota no puede ser menor o igual a 0");
			
		}
		
		this.nota = nota;
	}
}
