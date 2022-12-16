package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
		//de la hipotenusa según el teorema de Pitágoras.
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la longitud de los catetos del triángulo rectángulo ");
		double longcat;
		longcat=teclado.nextDouble();
		double hipotenusa;
		
		hipotenusa= Math.sqrt(2*(Math.pow(longcat, 2)));    //Raiz cuadrada de (2* cateto 2)
		System.out.println("La longitud de la hipotenusa es de " +hipotenusa);
		
	}

}
