import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu(entrada);
        entrada.close();
    }
 
 public static void menu(Scanner entrada) {
	 
	 int bandera = 0;
	 do{
            System.out.println("\n=============MENÚ=============\n");
            System.out.println("1 - Agregar colección de artículos.");
            System.out.println("2 - Buscar un artículo mediante ID.");
            System.out.println("3 - Préstamo de un artículo.");
            System.out.println("4 - Devolución de un artículo.");
            System.out.println("5 - Mostrar todos los artículos.");
            System.out.println("6 - Mostrar todos los préstamos realizados.");
            System.out.println("7 - Consultar préstamos de un usuario.");
            System.out.println("8 - Salir del programa.");
            System.out.print("\nSeleccione una opción: ");

            if (entrada.hasNextInt()) {
                int opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                    	Biblioteca.agregarArticulo(entrada);
                    	break;
                    case 2:
                    	Biblioteca.buscarArticuloPorID(entrada);
	                    break;
                    case 3:
                    	Biblioteca.prestarArticulo(entrada);
	                    break;
                    case 4:
                    	Biblioteca.devolverArticulo(entrada);
	                    break;
                    case 5:
                    	Biblioteca.mostrarTodosLosArticulos();
                    	break;
                    case 6:
                        
	                    break;
                    case 7:
                        
	                    break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        bandera=1;
	                    break;
                    default:
                    	System.out.println("Opción inválida.");
                    	bandera=1;
                }
	       } else {
	         System.out.println("Entrada inválida. Debe ingresar un número.");
	         entrada.nextLine();
	         bandera=1;
       }
	 }while(bandera==0);
    }
 }
 
