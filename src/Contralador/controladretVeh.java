
package Contralador;
import Vista.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Pati
 */
public class controladretVeh {
     public static retVeh retirarVehfrm = new retVeh();// static nos permite hacer el uso de estos metodos y puedeo hacer uso de esa variable desde cualquier lugar
     
     public static void mostrar(){ retirarVehfrm.setVisible(true);}
     public static void ocultar(){ retirarVehfrm.setVisible(false);}
     
     
     public static void btnRetirarV(){
        Double Valorapagar= 0.0;
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String fechahora =  dateformat .format(date);
      
         
     }
    
}
