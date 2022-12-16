package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 	1. Programa Java que lea dos numeros enteros por teclado y 			los muestre por pantalla.
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Introduce un numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = teclado.nextInt();
		
		System.out.println("El numero introducido es: "+num1);
		System.out.println("El otro numero introducido es: "+num2);
		
		System.out.printf("El primer numero es %d y el segundo %d\n",num1,num2);
		
	}

}
