/*1. Crear un menú con 3 opciones, una por cada tipo de figura mas otro menú para
elegir si se imprime la figura con relleno o sin relleno, y una opción para salir. Se
deberá elegir una opción y realizar la acción correspondiente. El programa no
terminará hasta que seleccionemos la opción SALIR del menú principal.*/


package utilidades;

import java.util.Scanner;


public class menu {
	
	public static int rellOVa() {
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Seleccione si la figura aparecerá rellena (1) o vacía (2)");
		int opcion2 = entrada2.nextInt(); 
		entrada2.close();
	}
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seleccione un tipo de figura (1- Rectángulo; 2-Triángulo Rectángulo; 3-Triángulo Equilatero)");
		
		int opcion = entrada.nextInt(); 
		
		entrada.close();
		
		if(opcion==1) {
			System.out.println("");
			rellOVa();
			
			
		}
	}
}

