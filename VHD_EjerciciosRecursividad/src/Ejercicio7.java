/*7. Crea un método que obtenga la suma de los números naturales desde 1hasta N. 
 * Se debe pasar como parámetro el número N, debe ser mayor que cero. 
 * Se debe imprimir toda la cadena por consola. 
 * Por ejemplo, para N=4 →( 1+2+3+4 =10).*/

import java.util.Scanner;

public class Ejercicio7 {
	
	public static int suma(int numero) {
		if (numero==0)return 0;
		return numero + suma(numero-1);
	        
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		System.out.println("Número de dígitos: "+suma(numero));
		
	}
}

