package co.edu.udea.iw.rest.service;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
/**
 * 
 * Autor: lmarinc
 * Clase donde estan los servicios que vamos a consumir
 */
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edu.udea.iw.rest.vo.VOUsuario;

@Path("/Login")
public class ServiceLogin {
	
	/**
	 * 
	 * 
	 * Metodo Validar acceso: El cual sera usado para el modulo de acceso a la aplicación de una forma segura
	 * Recibe un objecto JSON de parametro el cual tiene la siguiente esctructura
	 * 
	 * 
	 {
		"email":"email@valido.com",// Email del usuario registrado
		"password":"constrasenia"//contraseña del usuario registrado respectivamente.
	 }
	 Respuesta: El servicio devolvera una objecto de tipo JSON con la siguiente estructura.
	 
	 {
	    "email": "email@valido.com"
	    "password": "********************+",
	    "emailValido": true
		}	
		Devuelve el email enviado por POST y un etiqueta que verifica si la contraseña y el email es valido. True "emailValido"
	 */
	@POST
	@Path("/ingresarSesion")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public VOUsuario validarAcceso(VOUsuario vo) {
		vo.setEmailValido(false);
		if(vo.getEmail().equals("lcarlos.marin@udea.edu.co")&&vo.getPassword().equals("secret")) {
			 vo.setEmailValido(true);
			 
		}
		vo.setPassword("********************+");
		return vo;
	}
	
	/**
	 * 
	 * 
	 * Metodo cerrar sesion: El cual sera usado cerrar la  sesion de cualquier usuario
	 * Recibe un objecto JSON de parametro el cual tiene la siguiente esctructura
	 * 
	 * 
	 {
		"email":"email@valido.com",// Email del usuario logeado
		"password":"constrasenia"//contraseña del usuario logeado
	 }
	 Respuesta: El servicio devolvera un mensaje de fin de sesion
	 
	 El email@usuario.com a terminado la  sesion	
	Metodo POST
	 */
	@POST
	@Path("/cerrarSesion")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public String cerrarSesion(VOUsuario vo) {
		
		String respuesta ="El usuario "+ vo.getEmail()+" Ha terminado la sesión";
		
		return respuesta;
	}
}
