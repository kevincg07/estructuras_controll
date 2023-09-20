package ejercicios;

/*
 * Crea un programa que pida dos numeros y
 * muestre su division
 * si el segundo numero es cero debe
 * mostrar error/
 */

import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.print("primer numero: ");
		num1 = sc.nextDouble();
		System.out.println();
		System.out.print("segundo numero");
		num2 = sc.nextDouble();
		
		if(num2 == 0) {
			System.out.println("error");
		} else {
			double div = num1 / num2;
			System.out.println("La division es: " + div);
		}
	}
}
