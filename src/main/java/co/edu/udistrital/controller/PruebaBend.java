package co.edu.udistrital.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class PruebaBend {
	private String n = "Ok prueba";
	
	
	public String getN() {
		return n;
	}


	public void setN(String n) {
		this.n = n;
	}

	public String getMensaje() {
		return "Hola Mundo Prueba de Web con JSF y PrimeFaces";
	}

}
