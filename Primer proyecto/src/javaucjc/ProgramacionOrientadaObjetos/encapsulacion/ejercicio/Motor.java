package javaucjc.ProgramacionOrientadaObjetos.encapsulacion.ejercicio;

public class Motor {

	// Variables de instancia
	private String marcaMotor;
	private int caballos;
	private Piston piston;
	
	
	public Motor(String marcaMotor, int caballos, Piston piston) {
		super();
		this.marcaMotor = marcaMotor;
		this.caballos = caballos;
		this.piston = piston;
	}


	//Getters y setters
	public String getMarcaMotor() {
		return marcaMotor;
	}


	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}


	public int getCaballos() {
		return caballos;
	}


	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}


	public Piston getPistones() {
		return piston;
	}


	public void setPistones(Piston pistones) {
		this.piston = pistones;
	}
	
	
}
