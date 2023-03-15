package javaucjc.metodos.utilidades;

import java.util.Scanner;

public class Utilidades {

	// Metodo para pintar un menu por defecto

	public static void pintarMenu() {

		System.out.println(
				"\nSeleccione la opción deseada entre:\n1) Validar email\n2) Pintar el cuadrado\n3) Mostrar datos\n4) Salir");

	}

	public static void pintarMenu(String menu) {

		pintarMenu(menu, "\\|");

	}

	public static void pintarMenu(String menu, String caracter) {

		String [] opciones = menu.split(caracter);
		pintarMenu(opciones);

	}

	public static void pintarMenu(String[] menu) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}

	}
	
	public static String pideDatos(String mensaje) {
		String resultado = "";
		
		System.out.println(mensaje);
		Scanner scan = new Scanner (System.in);
		resultado = scan.nextLine();
		
		return resultado;
	}
	
	
	
}
