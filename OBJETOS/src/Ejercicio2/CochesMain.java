package Ejercicio2;


public class CochesMain {
	
	public static void main(String[]args) {
		
		Coches coche[]=new Coches[4];
		
		coche [0] = new Coches("Citroen","Gris",false,"4268DGC",2002,tipoCoche.FAMILIAR,seguro.TERCEROS);	
		coche [1] = new Coches("Mazda","Rojo",true,"8945FGS",2022,tipoCoche.MINI,seguro.TODORIESGO);
		coche [2] = new Coches("BMW","Verde",true,"9654TJA",2018,tipoCoche.UTILITARIO,seguro.TERCEROS);		
		coche [3] = new Coches("Bentley","Negro",false,"2158TDA",2009,tipoCoche.DEPORTIVO,seguro.TODORIESGO);
		
		todosCoches(coche);
		deportivo(coche);
		anio(coche);
	}
	
	static public void todosCoches(Coches coche[]) {
		System.out.println("MOSTRAR TODOS LOS COCHES:");
		for(int i = 0; i<coche.length;i++) {
			System.out.println(coche[i].toString());
		}
	}
	
	static public void deportivo(Coches coche[]) {
		System.out.println("\nMOSTRAR TODOS LOS DEPORTIVOS");
		for(int i = 0; i<coche.length;i++) {
			if(coche[i].getTipo()==tipoCoche.DEPORTIVO){
				System.out.println(coche[i].toString()+"\n");
			}
		}
	}
	
	static public void anio(Coches coche[]) {	
		System.out.println("\nMOSTRAR TODOS LOS COCHES CUYO AÑO DE FABRICACIÓN ES PAR");
		for(int i = 0; i<coche.length;i++) {
			if(coche[i].getAnoFabricacion()%2==0) {
				System.out.println(coche[i].toString());
			}
		}
	}
	
}
