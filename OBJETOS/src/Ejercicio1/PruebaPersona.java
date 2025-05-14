package Ejercicio1;

public class PruebaPersona {
	
	public static void main(String[]args) {
		
		//Nombre de la clase + nombre del objeto = new + Constructor
		Persona p1 = new Persona(55, 1.8, 85, false, "aguda");
		System.out.println("P1->"+p1.toString());
		
		p1.setAltura(1.2);
		System.out.println("P1->"+p1.toString());
		System.out.println("P1->La altura de esta persona es: "+p1.getAltura());
		
		Persona p2 = new Persona(99);
		System.out.println("P2->"+p2.toString());
		p2.setAltura(2.2);
		p2.setPeso(180);
		p2.setPelo(false);
		p2.setVoz("grave");
		System.out.println("P2->"+p2.toString());
	}
	
}
