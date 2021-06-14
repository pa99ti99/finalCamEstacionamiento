/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;
import Modelo.*;
import Vista.*;

import Modelo.hash;
import javax.swing.JOptionPane;
/**
 *
 * @author Pati
 */
public class controladorlogiAdmin {
    
     public static conAdmin modAdm = new conAdmin();
    public static admin adminM = new admin();
    public static logiAdm admlogfrm = new logiAdm();
    
    public static void mostrar() {admlogfrm.setVisible(true);}
    public static void ocultar() { admlogfrm.setVisible(false);}
    
    
     public static void btnGuardarAdmin(){
         ocultar();
         controladoRregAdministrador.mostrar();
        }
    
    public static void btnAdminlog() {

        //fecha y hora de ingrseo de nuestro sistema 
        //Date date = new Date();
        //DateFormat fechaHora = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss"); 
        
        String pass = new String(admlogfrm.txtAPass.getPassword());

        if (!admlogfrm.txtAusuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = hash.sha1(pass);

            adminM.setUsuario(admlogfrm.txtAusuario.getText());
            adminM.setContrasena(nuevoPass);
          //  userM.setLast_session(fechaHora.format(date));
            
            

            if (modAdm.loginAdmin(adminM)) {
               
             mostrar();
             controladorhomeadmin.mostrar();
             controladorlogiAdmin .ocultar();
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
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }
}

