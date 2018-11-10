package com.tecsup.gestion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.tecsup.gestion.model.Deparment;
import com.tecsup.gestion.repository.DepartmentDAO;
import com.tecsup.gestion.repository.DepartmentDAOImpl;
import com.tecsup.gestion.views.ViewDeparment;

@Controller
public class DepartmentController {
private ViewDeparment vista= new ViewDeparment();
	
	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}
	

			
			public void registrar(Deparment deparment) {
				DepartmentDAO dao = new DepartmentDAOImpl();
				dao.registrar(deparment);
			}
			
			
			public void viewDeparments() {
				List<Deparment> departments = new ArrayList<Deparment>();
				DepartmentDAO dao= new  DepartmentDAOImpl();
				departments=dao.obtener();
				vista.viewDeparments(departments);
			}
			
			
			public void eliminar(Deparment deparment) {
				DepartmentDAO dao = new DepartmentDAOImpl();
				dao.eliminar(deparment);
			}
			
			
			public void actualizar(Deparment deparment) {
				DepartmentDAO dao = new DepartmentDAOImpl();
				dao.actualizar(deparment);		
				}

	
}
