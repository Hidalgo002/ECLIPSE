
public class Revista extends Articulo {
	private int numeroEdicion;

	
	public Revista(String id, String titulo, boolean disponible, int numeroEdicion) {
		super(id, titulo, disponible);
		this.numeroEdicion = numeroEdicion;
	}


	


	@Override
	public String toString() {
		return "Revista \n     ID: " + getId()
				+ "\n     Título: " + getTitulo()
				+ "\n     Disponibilidad: " + isDisponible()
				+ "\n     Edición: " + getNumeroEdicion();
	}





	public int getNumeroEdicion() {
		return numeroEdicion;
	}


	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	
	
	
}
