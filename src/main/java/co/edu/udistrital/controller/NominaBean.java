package co.edu.udistrital.controller;

import co.edu.udistrital.model.EmpleadoDTO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class NominaBean {

    private EmpleadoDTO empleado = new EmpleadoDTO();
    private String mensajeResultado;

    public void calcularNomina() {
        try {
            double sueldo = empleado.getSalario() * empleado.getDias_t() / 30;
            this.mensajeResultado = String.format(
                "Empleado: %s | Total a pagar: $%,.2f", 
                empleado.getNombres(), 
                sueldo
            );
            
        } catch (Exception e) {
            this.mensajeResultado = " Error en el cálculo, verifique los datos.";
        }
    }
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public EmpleadoDTO getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoDTO empleado) {
        this.empleado = empleado;
    }
}