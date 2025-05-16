package Ejercicio3_2;

public class Profesor extends Persona{
		
		int num_Asignaturas;
		boolean tutor;
		
		
		public Profesor(String dni, String nombre, String apellidos, float salario, int num_Asignaturas,
				boolean tutor) {
			super(dni,nombre,apellidos,salario);
			this.num_Asignaturas = num_Asignaturas;
			this.tutor = tutor;
		}

		
		


		@Override
		public String toString() {
			return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
					+ ", num_Asignaturas=" + num_Asignaturas + ", tutor=" + tutor + "]";
		}



		public int getNum_Asignaturas() {
			return num_Asignaturas;
		}


		public void setNum_Asignaturas(int num_Asignaturas) {
			this.num_Asignaturas = num_Asignaturas;
		}


		public boolean isTutor() {
			return tutor;
		}


		public void setTutor(boolean tutor) {
			this.tutor = tutor;
		}
			
		
}

