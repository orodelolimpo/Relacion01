package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// 3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla 
		//el doble y el triple de ese número
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduca un número ");
		int numero = 0;
		numero = teclado.nextInt();
		 
		int num1;
		int num2;
				
		num1= numero*2;
		num2= numero*3;
		
		System.out.println(" El doble es "  +num1+ " y el triple es " +num2);
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
	}

}
