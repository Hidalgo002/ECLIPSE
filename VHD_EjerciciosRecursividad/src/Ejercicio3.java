/*3. Crea un método que dado un número positivo, lo imprima invertido por pantalla.*/

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void numeroInvertido(int numero) {
		if (numero > 0) {
			int ultimoNumero = numero % 10;
			System.out.print(ultimoNumero);
			numeroInvertido(numero / 10);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		if(numero>0) {
			System.out.print("Número invertido: ");
			numeroInvertido(numero);
		}
		else {
			System.out.println("El número debe ser positivo.");
		}
		
	}
}
