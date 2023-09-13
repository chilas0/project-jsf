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
		Employer empleadoNetflix = new Employer();
		Employer empleadoAmazon = new Employer();
		Employer empleadoHP = new Employer();
		Employer empleadoOracle = new Employer();
		Employer empleadoDeloitte = new Employer();
		Employer empleadoDisney = new Employer();
		
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
		
		empleadoNetflix.setName("Carlos");
		empleadoNetflix.setFirstname("Marin");
		empleadoNetflix.setSecondName("Calderon");
		empleadoNetflix.setPosition("Developer");
		empleadoNetflix.setStatus(true);
		
		empleadoAmazon.setName("Antony");
		empleadoAmazon.setFirstname("Abarca");
		empleadoAmazon.setSecondName("Zuñiga");
		empleadoAmazon.setPosition("Infrastructure");
		empleadoAmazon.setStatus(true);
		
		empleadoHP.setName("Alejandra");
		empleadoHP.setFirstname("Castro");
		empleadoHP.setSecondName("Zuñiga");
		empleadoHP.setPosition("Developer");
		empleadoHP.setStatus(true);
		
		empleadoOracle.setName("Karla");
		empleadoOracle.setFirstname("Arguedas");
		empleadoOracle.setSecondName("Castellon");
		empleadoOracle.setPosition("Developer");
		empleadoOracle.setStatus(true);
		
		empleadoDeloitte.setName("Patricio");
		empleadoDeloitte.setFirstname("Carvajal");
		empleadoDeloitte.setSecondName("Laredo");
		empleadoDeloitte.setPosition("Contador");
		empleadoDeloitte.setStatus(true);
		
		empleadoDisney.setName("Francisco");
		empleadoDisney.setFirstname("Moya");
		empleadoDisney.setSecondName("Hernandez");
		empleadoDisney.setPosition("Administracion");
		empleadoDisney.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		return empleados;
	}
	
}
