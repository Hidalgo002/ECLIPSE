/* 2. Crea una aplicación que muestre por pantalla la siguiente figura: (3 puntos)*/
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide invertida: ");
        int altura = entrada.nextInt();
        entrada.close();

        System.out.println("FORMA 1:");
        for (int i = 0; i < altura; i++) {
            int estrellas = altura - i;

            // Imprimir asteriscos del lado izquierdo
            for (int j = 0; j < estrellas; j++) {
                System.out.print("* ");
            }

            // Imprimir espacios internos (4 espacios por cada nivel)
            int espacios = i * 4;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos del lado derecho
            for (int j = 0; j < estrellas; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println("FORMA 2:");
        for (int i = 0; i < altura; i++) {
            int estrellas = altura - i;
            int espacios = i * 4;

            // Imprime lado izquierdo, espacios y lado derecho en una línea
            imprimirRepetido("* ", estrellas);
            imprimirRepetido(" ", espacios);
            imprimirRepetido("* ", estrellas);
            System.out.println();
        }
    }

    // Función auxiliar para imprimir cualquier string repetido n veces
    static void imprimirRepetido(String texto, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print(texto);
        }
    }
}
