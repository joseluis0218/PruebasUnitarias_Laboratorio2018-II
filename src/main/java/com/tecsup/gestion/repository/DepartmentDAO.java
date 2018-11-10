package com.tecsup.gestion.repository;

import java.util.List;

import com.tecsup.gestion.model.Deparment;

public interface DepartmentDAO {
	public boolean registrar(Deparment deparment);
	public List<Deparment> obtener();
	public boolean actualizar(Deparment deparment);
	public boolean eliminar(Deparment deparment);
}
