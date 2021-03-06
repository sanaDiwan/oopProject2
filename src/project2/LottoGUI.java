/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author x15007707
 */
public class LottoGUI extends javax.swing.JFrame {

    /**
     * Creates new form LottoGUI
     */
    public LottoGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        lottoTitleLbl = new javax.swing.JLabel();
        line1Lbl = new javax.swing.JLabel();
        line3Lbl = new javax.swing.JLabel();
        line4Lbl = new javax.swing.JLabel();
        line2Lbl = new javax.swing.JLabel();
        oneTrialBtn = new javax.swing.JButton();
        twoTrialBtn = new javax.swing.JButton();
        threeTrialBtn = new javax.swing.JButton();
        hintLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lottoTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lottoTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        lottoTitleLbl.setText("Lotto Application");
        jPanel1.add(lottoTitleLbl);
        lottoTitleLbl.setBounds(211, 39, 267, 44);

        line1Lbl.setBackground(new java.awt.Color(0, 0, 0));
        line1Lbl.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        line1Lbl.setForeground(new java.awt.Color(255, 255, 204));
        line1Lbl.setText("Our game generates five numbers between 1 to 40, for example the winning ");
        jPanel1.add(line1Lbl);
        line1Lbl.setBounds(75, 122, 551, 24);

        line3Lbl.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        line3Lbl.setForeground(new java.awt.Color(255, 255, 204));
        line3Lbl.setText("You can pick the number of trials you'd like and we will let you know how");
        jPanel1.add(line3Lbl);
        line3Lbl.setBounds(75, 193, 551, 24);

        line4Lbl.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        line4Lbl.setForeground(new java.awt.Color(255, 255, 204));
        line4Lbl.setText("many numbers per guess did you guess right!");
        jPanel1.add(line4Lbl);
        line4Lbl.setBounds(75, 223, 325, 24);

        line2Lbl.setBackground(new java.awt.Color(0, 0, 0));
        line2Lbl.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        line2Lbl.setForeground(new java.awt.Color(255, 255, 204));
        line2Lbl.setText("lottery numbers could be: {2, 32, 7, 39, 28}");
        jPanel1.add(line2Lbl);
        line2Lbl.setBounds(75, 151, 318, 24);

        oneTrialBtn.setForeground(new java.awt.Color(0, 102, 51));
        oneTrialBtn.setText("1 Trial");
        oneTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTrialBtnActionPerformed(evt);
            }
        });
        jPanel1.add(oneTrialBtn);
        oneTrialBtn.setBounds(70, 450, 150, 60);

        twoTrialBtn.setForeground(new java.awt.Color(0, 102, 51));
        twoTrialBtn.setText("2 Trials");
        twoTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTrialBtnActionPerformed(evt);
            }
        });
        jPanel1.add(twoTrialBtn);
        twoTrialBtn.setBounds(280, 450, 150, 60);

        threeTrialBtn.setForeground(new java.awt.Color(51, 102, 0));
        threeTrialBtn.setText("3 Trials");
        threeTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeTrialBtnActionPerformed(evt);
            }
        });
        jPanel1.add(threeTrialBtn);
        threeTrialBtn.setBounds(480, 450, 150, 60);

        hintLbl.setForeground(java.awt.Color.pink);
        hintLbl.setText("For maximum chances to win!");
        jPanel1.add(hintLbl);
        hintLbl.setBounds(530, 510, 141, 14);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 700, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTrialBtnActionPerformed

        OneGuessGUI myGuessOne = new OneGuessGUI();
        myGuessOne.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here: 
    }//GEN-LAST:event_oneTrialBtnActionPerformed

    private void twoTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTrialBtnActionPerformed
        // TODO add your handling code here:
        TwoGuessGUI myGuessTwo = new TwoGuessGUI();
        myGuessTwo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_twoTrialBtnActionPerformed

    private void threeTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeTrialBtnActionPerformed
        // TODO add your handling code here:
        ThreeGuessGUI myGuessThree = new ThreeGuessGUI();
        myGuessThree.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_threeTrialBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LottoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel hintLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line1Lbl;
    private javax.swing.JLabel line2Lbl;
    private javax.swing.JLabel line3Lbl;
    private javax.swing.JLabel line4Lbl;
    private javax.swing.JLabel lottoTitleLbl;
    private javax.swing.JButton oneTrialBtn;
    private javax.swing.JButton threeTrialBtn;
    private javax.swing.JButton twoTrialBtn;
    // End of variables declaration//GEN-END:variables
}
