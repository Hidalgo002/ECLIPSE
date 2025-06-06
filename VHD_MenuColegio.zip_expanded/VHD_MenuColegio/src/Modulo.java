
public class Modulo {
		
		private String nombre;
		private int horas;
		private Profesor unProfe;
		private boolean convalidable;
		
		
		public Modulo(String nombre, int horas, Profesor unProfe, boolean convalidable) {
			super();
			this.nombre = nombre;
			this.horas = horas;
			this.unProfe = unProfe;
			this.convalidable = convalidable;
		}
		


		@Override
		public String toString() {
			return "Modulo [nombre=" + nombre + ", horas=" + horas + ", unProfe=" + unProfe + ", convalidable="
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




		public Profesor getUnProfe() {
			return unProfe;
		}




		public void setUnProfe(Profesor unProfe) {
			this.unProfe = unProfe;
		}




		public boolean isConvalidable() {
			return convalidable;
		}




		public void setConvalidable(boolean convalidable) {
			this.convalidable = convalidable;
		}
		
		
		
		
		
		
}
