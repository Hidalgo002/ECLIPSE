/*1. Crea una apliación que sea una calculadora con las funciones: sumar, restar, multiplicar, dividir y calcular el porcentaje de un número. (5 puntos)
A. Se de debe crear un menú donde el usuario eligirá entre las diferen funciones o salir. (En cada función se le pedirá al usuario que introduzca cuantos y con que números con los que quiere operar.)
B. La aplicación no se termina hasta que el usuario elige la función de salir y puede eligir el resto de funciones todas las veces que quiera.
C. No se necesita contro de errores. Se recomienda estructurar en diferentes métodos.*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		MENU(entrada);
		entrada.close();
	}
	
	public static void MENU(Scanner entrada2) {
		System.out.println("MENÚ");
		System.out.println("1-Suma; 2-Restar; 3-Multiplicar; 4-Dividir; 5-Calcular porcentaje; 6-Salir del programa.");
		int opcion = entrada2.nextInt();
		entrada2.nextLine();
		int bandera=0;
		
		do {
			
			if(opcion==1) {
				System.out.println("SUMA: ");
				suma(entrada2);
				MENU(entrada2);
			}
			else if(opcion==2) {
				System.out.println("RESTA: ");
				  resta(entrada2);
				  MENU(entrada2);
			}
			else if(opcion==3) {
				System.out.println("MULTIPLICACIÓN: ");
				multiplicacion(entrada2);
				MENU(entrada2);;
			}
			else if(opcion==4) {
				System.out.println("DIVISIÓN: ");
				division(entrada2);
				MENU(entrada2);
			}
			else if(opcion==5) {
				System.out.println("PORCENTAJE: ");
				porcentaje(entrada2);
				MENU(entrada2);
			}
			else if(opcion==6) {
				System.out.println("Saliendo del programa");
			}
			bandera=1;
		}while(bandera==0);
		
			
	}
	
	//SUMA
	public static void suma(Scanner entrada2) {
		System.out.println("Introduzca el número de números que desea sumar: ");
		int totalNumeros= entrada2.nextInt();
		entrada2.nextLine();
		
		int numeros=0;
		int sumaNumeros=0;
		
		for(int i=0;i<totalNumeros;i++) {
			System.out.println("Introduzca el número["+(i+1)+"]");
			numeros = entrada2.nextInt();
			sumaNumeros+=numeros;
		}
		System.out.println("Resultado: "+sumaNumeros);
		
	}
	
	//RESTA
	public static void resta(Scanner entrada2) {
		System.out.println("Introduzca el número de número 1 a restar: ");
		int num1= entrada2.nextInt();
		entrada2.nextLine();
		System.out.println("Introduzca el número de número 2 a restar: ");
		int num2= entrada2.nextInt();
		
		int resultado= num1-num2;
				
		System.out.println("Resultado: "+resultado);
		
	}
	
	//MULTIPLICACIÓN
	public static void multiplicacion(Scanner entrada2) {
		System.out.println("Introduzca el número de número 1 a multiplicar: ");
		int num1= entrada2.nextInt();
		entrada2.nextLine();
		System.out.println("Introduzca el número de número 2 a multiplicar: ");
		int num2= entrada2.nextInt();
		
		int resultado= num1*num2;
				
		System.out.println("Resultado: "+resultado);
		
	}

	//DIVISIÓN
	public static void division(Scanner entrada2) {

		System.out.println("Introduzca el número a dividir: ");
		int numG= entrada2.nextInt();
		entrada2.nextLine();
		System.out.println("Introduzca el divisor: ");
		int numD= entrada2.nextInt();
		
		int resultado=numG/numD;
		
		System.out.println("Resultado: "+resultado);		
		
		}	
		
	
	//PORCENTAJE
	public static void porcentaje(Scanner entrada2) {
		
		System.out.println("Introduzca el primer número: ");
		float numG= entrada2.nextInt();
		entrada2.nextLine();
		System.out.println("Introduzca el porcentaje: ");
		float numD= entrada2.nextInt();
		
		numD=numD/100;
		float resultadof=numG*numD;
		
		System.out.println("Resultado: "+resultadof);
	}
}