package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la velocidad en Km/h ");
		double km;
		km = teclado.nextDouble();
		//0.277777777778 
		double mseg;
		mseg= km * 0.277777777778;
		System.out.println("La velocidad de " +km+ " Km/h equivale a " +mseg+ " m/s");
		System.out.printf("%d Km/h son %.2f m/sg");



	}

}
