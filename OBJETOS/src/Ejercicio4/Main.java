package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Trabajador[] empleados = new Trabajador[3];

        empleados[0] = new Trabajador("Carmelo Ríos Ferrer", 40, 1942.4);
        empleados[1] = new Trabajador("Rubén Díaz Alcalde", 15, 1980.8);
        empleados[2] = new Trabajador("Victor Tienza Garrido", 2, 2001.2);

        System.out.println("=== DATOS DE LOS EMPLEADOS ===");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]); // usa toString()
            System.out.println("->Clasificación: " + empleados[i].clasificacionPermanencia());
            System.out.println();
        }

        System.out.print("Introduce el porcentaje de aumento de salario: ");
        int porcentaje = scanner.nextInt();

        System.out.println("\n=== AUMENTANDO SALARIO UN {" + porcentaje + "%} A TODOS ===");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].setSalario(porcentaje); // Usa el método con solo porcentaje
            System.out.println(empleados[i]);
            System.out.println("->Clasificación: " + empleados[i].clasificacionPermanencia());
            System.out.println();
        }

        scanner.close();
    }
}
