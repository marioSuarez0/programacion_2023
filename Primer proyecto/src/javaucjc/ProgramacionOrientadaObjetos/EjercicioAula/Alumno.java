package javaucjc.ProgramacionOrientadaObjetos.EjercicioAula;

public class Alumno {

	//Variables de instancia
	private String nombreAlumno;
	private String apellidoAlumno;
	private Asignatura[] asignaturas;

	public Alumno(String nombreAlumno, String apellidoAlumno, Asignatura[] asignaturas) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.asignaturas = asignaturas;
	}

	//Getters y setters
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public Asignatura[] getAsigntura() {
		return asignaturas;
	}

	public void setAsigntura(Asignatura asigntura) {
		this.asignaturas = asignaturas;
	}

}