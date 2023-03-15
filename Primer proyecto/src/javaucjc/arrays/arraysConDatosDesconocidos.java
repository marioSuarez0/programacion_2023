package javaucjc.arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class arraysConDatosDesconocidos {

	public static void main(String[] args) {

		int[][] numeros = new int[2][3];
		numeros[1][1] = 8;
		System.out.println(numeros[1][1]);

		System.out.println("Número de filas: " + numeros.length);
		System.out.println("Número de columnas: " + numeros[1].length);

		// Mostramos los datos de la matriz
		for (int i = 0; i < numeros.length; i++) { // Recorre las filas
			for (int j = 0; j < numeros[i].length; j++) { // Recorre las columnas
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}

		// Asignamos datos a la matriz
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				
			}
			
		}
		
	}

}
