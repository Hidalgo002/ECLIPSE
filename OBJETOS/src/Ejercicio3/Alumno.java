package Ejercicio3;

import java.util.Arrays;

enum generos{HOMBRE, MUJER}

public class Alumno {
	
		String dni;
		String nombre;
		String apellidos;
		String fechaNacimiento;
		generos sexo;
		boolean repetidor;
		Modulo [] losModulos;
		
		public Alumno(String dni, String nombre, String apellidos, String fechaNacimiento, generos sexo,
				boolean repetidor, Modulo[] losModulos) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.sexo = sexo;
			this.repetidor = repetidor;
			this.losModulos = losModulos;
		}

		@Override
		public String toString() {
			return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
					+ fechaNacimiento + ", sexo=" + sexo + ", repetidor=" + repetidor + ", losModulos="
					+ Arrays.toString(losModulos) + "]";
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
