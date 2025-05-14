package Ejercicio2;

//DECLARAMOS LOS ENUM FUERA DE LA CLASE Y EN MAYÚSCULAS
enum tipoCoche{MINI,UTILITARIO,FAMILIAR,DEPORTIVO}
enum seguro{TERCEROS,TODORIESGO}		

public class Coches {
	
	String modelo;
	String color;
	boolean metalizado;
	String matricula;
	int anoFabricacion;
	tipoCoche tipo;
	seguro clase;
	
	public Coches (String modelo,String color,boolean metalizado,String matricula,int anoFabricacion, tipoCoche tipo, seguro clase) {
		super();
		this.modelo=modelo;
		this.color=color;
		this.metalizado=metalizado;
		this.matricula=matricula;
		this.anoFabricacion=anoFabricacion;
		this.tipo=tipo;
		this.clase=clase;
	}
	
	
	@Override
	public String toString() {
		return "Coche--> [Modelo=" + modelo + ", Color=" + color + ", Es Metalizado=" + metalizado + ", Matricula="
				+ matricula + ", Año de Fabricación=" + anoFabricacion + ", Tipo de coche=" + tipo + ", Seguro=" + clase + "]";
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	public boolean isMetalizado() {
		return metalizado;
	}
	public void setMetalizado(boolean metalizado) {
		this.metalizado = metalizado;
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}


	public tipoCoche getTipo() {
		return tipo;
	}
	public void setTipo(tipoCoche tipo) {
		this.tipo = tipo;
	}


	public seguro getClase() {
		return clase;
	}
	public void setClase(seguro clase) {
		this.clase = clase;
	}


	
}

