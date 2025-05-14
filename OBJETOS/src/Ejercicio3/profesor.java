package Ejercicio3;

public class profesor {

		String DNI;
		String Nombre;
		String Apellidos;
		float salario;
		int num_Asignaturas;
		boolean tutor;
		
		
		public profesor(String dNI, String nombre, String apellidos, float salario, int num_Asignaturas,
				boolean tutor) {
			super();
			DNI = dNI;
			Nombre = nombre;
			Apellidos = apellidos;
			this.salario = salario;
			this.num_Asignaturas = num_Asignaturas;
			this.tutor = tutor;
		}
			
		
		@Override
		public String toString() {
			return "profesor [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", salario=" + salario
					+ ", num_Asignaturas=" + num_Asignaturas + ", tutor=" + tutor + "]";
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

