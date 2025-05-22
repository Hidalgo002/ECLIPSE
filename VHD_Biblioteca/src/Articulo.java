
public class Articulo {
	private String id;
	private String titulo;
	private boolean disponible;
	
	
	public Articulo(String id, String titulo, boolean disponible) {
		this.id = id;
		this.setTitulo(titulo);
		this.disponible = disponible;
	}
	

	
	
	//GET-SET
	public  String getId() {
		return id;
	}
	public  void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	


}
