/**
 * 
 */
package com.chilas.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.chilas.projectjsf.entity.Employer;

/**
 * Clase que permite realizar la logica del negocio para empleados 
 */
public class EmpleadoService {
	
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Employer> consultarEmpleados() {
		
		//Generar la lista de empleados a consultar
		List<Employer> empleados = new ArrayList<Employer>();
		
		Employer empleadoIBM = new Employer();
		Employer empleadoMicrosoft = new Employer();
		Employer empleadoApple = new Employer();
		
		empleadoIBM.setName("Diego");
		empleadoIBM.setFirstname("Paniagua");
		empleadoIBM.setSecondName("Lopez");
		empleadoIBM.setPosition("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setName("Alejandro");
		empleadoMicrosoft.setFirstname("Abarca");
		empleadoMicrosoft.setSecondName("Castro");
		empleadoMicrosoft.setPosition("Mid Developer Java");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setName("Luis");
		empleadoApple.setFirstname("Abarca");
		empleadoApple.setSecondName("Salmeron");
		empleadoApple.setPosition("CEO");
		empleadoApple.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		return empleados;
	}
	
}
