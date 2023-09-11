/**
 * 
 */
package com.chilas.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.chilas.projectjsf.entity.Employer;
import com.chilas.projectjsf.services.EmpleadoService;


/**
 * @author Anthony
 * Calse que se encarga de procesar info para la pántalla principal .xhtml
 */

@ManagedBean
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla 
	 */
	private List<Employer> empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados 
	 */
	public void consultarEmpleados() {	
		this.empleados =  this.empleadoService.consultarEmpleados();
	}


	/**
	 * @return the empleados
	 */
	public List<Employer> getEmpleados() {
		return empleados;
	}


	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Employer> empleados) {
		this.empleados = empleados;
	}
}
