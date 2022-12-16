package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La 
		//fórmula correspondiente es: F = 32 + ( 9 * C / 5)

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduca la cantidad en grados ");
		float numero;
		numero = teclado.nextFloat();
		
		float numres;
		numres= 32 + (9* numero/5);

		System.out.println (+numero+ " C equivale a " +numres+ " grados Fahrenheit");
				
		
		
				
	}

}
