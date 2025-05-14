package Ejercicio3;


public class MAIN {

    public static void main(String[] args) {
        profesor[] clase1 = new profesor[2];
        administracion[] clase2 = new administracion[2];
        directivo[] clase3 = new directivo[2];
        modulo[] modulos = new modulo[2];

        clase1[0] = new profesor("53298745W", "Carmelo", "Rios", 2002, 2, true);
        clase1[1] = new profesor("96548513R", "Rubén", "Díaz", 1900, 2, true);

        clase2[0] = new administracion("12345678A", "Laura", "Gómez", 1800,"Universitarios",5);
        clase2[1] = new administracion("87654321B", "Pedro", "Lopez", 1700,"Universitarios",10);

        clase3[0] = new directivo("11223344C", "María", "Santos", 2500,false,turnos.MANANA);
        clase3[1] = new directivo("22334455D", "Carlos", "Martínez", 2600,true,turnos.TARDE);
        
        modulos[0] = new modulo("Matemáticas",6,clase1[0].getNombre(),true);
        modulos[1] = new modulo("Física",7,clase1[1].getNombre(),false);
        
        todosTrabajadoresP(clase1);
        todosTrabajadoresA(clase2);
        todosTrabajadoresD(clase3);
        todosModulos(modulos);
    }
    
    static public void todosTrabajadoresP(profesor clase1[]) {
		System.out.println("\nMOSTRAR TODOS LOS PROFESORES:");
		for(int i = 0; i<clase1.length;i++) {
			System.out.println(clase1[i].toString());
		}
	}
    static public void todosTrabajadoresA(administracion clase2[]) {
		System.out.println("\nMOSTRAR TODOS LOS ADMINISTRATIVOS:");
		for(int i = 0; i<clase2.length;i++) {
			System.out.println(clase2[i].toString());
		}
	}
    static public void todosTrabajadoresD(directivo clase3[]) {
		System.out.println("\nMOSTRAR TODOS LOS DIRECTIVOS:");
		for(int i = 0; i<clase3.length;i++) {
			System.out.println(clase3[i].toString());
		}
	}
    
    static public void todosModulos(modulo[] modulos) {
		System.out.println("\nMOSTRAR TODOS LOS MÓDULOS:");
		for(int i = 0; i<modulos.length;i++) {
			System.out.println(modulos[i].toString());
		}
	}
}


