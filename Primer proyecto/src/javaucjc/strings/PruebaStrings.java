package javaucjc.strings;

public class PruebaStrings {

	public static void main(String[] args) {
		String nombre = "Caperucita Roja";
		nombre = nombre.toUpperCase();
		
		System.out.println(nombre);
		
		String lobo1 = "lobo";
		String lobo2 = "lobo";
		
		System.out.println(lobo1.equals(lobo2));
		
		lobo2 = nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		
		System.out.println(nombre.endsWith("TA"));  	//Saca si el string indicado acaba en TA
		
		System.out.println(nombre.indexOf("R"));		//Saca la primera posicion en la que se encuentra la letra R dentro de el string nombre
		
		System.out.println(nombre.lastIndexOf("A"));	// Saca la última posicion en la que se encuentra la letra A dentro de el string nombre
		
		System.out.println("       asd           asdsawe    ".trim()); //Elimina espacios
		
		System.out.println("       asd           asdsawe    ".replace(" ", ""));  //Sustituye lo primero por lo segundo
		
		System.out.println(nombre.substring(3));	//Elimina los caracteres hasta esa posicion
		
		System.out.println(nombre.substring(3, 7)); 
		
		int posicion = nombre.indexOf(" ");
		System.out.println(nombre.substring(posicion).trim());
		
		String cadena = "N1;A1;DNI1;23;MADRID";
		String [] valores = cadena.split(";");		//Para separar por el caracter que indiques
		for(String valor : valores) {
			System.out.println(valor);
		}
	}

}
