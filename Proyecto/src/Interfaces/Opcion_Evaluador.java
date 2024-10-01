package Interfaces;

import Clases.Producto;
import Clases.Stack;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class Opcion_Evaluador extends javax.swing.JFrame {

    Stack pila;
    static Opcion_Evaluador oe;

    public Opcion_Evaluador() {
        initComponents();
    }

    public void Search(Stack s, String search) {
        Stack aux = new Stack();

        Producto elem;
        while (!s.isEmpty()) {
            elem = (Producto) s.Pop();
            if (elem.getCodigo().equals(search)) {
                elem.setCriterio1(uno.isSelected());
                elem.setCriterio2(dos.isSelected());
                elem.setCriterio3(tres.isSelected());
            }
            aux.Push(elem);
        }
        while (!aux.isEmpty()) {
            s.Push(aux.Pop());
        }
    }

    public Opcion_Evaluador(Stack s) {
        pila = s;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Validar = new javax.swing.JComboBox<>();
        uno = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        dos = new javax.swing.JCheckBox();
        tres = new javax.swing.JCheckBox();
        guadar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 139, -1));

        uno.setText("Información completa");
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("VALIDAD PRODUCTIVIDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        dos.setText("Registro de la información en el grupo de investigación");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        tres.setText("Veracidad de la información");
        jPanel1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        guadar.setText("GUARDAR");
        guadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guadarActionPerformed(evt);
            }
        });
        jPanel1.add(guadar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 440, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Stack aux = new Stack();
        while (!pila.isEmpty()) {
            Producto p = (Producto) pila.Pop();
            String pi = (p.getCodigo());
            Validar.addItem(pi);
            aux.Push(p);
        }
        while (!aux.isEmpty()) {
            pila.Push(aux.Pop());
        }
    }//GEN-LAST:event_formWindowOpened

    private void guadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guadarActionPerformed
        //buscar para llamar el método de validar
        Search(pila, (String) Validar.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Producto validado");

    }//GEN-LAST:event_guadarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Iniciar_Sesion ventanaIni = new Iniciar_Sesion();
        ventanaIni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Opcion_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion_Evaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                oe = new Opcion_Evaluador();
                oe.setVisible(true);
            }
        });
    }

    public static Opcion_Evaluador getOe() {
        return oe;
    }

    public JComboBox<String> getValidar() {
        return Validar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JComboBox<String> Validar;
    private javax.swing.JCheckBox dos;
    private javax.swing.JButton guadar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox tres;
    private javax.swing.JCheckBox uno;
    // End of variables declaration//GEN-END:variables
}
