package principal.p2_mantenimiento_datos.ejercicio1_atributos.beans;

public class Ficha {
	
	private String usuario;
	private int edad;
	private String email;
	
	public Ficha(String usuario, int edad, String email) {
		this.setUsuario(usuario);
		this.setEdad(edad);
		this.setEmail(email);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
