package javaucjc.ProgramacionOrientadaObjetos;

public class Universidad {
	
	public static void main(String[] args) {
	
		Persona persona1 = new Persona();
		persona1.nombre = "Maríad";
		
		Persona persona2 = persona1;
		persona2.nombre = "María";
		
		System.out.println(persona1.nombre);
		
		Persona persona3 = new Persona();
		persona3.nombre = "Eva";
		System.out.println(persona3.nombre);
		
		persona2 = persona3;
		
		persona3 = null;						// Pierdo a Eva
		System.out.println(persona2.apellidos);	// Sale error porque no estas refernciando nada, ya que Eva ha desaparecido
		
		
		
		
	}

}
