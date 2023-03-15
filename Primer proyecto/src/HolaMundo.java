
public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("HolaMundo");
		
		// Comentario en linea
		/* Comentario en bloque
		 * a
		 * b
		 */
		
		// Declaracion de variables
		int num = 7;				// Entero
		double nuDecimal = 7.0;		// Decimal
		boolean isMayorEdad = true;	// Booleano
		String Nombre = "Mario";	// String (Siempre en mayuscula)
		
		// Arrays	
		int [] numeros = {1,2};		// Como si fuera una lista en Python
		
		int edad;
		// Inicializacion
		edad = 26;
		
		edad = Integer.parseInt("7");	// Pasar de string a entero
		
		System.out.println("Valor de la variable edad "+(edad+9));	//syso es un atajo para poner 'System.out.println'
	}

}
