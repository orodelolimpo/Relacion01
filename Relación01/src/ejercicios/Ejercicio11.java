package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		//11. Programa que lee un número de 3 cifras y muestra sus cifras por separado.// 
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número de tres cífras ");
		int numero = teclado.nextInt();
		int res1 = numero /100;
		System.out.println(res1);
		
		int res2= (numero%100)/10;
		System.out.println(res2);
		
		
		int res3 = (numero%10);
		System.out.println(res3);

	}

}
