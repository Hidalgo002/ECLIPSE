package Ejercicio3;

public class modulo {
		
		String nombre;
		int horas;
		profesor unProfe;
		boolean convalidable;
		
		
		public modulo(String nombre, int horas, profesor unProfe, boolean convalidable) {
			super();
			this.nombre = nombre;
			this.horas = horas;
			this.unProfe = unProfe;
			this.convalidable = convalidable;
		}
		
		
		@Override
		public String toString() {
			return "modulo [nombre=" + nombre + ", horas=" + horas + ", unProfe=" + unProfe + ", convalidable="
					+ convalidable + "]";
		}


		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getHoras() {
			return horas;
		}
		public void setHoras(int horas) {
			this.horas = horas;
		}
		public profesor getUnProfe() {
			return unProfe;
		}
		public void setUnProfe(profesor unProfe) {
			this.unProfe = unProfe;
		}
		public boolean isConvalidable() {
			return convalidable;
		}
		public void setConvalidable(boolean convalidable) {
			this.convalidable = convalidable;
		}
		
		
}
