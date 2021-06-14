

package Contralador;


import Vista.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.*;

/**
 *
 * @author Pati
 */
public class controladorBuscarV {
    
     public static conVehiculo moCV = new conVehiculo();
    public static ClasVehiculo vehicM = new ClasVehiculo();// sobrecarga de metodos

    public static BuscarVehiculo listVfrm = new BuscarVehiculo();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar

    public static void mostrar() {
        listVfrm.setVisible(true);
    }

    public static void ocultar() {
        listVfrm.setVisible(false);

    }
    public static void btnBuscar(){
        mostrarDatos();
    }
    
     public static void mostrarDatos() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Propietario");
        model.addColumn("Placa");
        model.addColumn("Color");
        model.addColumn("Tipo");
        model.addColumn("Hora Entrada");
        model.addColumn("Hora salida");
        model.addColumn("total pagar");
        model.addColumn("estado");
        listVfrm.tabla.setModel(model);
    }
   
}
   