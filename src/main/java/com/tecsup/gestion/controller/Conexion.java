package com.tecsup.gestion.controller;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String password = "4C15";
		String usuario = "4C15";
		String url = "jdbc:mysql://192.168.13.250:3306/4C15" ;
		try {
			con = (Connection) DriverManager.getConnection(url,usuario,password);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}
