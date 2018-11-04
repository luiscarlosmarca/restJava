package co.edu.udea.iw.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.udea.iw.rest.vo.VOSolicitud;;
@Path("/Solicitud")
public class ServiceSolicitud {
	

	/**
	 * 
	 * 
	 * Metodo generar solicitud: El cual sera usado para crear una solicitud
	 * Recibe un objecto JSON de parametro el cual tiene la siguiente esctructura
	 * 
	 * 
	 {
		"titulo":"Titulo de la solicitud",
		"asunto":"Asunto de la solicitud",
		"texto":"Texto de la solicitud enviada al sistema",
		"personalResponsable":"102929221",
		"fechaCreacion":"02 noviembre 2018",
		"complejidad": "Medio",
		"cliente":"2019211",
		"jefe":"false",
		"solucionada":"false"
	 }
	 Respuesta: El servicio devolvera un mensaje de solicitud creada satisfactoriamente
	 
	
	Metodo POST
	 */
	
	@POST
	@Path("/generarSolicitud")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public String generarSolicitud(VOSolicitud vo) {
		
		String respuesta=" Solicitud "+vo.getTitulo()+" fue creada exitosamente";		
		
		return respuesta;
	}
	
	/**
	 * 
	 * 
	 * Metodo listar solicitudes: El cual sera usado para crear una solicitud
	 * Recibe un objecto JSON de parametro el cual tiene la siguiente esctructura
	 * 
	 * 
	
	 Respuesta: El servicio devolvera la lista de las solicitudes creadas
	
	Metodo GET
	 */
	
	@GET
	@Path("/listarSolicitud")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public List<String> listarSolicitud() {
		
		List<String> solicitudes = new ArrayList<String>();
		solicitudes.add("{titulo:'Titulo de la solicitud',asunto:'Asunto de la solicitud',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'102929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Medio',cliente:'2019211'}");
		
		solicitudes.add("{titulo:'Solicitud prueba',asunto:'asunto prueba',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'2929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Alto',cliente:'82019211'}");
		
		solicitudes.add("{titulo:'Solicitud prueba',asunto:'asunto prueba',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'2929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Alto',cliente:'82019211'}");
		
		solicitudes.add("{titulo:'Solicitud prueba',asunto:'asunto prueba',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'2929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Alto',cliente:'82019211'}");
		
		solicitudes.add("{titulo:'Solicitud prueba',asunto:'asunto prueba',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'2929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Alto',cliente:'82019211'}");
		
		solicitudes.add("{titulo:'Solicitud prueba',asunto:'asunto prueba',texto:'Texto de la solicitud enviada al sistema',personalResponsable:'2929221',fechaCreacion:'02 noviembre 2018',	complejidad: 'Alto',cliente:'82019211'}");
		
		
		return solicitudes;
			
		
		
	}

	

	/**
	 * 
	 * 
	 * Metodo asignar solicitud: El cual sera usado para asignar solicitud segun la complejidad
	 * Recibe un objecto JSON de la solicitud
	 * 
	 {
		"titulo":"Titulo de la solicitud",
		"asunto":"Asunto de la solicitud",
		"texto":"Texto de la solicitud enviada al sistema",
		"personalResponsable":"",
		"fechaCreacion":"02 noviembre 2018",
		"complejidad": "Alto",
		"cliente":"2019211",
		"jefe":"false",
		"id":23242,
		"solucionada":"false"
	 
	 }
	 Respuesta: El servicio devolvera un mensaje solicitud asignada correctamente, y el id de la persona asignada.
	 
	
	Metodo POST
	 */
	
	@POST
	@Path("/asignarSolicitud")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public VOSolicitud asignarSolicitud(VOSolicitud vo) {
		
		if(vo.getComplejidad().equals("Alto")) {
			vo.setJefe(true);
			vo.setPersonalResponsable(2324322);
		}else {
			vo.setJefe(false);
			vo.setPersonalResponsable(102402912);	
		
		}
			
		return vo;
	}
	
	/**
	 * 
	 * 
	 * Metodo solucionar solicitud: Metodo para dar solucion a la solicitudes
	 * Recibe un parametro del id
	 * 
	id
	 Respuesta: El servicio devolvera un mensaje de solicitud solucionada y eliminada
	 
	
	Metodo POST
	 */
	
	@POST
	@Path("/solucionarSolicitud")
	@Consumes({MediaType.APPLICATION_JSON}) 
	@Produces({MediaType.APPLICATION_JSON}) 
	public String solucionarSolicitud(@QueryParam("id") int id) {
		
		String respuesta ="La solicitud con el id: "+id+" ha sido solucionada correctamente";
			
		return respuesta;
	}

}
