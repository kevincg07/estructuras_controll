package ejercicios;

//El director de una escuela está organizando un viaje de estudios 
//y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe 
//pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, 
//sin importar el número de alumnos.

import java.util.*;

public class ejercicio6 {
	
	public static void main(String[] args) {
		
		int alumnos;
		double tarifa, costo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantos lumnos son: ");
		alumnos = sc.nextInt();
		 
		System.out.println();
		
		if (alumnos >= 100) {
			System.out.println("El costo por alumno es de 65 euros");
			tarifa = alumnos * 65;
			System.out.println("El costo del autobus es de: " + tarifa);
		} else if( alumnos >= 50 && alumnos < 100) {
			System.out.println("El costo por alumno es de 70 euros");
			tarifa = alumnos * 70;
			System.out.println("El costo del autobus es de: " + tarifa);
		} else if( alumnos >= 30 && alumnos < 50) {
			System.out.println("El costo por alumno es de 95 euros");
			tarifa = alumnos * 95;
			System.out.println("El costo del autobus es de: " + tarifa);
		} else {
			System.out.println("El precio del autobus es de 4000 euros");
			costo = 4000 / alumnos;
			System.out.println("Cada alumno debe de pagar " + costo + " euros" );
		}
	}

}
