package ejercicios;

import java.util.Scanner;

public class Ejercicio01bis {

	public static void main(String[] args) {
		// Pedir por teclado los datos de una persona, el nombre, la edad y el peso en kg con decimales
		
		Scanner teclado = new Scanner (System.in);
		String nombre;
		int edad;
		float peso;
		
		System.out.println("Introduce tus datos ");
		
		System.out.println( "Nombre ");
		nombre = teclado.nextLine();
		
		System.out.println("Edad ");
		edad= teclado.nextInt();
		
		System.out.println("Peso (en kg):");
		peso= teclado.nextFloat();
		
		System.out.printf("Te llamas %s tiene %d años y tu peso es de %f kg\n",nombre,edad,peso);
		
		System.out.println("Te llamas "+nombre+ " tienes "+edad+ " apos y tu peso es de "+peso + " kg");
		
		
		teclado.close();
		}

}
