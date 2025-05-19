/*Una empresa informática necesita llevar un registro de todos sus empleados que se encuentran en
la oficina central, para ello, se debe crear una clase que incluya lo siguiente:
Atributos: nombre completo, permanencia(número de años en la empresa) y salario.
Métodos:
1. Constructor con y sin parámetros de entrada.
2. Método que permita mostrar la clasificación según la la permanencia de acuerdo al siguiente
algoritmo:
a. Si la permanencia es menor o igual a 3, “Principiante”.
b. Si la permanencia es mayor que 3 y menor que 18, “Intermedio”.
c. Si la permanencia es mayor o igual a 18, “Senior”.
3. Método que muestre los datos del empleado por pantalla, incluida la permanencia( se debe
utilizar salto de línea para separar los atributos).
4. Un método que permita aumentar el salario en un porcentaje que sería pasado como
parámetro al método.
Implementa también un main para probar lo implementado anteriormente.*/

package Ejercicio4;

class Trabajador {
    private String nombreCompleto;
    private int permanencia;
    private double salario;

    // Constructor con parámetros
    public Trabajador(String nombreCompleto, int permanencia, double salario) {
        this.nombreCompleto = nombreCompleto;
        this.permanencia = permanencia;
        this.salario = salario;
    }

    // Constructor sin parámetros
    public Trabajador() {
        this.nombreCompleto = "";
        this.permanencia = 0;
        this.salario = 0.0;
    }

    // Método con solo un return
    public String clasificacionPermanencia() {
        String clasificacion;
        if (permanencia <= 3) {
            clasificacion = "Principiante";
        } else if (permanencia < 18) {
            clasificacion = "Intermedio";
        } else {
            clasificacion = "Senior";
        }
        return clasificacion;
    }


    // Getters y Setters (mantienen lógica simple)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    public double getSalario() {
        return salario;
    }
    
    

    public void setSalario(double salario) {//Dejamos este set intacto para actualizar el salario en bruto
		this.salario=salario;
	}
	public void setSalario(double salario, int porcentaje) {//salario y porcentaje
		this.salario=salario;
	}
	public void setSalario(int porcentaje) {//Solo con porcentaje
		double tantoPorCiente=porcentaje/100.0;
		this.salario=salario+salario*tantoPorCiente;
	}


    @Override
	public String toString() {
		return "\nTrabajador \n->Nombre Completo = " + nombreCompleto + ". \n->Permanencia = " + permanencia + " años. \n->Salario = " + salario
				+ "€.";
	}
	
	
	
}
