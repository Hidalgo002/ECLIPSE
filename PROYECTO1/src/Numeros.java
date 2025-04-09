/*Leer una cantidad 'N' y luego introducir 'N' numeros enteros. 
 * Se pide imprimir el mayor y el menot y las veces que aparece cada uno*/
import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cantidad de números a ordenar: ");
		int totalNumeros=entrada.nextInt();
		entrada.nextLine();
		
		int[] numeros = new int[totalNumeros*2];
		
		for(int i=0; i<totalNumeros; i++) {
				System.out.println("Numero: ");
				numeros[i]=entrada.nextInt();
				entrada.nextLine();
		}
		entrada.close();
		
		for(int i=0; i<totalNumeros; i++) {
			for(int j=0; j<totalNumeros; j++) {
				 if (numeros[j] < numeros[j + 1]) {
						int temp; 
						temp = numeros[j]; 
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = temp;
				 }
			}
		}
		
		
		System.out.println("Número Menor: " +numeros[0]);
		System.out.println("Número Mayor: " +numeros[totalNumeros-1]);
		
		
	}
}
	
/*
 *SOLUCIÓN 2. 
 * 		public static int (String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Cantidad de números a ordenar: ");
			int totalNumeros=entrada.nextInt();
			entrada.nextLine();
			
			int[] numeros = new int[totalNumeros*2];
			
			for(int i=0; i<totalNumeros; i++) {
					System.out.println("Numero: ");
					numeros[i]=entrada.nextInt();
					entrada.nextLine();
			}
			entrada.close();
			for(int i=0; i<totalNumeros; i++) {
				System.out.println(numeros[i]);
			}
			
			int max=numeros[0], min=numeros[0];
			
			for(int i=1; i<totalNumeros; i++) {
				if(numeros[i]>max) {
					max=numeros[i];
				}
				else {
					if(numeros[i]<min) {
					min=numeros[i];
						}
					}	
				}
			
			int cantMax=0, cantMin=0;
			for(int i=0; i<totalNumeros; i++) {
				if(numeros[i]==max) {
					cantMax++;
				}
				else {
					if(numeros[i]==min) {
						cantMin++;
					}
				}
			}
			
			
			System.out.println("Número Mayor: " +cantMax);
			System.out.println("Número Menor: " +cantMin);
			
			
		}
	}
}*/
