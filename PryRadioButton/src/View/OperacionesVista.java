/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OperacionesController;

/**
 *
 * @author Laboratorios DCCO
 */
public class OperacionesVista extends javax.swing.JFrame {

    /**
     * Creates new form OperacionesVista
     */
    public OperacionesVista() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_numero1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_numero2 = new javax.swing.JTextField();
        op_sumar = new javax.swing.JRadioButton();
        op_restar = new javax.swing.JRadioButton();
        op_multiplicar = new javax.swing.JRadioButton();
        op_dividir = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE NUMERO 1:");

        txt_numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero1ActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE NUMERO 2:");

        op_sumar.setText("SUMAR");
        op_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumar(evt);
            }
        });

        op_restar.setText("RESTAR");
        op_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restar(evt);
            }
        });

        op_multiplicar.setText("MULTIPLICAR");
        op_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar(evt);
            }
        });

        op_dividir.setText("DIVIDIR");
        op_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividir(evt);
            }
        });

        jLabel3.setText("RESULTADO:");

        txt_resultado.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op_dividir)
                    .addComponent(op_multiplicar)
                    .addComponent(op_sumar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(op_restar)
                    .addComponent(txt_numero2)
                    .addComponent(txt_numero1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(txt_resultado)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(op_sumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op_restar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op_multiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op_dividir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_resultado))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero1ActionPerformed
         
    }//GEN-LAST:event_txt_numero1ActionPerformed

    private void sumar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumar
        int n1=Integer.parseInt(txt_numero1.getText());
        int n2=Integer.parseInt(txt_numero2.getText());
                OperacionesController op=new OperacionesController();
        int resultado2=op.sumar(n1, n2);
        txt_resultado.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_sumar

    private void restar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restar
        int n1=Integer.parseInt(txt_numero1.getText());
        int n2=Integer.parseInt(txt_numero2.getText());
                OperacionesController op=new OperacionesController();
        int resultado2=op.restar(n1, n2);
        txt_resultado.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_restar

    private void multiplicar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar
        int n1=Integer.parseInt(txt_numero1.getText());
        int n2=Integer.parseInt(txt_numero2.getText());
                OperacionesController op=new OperacionesController();
        int resultado2=op.multiplicar(n1, n2);
        txt_resultado.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_multiplicar

    private void dividir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividir
        int n1=Integer.parseInt(txt_numero1.getText());
        int n2=Integer.parseInt(txt_numero2.getText());
                OperacionesController op=new OperacionesController();
        int resultado2=op.dividir(n1, n2);
        txt_resultado.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_dividir

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
            java.util.logging.Logger.getLogger(OperacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton op_dividir;
    private javax.swing.JRadioButton op_multiplicar;
    private javax.swing.JRadioButton op_restar;
    private javax.swing.JRadioButton op_sumar;
    private javax.swing.JTextField txt_numero1;
    private javax.swing.JTextField txt_numero2;
    private javax.swing.JLabel txt_resultado;
    // End of variables declaration//GEN-END:variables
}
