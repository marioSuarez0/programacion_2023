package javaucjc.ProgramacionOrientadaObjetos.encapsulacion.ejercicio;

public class Coche {
	
	// Variables de instancia
	private String marcaCoche;
	private String matrícula;
	private Motor motor;
	private Volante volante;
	private double velocidad;
	
	public Coche(String marcaCoche, String matrícula, Motor motor, Volante volante, double velocidad) {
		super();
		this.marcaCoche = marcaCoche;
		this.matrícula = matrícula;
		this.motor = motor;
		this.volante = volante;
		this.velocidad = velocidad;
	}

	//Getters y setters
	public String getMarcaCoche() {
		return marcaCoche;
	}

	public void setMarcaCoche(String marcaCoche) {
		this.marcaCoche = marcaCoche;
	}

	public String getMatrícula() {
		return matrícula;
	}

	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void conducir() {
		System.out.println("Marca: " + marcaCoche + "\nMatrícula: " + matrícula + "\nMotor: " + motor + "\nVolante: " + volante);
	}

}
