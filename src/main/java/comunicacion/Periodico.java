package comunicacion;

public class Periodico extends Escrito {
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	int palabrasTotales(int palabrasPagina) {
		int pT = this.getPaginas() * palabrasPagina * 10;
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
		atributos += this.fecha + "\n";
		atributos += this.primicia;
		return atributos;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;		
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;		
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
