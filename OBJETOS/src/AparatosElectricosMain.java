import java.util.Scanner;

public class AparatosElectricosMain {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		AparatosElectricos bombilla = new AparatosElectricos(100);
		System.out.println("Bombilla: "+bombilla.toString());
		
		AparatosElectricos radiador = new AparatosElectricos(2000);
		System.out.println("Radiador: "+radiador.toString());
		
		AparatosElectricos plancha = new AparatosElectricos(1200);
		System.out.println("Plancha: "+plancha.toString());
		
		int opcion=0;
		
		while (opcion!=5) {
		
		System.out.println("Elija el aparato que desea gestionar:(1-Bombilla, 2-Radiador, 3-Plancha, 4-Consumo Actual, 5-Salir) ");

		opcion = entrada.nextInt();
		switch(opcion) {
			case 1:
				System.out.println("BOMBILLA: 1-Encender; 2-Apagar");
				int opcion2=entrada.nextInt();
				if(opcion2==1) {
					bombilla.encender();
				}
				else if (opcion2 == 2) {
					bombilla.apagar();
				}
				System.out.println("Consumo Actual: "+AparatosElectricos.getConsumoInstalacion());
			break;
			
			case 2:
				System.out.println("RADIADOR: 1-Encender; 2-Apagar");
				int opcion3=entrada.nextInt();
				if(opcion3==1) {
					radiador.encender();
				}
				else if (opcion3 == 2){
					radiador.apagar();
				}
				System.out.println("Consumo Actual: "+AparatosElectricos.getConsumoInstalacion());
			break;
			
			case 3:
				System.out.println("PLANCHA: 1-Encender; 2-Apagar");
				int opcion4=entrada.nextInt();
				if(opcion4==1) {
					plancha.encender();
				}
				else if (opcion4 == 2){
					plancha.apagar();
				}
				System.out.println("Consumo Actual: "+AparatosElectricos.getConsumoInstalacion());
			break;
			
			case 4:
				System.out.println("Consumo Actual: "+AparatosElectricos.getConsumoInstalacion());
			break;
			
			case 5:
				System.out.println("Saliendo del programa...");
			break;
			
			default:
				System.out.println("OPCIÓN NO VÁLIDA");
			}
			
		}
		
	entrada.close();
	}
}
