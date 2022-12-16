package ejercicios2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Introduce un numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = teclado.nextInt();
		
		if (num1<num2) {
			System.out.print("El numero mayor es "+num2);
		}
		if (num1>num2) {
			System.out.print("El numero mayor es "+num1);
		}
		if (num1==num2) {
			System.out.print("Los numeros son iguales.");
		}
	}
}
