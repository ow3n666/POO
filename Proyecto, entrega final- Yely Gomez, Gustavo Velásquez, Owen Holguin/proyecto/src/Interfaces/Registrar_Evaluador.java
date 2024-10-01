package Interfaces;

import Clases.Evaluador;
import static Interfaces.Iniciar_Sesion.UsuarioIni;
import javax.swing.JOptionPane;
import static Interfaces.Iniciar_Sesion.eva;
import static Interfaces.Iniciar_Sesion.archi;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada
 *                 Owen Andrés Holguin Molina
 *                 Yely Leana Gómez Vargas
 */
public class Registrar_Evaluador extends javax.swing.JFrame {

    static Evaluador eval;
    
     public Registrar_Evaluador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idEva = new javax.swing.JTextField();
        nombreEva = new javax.swing.JTextField();
        registrarEva = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 92, -1, -1));

        jLabel2.setText("Identificacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 141, -1, -1));
        jPanel1.add(idEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 138, 130, -1));

        nombreEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEvaActionPerformed(evt);
            }
        });
        jPanel1.add(nombreEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 89, 130, -1));

        registrarEva.setText("Registrar");
        registrarEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEvaActionPerformed(evt);
            }
        });
        jPanel1.add(registrarEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 185, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Registrar Evaluador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 31, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 185, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Fondo.jpeg"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 410, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEvaActionPerformed

    private void registrarEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEvaActionPerformed
        eval = new Evaluador(idEva.getText(), nombreEva.getText());
        eva.AddFirst(eval);
        JOptionPane.showMessageDialog(null, "El evaluador fue registrado");
        idEva.setText("");
        nombreEva.setText("");
        
    }//GEN-LAST:event_registrarEvaActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
       if(UsuarioIni.getSelectedItem().equals("Administrador")){
            Opcion_Admin ob = new Opcion_Admin();
            ob.setVisible(true);
            this.setVisible(false);
        }else{
          Iniciar_Sesion ini = new Iniciar_Sesion();
        ini.setVisible(true);
        this.setVisible(false);  
        }
       archi.EscribirEvaluador(eva);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Evaluador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField idEva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreEva;
    private javax.swing.JButton registrarEva;
    // End of variables declaration//GEN-END:variables
}
