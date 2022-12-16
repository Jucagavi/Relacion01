package ejercicios2;

import java.util.Scanner;

public class Posicioncentral {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Introduce primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce segundo numero: ");
		num2 = teclado.nextInt();
	
		System.out.print("Introduce tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1<num2  && num2<num3) {
			System.out.println("El menor es "+num1);
		}
		else if (num2<num1 && num2<num3) {
			System.out.println("El menor es "+num2);
		}
		else { 
			System.out.println("El menor es "+num3);
		}
	}
}
