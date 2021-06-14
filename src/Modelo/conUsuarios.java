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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pati
 */
public class conUsuarios extends conexion {
// ------------------------------------------------ usuario--------------------------------------------------
    public boolean resgistrar(Usuarios usr) {
        PreparedStatement pst = null;
        Connection con = getconexion();
         int id_usuario=0;

        try {

            String sql = "INSERT INTO usuario( usuario, password, correo, matricula, contacto, nombre, paterno, materno, id_tipo) VALUES(?,?,?,?,?,?,?,?,?)";

            pst = con.prepareStatement(sql);
            pst.setString(1, usr.getUsuario());
            pst.setString(2, usr.getPassword());
            pst.setString(3, usr.getCorreo());
            pst.setString(4, usr.getMatricula());
            pst.setString(5, usr.getContacto());
            pst.setString(6, usr.getNombre());
            pst.setString(7, usr.getPaterno());
            pst.setString(8, usr.getMaterno());
            pst.setInt(9, usr.getId_tipo());
            //pst.execute();
            int res = pst.executeUpdate();

            // se hara consulta para que me regrese  la colsulta de id_usurio 
            sql = "(SELECT id_usuario FROM usuario WHERE usuario= ?)";/// Cnsulta    /// pst = con.prepareStatement(sql); // pst.setString(1, usr.getUsuario());  //ResulSet rs = pst.executeQuery();// faltar cterminar 
            
            pst = con.prepareStatement(sql);
            pst.setString(1, usr.getUsuario());
            ResultSet rs = pst.executeQuery();// teminado
            if (rs.next()) {
                id_usuario=rs.getInt(1);//0 no funcina//
               
            }
            //if (rs.next()) {
            //   return rs.getInt(1);// SE RETRNAN LOS VALORES 
            if(id_usuario>0){ //if 
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                
            sql = "INSERT INTO direccion( calle, nointe, noext, delegacion, colonia, id_usuario) VALUES(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, usr.getCalle());
            pst.setString(2, usr.getNointe());
            pst.setString(3, usr.getNoext());
            pst.setString(4, usr.getDelegacion());
            pst.setString(5, usr.getColonia());
            pst.setInt(6,id_usuario);//
            res = pst.executeUpdate();
           // pst.execute();
           //
            //return true;
             }return true;

        } catch (SQLException ex) {
            Logger.getLogger(conUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

 public boolean login(Usuarios usr) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();
        //String sql ="SELECT id_usuario, usuario, password, nombre, id_tipo FROM usuarios WHERE usuario= ?";   //Seleccionamos  el usurio para tomarlos datos de la tabla usuario 
        // consulta de multebaase de datos  //t.nombre es el nombre que se le da el rol que va recibir el usuario
        
        //  String sql = "SELECT u.id, u.usuario, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo= t.id WHERE usuario= ?";   //Seleccionamos  el usurio para tomarlos datos de la tabla usuario 

        String sql = "SELECT  id_usuario, usuario, password,correo, matricula, contacto,nombre, paterno,materno, id_tipo FROM usuario WHERE usuario= ?";   //Seleccionamos  el usurio para tomarlos datos de la tabla usuario 

        try {
            pst = con.prepareStatement(sql);//Preparamos nuestra consulta
            pst.setString(1, usr.getUsuario());//Le enviamos el dato
            rs = pst.executeQuery();//ejecutamos nuestra consulta

            if (rs.next()) {//  se hace la compraracion  de que el passworde que este en la base sea la mismas que ingres al login
                if (usr.getPassword().equals(rs.getString(3))) {// contamos los campos en que se ubica el password en string sql ="SELECT id, usuario, password,

                    /*
                    String sqlUpdate = "UPDATE usuario SET last_session = ? WHERE id_usuario=?"; // actualizacion de login de ingreso

                    pst = con.prepareStatement(sqlUpdate);//Preparamos nuestra consulta
                    pst.setString(1, usr.getLast_session());//Le
                    pst.setInt(2, rs.getInt(1));
                    pst.execute();//ejecutamos nuestra consulta
*/
                    usr.setId_usuario(rs.getInt(1));
                    usr.setNombre(rs.getString(7));
                    usr.setId_tipo(rs.getInt(10));
                    return true;
                } else {
                    return false;//en caso de que las contraseñas no coincidan se retorna falso 
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(conUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int Existeusuario(String usuario) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "(SELECT count(id_usuario) FROM usuario WHERE usuario= ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);// SE RETRNAN LOS VALORES 
            }
            return 1;// SE RETORNA UNA PARA QUE YA NO SE PUEDA REGISTAR EL USURAIO QUE YA EXISTE 

        } catch (SQLException ex) {
            Logger.getLogger(conUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    public boolean esEmail(String correo) {
        //patron para validar un correo electronico
        //iniciales   2.-caso que .o -  3.@    4.- dominio      5.- .com
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        /// String correo = "info@programacionextrema.com";
        Matcher mather = pattern.matcher(correo);//matcher se encarga de hacer la validación
        return mather.find();//aqui indicara si lo encontro o no
    }
    
    
    
 //   ----------------------------vehiculo-----------------------------
//Connection conect = conexion.conexion();
//Statement stm = conect.createstatement();
            //ResultSet rs = stm.executeQuery("consulta");

 
}
