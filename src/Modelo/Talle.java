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
public enum Talle {
MUY_CHICO("XS"),CHICO("S"),MEDIANO("M"),GRANDE("G"),MUY_GRANDE("XL");

private Talle (String abreviatura){
this.abreviatura = abreviatura;
}
private String abreviatura;

    /**
     * @return the abreviatura
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * @param abreviatura the abreviatura to set
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
}
