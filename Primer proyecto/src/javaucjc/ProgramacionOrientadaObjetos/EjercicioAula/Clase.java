package javaucjc.ProgramacionOrientadaObjetos.EjercicioAula;

public class Clase {

	public static void main(String[] args) {

		Asignatura asignatura1Alumno1 = new Asignatura("Programación", 7.0);
		Asignatura asignatura2Alumno1 = new Asignatura("Matemáticas", 6.0);

		Asignatura[] asignaturas1 = { asignatura1Alumno1, asignatura2Alumno1 };

		Alumno alumno1 = new Alumno("Nombre1", "Apellido1", asignaturas1);

		Asignatura asignatura1Alumno2 = new Asignatura("Programación", 8.0);
		Asignatura asignatura2Alumno2 = new Asignatura("Matemáticas", 5.0);

		Asignatura[] asignaturas2 = { asignatura1Alumno2, asignatura2Alumno2 };

		Alumno alumno2 = new Alumno("Nombre2", "Apellido2", asignaturas2);

		// Creo el aula con los alumnos
		Alumno[] alumnos = { alumno1, alumno2 };

		System.out.println("Hay " + alumnos.length + " alumnos en el aula");

		System.out.print(alumnos[0].getNombreAlumno() + " ");
		System.out.println(alumnos[0].getApellidoAlumno());

		System.out.print(alumnos[0].getAsigntura()[0].getNombre() + " ");
		System.out.println(alumnos[0].getAsigntura()[0].getNota());
		System.out.print(alumnos[0].getAsigntura()[1].getNombre() + " ");
		System.out.println(alumnos[0].getAsigntura()[1].getNota());

		System.out.print(alumnos[1].getNombreAlumno());
		System.out.print(" ");
		System.out.println(alumnos[1].getApellidoAlumno());

		System.out.print(alumnos[1].getAsigntura()[0].getNombre() + " ");
		System.out.println(alumnos[1].getAsigntura()[0].getNota());
		System.out.print(alumnos[1].getAsigntura()[1].getNombre() + " ");
		System.out.println(alumnos[1].getAsigntura()[1].getNota());

		// También se puede hacer con bucles el \t tabula

		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombreAlumno());
			Asignatura[] asignaturasAlumno = alumno.getAsigntura();
			for (Asignatura asignatura : asignaturasAlumno) {
				System.out.println("\t" + asignatura.getNombre() + " nota:" + asignatura.getNota());

			}

		}

		// Nota media

		double NotaAlumnos = 0;
		int totalAsignaturas = 0;
		for (Alumno alumno : alumnos) {
			Asignatura[] asignaturasAlumno = alumno.getAsigntura();
			int numAsignaturasAlumno = asignaturasAlumno.length;
			totalAsignaturas += numAsignaturasAlumno;
			for (Asignatura asignatura : asignaturasAlumno) {
				NotaAlumnos += asignatura.getNota();
			}
		}
		System.out.println("\nLa nota media de todos los alumnos es " + NotaAlumnos / totalAsignaturas);

		// Averiguar la nota media más alta
		double notaMediaMasAlta = 0;
		Alumno alumnoNotaMediaMasAlta = null;
		for (Alumno alumno : alumnos) {
			double notasAlumno = 0;
			Asignatura[] asignaturasAlumno = alumno.getAsigntura();
			int numAsignaturasAlumno = asignaturasAlumno.length;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumno += asignatura.getNota();
			}
			
			double mediaAlumno = notasAlumno / numAsignaturasAlumno;
			if (mediaAlumno > notaMediaMasAlta) {
				notaMediaMasAlta = mediaAlumno;
				alumnoNotaMediaMasAlta = alumno;
			}
		}

		System.out.println("El alumno con la nota media más alta es " + alumnoNotaMediaMasAlta.getNombreAlumno()
				+ " con una nota media de " + notaMediaMasAlta);
	}
}