/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;
import Vista.*;
import Modelo.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pati
 */
public class controladorhome {// ventana principal
    
    //controladorlogins.mostrar();
    Usuarios userM= new Usuarios();
    
    public static home principalfrm = new home();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar
     
     public static void mostrar(){principalfrm.setVisible(true);}
     public static void ocultar(){principalfrm.setVisible(false);}
     
     public static void BTNSalir(){
         ocultar();
         controladorlogins.mostrar();
         
        
     } 
     public static void inform(){
         ocultar();
        controladorinformacion.mostrar();
         
     }
      public static void RegistrarVeh(){
         ocultar();
         
         controladoringresarVeh.mostrar();
         JOptionPane.showMessageDialog(null, " Bienvenido");
        

        
        
     } 
       public static void RetirarVeh(){
         ocultar();
         controladretVeh.ocultar();
         controladorhome.mostrar();
       
     } 
        public static void buscarVeh(){
        ocultar();
        controladorBuscarV.ocultar();
        controladorhome.mostrar();
        
         
 
     } 
        
      
}
