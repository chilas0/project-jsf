/**
 * 
 */
package com.chilas.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author chilas Clase que permite controlar el funcionamiento con la pantalla
 *         de login.xhtml
 */

@ManagedBean
@RequestScoped
public class LoginController {

	private String user;

	private String pass;

	/**
	 * 
	 * Metodo que permite ingresar a la pantalla principal del proyecto.
	 * 
	 */
	public void ingresar() {
		System.out.println(user);

		if (user.equals("chilas") && pass.equals("1234")) {
			
			try {
				this.redirect("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Page not found", ""));
				e.printStackTrace();
			}
		
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "User or pass fail", ""));
		}
	}
	
	private void redirect(String page) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(page);
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

}
