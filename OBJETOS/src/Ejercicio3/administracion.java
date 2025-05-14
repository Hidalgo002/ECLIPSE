package Ejercicio3;

public class administracion{
	
		String DNI;
		String Nombre;
		String Apellidos;
		float salario;
		String estudios;
		int antiguedad;
			
		
		public administracion(String dNI, String nombre, String apellidos, float salario, String estudios,
				int antiguedad) {
			super();
			DNI = dNI;
			Nombre = nombre;
			Apellidos = apellidos;
			this.salario = salario;
			this.estudios = estudios;
			this.antiguedad = antiguedad;
		}
		
		
		
		@Override
		public String toString() {
			return "administracion [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", salario="
					+ salario + ", estudios=" + estudios + ", antiguedad=" + antiguedad + "]";
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
		public String getEstudios() {
			return estudios;
		}
		public void setEstudios(String estudios) {
			this.estudios = estudios;
		}
		public int getAntiguedad() {
			return antiguedad;
		}
		public void setAntiguedad(int antiguedad) {
			this.antiguedad = antiguedad;
		}
		
		
		
}
