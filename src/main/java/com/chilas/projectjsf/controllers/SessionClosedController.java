/**
 * 
 */
package com.chilas.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Anthony
 * Clase que se encarga de cerrar la sesion del usuario 
 */

@ManagedBean
public class SessionClosedController {

	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesion");
	}
	
	
	/**
	 * Metodo que permite cerrar la sesion del usuario y regresar al login 
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redirect("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void redirect(String page) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(page);
	}
}
