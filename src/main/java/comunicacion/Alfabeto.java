package comunicacion; 

public class Alfabeto extends Pictograma {
	
	private static String letras[];
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		int cL = Alfabeto.letras.length;
		return cL;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String abc = "";
		for (String letra: letras) {
			abc = abc + letra + ", ";
		}
		String abecedario = abc.substring(0, abc.length() - 2);
		return abecedario;	
	}
		
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;		
	}
	
	public String[] getLetras() {
		return letras;
	}	
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
