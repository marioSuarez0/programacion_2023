package javaucjc.ProgramacionOrientadaObjetos.EjercicioAula;

public class Asignatura {

	// Variables de instancia
	private String nombreAsignatura;
	private double nota;

	public Asignatura(String nombre, double nota) {
		super();
		this.nombreAsignatura = nombre;
		this.nota = nota;
	}

	// Getters y setters
	public String getNombre() {
		return nombreAsignatura;
	}

	public void setNombre(String nombre) {
		this.nombreAsignatura = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
