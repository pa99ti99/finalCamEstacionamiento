/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;

import Modelo.*;
import Vista.*;
import Contralador.*;
import Modelo.hash;
import javax.swing.JOptionPane;

/**
 *
 * @author Pati
 */
public class controladoRregAdministrador {

    public static conAdmin modAdm = new conAdmin();
    public static admin adminM = new admin();
    public static regAdministrador admfrm = new regAdministrador();

    public static void mostrar() {
        admfrm.setVisible(true);
    }

    public static void ocultar() {
        admfrm.setVisible(false);
    }

    public static void bntsaliradminReg() {
        ocultar();
        int eli = JOptionPane.showConfirmDialog(null, "DESEA REALIZAR OTRO REGISTRO", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eli == JOptionPane.YES_OPTION) {
            controladoRregAdministrador.mostrar();
        }
        if (eli == JOptionPane.NO_OPTION) {// parte de registro EN CASO DE NO 

            int ol = JOptionPane.showConfirmDialog(null, "DESEA INICIAR SESIÓN", "Sesion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (ol == JOptionPane.YES_OPTION) {
                controladorlogins.mostrar();
            }
            if (ol == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Gracias por registrarse");

            }
        }

        //controladorlogiAdmin.ocultar();
    }

    public static void btnGuardarAdmin() {

        String pass = new String(admfrm.APAss.getPassword()); //contraseñas val....
        String passCon = new String(admfrm.confiPAss.getPassword());

        if (admfrm.txtAusuario.getText().equals("") || pass.equals("") || passCon.equals("") || admfrm.txtAcorreo.getText().equals("") || admfrm.txtAnumero.getText().equals("") || admfrm.txtAnombre.getText().equals("") || admfrm.txtApaterno.getText().equals("") || admfrm.txtAmaterno.getText().equals("")) {///|| regfrm.jcbmpio.getSelectedItem().toString().equals("") || regfrm.jcbColonia.getSelectedItem().toString().equals(""))

            JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS VACIOS");
            //se valida que los campos no esten vacios 
        } else {

            if (pass.equals(passCon)) {

                if (modAdm.ExisteAdmin(admfrm.txtAusuario.getText()) == 0) {//se manda a llamar a modsql para verivifar si el usuario ya esxist

                    if (modAdm.Emails(admfrm.txtAcorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);

                        //se valida que los campos no esten vacios 
                        adminM.setUsuario(admfrm.txtAusuario.getText());
                        adminM.setContrasena(nuevoPass);
                        adminM.setCorreo(admfrm.txtAcorreo.getText());
                        adminM.setContacto(admfrm.txtAnumero.getText());
                        adminM.setNombre(admfrm.txtAnombre.getText());
                        adminM.setApaterno(admfrm.txtApaterno.getText());
                        adminM.setApmaterno(admfrm.txtAmaterno.getText());
                        adminM.setId_tipo(1);

                        if (modAdm.registrarAdmin(adminM)) {

                            JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo electronico no es valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coiciden");
            }
        }

    }

    public static void limpiar() {// se establece el metodo para limpiar las cajas de texto.
        admfrm.txtAusuario.setText(null);
        admfrm.APAss.setText(null);
        admfrm.confiPAss.setText(null);
        admfrm.txtAcorreo.setText(null);
        admfrm.txtAnumero.setText(null);
        admfrm.txtAnombre.setText(null);
        admfrm.txtApaterno.setText(null);
        admfrm.txtAmaterno.setText(null);

    }

}
