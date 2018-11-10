package com.tecsup.gestion.views;

import java.util.List;

import com.tecsup.gestion.model.Deparment;

public class ViewDeparment {

	public void viewDeparment(Deparment deparment) {
		System.out.println("Datos del Departamento: "+deparment);
	}
	public void viewDeparments(List<Deparment> deparments) {
		for (Deparment deparment : deparments) {
			System.out.println("Datos del Departamento: "+deparment);
		}		
	}
}
