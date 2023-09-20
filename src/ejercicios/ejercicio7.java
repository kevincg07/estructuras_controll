package ejercicios;

//Realiza un programa que pida por teclado el resultado 
//(dato entero) obtenido al lanzar un dado de seis caras
//y muestre por pantalla el número en letras (dato cadena) 
//de la cara opuesta al resultado obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras están 
//los números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor
//que 6, se mostrará el mensaje: “ERROR: número incorrecto”.

import java.util.*;
public class ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cara del dado en numero: ");
		int cara = sc.nextInt();
		System.out.println();
		switch(cara) {
		case 1:
			System.out.println("Seis");
			break;
		case 2:
			System.out.println("Cinco");
			break;
		case 3: 
			System.out.println("Cuatro");
			break;
		case 4:
			System.out.println("Tres");
			break;
		case 5:
			System.out.println("Dos");
			break;
		case 6:
			System.out.println("Uno");
			break;
			default:
				System.out.println("error");
		}
	}
}
