//package P1;
import java.io.ByteArrayInputStream;
public class Main {
	public static void main (String[] args) {
		//Mi primer objeto tipo coche
		coche c1 = new coche("Ford","Orion", 12);
		System.out.println(c1.toString());
		
		coche c2 = new coche("Citroen","C4", 56);
		System.out.println(c2.toString());
	}
}
