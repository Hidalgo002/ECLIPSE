package Ejercicio3;


public class Main {

    public static void main(String[] args) {
        Profesor[] clase1 = new Profesor[2];
        Administracion[] clase2 = new Administracion[2];
        Directivo[] clase3 = new Directivo[2];
        Modulo[] modulos = new Modulo[2];
        Modulo[] modulos2 = new Modulo[2];
        Alumno[] alumnos = new Alumno[2];

        clase1[0] = new Profesor("53298745W", "Carmelo", "Rios", 2002, 2, true);
        clase1[1] = new Profesor("96548513R", "Rubén", "Díaz", 1900, 2, true);

        clase2[0] = new Administracion("12345678A", "Laura", "Gómez", 1800,"Universitarios",5);
        clase2[1] = new Administracion("87654321B", "Pedro", "Lopez", 1700,"Universitarios",10);

        clase3[0] = new Directivo("11223344C", "María", "Santos", 2500,false,turnos.MANANA);
        clase3[1] = new Directivo("22334455D", "Carlos", "Martínez", 2600,true,turnos.TARDE);
        
        //MODULOS CLASE_A
        modulos[0] = new Modulo("Matemáticas",6,clase1[0],true);
        modulos[1] = new Modulo("Física",7,clase1[1],false);
        
        //MODULOS CLASE_B
        modulos2[0] = new Modulo("Programación",8,clase1[0],true);
        modulos2[1] = new Modulo("Base de datos",5,clase1[1],false);
        
        alumnos[0] = new Alumno("96548512G","Juan Manuel","Grandal","15-8-2001",generos.HOMBRE,false,modulos);
        alumnos[1] = new Alumno("96548512G","Sonia","Costa","19-4-2001",generos.MUJER,false,modulos2);


        
        
        todosTrabajadoresP(clase1);
        todosTrabajadoresA(clase2);
        todosTrabajadoresD(clase3);
        todosModulos(modulos);
        todosAlumnos(alumnos);
    }
    
    static public void todosTrabajadoresP(Profesor clase1[]) {
		System.out.println("\nMOSTRAR TODOS LOS PROFESORES:");
		for(int i = 0; i<clase1.length;i++) {
			System.out.println(clase1[i].toString());
		}
	}
    static public void todosTrabajadoresA(Administracion clase2[]) {
		System.out.println("\nMOSTRAR TODOS LOS ADMINISTRATIVOS:");
		for(int i = 0; i<clase2.length;i++) {
			System.out.println(clase2[i].toString());
		}
	}
    static public void todosTrabajadoresD(Directivo clase3[]) {
		System.out.println("\nMOSTRAR TODOS LOS DIRECTIVOS:");
		for(int i = 0; i<clase3.length;i++) {
			System.out.println(clase3[i].toString());
		}
	}
    
    static public void todosModulos(Modulo[] modulos) {
		System.out.println("\nMOSTRAR TODOS LOS MÓDULOS:");
		for(int i = 0; i<modulos.length;i++) {
			System.out.println(modulos[i].toString());
		}
	}
    
    static public void todosAlumnos(Alumno[] alumnos) {
		System.out.println("\nMOSTRAR TODOS LOS ALUMNOS:");
		for(int i = 0; i<alumnos.length;i++) {
			System.out.println(alumnos[i].toString());
		}
	}
}


