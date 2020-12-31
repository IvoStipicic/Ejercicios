package ejercicio2;

import java.util.ArrayList;

public class Academia {

	private ArrayList<Curso> cursos;
	
	public Academia() {
		this.cursos = new ArrayList<>();
	}
	
	public void agregarCurso(Curso curso) {
		
		if(buscarCurso(curso.getCodigo())==null) {
			
			this.cursos.add(curso);
			
			System.out.println("El curso se agrego con exito");
			
		}else {
			
			System.out.println("El curso ya existe");
			
		}
	}
	
	private Curso buscarCurso(String codigo) {
		
		Curso cursoBuscado = null;
		int i = 0;
		
		while(i<this.cursos.size() && cursoBuscado == null) {
			
			if(this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				
				cursoBuscado = this.cursos.get(i);
				
			}
			
			i++;
		}
		return cursoBuscado;
	}
}
