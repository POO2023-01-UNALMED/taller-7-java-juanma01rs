package comunicacion; 

public class Alfabeto extends Pictograma {
	
	private String letras[];
	private String interpretacion;
	
	public Alfabeto(String origen, String letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public static int cantidadLetras() {
		int cL = letras.size();
		return cL;
	}
	
	String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String abc = "";
		for (char a = 'a' ; a <= 'z' ; a++) {
			abc += a + ", ";
		}
		return abc;	
	}
		
	public void setLetras(String letras) {
		this.letras = letras;		
	}
	
	public String getLetras() {
		String let = "";
		for (int i = 0; i < letras.length; i++) {
			let += letras[i] + " ";
		}
		return let;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}
