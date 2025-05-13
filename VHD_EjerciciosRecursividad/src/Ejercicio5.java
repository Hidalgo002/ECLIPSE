/*5. Crea un método que obtenga el número binario de un número N pasado como parámetro.*/
//se hacen divisiones sucesivas por 2 y guardamo los residuos

import java.util.Scanner;

public class Ejercicio5 {

	public static void binario(int numero) {
		if (numero > 0) {
			int ultimoNumero = numero % 2;
			binario(numero / 2);
		}
		System.out.print(ultimoNumero);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		binario(numero);
	}

}
