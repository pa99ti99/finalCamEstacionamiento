/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Usuarios;
import Modelo.conUsuarios;



/**
 *
 * @author Pati
 */
public class ReGUsuario extends javax.swing.JFrame {
    /**
     * Creates new form ReGUsuario
     */
    public ReGUsuario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmaterno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtixt = new javax.swing.JTextField();
        txtExt = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        PAss = new javax.swing.JPasswordField();
        confiPAss = new javax.swing.JPasswordField();
        jcbmpio = new javax.swing.JComboBox<>();
        jcbColonia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 184, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 157, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 157, -1));

        txtpaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 157, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Número de Contacto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Calle:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 157, -1));
        getContentPane().add(txtcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 157, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Usuario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 163, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Correo Electronico");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 163, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Password:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Confirmar Contraseña:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 163, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Matricula:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));
        getContentPane().add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 163, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("No.Int");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Apellido Materno:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        getContentPane().add(txtmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 157, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("No.Ext");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        getContentPane().add(txtixt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 37, -1));
        getContentPane().add(txtExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 38, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("REGISTRAR ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));
        getContentPane().add(PAss, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 163, -1));
        getContentPane().add(confiPAss, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 163, -1));

        jcbmpio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbmpio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Del/Mpio", "Álvaro Obregón", "Azcapotzalco", "Benito Juárez", "Coyoacán", "Cuajimalpa de Morelos", "Cuauhtémoc", "Gustavo A. Madero", "Iztacalco", "ztapalapa", "Magdalena Contreras", "Miguel Hidalgo", " Milpa Alta", "Tláhuac", "Tlalpan", "Venustiano Carranza", "Xochimilco." }));
        jcbmpio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmpioActionPerformed(evt);
            }
        });
        getContentPane().add(jcbmpio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 163, -1));

        jcbColonia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbColonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colonia", "LOMAS DE CAPULA", "LOMAS DE BECERRA", "BARRIO NORTE", "JARDINES DEL PEDREGAL", "SAN CLEMENTE", "OLIVAR DE LOS PADRES", "OLIVAR DEL CONDE 1RA SECCIÓN I", "TIZAPAN TIZAPAN SAN ÁNGEL", "LAS ÁGUILAS (AMPL)", "LOMAS DE LA ERA", "TORRES DE POTRERO", "SAN BARTOLO AMEYALCO (PBLO)", "SANTA ROSA XOCHIAC (PBLO)", "REYNOSA TAMAULIPAS", "EL ROSARIO C (U HAB)", "ARENAL", "DEL GAS", "SAN JUAN TLIHUACA(PBLO)", "TEZOZÓMOC", "JUÁREZ NATIVITAS", "LOS REYES PUEBLO PEDREGAL DE SANTA ÚRSULA III", "PEDREGAL DE STO. DOMINGO IV", "PEDREGAL DE STO DOMINGO VI", "CTM VI CULHUACÁN (U HAB)", "AJUSCO I", "AJUSCO II", "LA PILA", "LAS LAJAS", "SAN LORENZO ACOPILCO (PBLO)", "GRANJAS DE NAVIDAD", "LOMA DEL PADRE", "SAN PEDRO CUAJIMALPA (PBLO)", "SAN MATEO TLALTENANGO (PBLO)", "CENTRO VIII", "PERALVILLO II", "DOCTORES II", "DOCTORES III", "GUERRERO IV", "DOCTORES IV", "OBRERA II", "MORELOS III", "SAN JUAN DE ARAGÓN (PBLO)", "CUCHILLA DEL TESORO", "SAN JUAN DE ARAGÓN 1A SECCIÓN (U HAB) II", "GABRIEL HERNÁNDEZ (AMPL) II", "GABRIEL HERNÁNDEZ", "NUEVA ATZACOALCO II", "NUEVA ATZACOALCO III", "LOMA DE LA PALMA", "SANTA ISABEL TOLA (PBLO)", "SAN FELIPE DE JESÚS III", "SAN FELIPE DE JESÚS IV", "LA PURÍSIMA TICOMÁN (BARR)", "LA CANDELARIA TICOMÁN BARRIO", "MÁRTIRES DE RÍO BLANCO", "SAN ANITA", "PANTITLÁN I", "PANTITLÁN II", "PANTITLÁN IV", "PANTITLÁN V", "ACULCO (PBLO)", "LAS PEÑAS I", "LOMAS ESTRELLA 2ª SECCIÓN I", "IXTLAHUACAN", "GUADALUPE DEL MORAL", "CONSEJO AGRARISTA MEXICANO I", "LOMAS DE SAN LORENZO ", "LOMAS DE SAN LORENZO II ", "SAN LORENZO TEZONCO (PBLO)", "CERRO DE LA ESTRELLA I", "SAN JUAN XALPA I", "MIRASOLES(U HAB)", "VALLE DE SAN LORENZO I", "SAN ANTONIO (BARR)", "LAS PALMAS", "BARRANCA SECA", "LA CRUZ", "EL ROSAL", "SAN BERNABÉ OCOTEPEC (PBLO)", "CAZULCO (BARR)", "EL TORO", "BARROS SIERRA", "TIERRA COLORADA", "EL OCOTAL", "LA CARBONERA", "EL TANQUE", "SAN BARTOLO AMEYALCO", "POTRERILLO", "LAS CRUCES", "LOS PADRES ", "LOMAS DE SAN BERNABE", "TIERRA UNIDA", "LA MALINCHE", "PUEBLO NUEVO ALTO", "SAN JERÓNIMO ACULCO - LÍDICE (PBLO)", "SAN NICOLÁS TOTOLAPAN (PBLO)", "ANÁHUAC I", "ANÁHUAC II", "POPOTLA", "AMÉRICA", "TLAXPANA", "SAN ANTONIO TECÓMITL (PBLO)", "SAN PABLO OZTOTEPEC (PBLO)", "SAN SALVADOR CUAUHTENCO (PBLO)", "VILLA MILPA ALTA (PBLO)", "SAN PEDRO ATOCPAN (PBLO)", "SAN JOSÉ", "LA CONCHITA I", "UNIDADES HABITACIONALES DE SANTA ANA PONIENTE I", "MIGUEL HIDALGO", "MIGUEL HIDALGO OTE", "LA CONCHITA II", "SANTIAGO ZAPOTITLÁN (PBLO)", "SAN ANDRÉS MIXQUIC (PBLO)", "SAN FRANCISCO TLALTENCO (PBLO)", "SELENE (AMPL)", "SAN PEDRO TLÁHUAC (PBLO)", "AGRÍCOLA METROPOLITANA", "LA HABANA", "SAN MIGUEL AJUSCO", "PEDREGAL DE SN NICOLÁS 2A SECC", "PEDREGAL DE SAN NICOLÁS 3A SECC", "SAN PEDRO MÁRTIR (PBLO)", "EJIDOS DE SAN PEDRO MÁRTIR I (NORTE)", "LOMAS DE PADIERNA II", "HÉROES DE PADIERNA 1", "SANTO TOMÁS AJUSCO", "POPULAR STA TERESA", "AMPLIACIÓN MIGUEL HIDALGO 2A SECC", "AMPLIACIÓN MIGUEL HIDALGO 3A SECC", "MESA LOS HORNOS, TEXCALTENCO", "MIGUEL HIDALGO", "PEDREGAL DE SN NICOLÁS 1A SECC", "SAN ANDRÉS TOTOLTEPEC (PBLO)", "SAN MIGUEL XICALCO (PBLO)", "LA MAGDALENA PETLACALCO (PBLO)", "SAN MIGUEL TOPILEJO (PBLO)", "LOMAS DE PADIERNA I", "EL ARENAL IV SECC", "MOCTEZUMA II SECC II", "MOCTEZUMA II SECC III", "ROMERO RUBIO", "SIMÓN BOLÍVAR", "CARACOL", "MORELOS I", "MORELOS II", "CUCHILLA PANTITLÁN", "SAN LORENZO ATEMOAYA (PBLO)", "SAN LUIS TLAXIALTEMALCO (PBLO)", "SAN GREGORIO ATLAPULCO (PBLO)", "SANTA MARÍA NATIVITAS (PBLO)", "SANTA CRUZ ACALPIXCA (PBLO)", "SANTIAGO TEPALCATLALPAN (PBLO)", "XALTOCAN (BARR)", "SAN ANDRÉS AHUAYUCAN (PBLO)", "SAN MATEO XALPA (PBLO)", "SANTIAGO TULYEHUALCO (PBLO)", "JOSE LOPEZ PORTILLO" }));
        getContentPane().add(jcbColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 206, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantalla.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbmpioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmpioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbmpioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
          
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Contralador.controladorReGUsuario.btnGuardar();
         this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtpaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaternoActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here; 
    }//GEN-LAST:event_txtnumeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReGUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReGUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReGUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReGUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField PAss;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JPasswordField confiPAss;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JComboBox<String> jcbColonia;
    public javax.swing.JComboBox<String> jcbmpio;
    public javax.swing.JTextField txtExt;
    public javax.swing.JTextField txtcalle;
    public javax.swing.JTextField txtcorreo;
    public javax.swing.JTextField txtixt;
    public javax.swing.JTextField txtmaterno;
    public javax.swing.JTextField txtmatricula;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnumero;
    public javax.swing.JTextField txtpaterno;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
