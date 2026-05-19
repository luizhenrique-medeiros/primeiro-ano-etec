/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Aluno
 */
public class telamarciano extends javax.swing.JFrame {
    int Escondido=0;
        int balas=3;
        Random ran = new Random();
       

 
    public telamarciano() {
        initComponents();
        
        jlarvores = new JLabel[] {lvarvore, lvarvore1, lvarvore2, lvarvore3, lvarvore4, lvarvore5, lvarvore6, lvarvore7, lvarvore8, lvarvore9};
    
    }
    JLabel[] jlarvores;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lvarvore = new javax.swing.JLabel();
        lvarvore1 = new javax.swing.JLabel();
        lvarvore2 = new javax.swing.JLabel();
        lvarvore3 = new javax.swing.JLabel();
        lvarvore4 = new javax.swing.JLabel();
        lvarvore5 = new javax.swing.JLabel();
        lvarvore6 = new javax.swing.JLabel();
        lvarvore7 = new javax.swing.JLabel();
        lvarvore8 = new javax.swing.JLabel();
        lvarvore9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbfundo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lvarvore.setText("u");
        lvarvore.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvoreMouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 80, 110));

        lvarvore1.setText("u");
        lvarvore1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore1MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 110));

        lvarvore2.setText("u");
        lvarvore2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore2MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 110));

        lvarvore3.setText("u");
        lvarvore3.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore3MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 110));

        lvarvore4.setText("u");
        lvarvore4.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore4MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 80, 110));

        lvarvore5.setText("u");
        lvarvore5.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore5MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 80, 110));

        lvarvore6.setText("u");
        lvarvore6.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore6MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 80, 110));

        lvarvore7.setText("u");
        lvarvore7.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore7MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 80, 110));

        lvarvore8.setText("u");
        lvarvore8.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore8MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 80, 110));

        lvarvore9.setText("u");
        lvarvore9.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        lvarvore9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvarvore9MouseClicked(evt);
            }
        });
        getContentPane().add(lvarvore9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 80, 110));

        jButton1.setText("reiniciar jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 50));
        jButton1.getAccessibleContext().setAccessibleName("reiniciar jogo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Encontre o marciano:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 200, 40));
        getContentPane().add(lbfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1040, 468));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon imagem = new ImageIcon(this.getClass().getResource("/img/floresta-vazia-2.jpg"));
        Image imag = imagem.getImage().getScaledInstance( lbfundo.getWidth(),
         lbfundo.getHeight(),  Image.SCALE_DEFAULT);
        lbfundo.setIcon(new ImageIcon( imag));
        for(int i=0; i<10; i++){
           ImageIcon imagem1 = new ImageIcon(this.getClass().getResource("/img/arovres.png"));
            Image imag1 = imagem1.getImage().getScaledInstance( jlarvores[i].getWidth(),
                     jlarvores[i].getHeight(),  Image.SCALE_DEFAULT);
                    jlarvores[i].setIcon(new ImageIcon( imag1));
        }
         Escondido=ran.nextInt(9);
        
    }//GEN-LAST:event_formWindowOpened

     private void testaArvore(int arvores){
        
    if(arvores<Escondido&&balas>0){
    JOptionPane.showMessageDialog(null,"errou,estou a direita");
    balas = balas-1;
    }
    else{
    if(arvores>Escondido&&balas>0)
    {JOptionPane.showMessageDialog(null,"errou,estou a esquerda");
    balas = balas-1;
    }
    
    else{
    if(arvores==Escondido&&balas>0){
        JOptionPane.showMessageDialog(null,"acertou,ahhgh");
     
    }
   
    }
    if(balas==0){JOptionPane.showMessageDialog(null,"errou vou te pegar!!!!");}
     }
     }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    balas=3;
    Escondido=ran.nextInt(9);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lvarvore1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore1MouseClicked
        testaArvore(1);
    }//GEN-LAST:event_lvarvore1MouseClicked

    private void lvarvore2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore2MouseClicked
        testaArvore(2);
    }//GEN-LAST:event_lvarvore2MouseClicked

    private void lvarvore3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore3MouseClicked
        testaArvore(3);
    }//GEN-LAST:event_lvarvore3MouseClicked

    private void lvarvore4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore4MouseClicked
        testaArvore(4);
    }//GEN-LAST:event_lvarvore4MouseClicked
    private void lvarvore6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore6MouseClicked
        testaArvore(6);
    }//GEN-LAST:event_lvarvore6MouseClicked

    private void lvarvore5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore5MouseClicked
        testaArvore(5);
    }//GEN-LAST:event_lvarvore5MouseClicked

    private void lvarvore7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore7MouseClicked
        testaArvore(7);
    }//GEN-LAST:event_lvarvore7MouseClicked

    private void lvarvore8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore8MouseClicked
       testaArvore(8);
    }//GEN-LAST:event_lvarvore8MouseClicked

    private void lvarvore9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvore9MouseClicked
    testaArvore(9);
    }//GEN-LAST:event_lvarvore9MouseClicked

    private void lvarvoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvarvoreMouseClicked
        testaArvore(10);
    }//GEN-LAST:event_lvarvoreMouseClicked

   
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
            java.util.logging.Logger.getLogger(telamarciano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telamarciano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telamarciano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telamarciano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telamarciano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbfundo;
    private javax.swing.JLabel lvarvore;
    private javax.swing.JLabel lvarvore1;
    private javax.swing.JLabel lvarvore2;
    private javax.swing.JLabel lvarvore3;
    private javax.swing.JLabel lvarvore4;
    private javax.swing.JLabel lvarvore5;
    private javax.swing.JLabel lvarvore6;
    private javax.swing.JLabel lvarvore7;
    private javax.swing.JLabel lvarvore8;
    private javax.swing.JLabel lvarvore9;
    // End of variables declaration//GEN-END:variables
}
