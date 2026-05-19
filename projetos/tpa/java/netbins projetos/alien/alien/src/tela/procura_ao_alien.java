/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class procura_ao_alien extends javax.swing.JFrame {
        int Escondido = 1;
        int balas = 3;
        Random ran = new Random();
        JLabel[] jlarvores;
        
    public procura_ao_alien() {
        initComponents();
        
        {
           
        jlarvores = new JLabel[] { arvore1, arvore2, arvore3, arvore4, arvore5, arvore6, arvore7 };
    }


}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        arvore1 = new javax.swing.JLabel();
        arvore2 = new javax.swing.JLabel();
        arvore3 = new javax.swing.JLabel();
        arvore4 = new javax.swing.JLabel();
        arvore5 = new javax.swing.JLabel();
        arvore6 = new javax.swing.JLabel();
        arvore7 = new javax.swing.JLabel();
        fundal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reset.setText("resetar");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("ACHE O ALIEN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 50));

        arvore1.setText(".");
        arvore1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore1MouseClicked(evt);
            }
        });
        getContentPane().add(arvore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 160));

        arvore2.setText("jLabel3");
        arvore2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore2MouseClicked(evt);
            }
        });
        getContentPane().add(arvore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, 140));

        arvore3.setText("jLabel4");
        arvore3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore3MouseClicked(evt);
            }
        });
        getContentPane().add(arvore3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 130, 130));

        arvore4.setText("jLabel5");
        arvore4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore4MouseClicked(evt);
            }
        });
        getContentPane().add(arvore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 160, 120));

        arvore5.setText("jLabel6");
        arvore5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore5MouseClicked(evt);
            }
        });
        getContentPane().add(arvore5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 150, 120));

        arvore6.setText("jLabel7");
        arvore6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore6MouseClicked(evt);
            }
        });
        getContentPane().add(arvore6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 150, 110));

        arvore7.setText("jLabel8");
        arvore7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arvore7MouseClicked(evt);
            }
        });
        getContentPane().add(arvore7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 260, 160, 120));
        getContentPane().add(fundal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arvore1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore1MouseClicked
       testaArvore(1);
    }//GEN-LAST:event_arvore1MouseClicked

    private void arvore2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore2MouseClicked
        testaArvore(2);
    }//GEN-LAST:event_arvore2MouseClicked

    private void arvore3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore3MouseClicked
        testaArvore(3);
    }//GEN-LAST:event_arvore3MouseClicked

    private void arvore4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore4MouseClicked
        testaArvore(4);
    }//GEN-LAST:event_arvore4MouseClicked

    private void arvore5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore5MouseClicked
        testaArvore(5);
    }//GEN-LAST:event_arvore5MouseClicked

    private void arvore6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore6MouseClicked
        testaArvore(6);
    }//GEN-LAST:event_arvore6MouseClicked

    private void arvore7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvore7MouseClicked
        testaArvore(7);
    }//GEN-LAST:event_arvore7MouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
                ImageIcon imagem = new  ImageIcon(this.getClass().getResource("/imagens/arvore.png"));       
        Image imag = imagem.getImage().getScaledInstance(jlarvores[Escondido - 1].getWidth(), jlarvores[Escondido - 1].getHeight(), Image.SCALE_DEFAULT); 
        jlarvores[Escondido - 1].setIcon(new ImageIcon(imag));
        balas=3;
        Escondido=ran.nextInt(6) + 1;

    }//GEN-LAST:event_resetActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

   
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

                ImageIcon imagem = new ImageIcon(this.getClass().getResource("/imagens/fundo.jpg"));
        Image imag = imagem.getImage().getScaledInstance( fundal.getWidth(),
        fundal.getHeight(),  Image.SCALE_DEFAULT);
        fundal.setIcon(new ImageIcon( imag));
        for(int i=0; i<7; i++){
           ImageIcon imagem1 = new ImageIcon(this.getClass().getResource("/imagens/arvore.png"));
            Image imag1 = imagem1.getImage().getScaledInstance( jlarvores[i].getWidth(),
                     jlarvores[i].getHeight(),  Image.SCALE_DEFAULT);
                    jlarvores[i].setIcon(new ImageIcon( imag1));
}
        balas=3;
        Escondido=ran.nextInt(6) + 1;
    }//GEN-LAST:event_formWindowOpened
private void testaArvore(int arvores){
        
    System.out.println(Escondido + " " + arvores);
    if(balas==0){
        JOptionPane.showMessageDialog(null,"Fim de munição. Errou vou te pegar!!!!");
        return;
    }
    
    if(arvores<Escondido){
        JOptionPane.showMessageDialog(null,"errou,estou a direita");
        balas = balas-1;
    }
    
    if(arvores>Escondido)
    {
        JOptionPane.showMessageDialog(null,"errou,estou a esquerda");
        balas = balas-1;
    }
    
    if(arvores==Escondido){
        JOptionPane.showMessageDialog(null,"acertou,ahhgh");
        ImageIcon imagem = new  ImageIcon(this.getClass().getResource("/imagens/aliem.png"));       
        Image imag = imagem.getImage().getScaledInstance(jlarvores[Escondido - 1].getWidth(), jlarvores[Escondido - 1].getHeight(), Image.SCALE_DEFAULT); 
        jlarvores[Escondido - 1].setIcon(new ImageIcon(imag));
        balas=0;
        
    }
}
     
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
            java.util.logging.Logger.getLogger(procura_ao_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(procura_ao_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(procura_ao_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(procura_ao_alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new procura_ao_alien().setVisible(true);
            }
        });
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arvore1;
    private javax.swing.JLabel arvore2;
    private javax.swing.JLabel arvore3;
    private javax.swing.JLabel arvore4;
    private javax.swing.JLabel arvore5;
    private javax.swing.JLabel arvore6;
    private javax.swing.JLabel arvore7;
    private javax.swing.JLabel fundal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
