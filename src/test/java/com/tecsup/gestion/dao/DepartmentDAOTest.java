package com.tecsup.gestion.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tecsup.gestion.controller.DepartmentController;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Deparment;

public class DepartmentDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOTest.class);

	@Test
	public void registrarDepartment() throws EmptyResultException, DAOException {
		Deparment deparment = new Deparment(6, "Cristtobal Jose", "Esto es un departamento","Santa Anita");			

		//
		logger.info("registrarDepartment()");
		DepartmentController controller = new DepartmentController();
		controller.registrar(deparment);

	}
	@Test
	public void listarDepartment() throws EmptyResultException, DAOException {
		logger.info("registrarDepartment()");
		DepartmentController controller = new DepartmentController();
		controller.viewDeparments();

	}
	@Test
	public void actualizarDepartment() throws EmptyResultException, DAOException {
		logger.info("actualizarDepartment()");
		Deparment deparment = new Deparment(5, "Cristtobal Jose", "Esto es un departamento","Santa Anita");			

		DepartmentController controller = new DepartmentController();
		deparment.setDepartment_id(6);
		deparment.setName("Luis Erquinio");
		controller.actualizar(deparment);
		controller.viewDeparments();

	}
	@Test
	public void eliminarDepartment() throws EmptyResultException, DAOException {
		logger.info("actualizarDepartment()");
		Deparment deparment = new Deparment(5, "Cristtobal Jose", "Esto es un departamento","Santa Anita");			

		DepartmentController controller = new DepartmentController();
		deparment.setDepartment_id(5);
		controller.eliminar(deparment);
		controller.viewDeparments();

	}
}
