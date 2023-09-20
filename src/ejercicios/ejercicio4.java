package ejercicios;
import java.util.*;

/*
 * /Realiza un programa que calcule la aceptacion de una solicitud
 * en base a los siguientes parametros
 * edad, nota, sexo
 * Minimo: nota(5), edad(18), sexo M -> posible
 * MInimo nota(5), edad(18), sexo F -> aceptada
 * Otros casos no aceptado
 */

public class ejercicio4 {
	
	public static void main(String[] args) {
		byte nota, edad;
		String sexo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa los datos que se te piden");
		System.out.println();
		System.out.println("sexo: ");
		sexo = sc.nextLine();
		System.out.print("nota: ");
		nota = sc.nextByte();
		System.out.println();
		System.out.println("edad: ");
		edad = sc.nextByte();
		
		
		
		if(nota >=5 && edad >=18 && (sexo == "M" || sexo == "m")) {
			System.out.println("es posible");
		} else if (nota >=5 && edad >=18 && (sexo == "F"|| sexo == "f")) {
			System.out.println(" aceptada");
		} else {
			System.out.println("no aceptado");
		}
	}

}
