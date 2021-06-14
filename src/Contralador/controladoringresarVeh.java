/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contralador;


import Modelo.ClasVehiculo;
import Modelo.conUsuarios;
import Modelo.conVehiculo;
import Vista.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGState;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
/*
/**
 *
 * @author Pati
 */
public class controladoringresarVeh {

    public static conVehiculo modCV = new conVehiculo();
    public static ClasVehiculo vehicM = new ClasVehiculo();// sobrecarga de metodos

    public static ingresarVeh frm = new ingresarVeh();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar

    public static void mostrar() {
        frm.setVisible(true);
    }

    public static void ocultar() {
        frm.setVisible(false);
    }
    

    public static void btnSalirregs() {
        ocultar();
        
        int tipo = 2;
        String dtipos;
        String dayType;
        
         
        switch (tipo) 
        {
            case 1:  dtipos = "1.- usuario";
                     break;
            case 2:  dtipos = "2.-administrador";
                     break;
            default: dtipos = "Dia invalido";
        }
         
        switch (tipo) 
        {
          //multiples cases sin declaraciones break
         
            case 1: 
                 dayType = "1.- usuario";
                int eli = JOptionPane.showConfirmDialog(null, "Desea realizar otro registro", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eli == JOptionPane.YES_OPTION) {
            controladoringresarVeh.mostrar();
        }
        if (eli == JOptionPane.NO_OPTION) {// parte de registro

            int ol = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación", "Operación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (ol == JOptionPane.YES_OPTION) {
                controladorhome.mostrar();
                //controladorhomeadmin.mostrar();
            }
            if (ol == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Gracias por registrarse");

            }
        }
                
            case 2:
                dayType = "2.- Admistrador"; 
        int el = JOptionPane.showConfirmDialog(null, "Desea realizar otro registro", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (el == JOptionPane.YES_OPTION) {
            controladoringresarVeh.mostrar();
        }
        if (el == JOptionPane.NO_OPTION) {// parte de registro

            int ol = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación", "Operación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (ol == JOptionPane.YES_OPTION) {
                //controladorhome.mostrar();
                controladorhomeadmin.mostrar();
            }
            if (ol == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Gracias por registrarse");

            }
        }
            
                break;
                 
            default: dayType= "Tipo invalido";
        }
         
        System.out.println(dtipos+" es un "+ dayType);
         System.out.println(dtipos+" es un "+ dayType);
    }
    


    public static void BtnIngresarVeh() {
        if (frm.jcbtipo.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "Selecione tipo de Vehiculo");

        }

        String horaentrada = "";
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        horaentrada = dateformat.format(date);
        System.out.print(dateformat.format(date));
        if (frm.txtusuario.getText().equals("") || frm.txtplaca.getText().equals("") || frm.txtcolor.getText().equals("") || frm.txtmodelo.getText().equals("")) {///|| regfrm.jcbmpio.getSelectedItem().toString().equals("") || regfrm.jcbColonia.getSelectedItem().toString().equals(""))

            JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS VACIOS");
            //se valida que los campos no esten vacios 
        } else {

            vehicM.setPropietario(frm.txtusuario.getText());
            vehicM.setPlaca(frm.txtplaca.getText());
            vehicM.setColor(frm.txtcolor.getText());
            vehicM.setModelo(frm.txtmodelo.getText());
            vehicM.setTipovehiculo(frm.jcbtipo.getSelectedItem().toString());
            vehicM.setHoraentrada(horaentrada);//
            vehicM.setEstado("Disponible");

            if (modCV.registrarVeh(vehicM)) {
                //controladorhomeadmin.mostrar();
                //controladorhome.mostrar();
                //conV.setTipovehivulo(ingfrm.jrbVeh.getSelectedIcon().toString());

                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                limpiarVe();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");

            }

        }
    }

    public static void limpiarVe() {// se establece el metodo para limpiar las cajas de texto.

        frm.txtusuario.setText(null);
        frm.txtplaca.setText(null);
        frm.txtcolor.setText(null);
        frm.txtmodelo.setText(null);
    }

}

/*

        if (ingrVfrm.jcbtipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "selecione el Tipo de Vehiculo");
        }
        if (ingrVfrm.txtusuario.getText().equals("") || ingrVfrm.txtplaca.getText().equals("") || ingrVfrm.txtcolor.getText().equals("") || ingrVfrm.txtmodelo.getText().equals("")) {///|| regfrm.jcbmpio.getSelectedItem().toString().equals("") || regfrm.jcbColonia.getSelectedItem().toString().equals(""))

            JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS VACIOS");

        } 

            if (modC.Existeusuario(ingrVfrm.txtusuario.getText()) == 0) {//se manda a llamar a modsql para verivifar si el usuario ya esxist

                //Date date = new Date();
                //se valida que los campos no esten vacios 
                String placa = "";
                String horaentrada = "";
                DateFormat daform = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                Date date = cal.getTime();
                horaentrada = daform.format(date);
                System.out.print(daform.format(date));
                
                vehicM.setUsuarios(ingrVfrm.txtusuario.getText());
                vehicM.setPlaca(ingrVfrm.txtplaca.getText());
                vehicM.setColor(ingrVfrm.txtcolor.getText());
                vehicM.setModelo(ingrVfrm.txtmodelo.getText());
                vehicM.setTipovehiculo(ingrVfrm.jcbtipo.getSelectedItem().toString());
                vehicM.setHoraentrada(horaentrada);
                //conV.setTipovehivulo(ingfrm.jrbVeh.getSelectedIcon().toString());

                if (modC.registrarVeh(vehicM)) {

                    JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                    limpiarVe();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
                
                 } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                
            

        }
 */
