package Ejercicio3_2;

import java.util.Arrays;

enum generos{HOMBRE, MUJER}

public class Alumno extends Persona{
	
		private String fechaNacimiento;
		private generos sexo;
		private boolean repetidor;
		private Modulo [] losModulos;
		
		public Alumno(String dni, String nombre, String apellidos, String fechaNacimiento, generos sexo,
				boolean repetidor, Modulo[] losModulos) {
			super(dni,nombre,apellidos);
			this.fechaNacimiento = fechaNacimiento;
			this.sexo = sexo;
			this.repetidor = repetidor;
			this.losModulos = losModulos;
		}
		

		


		@Override
		public String toString() {
			return "Alumno [toString()=" + super.toString() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
					+ ", getApellidos()=" + getApellidos() + ", getSalario()=" + getSalario() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", fechaNacimiento=" + fechaNacimiento + ", sexo="
					+ sexo + ", repetidor=" + repetidor + ", losModulos=" + Arrays.toString(losModulos) + "]";
		}





		public String getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public generos getSexo() {
			return sexo;
		}

		public void setSexo(generos sexo) {
			this.sexo = sexo;
		}

		public boolean isRepetidor() {
			return repetidor;
		}

		public void setRepetidor(boolean repetidor) {
			this.repetidor = repetidor;
		}

		public Modulo[] getLosModulos() {
			return losModulos;
		}

		public void setLosModulos(Modulo[] losModulos) {
			this.losModulos = losModulos;
		}
		
				
}
