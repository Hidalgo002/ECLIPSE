package Ejercicio3_2;

enum turnos{MANANA, TARDE};

public class Directivo extends Persona{
		
		private boolean salesiano;
		private	turnos turno;
		
		
		
		public Directivo(String dni, String nombre, String apellidos, float salario, boolean salesiano, turnos turno) {
			super(dni,nombre,apellidos,salario);
			this.salesiano = salesiano;
			this.turno = turno;
		}



		@Override
		public String toString() {
			return "DATOS DIRECTIVO \n    DNI: " + getDni() + "\n    NOMBRE: "
					+ getNombre() + "\n    APELLIDOS: " + getApellidos() + "\n    SALARIO: " + getSalario()
					+ " €\n    SALESIANO: " + salesiano + "\n    TURNO:" + turno;
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