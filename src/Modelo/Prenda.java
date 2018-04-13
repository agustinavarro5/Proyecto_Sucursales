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
public class Prenda {

private int precio;
private int codigo;
private String descripcion;
private Talle talle;
private Color color;

public Prenda(){
    
}

public Prenda(int precio, int codigo, String descripcion, Talle talle, Color color){
this.precio = precio;
this.codigo = codigo;
this.descripcion = descripcion;
this.talle = talle;
this.color = color;
}
       /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the persona
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the talle
     */
    public String getTalle() {
        return talle.getAbreviatura();
    }

    /**
     * @param talle the talle to set
     */
    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color.name();
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }


}
