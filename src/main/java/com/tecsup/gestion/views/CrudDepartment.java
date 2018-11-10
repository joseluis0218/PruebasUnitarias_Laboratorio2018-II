package com.tecsup.gestion.views;

import com.tecsup.gestion.controller.DepartmentController;
import com.tecsup.gestion.model.Deparment;

public class CrudDepartment {
	public static void main(String[] args) {
		 
		Deparment deparment = new Deparment(3, "Jose Cristobal", "Esto es un departamento","Santa Anita");			
		
	
		DepartmentController controller = new DepartmentController();
 
		controller.registrar(deparment);
 
		controller.viewDeparments();
 
		deparment.setDepartment_id(1);
		deparment.setName("Luis Erquinio");
		controller.actualizar(deparment);
 
		deparment.setDepartment_id(1);
		controller.eliminar(deparment);
	}
}
