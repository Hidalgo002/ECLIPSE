import java.util.ArrayList;

import java.util.Scanner;


public class Biblioteca {
	
	static String nombre="BIBLIOTECA";

	static ArrayList<Libro> Libros = new ArrayList<>();
	static ArrayList<Revista> Revistas = new ArrayList<>();
	
	static int contadorPrestamos = 0;
	

	
	public static void agregarArticulo(Scanner entrada) {
		    Libros.add(new Libro("L1", "Ronin", true, "Carmelo Rios Ferrer"));
		    Libros.add(new Libro("L2", "El señor de los anillos.", true, "J.R.R Tolkien"));
		    Revistas.add(new Revista("R1", "National Geographic", true, 202));
		    Revistas.add(new Revista("R2", "Muy Interesante", true, 1050));
	}
		
		/*switch(opcion) {
		case 1:
			System.out.println("DATOS DEL LIBRO:");
			System.out.print("Introduzca el ID del libro: ");
		    String id = entrada.nextLine();

		    System.out.print("Introduzca el título del libro: ");
		    String titulo = entrada.nextLine();

		    System.out.print("¿Está disponible el libro? SÍ --> true; NO --> false: ");
		    boolean disponible = Boolean.parseBoolean(entrada.nextLine());

		    System.out.print("Introduzca el autor del libro: ");
		    String autor = entrada.nextLine(); 

		    Libro nuevoLibro = new Libro(id, titulo, disponible, autor);
		    Libros.add(nuevoLibro);

		    System.out.println("Libro agregado con éxito. ");
			break;
		case 2:
			System.out.println("DATOS DE LA REVISTA:");
			System.out.print("Introduzca el ID de la revista: ");
		    String id1 = entrada.nextLine();

		    System.out.print("Introduzca el título de la revista: ");
		    String titulo1 = entrada.nextLine();

		    System.out.print("¿Está disponible la revista? SÍ --> true; NO --> false: ");
		    boolean disponible1 = Boolean.parseBoolean(entrada.nextLine());

		    System.out.print("Introduzca el número de edición de la revista: ");
		    int numeroEdicion = entrada.nextInt();

		    Revista nuevaRevista = new Revista(id1, titulo1, disponible1, numeroEdicion);
		    Revistas.add(nuevaRevista);

		    System.out.println("Revista agregada con éxito.");
			break;
			default:
				System.out.println("OPCIÓN NO VÁLIDA");
		}}*/
		
		
	
	
	public static String buscarArticuloPorID(Scanner entrada) {
		int opcion;
		System.out.print("¿Desea buscar un LIBRO (1) o una REVISTA (2)? (Escriba el número): ");
		opcion = entrada.nextInt();
		entrada.nextLine();
		
		switch(opcion) {
		case 1:
		    System.out.print("Introduzca el ID del libro: (L1 o L2)");
		    String idLibro = entrada.nextLine();
	
			    for (Libro libro : Libros) {
			        if (libro.getId().equalsIgnoreCase(idLibro)) {
			            System.out.println("LIBRO ENCONTRADO:");
			            System.out.println(libro);
			            return idLibro;
			        }
			    }
			    System.out.println("No se encontró el libro con ese ID.");
		case 2:
			System.out.print("Introduzca el ID de la revista: (R1 o R2)");
		    String idRevista = entrada.nextLine();
		    
			for (Revista revista : Revistas) {
				if (revista.getId().equalsIgnoreCase(idRevista)) {
			        System.out.println("REVISTA ENCONTRADA:");
			        System.out.println(revista);
			        return idRevista;
			    }
			}
			System.out.println("No se encontró la revista con ese ID.");
		}
		return nombre;
	}
	
	
	public static void prestarArticulo(Scanner entrada) {
	    String idArticulo = buscarArticuloPorID(entrada);
	    
	    // LIBROS
	    for (Libro libro : Libros) {
	        if (libro.getId().equals(idArticulo)) {
	            if (libro.isDisponible()) {
	                libro.setDisponible(false);
	                System.out.println("El libro ha sido prestado con éxito.");
	                contadorPrestamos++;
	            } else {
	                System.out.println("El libro ya está prestado.");
	            }
	        }
	    }

	    // REVISTAS
	    for (Revista revista : Revistas) {
	        if (revista.getId().equals(idArticulo)) {
	            if (revista.isDisponible()) {
	                revista.setDisponible(false);
	                System.out.println("La revista ha sido prestada con éxito.");
	                contadorPrestamos++;
	            } else {
	                System.out.println("La revista ya está prestada.");
	                
	            }
	        }
	    }
	    
	  System.out.println("TOTAL PRÉSTAMOS: "+contadorPrestamos);
	}
	
	public static void devolverArticulo(Scanner entrada) {
	    String idArticulo = buscarArticuloPorID(entrada);
	 
	    // LIBROS
	    for (Libro libro : Libros) {
	        if (libro.getId().equals(idArticulo)) {
	            if (libro.isDisponible()) {
	                libro.setDisponible(false);
	                System.out.println("El libro ha sido devuelto con éxito.");
	                contadorPrestamos--;
	            } else {
	                System.out.println("El libro ya ha sido devuelto.");
	            }
	        }
	    }

	    // REVISTAS
	    for (Revista revista : Revistas) {
	        if (revista.getId().equals(idArticulo)) {
	            if (revista.isDisponible()) {
	                revista.setDisponible(false);
	                System.out.println("La revista ha sido devuelta con éxito.");
	                contadorPrestamos--;
	            } else {
	                System.out.println("La revista ya ha sido devuelta.");
	                
	            }
	        }
	    }
	    
	  System.out.println("TOTAL PRÉSTAMOS: "+contadorPrestamos);
	}
	
	public static void mostrarTodosLosArticulos() {
		
		System.out.println("CATÁLOGO DE LIBROS");
		for (int i = 0; i < Libros.size(); i++) {
	        Libro libro = Libros.get(i);
	        System.out.println(libro);
	    }
		
		System.out.println("CATÁLOGO DE REVISTAS");
		for (int i = 0; i < Revistas.size(); i++) {
			Revista revista = Revistas.get(i);
	        System.out.println(revista);
	    }
	}
		
	
	
	
	
	
}

	 
	
