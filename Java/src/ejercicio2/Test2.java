package ejercicio2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Academia a = new Academia();
		
		Curso c = new Curso("c");
		a.agregarCurso(c);
		Curso c1 = new Curso("c1");
		a.agregarCurso(c1);
		Curso c2 = new Curso("c");
		a.agregarCurso(c2);
		
		Alumno a0 = new Alumno("Lucas");
		a0.agregarEvaluacion(new Evaluacion(TipoExamen.PRIMER_EXAMEN,7));
		a0.agregarEvaluacion(new Evaluacion(TipoExamen.SEGUNDO_EXAMEN,7));
		c.agregarAlumnoAlCurso(a0);
		Alumno a1 = new Alumno("Mariano");
		a1.agregarEvaluacion(new Evaluacion(TipoExamen.PRIMER_EXAMEN,4));
		a1.agregarEvaluacion(new Evaluacion(TipoExamen.SEGUNDO_EXAMEN,9));
		c.agregarAlumnoAlCurso(a1);
		Alumno a2 = new Alumno("Maria");
		a2.agregarEvaluacion(new Evaluacion(TipoExamen.PRIMER_EXAMEN,5));
		a2.agregarEvaluacion(new Evaluacion(TipoExamen.SEGUNDO_EXAMEN,2));
		c.agregarAlumnoAlCurso(a2);
		Alumno a3 = new Alumno("Luciana");
		a3.agregarEvaluacion(new Evaluacion(TipoExamen.PRIMER_EXAMEN,10));
		a3.agregarEvaluacion(new Evaluacion(TipoExamen.SEGUNDO_EXAMEN,9));
		c.agregarAlumnoAlCurso(a3);
		Alumno a4 = new Alumno("Nicolas");
		a4.agregarEvaluacion(new Evaluacion(TipoExamen.PRIMER_EXAMEN,2));
		a4.agregarEvaluacion(new Evaluacion(TipoExamen.SEGUNDO_EXAMEN,2));
		c.agregarAlumnoAlCurso(a4);
		
		a0.mostrarPromedio();
		a1.mostrarPromedio();
		a2.mostrarPromedio();
		a3.mostrarPromedio();
		a4.mostrarPromedio();
		
		c.mostrarAlumnosConMejoresPromedios(5);
		
		
	}

}
