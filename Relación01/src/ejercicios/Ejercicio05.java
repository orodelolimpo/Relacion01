package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
		//muestra por pantalla la longitud y el área de la circunferencia. Longitud de la 
		//circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
	
		Scanner teclado = new Scanner (System.in);
		System.out.println(" Introduzca el valor del radio circunsferencia  ");
		double numero;
		numero = teclado.nextFloat();
		double longitud;
		double area;
		//final float PI= 3.14159;  longitud= 2 *PI... otra opción  -->//math.PI pero tengo que poner en double
		longitud = 2* Math.PI * numero;
		area = Math.PI* Math.pow(numero, 2);
		System.out.println("La circunsferencia tiene una longitud de  " +longitud+ " y su área es de " +area);
		
	
			
	}

}
