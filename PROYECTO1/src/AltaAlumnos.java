import java.util.Scanner;

public class AltaAlumnos {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduzca el número de alumnos");
	int totalAlumnos=entrada.nextInt();
	entrada.nextLine();
	
	String[] nombres = new String[totalAlumnos];
	String[] apellidos = new String[totalAlumnos];
	int[] edades = new int[totalAlumnos];
	
	for(int i=0; i<totalAlumnos; i++) {
		System.out.println("Nombre: ");
		nombres[i]=entrada.nextLine();
		
		System.out.println("Apellido: ");
		apellidos[i]=entrada.nextLine();
		
		System.out.println("Edad: ");
		edades[i]=entrada.nextInt();
		entrada.nextLine();
		
		}
	entrada.close();
	
	for(int i=0; i<totalAlumnos; i++) {
		System.out.println("Nombre: " +nombres[i] + "; Apellido: " +apellidos[i]+ "; Edad: "  +edades[i]);
	}
}
	}