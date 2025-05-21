
public class Profesor extends Persona{
		
		private int num_Asignaturas;
		private boolean tutor;
		
		
		public Profesor(String dni, String nombre, String apellidos, float salario, int num_Asignaturas,
				boolean tutor) {
			super(dni,nombre,apellidos,salario);
			this.num_Asignaturas = num_Asignaturas;
			this.tutor = tutor;
		}

		
		



		@Override
		public String toString() {
			return "DATOS PROFESOR \n    DNI: " + getDni() + "\n    NOMBRE: "
					+ getNombre() + "\n    APELLIDOS: " + getApellidos() + "\n    SALARIO: " + getSalario()
					+ " €\n    NÚMERO DE ASIGNATURAS: " + num_Asignaturas + "\n    ES TUTOR:" + tutor;
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

