/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modes.Setup;

import Main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Ylope
 */
public class ComboModeSetup extends javax.swing.JPanel {

    int forceGoal = 500;
    int numPlayers = 6;
    boolean countDown = true;
    boolean multiplayer = false;
        
    /**
     * Creates new form ComboModeSetup1
     */
    public ComboModeSetup() {
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
        jPanel2 = new javax.swing.JPanel();
        SidebarButton = new javax.swing.JLabel();
        ComboCounterTitle = new javax.swing.JLabel();
        ComboModeB = new javax.swing.JLabel();
        ComboModeTitle = new javax.swing.JLabel();
        PunchChallengeButton = new javax.swing.JLabel();
        TimedModeButton = new javax.swing.JLabel();
        StrengthModeButton1 = new javax.swing.JLabel();
        ForceModeButton3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(768, 1024));
        setMinimumSize(new java.awt.Dimension(768, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 55));
        jPanel1.setMaximumSize(new java.awt.Dimension(768, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(768, 1024));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 86, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        SidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButtonMouseClicked(evt);
            }
        });
        jPanel2.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        jPanel2.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 755, 80));

        ComboModeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png"))); // NOI18N
        add(ComboModeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 30, 30));

        ComboModeTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        ComboModeTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboModeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ComboModeTitle.setText("Combo Mode");
        add(ComboModeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 118, 281, 50));

        PunchChallengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        add(PunchChallengeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 30, 30));

        TimedModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        TimedModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimedModeButtonMouseClicked(evt);
            }
        });
        add(TimedModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 30, 30));

        StrengthModeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        StrengthModeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StrengthModeButton1MouseClicked(evt);
            }
        });
        add(StrengthModeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 30, 30));

        ForceModeButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        ForceModeButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForceModeButton3MouseClicked(evt);
            }
        });
        add(ForceModeButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void TimedModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimedModeButtonMouseClicked
        Main.setup(3);
    }//GEN-LAST:event_TimedModeButtonMouseClicked

    private void StrengthModeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StrengthModeButton1MouseClicked
        // TODO add your handling code here:
        Main.setup(4);
    }//GEN-LAST:event_StrengthModeButton1MouseClicked

    private void ForceModeButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForceModeButton3MouseClicked
        Main.setup(2);
    }//GEN-LAST:event_ForceModeButton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JLabel ComboModeB;
    private javax.swing.JLabel ComboModeTitle;
    private javax.swing.JLabel ForceModeButton3;
    private javax.swing.JLabel PunchChallengeButton;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JLabel StrengthModeButton1;
    private javax.swing.JLabel TimedModeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
