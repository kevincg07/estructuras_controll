package ejercicios;
//
//Construir un programa que calcule el índice de masa corporal 
//de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado
//en el que se encuentra esa persona en función del valor de IMC:
//
//Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
//Nota 2: Los operandos (peso y altura) deben ser introducidos por 
//teclado por el usuario.

import java.util.*;
public class ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cual es el peso: ");
		double peso = sc.nextDouble();
		System.out.println();
		System.out.print("Cual es tu altura en metros");
		double altura = sc.nextDouble();
		double imc = peso / (Math.pow(altura, altura));
		System.out.println();
		if(imc < 16) {
			System.out.println("Estado critico ingreso al hospital");
		} else if(imc >= 16 && imc <= 17) {
			System.out.println("Infrapeso");
		} else if(imc > 17 && imc <= 18) {
			System.out.println("bajo peso");
		} else if(imc > 18 && imc <= 25) {
			System.out.println("normal");
		} else if(imc > 25 && imc <= 30) {
			System.out.println(" sobrepeso : Obesidad grado I");
		} else if(imc > 30 && imc <= 35) {
			System.out.println("sobrepeso cronico: obesidad grado II");
		} else if(imc > 36 && imc <= 40) {
			System.out.println("obesidad premorbida: obesidad grado III");
		} else{
			System.out.println("obesidad morbibda: obesidad grado IV");
		}
	}
}
