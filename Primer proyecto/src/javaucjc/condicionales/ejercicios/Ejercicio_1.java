package javaucjc.condicionales.ejercicios;

import java.util.Scanner;	//ctrl + shift + o

/*
 * Declarar variable de tipo String para representar el nombre de un mes
 * A partir del mes indicar la estación del año
 */

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);	// Es como un input
		System.out.println("Escribe el nombre de un mes: ");
		mes = scan.nextLine();	// Almacena los datos introducidos en la variable mes
		System.out.println("Mes introducido: " + mes);
		
	
	// Realizamos con el if
		String estacion = "";
	if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) {
		estacion = "Invierno";
	}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
		estacion = "Primavera";
	}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
		estacion = "Verano";				
	}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
		estacion = "Otoño";
	}else {
		estacion = "erronea";
	}
	System.out.println("La estación del mes "+ mes + " es "+ estacion);
	
	
	// Switch
	switch (mes) {
	case "Enero":System.out.println("Invierno");
	case "Febrero":System.out.println("Invierno");
	case "Marzo":System.out.println("Invierno");break;
	case "Abril":System.out.println("Primavera");
	case "Mayo":System.out.println("Primavera");
	case "Junio":System.out.println("Primavera");break;
	case "Julio":System.out.println("Verano");
	case "Agosto":System.out.println("Verano");
	case "Septiembre":System.out.println("Verano");break;
	case "Octubre":System.out.println("Otoño");
	case "Noviembre":System.out.println("Otoño");
	case "Diciembre":System.out.println("Otoño");break;
	default :System.out.println("Te has equivocado");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
}
