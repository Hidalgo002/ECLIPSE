package Ejercicio1;


public class Persona {

	int edad;
	double altura;
	double peso;
	boolean pelo;
	String voz;
	
	/*CONSTRUCTOR COMPLETO > Aqui se rellena con todos los parámetros generales que se van a usar de forma general, a modo de plantilla.
	*Todo aquello de lo que no estemos seguros o se vayan a añadir más tarde, se quitan. 
	*Por ejemplo, añadimos un ID, no vamos a cambiar todos los datos que hemos rellenado, hacemos otra función*/
	public Persona(int edad, double altura, double peso, boolean pelo, String voz) {
		super();//LLama al elemento PADRE
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pelo = pelo;
		this.voz = voz;
	}
	
	//CONSTRUCTOR CON VALORES PREDETERMINADOS
	/*
	public Persona(int edad) {
		super();//LLama al elemento PADRE
		this.edad = edad;
		this.altura = 150;
		this.peso = 60;
		this.pelo = true;
		this.voz = "grave";
	}*/
	
	//CONSTRUCTOR VACIO
	
	public Persona(int edad) {
		super();//LLama al elemento PADRE
		this.edad = edad;
		this.altura = 0;
		this.peso = 0;
		this.pelo = false;
		this.voz = "";
	}
	
	
	//SOURCE > GENERATE toString --> Genera una cadena para imprimir los datos por pantalla
	@Override
	public String toString() {
		return "DATOS DEL USUARIO: [edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", pelo=" + pelo + ", voz=" + voz
				+ "]";
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public boolean isPelo() {
		return pelo;
	}
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	
	public String getVoz() {
		return voz;
	}
	public void setVoz(String voz) {
		this.voz = voz;
	}
	
}
