package ejercicios;
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina 
//al centro de salud, 50% al comedor de ni�os y el resto se invierte
//en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al 
//centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
//
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
import java.util.*;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad recibida ");
		double donacion = sc.nextDouble();
		double salud, comedor, bolsa;
		if(donacion >= 10000) {
			comedor = donacion * 0.50;
			salud = donacion * 0.30;
			bolsa = donacion * 0.20;
			
			System.out.println("Comedor " + comedor);
			System.out.println("Centros de salud " + salud);
			System.out.println("Bolsa " + bolsa);
		} else {
			comedor = donacion * 0.60;
			salud = donacion * 0.25;
			bolsa = donacion * 0.15;
			
			System.out.println("Comedor " + comedor);
			System.out.println("Centros de salud " + salud);
			System.out.println("Bolsa " + bolsa);
		}
	}
}
