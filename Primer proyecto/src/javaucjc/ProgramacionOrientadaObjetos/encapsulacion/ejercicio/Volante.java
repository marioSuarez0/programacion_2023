package javaucjc.ProgramacionOrientadaObjetos.encapsulacion.ejercicio;

public class Volante {

	// Variables de instancia
	private int idVolante;
	private String tipo;
	private String color;
	
	
	public Volante(int idVolante, String tipo, String color) {
		super();
		this.idVolante = idVolante;
		this.tipo = tipo;
		this.color = color;
	}

	
	//Getters y setters
	public int getIdVolante() {
		return idVolante;
	}


	public void setIdVolante(int idVolante) {
		this.idVolante = idVolante;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
