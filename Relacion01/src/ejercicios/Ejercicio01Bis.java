package ejercicios;

import java.util.Scanner;

public class Ejercicio01Bis {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Pedir por teclado los datos de una persona, nombre, edad y peso en kg con decimales.
		
	Scanner teclado = new Scanner(System.in);
		
	String nombre;
	int edad;
	float peso;
	
	System.out.println("Introduce tus datos.");
	
	System.out.println("Nombre: ");
	nombre = teclado.nextLine();
	
	System.out.println("Edad: ");
	edad = teclado.nextInt();
	
	System.out.println("Peso en Kg: ");
	peso = teclado.nextFloat();
	
	System.out.printf("Te llamas %s, tienes %d años y pesas %f kg\n",
			nombre, edad, peso);
	
	}
}
