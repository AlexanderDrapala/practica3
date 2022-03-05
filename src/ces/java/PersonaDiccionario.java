package ces.java;

public class PersonaDiccionario {
	
	private String nombreCompleto;
	private String telefono;
	
		
	
	public PersonaDiccionario(String telefono, String nombreCompleto) {

		this.nombreCompleto = nombreCompleto;		
		this.telefono = telefono;
	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

	

}