/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnteros;

import java.util.Date;

/**
 * @author sigacdev
 */
public class Persona {

    private Long identificacion;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private Long telefono;
    private String direccionResidencia;
    private String email;

    public Persona() {
    }

    public Persona(Long identificacion, String nombres, String apellidos, Date fechaNacimiento, Long telefono, String direccionResidencia, String email) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccionResidencia = direccionResidencia;
        this.email = email;
    }

    public Long obtenerIdentificacion() {
        return identificacion;
    }

    public void asignarIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    public void asignarFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long obtenerTelefono() {
        return telefono;
    }

    public void asignarTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String obtenerDireccionResidencia() {
        return direccionResidencia;
    }

    public void asignarDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String obtenerEmail() {
        return email;
    }

    public void asignarEmail(String email) {
        this.email = email;
    }

}
