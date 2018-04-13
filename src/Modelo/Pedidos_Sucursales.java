/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.controlador;
import vista.*;

/**
 *
 * @author Coyote
 */
public class Pedidos_Sucursales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Sucursal sucursal1 = new Sucursal(1);
    Sucursal sucursal2 = new Sucursal(2);
    Talle medio = Talle.MEDIANO;
    Talle chico = Talle.CHICO;
    Talle grande = Talle.GRANDE;
    Color blanco = Color.BLANCO;
    Color azul = Color.AZUL;
    Color rojo = Color.ROJO;
    Color naranja = Color.NARANJA;
    
    Prenda prenda1 = new Prenda(100,001,"REMERA",medio,blanco);
    Prenda prenda2 = new Prenda(90,002,"PANTALON",grande,rojo);
    Prenda prenda3 = new Prenda(120,003,"CAMPERA",chico,azul);
    Prenda prenda4 = new Prenda(100,001,"REMERA",chico,azul);
    Prenda prenda5 = new Prenda(10,004,"CAMISETA",chico,naranja);
    sucursal1.agregar_prenda(9, prenda1);
    sucursal1.agregar_prenda(4, prenda2);
    sucursal1.agregar_prenda(1, prenda3);
    sucursal1.agregar_prenda(21, prenda4);
    sucursal1.agregar_prenda(10, prenda5);
    sucursal2.agregar_prenda(10, prenda1);
    sucursal2.agregar_prenda(5, prenda2);
    sucursal2.agregar_prenda(3, prenda4);
    sucursal2.agregar_prenda(4, prenda5);
    Solicitud s = new Solicitud(10,10,2018,sucursal1,1);
    s.agregarPedido(3, prenda1);
    sucursal1.generarSolicitud(s);
    Solicitud s2 = new Solicitud(29,05,2015,sucursal2,2);
    s2.agregarPedido(10, prenda5);
    s2.agregarPedido(5, prenda3);
    s2.agregarPedido(1, prenda2);
    sucursal1.generarSolicitud(s2);
    sucursal1.recibirSolicitudes(sucursal2);
    sucursal2.recibirSolicitudes(sucursal1);
    frmVentanaPrincipal ventanaPrincipal = new frmVentanaPrincipal();
    /*int b;
     
    if(ventanaPrincipal.cbxSeleccionar.getSelectedIndex()==1)
    {
        b=1;
        controlador ctr = new controlador(sucursal1, ventanaPrincipal,b);
    }
    else
    {
        b=2;
        controlador ctr = new controlador(sucursal2, ventanaPrincipal,b);
    }*/
    controlador ctr = new controlador(sucursal1, ventanaPrincipal);
    ctr.iniciar();
    
    ventanaPrincipal.setVisible(true);
    
   
    
    
    }
    
}
