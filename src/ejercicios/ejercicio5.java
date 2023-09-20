package ejercicios;
/*
 * La asociaci�n de vinicultores tiene como pol�tica 
 * fijar un precio inicial al kilo de uva, la cual se 
 * clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo
 *  y tama�o, se requiere determinar cuanto recibir� un productor por
 *   la uva que entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando 
* es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 
* c�ntimos cuando es de tama�o 2.
Precio inicial se recibe desde teclado

 */
import java.util.*;
public class ejercicio5 {
	
	public static void main(String[] args) {
		double kilos, precio, total;
		int tamanho;
		char tipo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que tipo de uva es: ");
		tipo = sc.nextLine().charAt(0);
		System.out.println("Cuantos kilos son: ");
		kilos = sc.nextDouble();
		System.out.print("De que tama�o es la uva: ");
		tamanho = sc.nextInt();
		System.out.print("Cuanto cuesta el kilo de uva: ");
		precio = sc.nextDouble();
		
		switch(tipo) {
		case 'a':
		case 'A':
			if(tamanho == 1) {
				precio = precio + 0.20;
			} else if(tamanho == 2) {
				precio = precio + 0.30;
			} else {
				System.out.println("error");
			}
			
			break;
		case 'b':
		case 'B':
			if(tamanho == 1) {
				precio = precio * 0.70;
			} else if(tamanho == 2) {
				precio = precio * 0.50;
			} else {
				System.out.println("error");
			}
		default:
			System.out.println("No es valido el tipo");
		}
		
		total = kilos * precio;
		System.out.println(total);
		}

}
