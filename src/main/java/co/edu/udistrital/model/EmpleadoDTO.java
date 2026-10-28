package co.edu.udistrital.model;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable {

	private static final long serialVersionUID = -814469580348284935L;

	private long id;
	private String nombres;
	private double salario;
	private int dias_t;

	public EmpleadoDTO() {

	}

	public EmpleadoDTO(long id, String nombres, double salario, int dias_t) {
		this.id = id;
		this.nombres = nombres;
		this.salario = salario;
		this.dias_t = dias_t;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDias_t() {
		return dias_t;
	}

	public void setDias_t(int dias_t) {
		this.dias_t = dias_t;
	}

	public double calcularSueldo() {
		return (salario / 30) * dias_t;
	}

}
