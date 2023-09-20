package ejercicios;
/*
 * Realiza un progrma que reciba dos numeros por
 * teclado e indica cual de los dos es el mayor7
 */

import java.util.*;
public class ejercicio1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Ingresa el numero uno");
		num1 = leer.nextDouble();
		System.out.println();
		System.out.println("Ingrese el segundo numero");
		num2 = leer.nextDouble();
		
		String esMayor = (num1>num2)? "El numero 1 es el mayor": "El numero dos es mayor";
		System.out.println(esMayor);

	}

}
