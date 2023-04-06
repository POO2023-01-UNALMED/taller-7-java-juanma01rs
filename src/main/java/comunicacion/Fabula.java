package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	int palabrasTotales(int palabrasPagina) {
		int pT = this.getPaginas() * palabrasPagina * 1;
		return pT;
	}	
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String atributos = this.getOrigen() + "\n";
		atributos += this.getTitulo() + "\n";
		atributos += this.getAutor() + "\n";
		atributos += this.getPaginas() + "\n";
		atributos += ensenanza;
		return atributos;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;		
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
