/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;

import Modelo.Usuarios;
import Modelo.hash;
import Modelo.conUsuarios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Vista.logins;

import Modelo.hash;
import Vista.home;
import Vista.inicio;

/**
 *
 * @author Pati
 */
public class controladorlogins {

    public static conUsuarios modC = new conUsuarios();
    public static Usuarios userM = new Usuarios();
    public static logins lofrm = new logins();
    
    public static void mostrar() { lofrm.setVisible(true);}
    public static void ocultar() { lofrm.setVisible(false);}

    public static void btnGuardar(){
         ocultar();
         controladorReGUsuario.mostrar();
        }
      
    public static void btnIngresarlog() {

        //fecha y hora de ingrseo de nuestro sistema 
        //Date date = new Date();
        //DateFormat fechaHora = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss"); 
        
        String pass = new String(lofrm.txtPass.getPassword());

        if (!lofrm.txtusuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = hash.sha1(pass);

            userM.setUsuario(lofrm.txtusuario.getText());
            userM.setPassword(nuevoPass);
          //  userM.setLast_session(fechaHora.format(date));
            
            

            if (modC.login(userM)) {
                limpiar();
               
             mostrar();
             controladorhome.mostrar();
             controladorlogins .ocultar();
               //inicio.frmlog = null;
                //this.dispose();
/*
                prifrm.setVisible(true);
                inicio.frmlog = null;
                this.dispose();

                home principalfrm = new home(mod);
                frmHome.setVisible(true)
*/
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                //limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }
     public static void limpiar() {// se establece el metodo para limpiar las cajas de texto.
        lofrm.txtusuario.setText(null);
        lofrm.txtPass.setText(null);
     }
}
