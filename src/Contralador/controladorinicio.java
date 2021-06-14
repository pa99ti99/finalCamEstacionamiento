    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;

import Vista.*;

/**
 *
 * @author Pati
 */
public class controladorinicio {

    public static inicio inicioVfrm = new inicio();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar

    public static void mostrar() {
        inicioVfrm.setVisible(true);
    }

    public static void ocultar() {
        inicioVfrm.setVisible(false);
    }
    
    public static void btnPrinIngresarAdmin(){
         ocultar();
         controladorlogiAdmin.mostrar();
        }
      
  
      public static void btnPrinIngresar(){
        ocultar();
        controladorlogins.mostrar();
     } 
}
