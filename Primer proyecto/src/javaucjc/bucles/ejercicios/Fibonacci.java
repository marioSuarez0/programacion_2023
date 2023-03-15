package javaucjc.bucles.ejercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int serie = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe cuantos valores desea imprimir: ");
		serie = scan.nextInt();
		
		int num1 = 0, num2 = 1, suma = 1;
		System.out.println(num1);
		for (int i = 1; i < serie; i++) {	
		System.out.println(suma);
		suma = num1 + num2;
		num1 = num2;
		num2 = suma;
		
		}
	}
}
