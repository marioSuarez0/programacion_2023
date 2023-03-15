package javaucjc.metodos.utilidades.ejercicios;

public class coche {

	private String escuderia;
	private String motor;
	private int numCoche;
	private piloto piloto;
	private int velocidad;
	private int avance;
	
	public coche(String escuderia, String motor, int numCoche, javaucjc.metodos.utilidades.ejercicios.piloto piloto,
			int velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numCoche = numCoche;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumCoche() {
		return numCoche;
	}

	public void setNumCoche(int numCoche) {
		this.numCoche = numCoche;
	}

	public piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(piloto piloto) {
		this.piloto = piloto;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	
	public void correr() {
		int numero = (int)(Math. random()*10+1);
		avance = avance + numero + velocidad + piloto.getExperienciaPiloto();
	}
	
}
