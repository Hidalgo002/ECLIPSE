
public class Libro extends Articulo {
	private String autor;

	
	public Libro(String id, String titulo, boolean disponible, String autor) {
		super(id, titulo, disponible);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Revista \n     ID: " + getId()
				+ "\n     Título: " + getTitulo()
				+ "\n     Disponibilidad: " + isDisponible()
				+ "\n     Autor: " + getAutor();
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
		
}
