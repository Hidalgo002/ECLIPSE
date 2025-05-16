package Ejercicio3;

enum turnos{MANANA, TARDE};

public class Directivo{
	
		String dni;
		String nombre;
		String apellidos;
		float salario;
		boolean salesiano;
		turnos turno;
		
		
		
		public Directivo(String dni, String nombre, String apellidos, float salario, boolean salesiano, turnos turno) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
			this.salesiano = salesiano;
			this.turno = turno;
		}



		@Override
		public String toString() {
			return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
					+ ", salesiano=" + salesiano + ", turno=" + turno + "]";
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



		public boolean isSalesiano() {
			return salesiano;
		}



		public void setSalesiano(boolean salesiano) {
			this.salesiano = salesiano;
		}



		public turnos getTurno() {
			return turno;
		}



		public void setTurno(turnos turno) {
			this.turno = turno;
		}
		
		
		
		
		
		
}