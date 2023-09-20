package ejercicios;

//Realiza un programa que pida el día de la semana (del 1 al 7) 
//y escriba el día correspondiente. Si introducimos otro número 
//nos da un error.

import java.util.*;
public class ejercicio8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dia de la semana: ");
		int dia = sc.nextInt();
		
		switch(dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("MIercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Error");
		}
	}

}
