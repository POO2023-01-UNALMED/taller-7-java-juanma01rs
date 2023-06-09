package comunicacion;

public class Libro extends Escrito {

	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int palabrasPagina) {
		int pT = this.getPaginas() * palabrasPagina * 2;
		return pT;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String atributos = super.getOrigen() + "\n";
		atributos += super.getTitulo() + "\n";
		atributos += super.getAutor() + "\n";
		atributos += super.getPaginas() + "\n";
		atributos += this.co_autor + "\n";
		atributos += this.editorial + "\n";
		atributos += this.edicion;
		return atributos;
	}
	
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;		
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;		
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
