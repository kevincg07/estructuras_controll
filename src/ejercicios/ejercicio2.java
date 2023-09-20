package ejercicios;
/*
 * Realiza un programa que pida un numero
 * y nos indique si es par o impar/
 */
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short num = sc.nextShort();
		
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}
}
