package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//8. Programa que calcula el volumen de una esfera.
		//V = (4/3) (π) (r³
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el radio ");
		double radio;
		radio= teclado.nextDouble();
		
		double volumen;
		volumen=4.0/3*(Math.PI)*(Math.pow(radio, 3));
		System.out.println("El volumen de la esfera es de " +volumen);
		
		
	}

}
