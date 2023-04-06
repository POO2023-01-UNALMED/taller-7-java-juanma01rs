package comunicacion;

public class Tesis extends Escrito {

	private String idea;
	private static String argumentos[];
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
				
	}
	
	int palabrasTotales(int palabrasPagina) {
		int pT = this.getPaginas() * palabrasPagina * 5;
		return pT;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		int cantidadArgumentos = argumentos.size();
		String atributos = this.getOrigen() + "\n";
		atributos += this.getTitulo() + "\n";
		atributos += this.getAutor() + "\n";
		atributos += this.getPaginas() + "\n";
		atributos += this.idea + "\n";
		atributos += cantidadArgumentos + "\n";
		atributos += this.conclusion + "\n";
		atributos += this.referencias;
		return atributos;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;		
	}
	
	public String getIdea() {
		return idea;
	}
	
	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;		
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;		
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;		
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
