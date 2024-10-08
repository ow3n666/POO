/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Archivo;
import Clases.Articulo;
import Clases.Colaborador;
import Clases.List;
import Clases.Patente;
import Clases.Producto;
import Clases.Queue;
import Clases.Software;
//import  Interfaces.Registrar_Colaborador.;
import Clases.Node;
import javax.swing.JOptionPane;
import static Interfaces.Iniciar_Sesion.UsuarioIni;
import static Interfaces.Iniciar_Sesion.colPro;
import static Interfaces.Iniciar_Sesion.AllProduc;


/**
 *
 * @author Gustavo Adolfo Velasquez Granada Owen Andrés Holguin Molina Yely
 * Leana Gómez Vargas
 */
public class Registrar_Productividad extends javax.swing.JFrame {

    Producto prod;
    Software sof;
    Articulo art;
    Patente pat;
    Node aux = new Node();
    static int Consecutivo = 1;
    static private int contart = 0;
    static private int contpat = 0;
    static private int contsoft = 0;
    static private int cont = 0;

    public static int getContart() {
        return contart;
    }

    public static void setContart(int contart) {
        Registrar_Productividad.contart = contart;
    }

    public static int getContpat() {
        return contpat;
    }

    public static void setContpat(int contpat) {
        Registrar_Productividad.contpat = contpat;
    }

    public static int getContsoft() {
        return contsoft;
    }

    public static void setContsoft(int contsoft) {
        Registrar_Productividad.contsoft = contsoft;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Registrar_Productividad.cont = cont;
    }
    

    Archivo ar = new Archivo();
    List usuario = ar.LeerLColabolador();

    public static String Print(Queue q) {
        Queue aux = new Queue();
        Producto pro;
        String text = "";
        //Reecorremos la cola

        while (!q.isEmpty()) {
            pro = (Producto) q.Dequeque();
            text = text + pro + "\n";
            aux.Enqueque(pro);
        }
        //Devolvemos la cola

        while (!aux.isEmpty()) {
            q.Enqueque(aux.Dequeque());
        }
        return text;

    }

    /**
     * Creates new form Registrar_Productividad
     */
    public Registrar_Productividad() {
        initComponents();

        Cod.setText(Consecutivo + "");
        //objetos ocultos
        articulos.setVisible(false);
        titulo.setVisible(false);
        Titu.setVisible(false);
        isbm.setVisible(false);
        Isbm.setVisible(false);
        categoria.setVisible(false);
        catego.setVisible(false);
        pate.setVisible(false);
        codpa.setVisible(false);
        codpat.setVisible(false);
        tippat.setVisible(false);
        tippate.setVisible(false);
        soft.setVisible(false);
        codsog.setVisible(false);
        cossof.setVisible(false);

        //se crea un nodo aux al que se le asigna que es el primero de la lista usuario
        aux = usuario.getFirst();

        //se recorre para agregar al combo box para dejar la lista de colaboradores exisrtenes y vincularlo con el producto
        while (aux != null) {
            Colab.addItem(((Colaborador) aux.getData()).getId());
            aux = aux.getLink();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tippat = new javax.swing.JLabel();
        tippate = new javax.swing.JComboBox<>();
        codsog = new javax.swing.JLabel();
        cossof = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ann = new javax.swing.JTextField();
        articulos = new javax.swing.JLabel();
        soft = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        Titu = new javax.swing.JTextField();
        categoria = new javax.swing.JLabel();
        Isbm = new javax.swing.JTextField();
        isbm = new javax.swing.JLabel();
        TipProduc = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Cod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        catego = new javax.swing.JComboBox<>();
        pate = new javax.swing.JLabel();
        codpa = new javax.swing.JLabel();
        codpat = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        Colab = new javax.swing.JComboBox<>();
        mostro = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR PRODUCTIVIDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 27, -1, -1));

        tippat.setText("Tipo Patente");
        jPanel1.add(tippat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        tippate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invencion", "Producto", "Procedimiento" }));
        jPanel1.add(tippate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 104, -1));

        codsog.setText("Código");
        jPanel1.add(codsog, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        cossof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cossofActionPerformed(evt);
            }
        });
        jPanel1.add(cossof, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 104, -1));

        jLabel4.setText("Colaborador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setText("Año Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 197, -1, -1));

        Ann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnActionPerformed(evt);
            }
        });
        jPanel1.add(Ann, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 197, 104, -1));

        articulos.setText("Artículos");
        jPanel1.add(articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        soft.setText("Software");
        jPanel1.add(soft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        titulo.setText("Título");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 258, -1, -1));

        Titu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituActionPerformed(evt);
            }
        });
        jPanel1.add(Titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 255, 104, -1));

        categoria.setText("Categoría");
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Isbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsbmActionPerformed(evt);
            }
        });
        jPanel1.add(Isbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 286, 104, -1));

        isbm.setText("ISBN");
        jPanel1.add(isbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        TipProduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Artículos", "Patentes", "Software" }));
        TipProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipProducActionPerformed(evt);
            }
        });
        jPanel1.add(TipProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 89, 104, -1));

        jLabel12.setText("Código");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        Cod.setEditable(false);
        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });
        jPanel1.add(Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 104, -1));

        jLabel13.setText("Tipo Productividad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 92, -1, -1));

        catego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jPanel1.add(catego, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 104, -1));

        pate.setText("Patentes");
        jPanel1.add(pate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        codpa.setText("Código");
        jPanel1.add(codpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        codpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codpatActionPerformed(evt);
            }
        });
        jPanel1.add(codpat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 104, -1));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        Colab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColabActionPerformed(evt);
            }
        });
        jPanel1.add(Colab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, -1));

        mostro.setText("Mostrar");
        mostro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostroActionPerformed(evt);
            }
        });
        jPanel1.add(mostro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cossofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cossofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cossofActionPerformed

    private void AnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnActionPerformed

    private void TituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituActionPerformed

    private void IsbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsbmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsbmActionPerformed

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed

    }//GEN-LAST:event_CodActionPerformed

    private void codpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codpatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codpatActionPerformed

    private void TipProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipProducActionPerformed

        if (TipProduc.getSelectedItem().equals("Seleccione")) {
            articulos.setVisible(false);
            titulo.setVisible(false);
            Titu.setVisible(false);
            isbm.setVisible(false);
            Isbm.setVisible(false);
            categoria.setVisible(false);
            catego.setVisible(false);
            pate.setVisible(false);
            codpa.setVisible(false);
            codpat.setVisible(false);
            tippat.setVisible(false);
            tippate.setVisible(false);
            soft.setVisible(false);
            codsog.setVisible(false);
            cossof.setVisible(false);
        }

        if (TipProduc.getSelectedItem().equals("Artículos")) {
            articulos.setVisible(true);
            titulo.setVisible(true);
            Titu.setVisible(true);
            isbm.setVisible(true);
            Isbm.setVisible(true);
            categoria.setVisible(true);
            catego.setVisible(true);
            pate.setVisible(false);
            codpa.setVisible(false);
            codpat.setVisible(false);
            tippat.setVisible(false);
            tippate.setVisible(false);
            soft.setVisible(false);
            codsog.setVisible(false);
            cossof.setVisible(false);
        }

        if (TipProduc.getSelectedItem().equals("Patentes")) {
            articulos.setVisible(false);
            titulo.setVisible(false);
            Titu.setVisible(false);
            isbm.setVisible(false);
            Isbm.setVisible(false);
            categoria.setVisible(false);
            catego.setVisible(false);
            pate.setVisible(true);
            codpa.setVisible(true);
            codpat.setVisible(true);
            tippat.setVisible(true);
            tippate.setVisible(true);
            soft.setVisible(false);
            codsog.setVisible(false);
            cossof.setVisible(false);
        }

        if (TipProduc.getSelectedItem().equals("Software")) {
            articulos.setVisible(false);
            titulo.setVisible(false);
            Titu.setVisible(false);
            isbm.setVisible(false);
            Isbm.setVisible(false);
            categoria.setVisible(false);
            catego.setVisible(false);
            pate.setVisible(false);
            codpa.setVisible(false);
            codpat.setVisible(false);
            tippat.setVisible(false);
            tippate.setVisible(false);
            soft.setVisible(true);
            codsog.setVisible(true);
            cossof.setVisible(true);
        }
    }//GEN-LAST:event_TipProducActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (TipProduc.getSelectedItem().equals("Artículos")) {
            String categ = (String) catego.getSelectedItem();
            String colab = (String) Colab.getSelectedItem();
            String ann = Ann.getText();
            String Ibn = Isbm.getText();
            String tit = Titu.getText();
            Colaborador col = usuario.SearchCol(colab);
            art = new Articulo(tit, Ibn, categ, Consecutivo + "", col, ann);
            colPro.Enqueque(art);
            AllProduc.AddLast(art);
            Consecutivo++;
            contart++;
            cont++;
            JOptionPane.showMessageDialog(null, "Artículo registrada", "Artículo", 1);
        }

        if (TipProduc.getSelectedItem().equals("Patentes")) {
            String colab = (String) Colab.getSelectedItem();
            Colaborador col = usuario.SearchCol(colab);
            pat = new Patente(codpat.getText(), (String) tippate.getSelectedItem(), Consecutivo + "", col, Ann.getText());
            colPro.Enqueque(pat);
            AllProduc.AddLast(pat);
            Consecutivo++;
            contpat++;
            cont++;
            JOptionPane.showMessageDialog(null, "Patente registrada", "Patetente", 1);
        }

        if (TipProduc.getSelectedItem().equals("Software")) {
            String colab = (String) Colab.getSelectedItem();
            Colaborador col = usuario.SearchCol(colab);
            sof = new Software(cossof.getText(), Consecutivo + "", col, Ann.getText());
            colPro.Enqueque(sof);
            AllProduc.AddLast(sof);
            Consecutivo++;
            contsoft++;
            cont++;
            JOptionPane.showMessageDialog(null, "Software registrada", "Software", 1);
        }

        if (TipProduc.getSelectedItem().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Ingrese datos correctos");
        }

        Cod.setText(Consecutivo + "");


    }//GEN-LAST:event_RegistrarActionPerformed

    private void ColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColabActionPerformed

    private void mostroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostroActionPerformed
        JOptionPane.showMessageDialog(null, Print(colPro));
    }//GEN-LAST:event_mostroActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        if (UsuarioIni.getSelectedItem().equals("Administrador")) {
            Opcion_Admin ob = new Opcion_Admin();
            ob.setVisible(true);
            this.setVisible(false);
        } else {
            Iniciar_Sesion ini = new Iniciar_Sesion();
            ini.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Productividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Productividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Productividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Productividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Productividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ann;
    private javax.swing.JTextField Cod;
    private javax.swing.JComboBox<String> Colab;
    private javax.swing.JTextField Isbm;
    private javax.swing.JButton Registrar;
    private javax.swing.JComboBox<String> TipProduc;
    private javax.swing.JTextField Titu;
    private javax.swing.JLabel articulos;
    private javax.swing.JComboBox<String> catego;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel codpa;
    private javax.swing.JTextField codpat;
    private javax.swing.JLabel codsog;
    private javax.swing.JTextField cossof;
    private javax.swing.JLabel isbm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostro;
    private javax.swing.JLabel pate;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel soft;
    private javax.swing.JLabel tippat;
    private javax.swing.JComboBox<String> tippate;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
