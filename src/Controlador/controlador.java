/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.*;

/**
 //hola
 * @author usuario
 */
public class controlador implements ActionListener{
    private Sucursal s;
    private frmVentanaPrincipal ven;
    private frmSucursal suc;
    private frmRespuesta res;
    private frmPrendas pren;
    private frmGenerar gen;
    private frmConsultar con;

    
    
    
    public controlador(Sucursal s, frmVentanaPrincipal ven) {
    
        this.s = s;
        this.ven = ven;
      
               this.ven.btnSalir.addActionListener(this);
              this.ven.btnGenerar.addActionListener(this);
              this.ven.btnResponder.addActionListener(this);
            
              this.ven.cbxSeleccionar.addActionListener(this);
    }
    public controlador(Sucursal s, frmGenerar gen) {
      
        this.s = s;
        this.gen=gen;
       this.gen.btnAgregar.addActionListener(this);
       this.gen.btnCancelar.addActionListener(this);
       this.gen.btnGuardar.addActionListener(this);
       
       
    } 
    
       public controlador(Sucursal s, frmPrendas pren) {
      
        this.s = s;
        this.pren=pren;
       this.pren.btnAceptar.addActionListener(this);
       this.pren.btnCancelar.addActionListener(this);
       this.pren.txtCantidad.addActionListener(this);
       
       
    } 
    
    
    
     public void iniciar()
    {
        ven.setTitle("Empresa de indumentaria");
        ven.setLocationRelativeTo(null);
    }
        
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==ven.btnSalir)
        {
            System.exit(0);
        }
        if(/*ven.cbxSeleccionar.toString()=="Sucursal 1"*/e.getSource()==ven.btnResponder)
         {
             
             String matriz[][] = new String[s.cantidadSolicitudesRecibidas(s)][2];
             for(int i=0;i<s.cantidadSolicitudesRecibidas(s);i++){
                 matriz[i][0]=String.valueOf(s.getNumeroSolicitud(s, i));
                 matriz[i][1]=s.devolverFecha(s, i);}
                  ven.tbLista.setModel(new javax.swing.table.DefaultTableModel(
                   matriz,
                   new String [] {
                       "N° de solicitud", "Fecha del Pedido"
                   }
                  ));
                 
            }
        
           
        
        if(e.getSource()==ven.btnGenerar)
            {
                frmGenerar gen = new frmGenerar();
                controlador con = new controlador(s, gen);
                gen.setVisible(true);
                if(e.getSource()==gen.btnAgregar)
                {
                    frmPrendas pren= new frmPrendas();
                    new controlador(s,pren);
                    pren.setVisible(true);
                }
          
                 
                
            }
         
        
    }   
         
         
    
    
    
}
