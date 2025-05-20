package Ejercicio3_2;

public class Administracion extends Persona{
		
		
		private String estudios;
		private int antiguedad;
			
		
		public Administracion(String dni, String nombre, String apellidos, float salario, String estudios, int antiguedad) {
			super(dni,nombre,apellidos,salario);
			this.estudios = estudios;
			this.antiguedad = antiguedad;
		}


		


		@Override
		public String toString() {
			return "DATOS ADMINISTRATIVO \n    DNI: " + getDni() + "\n    NOMBRE: "
					+ getNombre() + "\n    APELLIDOS: " + getApellidos() + "\n    SALARIO: " + getSalario()
					+ " €\n    ESTUDIOS: " + estudios + "\n    ANTIGÜEDAD:" + antiguedad;
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
