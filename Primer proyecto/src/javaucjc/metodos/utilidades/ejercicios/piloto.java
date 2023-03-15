package javaucjc.metodos.utilidades.ejercicios;

public class piloto {

	private String nombrePiloto;
	private int experienciaPiloto;
	private String equipo;
	private int numVictorias;
	
	
	public piloto(String nombrePiloto, int experienciaPiloto, String equipo, int numVictorias) {
		super();
		this.nombrePiloto = nombrePiloto;
		this.experienciaPiloto = experienciaPiloto;
		this.equipo = equipo;
		this.numVictorias = numVictorias;
	}


	public String getNombrePiloto() {
		return nombrePiloto;
	}


	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}


	public int getExperienciaPiloto() {
		return experienciaPiloto;
	}


	public void setExperienciaPiloto(int experienciaPiloto) {
		this.experienciaPiloto = experienciaPiloto;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public int getNumVictorias() {
		return numVictorias;
	}


	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}
	
	
	
}
