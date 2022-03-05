package ces.java;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String telefono;
	
	
	
	
	public Persona(String nombre, String apellidos, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//overridden method, has to be exactly the same like the following
    public boolean equals(Object obj) {
			if (!(obj instanceof Persona))
				return false;	
			if (obj == this)
				return true;
			return this.telefono.equals(((Persona) obj).telefono);
		}
	 
		public int hashCode(){
			return telefono.length();//for simplicity reason
		}
	
	

}
