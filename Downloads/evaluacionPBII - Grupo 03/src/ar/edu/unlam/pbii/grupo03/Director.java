package ar.edu.unlam.pbii.grupo03;

public class Director extends Persona {

	private String patenteCorporativa;

	public Director(Integer dni, String nombre,String patente) {
		super(dni, nombre);
		
		this.patenteCorporativa=patente;
	}

	public String getPatenteCorporativa() {
		return patenteCorporativa;
	}

	public void setPatenteCorporativa(String patenteCorporativa) {
		this.patenteCorporativa = patenteCorporativa;
	}

}
