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
public class Sucursal {
 private int id;
 private ArrayList<Stock> existencias = new ArrayList<>();
 private ArrayList<Solicitud> sEnviadas = new ArrayList<>();
 private ArrayList<Solicitud> sRecibidas = new ArrayList<>();
 
 public Sucursal (){
 }

 public Sucursal (int id){
 this.id = id;
 }   

 void agregar_prenda (int cantidad, Prenda prenda){
 Stock stock = new Stock(cantidad, prenda);
 existencias.add(stock);
 }
 
 void modificar_existencias (int cantidad, int codigo){
int i;
    for (i=0 ; i < existencias.size(); i++){
    
        if(existencias.get(i).getPrenda().getCodigo() == codigo){
            existencias.get(i).setCantidad(cantidad);
            break;
        }
    }
   
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
public void generarSolicitud(Solicitud s)
{
    sEnviadas.add(s);
}

public void recibirSolicitudes(Sucursal s)
{
    for(int i=0; i<s.sEnviadas.size();i++)
    {
        if(s.sEnviadas.get(i).getSucursal().getId()==this.id)
        {
            sRecibidas.add(s.sEnviadas.get(i));
        }
    }
}

public int cantidadSolicitudesRecibidas(Sucursal s)
{
    return s.sRecibidas.size();
}

public Solicitud getSolicitud(Sucursal s, int n)
{
    for(int i=0;i<s.sRecibidas.size();i++)
    {
        if(i==n)
        {
            return s.sRecibidas.get(n);
        }
    }
     return null;
}
public int getNumeroSolicitud(Sucursal s, int n)
{
    for(int i=0;i<s.sRecibidas.size();i++)
    {
        if(i==n)
        {
            return s.sRecibidas.get(n).getNumeroSolicitud();
        }
    }
     return 0;

}
 
public String devolverFecha(Sucursal s, int n)
{
    for(int i=0;i<s.sRecibidas.size();i++)
    {
        if(i==n)
        {
            return ("%d"+s.sRecibidas.get(i).getDia()+"/"+"%d"+s.sRecibidas.get(i).getMes()+"/"+"%d"+s.sRecibidas.get(i).getAnio());
        }
    }
     return null;
  

}


}








