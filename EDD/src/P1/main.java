package P1;

public class main {
	public static void main (String[] args) {
		//Mi primer objeto tipo coche
		coche c1 = new coche("Ford","Orion", 12);
		System.out.println(c1.toString());
		
		coche c2 = new coche("Citroen","C4", 56);
		System.out.println(c2.toString());
		
		System.out.println("Potencia Antigua: " +c1.getPotencia());
		c1.cambiarPotencia(2);
		System.out.println("Potencia Nueva: " +c1.getPotencia());
	}
}
