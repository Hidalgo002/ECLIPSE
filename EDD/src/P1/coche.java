/*
 * Clase coche: con marca, modelo y potencia
 * @autorValeria
 */



package P1;

public class coche {
	//Siendo PRIVATE, solo es accesible desde esta clase
	private String marca;
	private String modelo;
	private int potencia;
	int cambio = 10;
	
	/*CONTRUCTOR-> SE HA DE LLAMAR IGUAL QUE LA CLASE. Se puede crear vacio, es decir 
	public coche(). Cuando yo creo un constructor vacio, el 'coche' no tiene ni marca, ni modelo .
	, ni potencia, creo el constructor vacio. Pero se le puede dar atributos y asignarle valores.
	
	EJEMPLO VACIO:
	public coche(){
		this.marca="";
		this.modelo="";
		this.potencia=0;
     }*/
	

	//LOS CONSTRUCTORES SE ORDENAN DE MÁS ELEMENTOS TIENE A MENOS
	//CONTRUCTOR 1-> CONTIENE TODOS LOS ELMENTOS
	public coche(String marca,String modelo,int potencia) {
		
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.potencia=potencia;
		
	}
	
	/*CONSTRUCTOR 2 -> UN COCHE CON SOLO MARCA Y MODELO MODIFICABLE, LA POTENCIA SERÁ CERO SIEMPRE
	public coche(String marca,String modelo) {
		
		this.marca=marca;
		this.modelo=modelo;
		this.potencia=0;
		
	}*/
	
	//METODOS = FUNCIONES
	
	 //GETTER: Consigue el valor de los tributos
		public String getMarca() {
			return this.marca;
		}
	
		public String getModelo() {
			return this.modelo;
		}
	
		public int getPotencia() {
			return this.potencia;
		}
	
	//SETTER: Función para modificar los elementos
		public void setMarca(String m) {
			this.marca = m;
		}

		public void setModelo(String m) {
			this.modelo = m;
		}

		public void setPotencia(int p) {
			this.potencia = p;
		}
		
		//Funciones relacionadas con coche
		@Override
		public String toString() {
			return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
		}
		
		//Cambiar funciones con void
		public void cambiarPotencia(int cambio) {
			int nuevaPotencia = this.potencia;
			this.potencia = nuevaPotencia * cambio;
		}
	}
