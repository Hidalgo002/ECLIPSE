/*1. Crea un método que obtenga la cantidad de dígitos de un número N mayor que cero. 
Se debe pasar como parámetro el número N.*/

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int suma(int numero) {

		if (numero==0) {
			return 0;
		}else {
			return 1 + suma(numero/10);
		}
	        
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		System.out.println("Número de dígitos: "+suma(numero));
		
	}
}
