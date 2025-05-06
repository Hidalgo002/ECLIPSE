/*4. Crea un método que compruebe si un número es binario. 
 * Un número binario está formado únicamente por ceros y unos.*/

import java.util.Scanner;

public class Ejercicio4 {

	public static void binario(int numero) {
		if (numero != 0||numero != 1) {
			int ultimoNumero = numero % 10;
			System.out.print(ultimoNumero);
			binario(numero / 10);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		System.out.println("Resultado: " + binario(numero));
	}
}
