package Interfaces;

import static Interfaces.Iniciar_Sesion.eva;
import static Interfaces.Iniciar_Sesion.colPro;
import Clases.Evaluador;
import Clases.Node;
import Clases.Producto;
import Clases.Queue;
import Clases.Stack;
import javax.swing.JOptionPane;
import static Interfaces.Iniciar_Sesion.arbol;
import static Interfaces.Iniciar_Sesion.AllProduc;
import static Interfaces.Iniciar_Sesion.Aprovados;
import static Interfaces.Iniciar_Sesion.NoAprov;
import static Interfaces.Iniciar_Sesion.archi;
import static Interfaces.Iniciar_Sesion.lista_productos;

/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class Opcion_Admin extends javax.swing.JFrame {
   
    public Opcion_Admin() {
        initComponents();

    }

    //mostrar cola
    public static String Print(Queue q) {
        Queue aux = new Queue();
        Producto name;
        String text = "";
        //Reecorremos la cola

        while (!q.isEmpty()) {
            name = (Producto) q.Dequeque();
            text = text + name.toString() + "\n";
            aux.Enqueque(name);
        }
        //Devolvemos la cola

        while (!aux.isEmpty()) {
            q.Enqueque(aux.Dequeque());
        }
        return text;
    }

    //borrar cola
    public static void Delete(Queue q, String delete) {
        Queue aux = new Queue();
        Producto pro;
        while (!q.isEmpty()) {
            pro = (Producto) q.Dequeque();
            if (!pro.getCodigo().equals(delete)) {
                aux.Enqueque(pro);
            }
        }
        while (!aux.isEmpty()) {
            q.Enqueque(aux.Dequeque());
        }
    }

    //metodo para asignar evaluadores
    public void AsignarEva() {
        Node aux = eva.getFirst();
        while (!colPro.isEmpty()) {
            Producto prod = (Producto) colPro.Dequeque();
            ((Evaluador) aux.getData()).getProductos().Push(prod);
            aux = aux.getLink();
            if (aux == null) {
                aux = eva.getFirst();
            }
        }
        JOptionPane.showMessageDialog(null, "Evaluadores Asignados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdmiColab = new javax.swing.JButton();
        AdmiPro = new javax.swing.JButton();
        AdmiEva = new javax.swing.JButton();
        AdmiAsig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mostrartd = new javax.swing.JButton();
        AdmiAsigPun = new javax.swing.JButton();
        EliminarPro = new javax.swing.JButton();
        EliminarEva = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Revalidar = new javax.swing.JButton();
        Pago = new javax.swing.JButton();
        nocumple = new javax.swing.JButton();
        Distribuir = new javax.swing.JButton();
        NoReconocidos = new javax.swing.JButton();
        Promedio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdmiColab.setText("Registrar colaborador");
        AdmiColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmiColabActionPerformed(evt);
            }
        });
        jPanel1.add(AdmiColab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        AdmiPro.setText("Registrar Productividad");
        AdmiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmiProActionPerformed(evt);
            }
        });
        jPanel1.add(AdmiPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        AdmiEva.setText("Registrar Evaluador");
        AdmiEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmiEvaActionPerformed(evt);
            }
        });
        jPanel1.add(AdmiEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        AdmiAsig.setText("Asignar Evaluador");
        AdmiAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmiAsigActionPerformed(evt);
            }
        });
        jPanel1.add(AdmiAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("¿Que desea hacer?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        mostrartd.setText("Mostrar todo");
        mostrartd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrartdActionPerformed(evt);
            }
        });
        jPanel1.add(mostrartd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        AdmiAsigPun.setText("Asignar Puntos");
        AdmiAsigPun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmiAsigPunActionPerformed(evt);
            }
        });
        jPanel1.add(AdmiAsigPun, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        EliminarPro.setText("Eliminar Productividad");
        EliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        EliminarEva.setText("Eliminar Evaluador");
        EliminarEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEvaActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarEva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        Revalidar.setText("Revalidar Productos");
        Revalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevalidarActionPerformed(evt);
            }
        });
        jPanel1.add(Revalidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        Pago.setText("Valor a pagar");
        Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoActionPerformed(evt);
            }
        });
        jPanel1.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        nocumple.setText("No cumplen con los criterios");
        nocumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nocumpleActionPerformed(evt);
            }
        });
        jPanel1.add(nocumple, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        Distribuir.setText("Distribuir aprobados y no");
        Distribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistribuirActionPerformed(evt);
            }
        });
        jPanel1.add(Distribuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, -1));

        NoReconocidos.setText("No Reconocidos");
        NoReconocidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoReconocidosActionPerformed(evt);
            }
        });
        jPanel1.add(NoReconocidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        Promedio.setText("Promedio");
        Promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromedioActionPerformed(evt);
            }
        });
        jPanel1.add(Promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sin pasos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Registrar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 10, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 10, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Eliminar:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Enviar.setText("Enviar Respuesta");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        jPanel1.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Seguir paso a paso:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 10, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 500, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdmiColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmiColabActionPerformed
        Registrar_Colaborador ventanaColab = new Registrar_Colaborador();
        ventanaColab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdmiColabActionPerformed

    private void AdmiProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmiProActionPerformed
        Registrar_Productividad ventanaPro = new Registrar_Productividad();
        ventanaPro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdmiProActionPerformed

    private void AdmiEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmiEvaActionPerformed
        Registrar_Evaluador ventanaEva = new Registrar_Evaluador();
        ventanaEva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdmiEvaActionPerformed

    private void AdmiAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmiAsigActionPerformed
        AsignarEva();
    }//GEN-LAST:event_AdmiAsigActionPerformed

    private void mostrartdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrartdActionPerformed
        JOptionPane.showMessageDialog(null, eva.toString(), "Evaluadores", 1);
        JOptionPane.showMessageDialog(null, AllProduc.toString(), "Todos los productos", 1);
        JOptionPane.showMessageDialog(null, NoAprov.toString(), "No aprobados", 1);
        JOptionPane.showMessageDialog(null, Aprovados.toString(), "Aprobados", 1);
    }//GEN-LAST:event_mostrartdActionPerformed

    private void AdmiAsigPunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmiAsigPunActionPerformed
        Aprovados.AsignarPuntos(Aprovados);
        JOptionPane.showMessageDialog(null, "Puntos asignados");
    }//GEN-LAST:event_AdmiAsigPunActionPerformed

    private void EliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProActionPerformed
        String delete = JOptionPane.showInputDialog("Ingrese el código del producto a eliminar");
        Delete(colPro, delete);
        AllProduc.Delete(delete);
        Aprovados.Delete(delete);
        NoAprov.Delete(delete);
        eva.EliminarPro(eva, delete);
    }//GEN-LAST:event_EliminarProActionPerformed

    private void EliminarEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEvaActionPerformed
        String delete = JOptionPane.showInputDialog("Ingrese la identificación del evaluador a eliminar");
        Stack aux = eva.SearchEva(delete);

        if (eva.DeleteEva(delete)) {
            Node auxA = eva.getFirst();
            Producto p;
            while (!aux.isEmpty()) {
                p = (Producto) aux.Pop();
                colPro.Enqueque(p);
            }
            AsignarEva();
        } else {
            JOptionPane.showMessageDialog(null, "El evaluador no se encuentra en la lista");
        }
        
        archi.EscribirEvaluador(eva);
    }//GEN-LAST:event_EliminarEvaActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Iniciar_Sesion ventanaIni = new Iniciar_Sesion();
        ventanaIni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void RevalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevalidarActionPerformed
        arbol = NoAprov.noPro();
        arbol.Revaluar(Aprovados, NoAprov);
        Aprovados.AsignarPuntos(Aprovados);
        JOptionPane.showMessageDialog(null, arbol.Inorder());
        JOptionPane.showMessageDialog(null, "Los aprobados son: \n" + Aprovados.toString(), "Aprobados", 1);
    }//GEN-LAST:event_RevalidarActionPerformed

    private void PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoActionPerformed
        JOptionPane.showMessageDialog(null, Aprovados.PrePago());
    }//GEN-LAST:event_PagoActionPerformed

    private void nocumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nocumpleActionPerformed
        JOptionPane.showMessageDialog(null, NoAprov.toString());
    }//GEN-LAST:event_nocumpleActionPerformed

    private void DistribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistribuirActionPerformed
        //mandar a distribuir en los aprobados y no aprobados
        AllProduc.Distribuidos(AllProduc, Aprovados, NoAprov);
        JOptionPane.showMessageDialog(null, "Distribución con exito");
    }//GEN-LAST:event_DistribuirActionPerformed

    private void NoReconocidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoReconocidosActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona buscada");
        JOptionPane.showMessageDialog(null, "Los productos no aprobados por " + nombre + " son: \n" + arbol.SearchNode(nombre));
    }//GEN-LAST:event_NoReconocidosActionPerformed

    private void PromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromedioActionPerformed
        Grafica ventanaGraf = new Grafica();
        ventanaGraf.setVisible(true);
    }//GEN-LAST:event_PromedioActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        Node aux=Aprovados.getFirst();      
        
        while (aux!=null) 
        {
            lista_productos = Aprovados.Listar_colav(((Producto)aux.getData()).getColab().getNombre(), Aprovados);
            archi.Enviar_respuerta(lista_productos,((Producto)aux.getData()).getColab().getNombre() );
            aux = aux.getLink();
        }
        JOptionPane.showMessageDialog(null, "El mensaje ha sido enviado", "Confirmación", 1);
    }//GEN-LAST:event_EnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Opcion_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdmiAsig;
    private javax.swing.JButton AdmiAsigPun;
    private javax.swing.JButton AdmiColab;
    private javax.swing.JButton AdmiEva;
    private javax.swing.JButton AdmiPro;
    private javax.swing.JButton Distribuir;
    private javax.swing.JButton EliminarEva;
    private javax.swing.JButton EliminarPro;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton NoReconocidos;
    private javax.swing.JButton Pago;
    private javax.swing.JButton Promedio;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Revalidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrartd;
    private javax.swing.JButton nocumple;
    // End of variables declaration//GEN-END:variables
}
