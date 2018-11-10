package com.tecsup.gestion.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.tecsup.gestion.controller.Conexion;
import com.tecsup.gestion.model.Deparment;

public class DepartmentDAOImpl implements DepartmentDAO  {

	@Override
	
	public boolean registrar(Deparment deparment) {
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;
		String sql = "INSERT INTO departments VALUES('"+deparment.getDepartment_id()+"','"+deparment.getName()+"','"+deparment.getDescription()+"','"+deparment.getCity()+"')";
		try {			
			con=Conexion.conectar();
			stm= (Statement) con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Deparment> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM departments ORDER BY department_id";
		
		List<Deparment> listaCliente= new ArrayList<Deparment>();
		
		try {			
			co= Conexion.conectar();
			stm=(Statement) co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Deparment c=new Deparment();
				c.setDepartment_id(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setDescription(rs.getString(3));
				c.setCity(rs.getString(4));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase DeparmentDAOImpl, método obtener");
			e.printStackTrace();
		}
		
		return listaCliente;
	}

	@Override
	public boolean actualizar(Deparment deparment) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE departments SET department_id='"+deparment.getDepartment_id()+"', name='"+deparment.getName()+"', description='"+deparment.getDescription()+"'" +" WHERE ID="+deparment.getDepartment_id();
		try {
			connect=Conexion.conectar();
			stm=(Statement) connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase DeparmentDAOImpl, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}

	@Override
	public boolean eliminar(Deparment deparment) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM departments WHERE department_id="+deparment.getDepartment_id();
		try {
			connect=Conexion.conectar();
			stm=(Statement) connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase DeparmentDAOImpl, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}
