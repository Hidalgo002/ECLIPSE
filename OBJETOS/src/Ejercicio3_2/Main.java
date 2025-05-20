package Ejercicio3_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
  
    	Modulo[] clase4 = new Modulo[1];
       
      
        menu(entrada);
        entrada.close();
    }
   

 
    public static void menu(Scanner entrada) {
        System.out.println("\n============= MENÚ =============\n");
        System.out.println("1 - Agregar UN Profesor.");
        System.out.println("2 - Agregar UN Administrativo.");
        System.out.println("3 - Agregar UN Directivo.");
        System.out.println("4 - Agregar UN Módulo.");
        System.out.println("5 - Agregar UN Alumno.");
        System.out.println("6 - Mostrar todos los datos actualmente almacenados.");
        System.out.println("7 - Salir del programa.");
        System.out.print("\nSeleccione una opción: ");
 
        if (entrada.hasNextInt()) {
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarProfesor(entrada);
                    menu(entrada);
                    break;
                case 2:
                    agregarAdministrativo(entrada);
                	menu(entrada);
                    break;
                case 3:
                    agregarDirectivo(entrada);
                	menu(entrada);
                    break;
                case 4:
                	//agregarAlumno(entrada);
                	menu(entrada);
                    break;
                case 5:
                    //agregarModulo(entrada);
                	//menu(entrada);
                    break;
                case 6:
                   // mostrarDatos(entrada);
                	//menu(entrada);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
            }
        } else {
            System.out.println("Entrada inválida. Debe ingresar un número.");
            entrada.nextLine();
        }
    }
    
    public static void agregarProfesor(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN PROFESOR:");
        
        Profesor profesor = new Profesor(null, null, null, 0, 0, false);
        Profesor[] clase1 = new Profesor[1];

        System.out.print("DNI: ");
        profesor.setDni(entrada.nextLine());
        
        System.out.print("Nombre: ");
		profesor.setNombre(entrada.nextLine());
		
		System.out.print("Apellidos: ");
		profesor.setApellidos(entrada.nextLine());
		
		System.out.print("Salario: ");
		profesor.setSalario(entrada.nextFloat());
		
        System.out.print("Numero de Asignaturas: ");
        profesor.setNum_Asignaturas(entrada.nextInt());
        entrada.nextLine();

        System.out.print("¿Es tutor? SÍ--> true; NO--> false. ");
        profesor.setTutor(entrada.nextBoolean());
        entrada.nextLine();

        clase1[0] = profesor;

        System.out.println("Profesor agregado correctamente.");
        System.out.println(profesor);
    }
		
    public static void agregarAdministrativo(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN ADMINISTRATIVO:");
        
        Administracion admin = new Administracion(null, null, null, 0,null,0);
        Administracion[] clase2 = new Administracion[1];

        System.out.print("DNI: ");
        admin.setDni(entrada.nextLine());
        
        System.out.print("Nombre: ");
        admin.setNombre(entrada.nextLine());
		
		System.out.print("Apellidos: ");
		admin.setApellidos(entrada.nextLine());
		
		System.out.print("Salario: ");
		admin.setSalario(entrada.nextFloat());
		
        System.out.print("Indique el nivel de estudios: ");
        admin.setEstudios(entrada.nextLine());

        System.out.print("¿Cuántos años de antigüedad posee el administrativo? ");
        admin.setAntiguedad(entrada.nextInt());

        clase2[0] = admin;

        System.out.println("Administrativo agregado correctamente.");
        System.out.println(admin);
    }

    public static void agregarDirectivo(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN DIRECTIVO:");
        
        Directivo direct = new Directivo(null, null, null, 0, false,null);
        Directivo[] clase3 = new Directivo[1];
 

        System.out.print("DNI: ");
        direct.setDni(entrada.nextLine());
        
        System.out.print("Nombre: ");
        direct.setNombre(entrada.nextLine());
		
		System.out.print("Apellidos: ");
		direct.setApellidos(entrada.nextLine());
		
		System.out.print("Salario: ");
		direct.setSalario(entrada.nextFloat());
		
		System.out.print("¿Es salesiano? SÍ--> true; NO--> false. ");
		direct.setSalesiano(entrada.nextBoolean());
		entrada.nextLine();

        System.out.print("¿Durante cuál turno trabaja, MANANA o TARDE?");
        String turnoStr = entrada.nextLine();
        direct.setTurno(turnos.valueOf(turnoStr.toUpperCase()));

        clase3[0] = direct;

        System.out.println("Directivo agregado correctamente.");
        System.out.println(direct);

    }
    
    public static void agregarAlumno(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN MÓDULO:");
        
        Alumno alumnos = new Alumno(null, 0, null);
        Alumno[] clase4 = new Alumno[1];
 

        System.out.print("DNI: ");
        alumnos.setDni(entrada.nextLine());
        
        System.out.print("Nombre: ");
        alumnos.setNombre(entrada.nextLine());
		
		System.out.print("Apellidos: ");
		alumnos.setApellidos(entrada.nextLine());
		
		System.out.print("Fecha de nacimiento: ");
		alumnos.set(entrada.nextLine());
		
		System.out.print("¿Es salesiano? SÍ--> true; NO--> false. ");
		alumnos.setSalesiano(entrada.nextBoolean());
		entrada.nextLine();

        System.out.print("¿Cuál es su sexo: HOMBRE o MUJER?");
        String sexoStr = entrada.nextLine();
        alumnos(turnos.valueOf(sexoStr.toUpperCase()));

        clase4[0] = alumnos;

        System.out.println("Profesor agregado correctamente.");
        System.out.println(alumnos);

    }
    
	
}


