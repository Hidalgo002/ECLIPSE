/*3. Crea una aplicación que muestre los números primeros en un rango determinado por el usuario. Por ejemplo: Los números primos entre 1 y 10 son: el 2, 3, 5 y 7. (2 puntos)
Los números primos son aquellos que solo son divisibles por 1 y por sí mismos.*/
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar el primer y último número del rango
        System.out.println("Introduce el primer número del rango: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Introduce el último número del rango: ");
        int num2 = entrada.nextInt();
        
        entrada.close();
        
        // Mostrar los números primos en el rango
        System.out.println("Los números primos entre " + num1 + " y " + num2 + " son:");

        // Recorrer el rango de números
        for (int i = num1; i <= num2; i++) {
            // Si el número es menor o igual a 1, no es primo
            if (i <= 1) {
                continue;
            }
            
            boolean esPrimo = true;  // Suposición de que el número es primo
            
            // Verificar si el número es divisible por algún número entre 2 y num / 2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;  // No es primo si se puede dividir exactamente
                    break;  // No es necesario seguir comprobando si ya se ha encontrado un divisor
                }
            }
            
            // Si es primo, lo mostramos
            if (esPrimo) {
                System.out.println(i + " es primo.");
            }
        }
    }
}
