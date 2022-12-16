package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 12. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el 
		//principio como en el ejemplo.
		//Por ejemplo, para un número N = 12345 La salida debe ser:
		//1
		//12
		//123
		//1234
		//12345
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número de cinco cífras ");
		int numero = teclado.nextInt();
		int res = numero/10000;
		System.out.println(res);
		res = numero/1000;
		System.out.println(res);
		res= numero /100;
		System.out.println(res);
		res= numero/10;
		System.out.println(res);
		res=numero;
		System.out.println(res);
		
		

	}

}
