/*4. Crea un método que compruebe si un número es binario. 
 * Un número binario está formado únicamente por ceros y unos.*/

import java.util.Scanner;

public class Ejercicio4 {

	public static boolean binario(int numero) {
		
		if(numero<0) {
			return false;
		}
		
		while (numero>0) {
			int ultimoNumero = numero % 10;
			
			if (ultimoNumero != 0 && ultimoNumero != 1) {
				return false;
			}

		numero = numero / 10; // Avanzamos al siguiente dígito
		
		}//fin del while

    return true; // nos dice verdadero solo si todos los numeros son cero y uno
}
	

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		if(binario(numero)) {
			System.out.println("Es un número binario.");
		}
		else {
			System.out.println("No es un número binario");
		}
	}
}
