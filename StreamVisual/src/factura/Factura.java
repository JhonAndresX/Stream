/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();

    }

    public void facturita() {
        List<FacturaClass> facturas = new ArrayList<FacturaClass>();
        FacturaClass f = new FacturaClass("Ticketera", 80);
        FacturaClass f2 = new FacturaClass("Celular", 1000);
        FacturaClass f3 = new FacturaClass("Impresora", 200);
        FacturaClass f4 = new FacturaClass("Computadora", 400);

        facturas.add(f);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);
        FacturaClass facturafiltro = facturas.stream().filter(fac -> fac.getImporte() > Integer.parseInt(txtimpo.getText())).findFirst().get();
        JOptionPane.showMessageDialog(rootPane, "Importe" + facturafiltro.getImporte());

    }

    public void Facturitav1() {
        List<FacturaClass> facturas = new ArrayList<FacturaClass>();
        FacturaClass f = new FacturaClass("Ticketera", 80);
        FacturaClass f2 = new FacturaClass("Celular", 1000);
        FacturaClass f3 = new FacturaClass("Impresora", 200);
        FacturaClass f4 = new FacturaClass("Computadora", 400);

        facturas.add(f);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);
        Predicate<FacturaClass> predicado = new Predicate<FacturaClass>() {
            @Override
            public boolean test(FacturaClass f) {
                JOptionPane.showMessageDialog(rootPane, "Iteracion");
                return f.getImporte() >Integer.parseInt(txtpredicado.getText());
            }
        };
        FacturaClass facturafiltro = facturas.stream().filter(predicado).findFirst().get();
        JOptionPane.showMessageDialog(rootPane, "Unica" + facturafiltro.getImporte());
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtpredicado = new javax.swing.JTextField();
        txtimpo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Factura");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, 50));

        jButton1.setText("Obtener Importe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 170, -1));
        jPanel1.add(txtpredicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 150, -1));
        jPanel1.add(txtimpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));

        jButton2.setText("ImportePredicado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pngtree-dark-blue-background-abstract-with-modern-banner-image_1070892.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtimpo.getText().equals("")) {
             JOptionPane.showMessageDialog(rootPane,"Por Favor ingrese un Dato");
        }else{
           facturita();  
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtpredicado.getText().equals("")) {
             JOptionPane.showMessageDialog(rootPane,"Por Favor ingrese un Dato");
        }else{
        Facturitav1();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtimpo;
    private javax.swing.JTextField txtpredicado;
    // End of variables declaration//GEN-END:variables
}
