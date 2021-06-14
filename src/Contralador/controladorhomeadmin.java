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
public class controladorhomeadmin {// ventana principal
    
    //controladorlogins.mostrar();
    Usuarios userM= new Usuarios();
    
    public static homeAdmin adminfrm = new homeAdmin();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar
     
     public static void mostrar(){adminfrm.setVisible(true);}
     public static void ocultar(){adminfrm.setVisible(false);}
    
     public static void inform(){
         ocultar();
        controladorinformacion.mostrar();
         
     }
    
     
     public static void BTNSalirAdmin(){
         ocultar();
         controladorlogiAdmin.mostrar();
           
     } 
     public static void cerraSEHo(){
         int eli = JOptionPane.showConfirmDialog(null, "Desea realizar una operación mas", "home", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eli == JOptionPane.YES_OPTION) {
            controladorhomeadmin.mostrar();
        }
        if (eli == JOptionPane.NO_OPTION) {// parte de registro
            JOptionPane.showMessageDialog(null, "Ha cerrado con Exito");
        }

           
     } 
     
      public static void RegistrarV(){
         ocultar();
         controladoringresarVeh.mostrar();
         JOptionPane.showMessageDialog(null, " Bienvenido");

        
        
     } 
       public static void RetirarV(){
         ocultar();
         controladretVeh.mostrar();
       
     } 
        public static void buscarVeh(){
        ocultar();
        controladorBuscarV.mostrar();
        
         
 
     } 
        
      
}
