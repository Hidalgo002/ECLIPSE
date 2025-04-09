/*Escribir un programa que pida números enteros hasta que se introduzca un valor menor o igual a
cero. A continuación debe mostrar la suma total de dichos números. Se deben incluir todos los
números que hemos ido introduciendo por teclado. No se pueden utilizar Arrays. Entrada: 3, 4, 5,
6, 8 | Salida: 3+4+5+6+8=26*/

	import java.util.Scanner;

	public class Ejercicio2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        int suma = 0;
	        String expresion = "";
	        boolean primerNumero = true;

	        while (true) {
	            System.out.print("Introduce un número entero (<= 0 para salir): ");
	            numero = scanner.nextInt();

	            if (numero <= 0) {
	                break;
	            }

	            suma += numero;

	            // Construir la expresión de suma
	            if (primerNumero) {
	                expresion += numero;
	                primerNumero = false;
	            } else {
	                expresion += "+" + numero;
	            }
	        }

	        if (!expresion.isEmpty()) {
	            expresion += "=" + suma;
	            System.out.println("Salida: " + expresion);
	        } else {
	            System.out.println("No se introdujeron números positivos.");
	        }
	        
	        scanner.close();
	    }
	}


