package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pati
 */
public class conVehiculo extends conexion {

    public boolean registrarVeh(ClasVehiculo veh) {

        PreparedStatement pst = null;
        Connection con = getconexion();

        try {
            //String sql = "INSERT vehiculo(usuarios,placa,color,modelo,tipovehiculo, horaentrada,estado) VALUES(?,?,?,?,?,?,?)";

            String sql = "INSERT INTO vehiculo(propietario,placa,color,modelo,tipovehiculo,horaentrada,estado) VALUES(?,?,?,?,?,?,?)";

            pst = con.prepareStatement(sql);
            pst.setString(1, veh.getPropietario());
            pst.setString(2, veh.getPlaca());
            pst.setString(3, veh.getColor());
            pst.setString(4, veh.getModelo());
            pst.setString(5, veh.getTipovehiculo());
            pst.setString(6, veh.getHoraentrada());
            pst.setString(7, veh.getEstado());
            pst.executeUpdate();
            
            
            
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(conVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean retirar(ClasVehiculo ve) {

        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT  horaentrada,tipovehiculo FROM vehiculo WHERE placa=? AND estado='Disponible'";//comando para busca

        try {
            pst = con.prepareStatement(sql);//Preparamos nuestra consulta
            pst.setString(1, ve.getPlaca());//Le enviamos el dato
            // pst.setString(2, ve.getEstado());
            rs = pst.executeQuery();//ejecutamos nuestra consulta

            if (rs.next()) {
                return true;// SE RETRNAN LOS VALORES 
            }
            return false;// SE RETORNA UNA PARA QUE YA NO SE PUEDA REGISTAR EL USURAIO QUE YA EXISTE 

        } catch (SQLException ex) {
            Logger.getLogger(conVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean buscar(ClasVehiculo busc) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT * FROM vehiculo WHERE id_vehiculo=?";//comando para buscar
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, busc.getId_vehiculo());
            rs = pst.executeQuery();;// es el que se encarga de regresar el resultado   

            if (rs.next()) {
                return true;// SE RETRNAN LOS VALORES 
            }
            return false;// SE RETORNA UNA PARA QUE YA NO SE PUEDA REGISTAR EL USURAIO QUE YA EXISTE 

        } catch (SQLException ex) {
            Logger.getLogger(conVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
