package Ejercicio3;

enum turnos{MANANA, TARDE};

public class directivo{
	
		String DNI;
		String Nombre;
		String Apellidos;
		float salario;
		boolean salesiano;
		turnos turno;
		
		
		
		public directivo(String dNI, String nombre, String apellidos, float salario, boolean salesiano, turnos turno) {
			super();
			DNI = dNI;
			Nombre = nombre;
			Apellidos = apellidos;
			this.salario = salario;
			this.salesiano = salesiano;
			this.turno = turno;
		}
		
		
		
		@Override
		public String toString() {
			return "directivo [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", salario=" + salario
					+ ", salesiano=" + salesiano + ", turno=" + turno + "]";
		}



		public String getDNI() {
			return DNI;
		}
		public void setDNI(String dNI) {
			DNI = dNI;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		
		
		public String getApellidos() {
			return Apellidos;
		}
		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
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