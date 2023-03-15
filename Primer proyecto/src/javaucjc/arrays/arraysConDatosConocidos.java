package javaucjc.arrays;

public class arraysConDatosConocidos {

	public static void main(String[] args) {

		String [] colores = {"Rojo", "Azul", "Amarillo"};
		System.out.println(colores.length);
		System.out.println(colores[2]);
		
		//Recorremos el array con el for tradicional
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}
		
		//Recorremos el array con el bucle for each
		for (String color : colores) {
			System.out.println(color);
		}
	}

}
