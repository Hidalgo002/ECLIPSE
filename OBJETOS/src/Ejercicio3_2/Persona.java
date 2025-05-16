package Ejercicio3_2;

public class Persona {
	
		String dni;
		String nombre;
		String apellidos;
		float salario;
		
		
		public Persona(String dni, String nombre, String apellidos, float salario) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
		}
		
		public Persona(String dni, String nombre, String apellidos) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = 0;
		}
		
		
		@Override
		public String toString() {
			return "Persona [DNI=" + dni + ", Nombre=" + nombre + ", Apellidos=" + apellidos + ", Salario=" + salario
					+ "]";
		}



		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		
		
}
