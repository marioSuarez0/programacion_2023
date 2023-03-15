package javaucjc.metodos.utilidades.ejercicios;

public class carrera {

	private String nombreCarrera;
	private String nombreCircuito;
	private int parrillaSalida;
	private int distancia;
	
	public carrera(String nombreCarrera, String nombreCircuito, int parrillaSalida, int distancia) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.nombreCircuito = nombreCircuito;
		this.parrillaSalida = parrillaSalida;
		this.distancia = distancia;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public String getNombreCircuito() {
		return nombreCircuito;
	}

	public void setNombreCircuito(String nombreCircuito) {
		this.nombreCircuito = nombreCircuito;
	}

	public int getParrillaSalida() {
		return parrillaSalida;
	}

	public void setParrillaSalida(int parrillaSalida) {
		this.parrillaSalida = parrillaSalida;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void iniciarCarrera() {
		
	}
	
	
	
	
	
}
