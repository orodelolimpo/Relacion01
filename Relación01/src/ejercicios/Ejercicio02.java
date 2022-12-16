package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 2. Programa Java que lea un nombre y muestre por pantalla: “Buenos días nombre_introducido”

		Scanner teclado = new Scanner (System.in);
		String nombre;
		System.out.println("Escriba su nombre ");
		nombre = teclado.nextLine();
		
		System.out.println("Buenos días "+nombre);
	}

}
