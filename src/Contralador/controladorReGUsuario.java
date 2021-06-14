/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;

import Vista.ReGUsuario;

import Modelo.hash;
import Modelo.conUsuarios;
import Modelo.Usuarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Pati
 */
// en este aparatdo manejaremos todo los eventos de las ventanas o sea vistas.
public class controladorReGUsuario {

    public static conUsuarios modC = new conUsuarios();
    public static Usuarios userM = new Usuarios();
    public static ReGUsuario regfrm = new ReGUsuario();

    public static void mostrar() {
        regfrm.setVisible(true);
    }

    public static void ocultar() {
        regfrm.setVisible(false);
    }
    public static void btn_resgistrar(){
         ocultar();
         controladorReGUsuario.mostrar();
    }
    public static void btnSalirReg(){
        ocultar();

        int eli = JOptionPane.showConfirmDialog(null, "Desea realizar otro registro", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eli == JOptionPane.YES_OPTION) {
            controladorReGUsuario.mostrar();
        }
        if (eli == JOptionPane.NO_OPTION) {// parte de registro
            
            int ol= JOptionPane.showConfirmDialog(null, "Desea Iniciar sesión", "Sesion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (ol == JOptionPane.YES_OPTION) {
            controladorlogins.mostrar();
        }
        if (ol == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por registrarse");
            
        }
        }   
            //controladorlogins.mostrar(),
        
    }

    public static void btnGuardar() {

        String pass = new String(regfrm.PAss.getPassword()); //contraseñas val....
        String passCon = new String(regfrm.confiPAss.getPassword());

        if (regfrm.jcbColonia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione la colonia");
        }
        if (regfrm.jcbmpio.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "selecione el Municipio");
        }

        if (regfrm.txtusuario.getText().equals("") || pass.equals("") || passCon.equals("") || regfrm.txtcorreo.getText().equals("") || regfrm.txtmatricula.getText().equals("") || regfrm.txtnumero.getText().equals("") || regfrm.txtnombre.getText().equals("") || regfrm.txtpaterno.getText().equals("") || regfrm.txtmaterno.getText().equals("")
                || regfrm.txtcalle.getText().equals("") || regfrm.txtExt.getText().equals("") || regfrm.txtixt.getText().equals("")) {///|| regfrm.jcbmpio.getSelectedItem().toString().equals("") || regfrm.jcbColonia.getSelectedItem().toString().equals(""))

            JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS VACIOS");
            //se valida que los campos no esten vacios 
        } else {

            if (pass.equals(passCon)) {

                if (modC.Existeusuario(regfrm.txtusuario.getText()) == 0) {//se manda a llamar a modsql para verivifar si el usuario ya esxist

                    if (modC.esEmail(regfrm.txtcorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);

                        //se valida que los campos no esten vacios 
                        userM.setUsuario(regfrm.txtusuario.getText());
                        userM.setPassword(nuevoPass);
                        //userM.setPassword(regfrm.PAss.getText());
                        userM.setCorreo(regfrm.txtcorreo.getText());
                        userM.setMatricula(regfrm.txtmatricula.getText());//para ingresar lo datos en el campo jtextfield
                        userM.setContacto(regfrm.txtnumero.getText());
                        userM.setNombre(regfrm.txtnombre.getText());
                        userM.setPaterno(regfrm.txtpaterno.getText());
                        userM.setMaterno(regfrm.txtmaterno.getText());

                        ///Direccion
                        userM.setCalle(regfrm.txtcalle.getText());
                        userM.setNoext(regfrm.txtExt.getText());
                        userM.setNointe(regfrm.txtixt.getText());
                        userM.setDelegacion(regfrm.jcbmpio.getSelectedItem().toString());
                        userM.setColonia(regfrm.jcbColonia.getSelectedItem().toString());
                        userM.setId_tipo(1);

                        if (modC.resgistrar(userM)) {

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
        regfrm.txtusuario.setText(null);
        regfrm.PAss.setText(null);
        regfrm.confiPAss.setText(null);
        regfrm.txtcorreo.setText(null);
        regfrm.txtmatricula.setText(null);
        regfrm.txtnumero.setText(null);
        regfrm.txtnombre.setText(null);
        regfrm.txtpaterno.setText(null);
        regfrm.txtmaterno.setText(null);

        regfrm.txtixt.setText(null);
        regfrm.txtcalle.setText(null);
        regfrm.txtExt.setText(null);
        //regfrm.txtmpio.getSelectedItem().toString()(null);
        // regfrm.txtcolonia.setText(null);

    }

}
