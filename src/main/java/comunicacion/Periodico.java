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
	
	public static int palabrasTotales(int palabrasPagina) {
		int pT = this.getPaginas() * palabrasPagina * 10;
		return pT;
	}
	
	public static String interpretacion() {
		return interpretacion;
	}
	
	public static String toString() {
		String atributos = this.getOrigen() + "\n";
		atributos += this.getTitulo() + "\n";
		atributos += this.getAutor() + "\n";
		atributos += this.getPaginas() + "\n";
		atributos += fecha + "\n";
		atributos += primicia;
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
