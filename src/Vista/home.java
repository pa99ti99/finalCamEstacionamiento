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
public class home extends javax.swing.JFrame {
    Usuarios userM;

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }
     public home(Usuarios userM){
        
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
         
        }
        */
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
        JLNombre = new javax.swing.JLabel();
        JLrol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Registrar = new javax.swing.JMenu();
        RegistrarVeh = new javax.swing.JMenuItem();
        RetirarVeh = new javax.swing.JMenuItem();
        buscarVeh = new javax.swing.JMenuItem();
        jMComprobante = new javax.swing.JMenuItem();
        BTNSalir = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu6.setText("jMenu6");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Registrar.setText("Operaciones ");

        RegistrarVeh.setText("Registar Vehiculo");
        RegistrarVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarVehActionPerformed(evt);
            }
        });
        Registrar.add(RegistrarVeh);

        RetirarVeh.setText("Retirar Vehiculo");
        RetirarVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarVehActionPerformed(evt);
            }
        });
        Registrar.add(RetirarVeh);

        buscarVeh.setText("Buscar Vehiculo");
        buscarVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVehActionPerformed(evt);
            }
        });
        Registrar.add(buscarVeh);

        jMComprobante.setText("Comprobante");
        jMComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMComprobanteActionPerformed(evt);
            }
        });
        Registrar.add(jMComprobante);

        BTNSalir.setText("Salir");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });
        Registrar.add(BTNSalir);

        jMenuBar1.add(Registrar);

        Salir.setText("Arcerca de ");
        jMenuBar1.add(Salir);

        jMenu8.setText("Contactanos");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(JLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLrol, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JLrol, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(JLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMComprobanteActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        // TODO add your handling code here:
        controladorhome.BTNSalir();
    }//GEN-LAST:event_BTNSalirActionPerformed

    private void RegistrarVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVehActionPerformed
        // TODO add your handling code here:
        controladorhome.RegistrarVeh();
        
      
    }//GEN-LAST:event_RegistrarVehActionPerformed

    private void RetirarVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarVehActionPerformed
        // TODO add your handling code here:

        controladorhome.RetirarVeh();
    }//GEN-LAST:event_RetirarVehActionPerformed

    private void buscarVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVehActionPerformed
        // TODO add your handling code here:
        controladorhome.buscarVeh();
    }//GEN-LAST:event_buscarVehActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BTNSalir;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLrol;
    private javax.swing.JMenu Registrar;
    private javax.swing.JMenuItem RegistrarVeh;
    private javax.swing.JMenuItem RetirarVeh;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem buscarVeh;
    private javax.swing.JMenuItem jMComprobante;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
