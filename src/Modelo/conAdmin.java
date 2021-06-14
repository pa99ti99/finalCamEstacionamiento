/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pati
 */
public class conAdmin extends conexion {
    
    public boolean registrarAdmin(admin adm) {
        
        PreparedStatement pst = null;
        Connection con = getconexion();

        try {

            String sql = "INSERT INTO administrador( usuario,correo, contrasena, contacto, nombre, apaterno, apmaterno,id_tipo) VALUES(?,?,?,?,?,?,?,?)";

            pst = con.prepareStatement(sql);
            pst.setString(1, adm.getUsuario());
            pst.setString(2, adm.getCorreo());
            pst.setString(3, adm.getContrasena());
            pst.setString(4, adm.getContacto());
            pst.setString(5, adm.getNombre());
            pst.setString(6, adm.getApaterno());
            pst.setString(7, adm.getApmaterno());
            pst.setInt(8, adm.getId_tipo());
            //pst.execute();
            int r = pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(conAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

 public boolean loginAdmin(admin adm) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();
        //String sql ="SELECT id_usuario, usuario, password, nombre, id_tipo FROM usuarios WHERE usuario= ?";   //Seleccionamos  el usurio para tomarlos datos de la tabla usuario 
        // consulta de multebaase de datos  //t.nombre es el nombre que se le da el rol que va recibir el usuario
        
        //  String sql = "SELECT u.id, u.usuario, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo= t.id WHERE usuario= ?";   //Seleccionamos  el usurio para tomarlos datos de la tabla usuario 

        String sql = "SELECT id_adminstrador, usuario, contrasena, nombre, id_tipo FROM  administrador WHERE usuario= ?";
        try {
            pst = con.prepareStatement(sql);//Preparamos nuestra consulta
            pst.setString(1, adm.getUsuario());//Le enviamos el dato
            rs = pst.executeQuery();//ejecutamos nuestra consulta

            if (rs.next()) {//  se hace la compraracion  de que el passworde que este en la base sea la mismas que ingres al login
                if (adm.getContrasena().equals(rs.getString(3))) {// contamos los campos en que se ubica el password en string sql ="SELECT id, usuario, password,
                  
                    adm.setId_adminstrador(rs.getInt(1));
                    adm.setNombre(rs.getString(4));
                    adm.setId_tipo(rs.getInt(5));
                    return true;
                } else {
                    return false;//en caso de que las contraseñas no coincidan se retorna falso 
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(conAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int ExisteAdmin(String usuario) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "(SELECT count(id_adminstrador) FROM administrador WHERE usuario= ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);// SE RETRNAN LOS VALORES 
            }
            return 1;// SE RETORNA UNA PARA QUE YA NO SE PUEDA REGISTAR EL USURAIO QUE YA EXISTE 

        } catch (SQLException ex) {
            Logger.getLogger(conAdmin.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    public boolean Emails(String correo) {
        //patron para validar un correo electronico
        //iniciales   2.-caso que .o -  3.@    4.- dominio      5.- .com
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        /// String correo = "info@programacionextrema.com";
        Matcher mather = pattern.matcher(correo);//matcher se encarga de hacer la validación
        return mather.find();//aqui indicara si lo encontro o no
    }

    
}
