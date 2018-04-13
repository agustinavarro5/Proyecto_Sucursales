/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Coyote
 */
public class Solicitud {

private int dia;
private int mes;
private int anio;
private Estado estado;
private ArrayList <Lineas_de_Solicitud> lineaSolicitud = new ArrayList<>();
private Sucursal sucursalOrigen;
private int numeroSolicitud;

public Solicitud(){
    
}

public Solicitud(int dia, int mes, int anio, Sucursal sucursalOrigen, int numeroSolicitud){
this.dia = dia;
this.mes = mes;
this.anio = anio;
this.numeroSolicitud=numeroSolicitud;
this.sucursalOrigen=sucursalOrigen;
this.estado = Enum.valueOf(Estado.class,"PENDIENTE");
}

    public Sucursal getSucursal() {
        return sucursalOrigen;
    }

    public void setSucursal(Sucursal sucursalOrigen) {
        this.sucursalOrigen = sucursalOrigen;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Sucursal getSucursalOrigen() {
        return sucursalOrigen;
    }

    public void setSucursalOrigen(Sucursal sucursalOrigen) {
        this.sucursalOrigen = sucursalOrigen;
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

   


public void Completar_Parcial(){
this.estado = Enum.valueOf(Estado.class,"PARCIAL");
}

public void Completar_Total(){
this.estado = Enum.valueOf(Estado.class,"TOTAL");
}

public void agregarPedido(int cantidadPedida, Prenda prenda){

    Lineas_de_Solicitud l = new Lineas_de_Solicitud(cantidadPedida, prenda);
    lineaSolicitud.add(l);
}




}


