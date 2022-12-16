package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// 13. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final 
		//igual que en el ejemplo.
		
		System.out.println("Introduce un número entero de 5 cifras");
		
		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		System.out.println();
		numero=numero;	
		System.out.println(numero);
		numero= numero/10;
		System.out.println(numero);
		numero= numero/100;
		System.out.println(numero);
		numero=numero/1000;
		System.out.println(numero);
	
		numero=numero/10000;
		System.out.println(numero);
	


	}

}
