package Interfaces;

import Clases.Archivo;
import Clases.BinaryTree;
import Clases.List;
import Clases.Producto;
import Clases.Queue;
//import static Interfaces.Registrar_Colaborador.usuario;
import Clases.Stack;
//import static Interfaces.Registrar_Colaborador.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class Iniciar_Sesion extends javax.swing.JFrame {

//    Archivo ar = new Archivo();
    static BinaryTree arbol = new BinaryTree();
    static Queue colPro = new Queue();
    static List AllProduc = new List();
    static List Aprovados = new List();
    static List NoAprov = new List();
    Archivo ar = new Archivo();
    List usuario = ar.LeerLColabolador();
    static Iniciar_Sesion ini;
    static Archivo archi = new Archivo();
    static List eva = archi.LeerEvaluador();
    static List lista_productos = new List();
//    static List eva = new List();

    public Iniciar_Sesion() {
        initComponents();
    }

    public List getUsuario() {
        return usuario;
    }

    public static Iniciar_Sesion getIni() {
        return ini;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Ini = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreIni = new javax.swing.JTextField();
        ContraIni = new javax.swing.JTextField();
        UsuarioIni = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 172, -1, -1));

        Ini.setText("Iniciar sesión");
        Ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniActionPerformed(evt);
            }
        });
        jPanel1.add(Ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 217, -1, -1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 77, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 125, -1, -1));

        NombreIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreIniActionPerformed(evt);
            }
        });
        jPanel1.add(NombreIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 74, 218, -1));
        jPanel1.add(ContraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 122, 218, -1));

        UsuarioIni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Colaborador", "Evaluadores" }));
        UsuarioIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioIniActionPerformed(evt);
            }
        });
        jPanel1.add(UsuarioIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 168, 218, 23));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Iniciar sesion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 280));

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

    private void IniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniActionPerformed

        //preguntar si los campos estén llenos con la información correcta y el combox esté seleccionado con Admi
        if (UsuarioIni.getSelectedItem().equals("Administrador")) {
            if ((NombreIni.getText().equals("admin") && ContraIni.getText().equals("admin"))) {
                Opcion_Admin ventanaAdmin = new Opcion_Admin();
                ventanaAdmin.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos érroneos", "Error", 0);
            }
        }

        //preguntar si los campos estén llenos con la información correcta y el combox esté seleccionado con Colaborador
        if (UsuarioIni.getSelectedItem().equals("Colaborador")) {
            String nombre = NombreIni.getText();
            String id = ContraIni.getText();

            //se usa el método buscar booleano de la lista, para verificar que el colaborador si exista
            if (usuario.Search(nombre, id)) {
                Opcion_Colaborador ventanaColab = new Opcion_Colaborador();
                ventanaColab.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos érroneos", "Error", 0);
            }
        }

        //preguntar por el evaluador
        if (UsuarioIni.getSelectedItem().equals("Evaluadores")) {
            String nombre = NombreIni.getText();
            String id = ContraIni.getText();

            //se usa el método buscar booleano de la lista, para verificar que el colaborador si exista
            if (eva.SearchEva(nombre, id)) {

                Stack pila = eva.SearchEva(id);
                Producto prd;
                Stack aux = new Stack();

                Opcion_Evaluador ventanaEva = new Opcion_Evaluador(pila);
                ventanaEva.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos érroneos", "Error", 0);
            }
        }

        NombreIni.setText("");
        ContraIni.setText("");
    }//GEN-LAST:event_IniActionPerformed

    private void NombreIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreIniActionPerformed

    private void UsuarioIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioIniActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        ar.EscribirLColabolador(Interfaces.Registrar_Colaborador.getRc().usuario);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ini = new Iniciar_Sesion();
                ini.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContraIni;
    private javax.swing.JButton Ini;
    private javax.swing.JTextField NombreIni;
    public static javax.swing.JComboBox UsuarioIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
