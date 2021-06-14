/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;
import Modelo.*;
import Vista.informacion;
import vista.*;

/**
 *
 * @author Pati
 */
public class controladorinformacion {
      

    public static informacion infrm = new informacion();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar
     
     public static void mostrar(){infrm.setVisible(true);}
     public static void ocultar(){infrm.setVisible(false);}
     
     public static void inform(){
         ocultar();
        controladorinformacion.mostrar();
         
     }
     public static void Salirinf(){
         ocultar();
         controladorhomeadmin.mostrar();
     }
    
}
