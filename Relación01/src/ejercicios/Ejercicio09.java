package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// 9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la longitud de sus lados, ");
		
		double lado1, lado2, lado3;
		System.out.println("lado1");
		lado1= teclado.nextDouble();
		System.out.println("lado2");
		lado2= teclado.nextDouble();
		System.out.println("lado3");
		lado3= teclado.nextDouble();
	
		double s=(lado1+lado2+lado3)/2; // a= raiz2 s(s-a)(s-b)(s-c)
		double area= Math.sqrt(s* (s-lado1)*(s-lado2)* (s-lado3));
		System.out.println("El área del triangulo es "+area); 
		
		
	}

}
