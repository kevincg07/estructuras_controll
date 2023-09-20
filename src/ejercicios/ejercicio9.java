package ejercicios;

//Realiza un programa que pida un número entero entre uno 
//y doce e imprima el número de días que tiene el mes correspondiente.
import java.util.*;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un numero ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("El mes tiene 31 dias");
			break;
		case 2: 
			System.out.println("El mes tiene 28 dias");
			break;
		case 3:
			System.out.println("El mes tiene 31 dias");
			break;
		case 4:
			System.out.println("El mes tiene 30 dias");
			break;
		case 5:
			System.out.println("El mes tiene 31 dias");
			break;
		case 6:
			System.out.println("El mes tiene 30 dias");
			break;
		case 7:
			System.out.println("El mes tiene 31 dias");
			break;
		case 8:
			System.out.println("El mes tiene 31 dias");
			break;
		case 9: 
			System.out.println("El mes tiene 30 dias");
			break;
		case 10:
			System.out.println("El mes tiene 31 dias");
			break;
		case 11: 
			System.out.println("El mes tiene 30 dias");
			break;
		case 12:
			System.out.println("El mes tiene 31 dias");
			break;
		default:
			System.out.println("Error");
		}
		
	}
}
