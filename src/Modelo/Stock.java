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
public class Stock {
private int cantidad;
private Prenda prenda;

public Stock(){
    
}

public Stock(int cantidad, Prenda prenda){
this.cantidad = cantidad;
this.prenda = prenda;
}

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
       /*if(this.cantidad >= cantidad){
           this.cantidad = this.cantidad-cantidad;
       }*/
       this.cantidad=cantidad;
    }

    /**
     * @return the prenda
     */
    public Prenda getPrenda() {
        return prenda;
    }

    /**
     * @param prenda the prenda to set
     */
    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }



}
