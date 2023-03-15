package javaucjc.condicionales;

public class Condicionales {
	
	public static void main(String[] args) { 
// Para crear 'public static void main(String[] args) {', se puede poner main+ctrl+space
		
		int numero1 = 10;
		int numero2 = 9;
		
		if (numero1>numero2 || numero1<0) { 					// || es un or y && es and
			System.out.println("Numero1 es mayor");
		}else if (numero2>0) {
			System.out.println("Número2 es mayor que 0");
		}else {
			System.out.println("No se cumple ninguna condición");
		}
		
		// Condiciones con switch
		String mensaje = "Hola";
		switch(mensaje) {
			case "Hola": System.out.println("Saludando");
		}
		
		switch (numero1) {
			case 2:System.out.println("Valor2");break;
			case 10:System.out.println("Valor10");break;
			case 1:System.out.println("Valor1");break;
			default: System.out.println("Otro valor");break;
		}
	}
	
	
}
