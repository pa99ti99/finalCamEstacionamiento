/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Contralador.controladorhome;
import Modelo.Usuarios;
import Contralador.*;
/**
 *
 * @author Pati
 */
public class homeAdmin extends javax.swing.JFrame {
    Usuarios userM;

    /**
     * Creates new form home
     */
    public homeAdmin() {
        initComponents();
    }
     public homeAdmin(Usuarios userM){
        
        initComponents();
        setLocationRelativeTo(null);
        
       /* this.userM =userM;
        //1 admi --- 2 usuario 
        
        JLNombre.setText(userM.getNombre());
        JLrol.setText(userM.getNombre_tipo());
        
        
        
        if( userM.getId_tipo() == 1){// Adm
            
        }else if(userM.getId_tipo() == 2){// us
         controladoringresarVehi.mostrar();
         controladorBuscarV.ocultar();
         
        }*/
    }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Registrar = new javax.swing.JMenu();
        RegistrarV = new javax.swing.JMenuItem();
        RetirarV = new javax.swing.JMenuItem();
        buscarv = new javax.swing.JMenuItem();
        jMComprobante = new javax.swing.JMenuItem();
        BTNSalirAdmin = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        informAdmin = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu6.setText("jMenu6");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoesta.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -24, 650, 480));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(204, 255, 255));

        Registrar.setText("Operaciones ");
        Registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        RegistrarV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegistrarV.setText("Registar Vehiculo");
        RegistrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVActionPerformed(evt);
            }
        });
        Registrar.add(RegistrarV);

        RetirarV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RetirarV.setText("Retirar Vehiculo");
        RetirarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarVActionPerformed(evt);
            }
        });
        Registrar.add(RetirarV);

        buscarv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscarv.setText("Buscar Vehiculo");
        buscarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarvActionPerformed(evt);
            }
        });
        Registrar.add(buscarv);

        jMComprobante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMComprobante.setText("Comprobante");
        jMComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMComprobanteActionPerformed(evt);
            }
        });
        Registrar.add(jMComprobante);

        BTNSalirAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNSalirAdmin.setText("Salir");
        BTNSalirAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirAdminActionPerformed(evt);
            }
        });
        Registrar.add(BTNSalirAdmin);

        jMenuBar1.add(Registrar);

        Salir.setText("Quienes somos ");
        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        informAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        informAdmin.setText("Informacion");
        informAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informAdminActionPerformed(evt);
            }
        });
        Salir.add(informAdmin);

        jMenuBar1.add(Salir);

        jMenu8.setBackground(new java.awt.Color(255, 255, 255));
        jMenu8.setText("Contactanos");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMComprobanteActionPerformed

    private void BTNSalirAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirAdminActionPerformed
        // TODO add your handling code here:
        controladorhomeadmin.BTNSalirAdmin();
    }//GEN-LAST:event_BTNSalirAdminActionPerformed

    private void RegistrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVActionPerformed
        // TODO add your handling code here:
         controladorhomeadmin.RegistrarV();
         
     
    }//GEN-LAST:event_RegistrarVActionPerformed

    private void RetirarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarVActionPerformed
        // TODO add your handling code here:

        controladorhomeadmin.RetirarV();
        
        
    }//GEN-LAST:event_RetirarVActionPerformed

    private void buscarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarvActionPerformed
        // TODO add your handling code here:
         controladorhomeadmin.buscarVeh();
         
        this.dispose();
    }//GEN-LAST:event_buscarvActionPerformed

    private void informAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informAdminActionPerformed
        // TODO add your handling code here:
        controladorhomeadmin.inform();
    }//GEN-LAST:event_informAdminActionPerformed

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
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BTNSalirAdmin;
    public javax.swing.JMenu Registrar;
    private javax.swing.JMenuItem RegistrarV;
    private javax.swing.JMenuItem RetirarV;
    public javax.swing.JMenu Salir;
    private javax.swing.JMenuItem buscarv;
    public javax.swing.JMenuItem informAdmin;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMComprobante;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
