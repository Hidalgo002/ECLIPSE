/*Dado un número, determinar cuántos dígitos tiene. No se pueden utilizar ni variables 
ni funciones de tipo String. */

import java.util.Scanner;
	
public class Ejercicio1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número entero positivo: ");
	        int numero = scanner.nextInt();
	        
	        // Asegurarse de que el número sea positivo
	        if (numero == 0) {
	            System.out.println("El número tiene 1 dígito.");
	        } else {
	            if (numero < 0) {
	                numero = -numero; // Convertirlo a positivo si es negativo
	            }

	            int contador = 0;
	            while (numero > 0) {
	                numero = numero / 10;
	                contador++;
	            }
	            

	            System.out.println("El número tiene " + contador + " dígito(s).");
	        }
	        
	        scanner.close();
	      
	    }
	    
	}


