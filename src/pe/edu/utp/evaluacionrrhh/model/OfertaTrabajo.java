/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.model;

import java.time.LocalDate;

/**
 *
 * @author booz
 */
public class OfertaTrabajo {

    private String area;
    private String cargo;
    private String modalidad;
    private String direccion;
    private int edadMaxima;
    private int sueldoTope;
    private LocalDate fechaDeEntrevista;
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldoTope() {
        return sueldoTope;
    }

    public void setSueldoTope(int sueldoTope) {
        this.sueldoTope = sueldoTope;
    }

    public LocalDate getFechaDeEntrevista() {
        return fechaDeEntrevista;
    }

    public void setFechaDeEntrevista(LocalDate fechaDeEntrevista) {
        this.fechaDeEntrevista = fechaDeEntrevista;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String localidad) {
        this.direccion = localidad;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }
}
