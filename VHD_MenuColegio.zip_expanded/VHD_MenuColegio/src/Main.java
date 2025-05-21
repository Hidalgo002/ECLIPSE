import java.util.Scanner;

public class Main {
    static Profesor[] clase1 = new Profesor[1];
    static Administracion[] clase2 = new Administracion[1];
    static Directivo[] clase3 = new Directivo[1];
    static Alumno[] clase4 = new Alumno[1];
    static Modulo[] clase6 = new Modulo[1];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu(entrada);
        entrada.close();
    }

    public static void menu(Scanner entrada) {
        while (true) {
            System.out.println("\n=============MENÚ=============\n");
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
                        break;
                    case 2:
                        agregarAdministrativo(entrada);
                        break;
                    case 3:
                        agregarDirectivo(entrada);
                        break;
                    case 4:
                        agregarModulo(entrada);
                        break;
                    case 5:
                        agregarAlumno(entrada);
                        break;
                    case 6:
                        mostrarDatos();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        return;
                    default:
                        System.out.println("Opción fuera de rango. Intente nuevamente.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                entrada.nextLine();
            }
        }
    }

    public static void agregarProfesor(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN PROFESOR:");

        Profesor profesor = new Profesor(null, null, null, 0, 0, false);

        System.out.print("DNI: ");
        profesor.setDni(entrada.nextLine());

        System.out.print("Nombre: ");
        profesor.setNombre(entrada.nextLine());

        System.out.print("Apellidos: ");
        profesor.setApellidos(entrada.nextLine());

        System.out.print("Salario: ");
        profesor.setSalario(entrada.nextFloat());

        System.out.print("Número de Asignaturas: ");
        profesor.setNum_Asignaturas(entrada.nextInt());
        entrada.nextLine();

        System.out.print("¿Es tutor? SÍ--> true; NO--> false: ");
        profesor.setTutor(entrada.nextBoolean());
        entrada.nextLine();

        clase1[0] = profesor;

        System.out.println("Profesor agregado correctamente.");
        System.out.println(profesor);
    }

    public static void agregarAdministrativo(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN ADMINISTRATIVO:");

        Administracion admin = new Administracion(null, null, null, 0, null, 0);

        System.out.print("DNI: ");
        admin.setDni(entrada.nextLine());

        System.out.print("Nombre: ");
        admin.setNombre(entrada.nextLine());

        System.out.print("Apellidos: ");
        admin.setApellidos(entrada.nextLine());

        System.out.print("Salario: ");
        admin.setSalario(entrada.nextFloat());
        entrada.nextLine();

        System.out.print("Indique el nivel de estudios: ");
        admin.setEstudios(entrada.nextLine());

        System.out.print("¿Cuántos años de antigüedad posee el administrativo? ");
        admin.setAntiguedad(entrada.nextInt());
        entrada.nextLine();

        clase2[0] = admin;

        System.out.println("Administrativo agregado correctamente.");
        System.out.println(admin);
    }

    public static void agregarDirectivo(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN DIRECTIVO:");

        Directivo direct = new Directivo(null, null, null, 0, false, null);

        System.out.print("DNI: ");
        direct.setDni(entrada.nextLine());

        System.out.print("Nombre: ");
        direct.setNombre(entrada.nextLine());

        System.out.print("Apellidos: ");
        direct.setApellidos(entrada.nextLine());

        System.out.print("Salario: ");
        direct.setSalario(entrada.nextFloat());

        System.out.print("¿Es salesiano? SÍ--> true; NO--> false: ");
        direct.setSalesiano(entrada.nextBoolean());
        entrada.nextLine();

        System.out.print("¿Durante cuál turno trabaja, MANANA o TARDE? ");
        String turnoStr = entrada.nextLine();
        direct.setTurno(turnos.valueOf(turnoStr.toUpperCase()));

        clase3[0] = direct;

        System.out.println("Directivo agregado correctamente.");
        System.out.println(direct);
    }

    public static void agregarModulo(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN MÓDULO:");

        Modulo modulo = new Modulo(null, 0, null, false);

        System.out.print("Nombre del módulo: ");
        modulo.setNombre(entrada.nextLine());

        System.out.print("Horas del módulo: ");
        modulo.setHoras(entrada.nextInt());
        entrada.nextLine();

        if (clase1[0] == null) {
            System.out.println("No hay profesor disponible. Debe agregar un profesor primero.");
            return;
        }

        modulo.setUnProfe(clase1[0]);

        System.out.print("¿El módulo es convalidable? SÍ --> true ; NO --> false: ");
        modulo.setConvalidable(entrada.nextBoolean());
        entrada.nextLine();

        clase6[0] = modulo;

        System.out.println("Módulo agregado correctamente.");
        System.out.println(modulo);
    }

    public static void agregarAlumno(Scanner entrada) {
        System.out.println("FORMULARIO DE DATOS DE UN ALUMNO:");

        Alumno alumno = new Alumno(null, null, null, null, null, false, new Modulo[0]);

        System.out.print("DNI: ");
        alumno.setDni(entrada.nextLine());

        System.out.print("Nombre: ");
        alumno.setNombre(entrada.nextLine());

        System.out.print("Apellidos: ");
        alumno.setApellidos(entrada.nextLine());

        System.out.print("Fecha de nacimiento (ej. 01/01/2000): ");
        alumno.setFechaNacimiento(entrada.nextLine());

        System.out.print("¿Cuál es su sexo? (HOMBRE o MUJER): ");
        String generoStr = entrada.nextLine().toUpperCase();
        alumno.setSexo(generos.valueOf(generoStr));

        System.out.print("¿Es repetidor? SÍ --> true ; NO --> false: ");
        alumno.setRepetidor(entrada.nextBoolean());
        entrada.nextLine();

        alumno.setLosModulos(new Modulo[0]); // No se asignan módulos aún

        clase4[0] = alumno;

        System.out.println("Alumno agregado correctamente.");
        System.out.println(alumno);
    }

    public static void mostrarDatos() {
        System.out.println("\n===== DATOS ACTUALMENTE ALMACENADOS =====");

        if (clase1[0] != null) {
            System.out.println("Profesor: " + clase1[0]);
        }
        if (clase2[0] != null) {
            System.out.println("Administrativo: " + clase2[0]);
        }
        if (clase3[0] != null) {
            System.out.println("Directivo: " + clase3[0]);
        }
        if (clase6[0] != null) {
            System.out.println("Módulo: " + clase6[0]);
        }
        if (clase4[0] != null) {
            System.out.println("Alumno: " + clase4[0]);
        }
    }
}
