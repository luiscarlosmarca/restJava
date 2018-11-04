 package co.edu.udea.iw.rest.vo;
/**
 * 
 * Autor: lmarinc
 * Clase en la cual esta nuestro objecto
 */
public class VOUsuario {
	
	private String email;
	private String password;
	private boolean emailValido;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEmailValido() {
		return emailValido;
	}
	public void setEmailValido(boolean emailValido) {
		this.emailValido = emailValido;
	}
	
	

}
