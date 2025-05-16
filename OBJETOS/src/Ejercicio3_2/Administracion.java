package Ejercicio3_2;

public class Administracion extends Persona{
		
		
		String estudios;
		int antiguedad;
			
		
		public Administracion(String dni, String nombre, String apellidos, float salario, String estudios,
				int antiguedad) {
			super(dni,nombre,apellidos,salario);
			this.estudios = estudios;
			this.antiguedad = antiguedad;
		}


		@Override
		public String toString() {
			return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
					+ salario + ", estudios=" + estudios + ", antiguedad=" + antiguedad + "]";
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
