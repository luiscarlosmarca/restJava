package co.edu.udea.iw.rest.vo;

public class VOSolicitud {

	private String titulo;
	private String asunto;
	private String texto;
	private int id;
	private String fechaCreacion;
	private int personalResponsable;
	private int cliente;
	private String complejidad;
	private boolean jefe;
	private boolean solucionada;
	
	public boolean isSolucionada() {
		return solucionada;
	}
	public void setSolucionada(boolean solucionada) {
		this.solucionada = solucionada;
	}
	public boolean isJefe() {
		return jefe;
	}
	public void setJefe(boolean jefe) {
		this.jefe = jefe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(String complejidad) {
		this.complejidad = complejidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getPersonalResponsable() {
		return personalResponsable;
	}
	public void setPersonalResponsable(int personalResponsable) {
		this.personalResponsable = personalResponsable;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	
}
