/*2. Crea un método que obtenga el resultado de elevar un número a otro. 
 * Ambos números se deben pasar como parámetros. Los números deben ser positivos.*/

import java.util.Scanner;

public class Ejercicio2 {
	
	public static double potencia(double base , double exponente) {
		if(exponente==0) {
			return 1;//Cualquier nummero elevado a 0 es 1
		}
		else {
			
			return base* potencia(base, exponente-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el número base: ");
		double base  = entrada.nextInt();

		System.out.print("Introduzca el número exponente: ");
		double exponente = entrada.nextInt();
		entrada.close();
		
		if(base>0 && exponente>0) {
		System.out.println("El resultado de elevar "+base +" y "+exponente+" es: "+potencia(base,exponente));
		}
		else {
			System.out.println("Los dos números deben ser positivos");
		}
	}
}
