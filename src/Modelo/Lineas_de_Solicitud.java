/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Coyote
 */
public class Lineas_de_Solicitud {
    
private int cantidad_pedida;
private int cantidad_recibida;
private Prenda prenda;

public Lineas_de_Solicitud(){
    
}

public Lineas_de_Solicitud(int cantidad_pedida, Prenda prenda){
this.prenda = prenda;
this.cantidad_pedida = cantidad_pedida;
this.cantidad_recibida = 0;
}

void recibir_prendas(int cantidad_recibida){    
this.cantidad_recibida = cantidad_recibida + this.cantidad_recibida;

}



}
