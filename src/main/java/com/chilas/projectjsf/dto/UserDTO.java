/**
 * 
 */
package com.chilas.projectjsf.dto;

/**
 * @author Anthony
 * cLASE QUE PERMITIRA CONTENER LA INFORMACION DEL USUARIO EN SESION
 */
public class UserDTO {

	
	private String user;
	
	private String pass;

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
