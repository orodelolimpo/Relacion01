package ejercicios;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 0. Programa que calcule el cambio que se debe devolver al usuario. Se pedirán por 
		//teclado dos números, el precio del artículo y el importe introducido. Se devolverá el 
		//número de monedas a entregar óptimo suponiendo que tenemos disponibilidad de 
		//monedas infinita
		System.out.println("Máquina expendedora: ");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Importe introducido ");
		double importe;
		importe =teclado.nextDouble();
		System.out.println("El precio es de ");
		double precio;
		precio=teclado.nextDouble();
		double cambio = importe-precio;
		
		
		int euros= (int) cambio;
		int centimos = (int) ((cambio-euros)*100);
		
		int m2e = euros/2;
		int m1e = euros %2;
		
		int m50c = centimos / 50;
		int resto=centimos % 50;
		
		int m20c = resto /20;
		resto=resto%20;
	
		int m10c = resto /10;
		resto= resto%10;
		int m5c = resto /5;
		resto= resto%5;
		int m2c= resto/2;
		resto=resto%2;
		int m1c= resto;
		
		System.out.printf("El cambio es de %.2f y son %d monedas de 2 euros, %d monedas de 1 euro,"
				+ "%d monedas de 50c,\n %d monedas de 20c, %d monedas de 10c, %d monedas de 5c, "
				+ "%d monedas de 2c y %d monedas de 1c", cambio, m2e, m1e, m50c,m20c,m10c,m5c,m2c,m1c);
				
		//System.out.println( "El cambio es de "+m2e+ "monedas de 2€," +m1e+ " monedas de 1€", " mo");
	}

}
