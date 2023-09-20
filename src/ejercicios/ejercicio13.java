package ejercicios;
//Un obrero necesita calcular su salario semanal, el cual se 
//obtiene de la siguiente manera: Si trabaja 40 horas o menos se 
//le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por
//cada una de las primeras 40 horas y $20 por cada hora extra.

import java.util.*;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte extras = 0;
		short sueldo;
		System.out.print("Total de horas ");
		byte horas = sc.nextByte();
	
		if(horas <= 40) {
			sueldo = (short) (horas * 16);
			System.out.println("Sueldo " + sueldo);
		} else {
			sueldo = (short) (40 * 16);
			extras = (byte) (horas - 40);
			sueldo += extras * 20;
			System.out.println("Sueldo " + sueldo);
		}
		
		
	}
}
