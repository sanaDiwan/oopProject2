/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author x15007707
 */
public class TwoGuessGUI extends javax.swing.JFrame {

    /**
     * Creates new form TwoGuessGUI
     */
    public TwoGuessGUI() {
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

        captionLbl = new javax.swing.JLabel();
        oneLbl = new javax.swing.JLabel();
        twoLbl = new javax.swing.JLabel();
        twoTxt = new javax.swing.JTextField();
        oneTxt = new javax.swing.JTextField();
        submitLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        resultsLbl = new javax.swing.JLabel();
        otherGamesFrame = new javax.swing.JInternalFrame();
        otherGamesLbl = new javax.swing.JLabel();
        twoTrialBtn = new javax.swing.JButton();
        threeTrialBtn = new javax.swing.JButton();
        danyGameLbl = new javax.swing.JLabel();
        danyGameBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        captionLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        captionLbl.setForeground(new java.awt.Color(255, 255, 204));
        captionLbl.setText("Please enter your two guesses!");

        oneLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oneLbl.setForeground(new java.awt.Color(255, 255, 255));
        oneLbl.setText("Guess 1");

        twoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        twoLbl.setForeground(new java.awt.Color(255, 255, 255));
        twoLbl.setText("Guess 2");

        twoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        oneTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        submitLbl.setText("Send my guesses!");

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        resultsLbl.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        resultsLbl.setForeground(new java.awt.Color(255, 204, 204));
        resultsLbl.setText(" ");

        otherGamesFrame.setVisible(true);

        otherGamesLbl.setText("You may also try the games with :");

        twoTrialBtn.setText("1 Trial");
        twoTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTrialBtnActionPerformed(evt);
            }
        });

        threeTrialBtn.setText("3 Trials");
        threeTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeTrialBtnActionPerformed(evt);
            }
        });

        danyGameLbl.setText("Or alternatively,");

        danyGameBtn.setText("Lotto, Plus 1 and Plus 2 Game");
        danyGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danyGameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout otherGamesFrameLayout = new javax.swing.GroupLayout(otherGamesFrame.getContentPane());
        otherGamesFrame.getContentPane().setLayout(otherGamesFrameLayout);
        otherGamesFrameLayout.setHorizontalGroup(
            otherGamesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherGamesFrameLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(danyGameBtn)
                .addGap(36, 36, 36))
            .addGroup(otherGamesFrameLayout.createSequentialGroup()
                .addGroup(otherGamesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherGamesFrameLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(otherGamesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(danyGameLbl)
                            .addComponent(otherGamesLbl)))
                    .addGroup(otherGamesFrameLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(otherGamesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeTrialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoTrialBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otherGamesFrameLayout.setVerticalGroup(
            otherGamesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherGamesFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(otherGamesLbl)
                .addGap(33, 33, 33)
                .addComponent(twoTrialBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(threeTrialBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(danyGameLbl)
                .addGap(18, 18, 18)
                .addComponent(danyGameBtn)
                .addGap(74, 74, 74))
        );

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/background.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(submitLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resultsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(otherGamesFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(twoLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(oneLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(captionLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(209, 209, 209)
                            .addComponent(submitBtn))
                        .addComponent(backgroundLbl))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(submitLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(resultsLbl)
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(twoLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(oneLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addComponent(oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(captionLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(383, 383, 383)
                            .addComponent(submitBtn))
                        .addComponent(backgroundLbl)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(otherGamesFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void twoTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTrialBtnActionPerformed
        // TODO add your handling code here:
        OneGuessGUI myGuess = new OneGuessGUI();
        myGuess.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_twoTrialBtnActionPerformed

    private void threeTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeTrialBtnActionPerformed
        // TODO add your handling code here:
        ThreeGuessGUI myGuess = new ThreeGuessGUI();
        myGuess.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_threeTrialBtnActionPerformed

    private void danyGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danyGameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danyGameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TwoGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoGuessGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel captionLbl;
    private javax.swing.JButton danyGameBtn;
    private javax.swing.JLabel danyGameLbl;
    private javax.swing.JLabel oneLbl;
    private javax.swing.JTextField oneTxt;
    private javax.swing.JInternalFrame otherGamesFrame;
    private javax.swing.JLabel otherGamesLbl;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel submitLbl;
    private javax.swing.JButton threeTrialBtn;
    private javax.swing.JLabel twoLbl;
    private javax.swing.JButton twoTrialBtn;
    private javax.swing.JTextField twoTxt;
    // End of variables declaration//GEN-END:variables
}