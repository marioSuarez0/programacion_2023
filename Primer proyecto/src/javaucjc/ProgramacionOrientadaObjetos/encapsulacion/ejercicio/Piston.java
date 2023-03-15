package javaucjc.ProgramacionOrientadaObjetos.encapsulacion.ejercicio;

public class Piston {

	// Variables de instancia
	private int idPiston;
	private String marcaPiston;
	
	
	public Piston(int idPiston, String marcaPiston) {
		super();
		this.idPiston = idPiston;
		this.marcaPiston = marcaPiston;
	}

	
	//Getters y setters
	public int getIdPiston() {
		return idPiston;
	}


	public void setIdPiston(int idPiston) {
		this.idPiston = idPiston;
	}


	public String getMarcaPiston() {
		return marcaPiston;
	}


	public void setMarcaPiston(String marcaPiston) {
		this.marcaPiston = marcaPiston;
	}
	
}
