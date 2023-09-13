/**
 * 
 */
package com.chilas.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.chilas.projectjsf.dto.UserDTO;

/**
 * @author Anthony
 * Clase que se encarga de mantener la informacion del usuario que ingrsa al aplicativo en sesion
 */

@ManagedBean
@SessionScoped
public class SessionController {

	
	/**
	 * Usuario que se mantendra en la sesion 
	 */
	private UserDTO userDTO;

	
	/**
	 * Inicializ ala sesion del usuario 
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando datos del user");
	}
	
	/**
	 * @return the userDTO
	 */
	public UserDTO getUserDTO() {
		return userDTO;
	}

	/**
	 * @param userDTO the userDTO to set
	 */
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
}
