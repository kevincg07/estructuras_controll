package ejercicios;
//Una compa��a de transporte internacional tiene servicio en algunos 
//pa�ses de Am�rica del Norte, Am�rica Central, Am�rica del Sur, 
//Europa y Asia. El costo por servicio de transporte se basa en el
//peso del paquete y la zona a la que va dirigida. Lo anterior se 
//muestra en la siguiente tabla:
//
//ZONA UBICACI�N	COSTO/KILOGRAMO
//1 Am�rica del Norte	24,00 euros
//2 Am�rica Central	20, 00 euros
//3 Am�rica del Sur	21,00 euros
//4 Europa	10,00 euros
//5 Asia	18,00 euros
//Parte de su pol�tica implica que los paquetes con un peso superior
//a 5kg no son transportados, por cuestiones de log�stica y seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un 
//paquete o, en su caso, el rechazo de la entrega.



import java.util.*;
public class ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Zona ");
		int zona = sc.nextInt();
		System.out.println();
		System.out.print("Kilos");
		double kilos = sc.nextDouble();
		double total;
		if(kilos <= 5.0) {
			if(zona == 1) {
				total = kilos * 24;
				System.out.println("Total a pagar " + total);
			} else if(zona == 2) {
				total = kilos * 20;
				System.out.println("Total a pagar " + total);
			} else if(zona == 3) {
				total = kilos * 21;
				System.out.println("Total a pagar " + total);
			} else if(zona == 4) {
				total = kilos * 10;
				System.out.println("Total a pagar " + total);
			} else if(zona == 5) {
				total = kilos * 18;
				System.out.println("Total a pagar " + total);
			} else {
				System.out.println("error de zona");
			}  
			} else {
				System.out.println("NO se puede entregar el paquete");
			}
		}

	}

