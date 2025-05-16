package Ejercicio3;

public class Profesor {

		String dni;
		String nombre;
		String apellidos;
		float salario;
		int num_Asignaturas;
		boolean tutor;
		
		
		public Profesor(String dni, String nombre, String apellidos, float salario, int num_Asignaturas,
				boolean tutor) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
			this.num_Asignaturas = num_Asignaturas;
			this.tutor = tutor;
		}

		

		@Override
		public String toString() {
			return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
					+ ", num_Asignaturas=" + num_Asignaturas + ", tutor=" + tutor + "]";
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

