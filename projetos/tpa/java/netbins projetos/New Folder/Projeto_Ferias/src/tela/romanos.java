/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

import javax.swing.JOptionPane;

/**
 *
 * @author luizh
 */
public class romanos extends javax.swing.JFrame {

    /**
     * Creates new form romanos
     */
    public romanos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display_text = new javax.swing.JLabel();
        recebe = new javax.swing.JTextField();
        converte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(display_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 220, 160));

        recebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebeActionPerformed(evt);
            }
        });
        getContentPane().add(recebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 50));

        converte.setText("converter");
        converte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                converteMouseClicked(evt);
            }
        });
        getContentPane().add(converte, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebeActionPerformed

    private void converteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_converteMouseClicked
        int num = Integer.parseInt(recebe.getText());
     
        if (num < 1 || num > 3999) {
            return;
        }

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String romano = "";
        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                romano += romanos[i];
                num -= valores[i];
            
          display_text.setText("seu numero romano é : " + romano);
            }}
    }//GEN-LAST:event_converteMouseClicked

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
            java.util.logging.Logger.getLogger(romanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(romanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(romanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(romanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new romanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton converte;
    private javax.swing.JLabel display_text;
    private javax.swing.JTextField recebe;
    // End of variables declaration//GEN-END:variables
}
