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

    int numPlayers = 0;
    boolean countDown = true;
    boolean multiplayer; 
    public  static int punches = 1;
    public  static int forceGoal = 0;
    public  static int timeGoal = 1;
    

          
    /**
     * Creates new form ComboModeSetup1
     */
    public ComboModeSetup() {
        initComponents();
        NumOfPunches.setText("1");
        PunchForceGoal.setText("0");
        PunchTimeGoal.setText("1");
        NumOfPlayersText2.setVisible(false);
        NumOfPlayers.setVisible(false);
        NumPlayersPlus2.setVisible(false);
        NumPlayersMinus2.setVisible(false);
        SideBar.setVisible(false);
        
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
        NumPunchesMinus1 = new javax.swing.JLabel();
        NumOfPunches = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NumOfPlayersPunchesText = new javax.swing.JLabel();
        ComboModeTitle = new javax.swing.JLabel();
        StartButton1 = new javax.swing.JButton();
        NumOfPlayersText2 = new javax.swing.JLabel();
        NumOfPlayers = new javax.swing.JLabel();
        NumPlayersPlus2 = new javax.swing.JLabel();
        SideBar = new javax.swing.JPanel();
        jPanel1.setVisible(false);
        About_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Settings_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Profile_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Activity_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        Feedback_Button = new javax.swing.JButton();
        About_Button.setOpaque(false);
        About_Button.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        NumPlayersMinus2 = new javax.swing.JLabel();
        Training_Button1 = new javax.swing.JLabel();
        Competition_Button1 = new javax.swing.JLabel();
        ComboModeB = new javax.swing.JLabel();
        PunchChallengeButton = new javax.swing.JLabel();
        TimedModeButton = new javax.swing.JLabel();
        StrengthModeButton1 = new javax.swing.JLabel();
        ForceModeButton3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SidebarButton = new javax.swing.JLabel();
        ComboCounterTitle = new javax.swing.JLabel();
        PunchForceGoalText = new javax.swing.JLabel();
        PunchForceGoal = new javax.swing.JLabel();
        PunchForceGoalPlus = new javax.swing.JLabel();
        PunchForceGoalMinus = new javax.swing.JLabel();
        PunchTimeGoalText = new javax.swing.JLabel();
        PunchTimeGoal = new javax.swing.JLabel();
        PunchTimeGoalPlus = new javax.swing.JLabel();
        PunchTimeGoalMinus = new javax.swing.JLabel();
        NumPunchesPlus1 = new javax.swing.JLabel();

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
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 86, -1, -1));

        NumPunchesMinus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        NumPunchesMinus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPunchesMinus1MouseClicked(evt);
            }
        });
        add(NumPunchesMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 40));

        NumOfPunches.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumOfPunches.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPunches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPunches.setText("1");
        add(NumOfPunches, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player Setting");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 260, 50));

        NumOfPlayersPunchesText.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NumOfPlayersPunchesText.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayersPunchesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayersPunchesText.setText("      # of Punches:");
        add(NumOfPlayersPunchesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 290, 50));

        ComboModeTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        ComboModeTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboModeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ComboModeTitle.setText("Combo Mode");
        add(ComboModeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 240, 50));

        StartButton1.setBackground(new java.awt.Color(51, 51, 56));
        StartButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        StartButton1.setForeground(new java.awt.Color(240, 240, 240));
        StartButton1.setText("Start");
        StartButton1.setContentAreaFilled(false);
        StartButton1.setFocusPainted(false);
        StartButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButton1MouseClicked(evt);
            }
        });
        add(StartButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 790, 180, 70));

        NumOfPlayersText2.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NumOfPlayersText2.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayersText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayersText2.setText("# of Players:");
        add(NumOfPlayersText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 220, 50));

        NumOfPlayers.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumOfPlayers.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayers.setText("2");
        add(NumOfPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 60, 50));

        NumPlayersPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        NumPlayersPlus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersPlus2MouseClicked(evt);
            }
        });
        add(NumPlayersPlus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, -1, 40));

        SideBar.setBackground(new java.awt.Color(51, 51, 56));
        SideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        About_Button.setBackground(new java.awt.Color(51, 51, 56));
        About_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        About_Button.setForeground(new java.awt.Color(240, 240, 240));
        About_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutIcon.png"))); // NOI18N
        About_Button.setText(" About");
        About_Button.setBorder(null);
        About_Button.setContentAreaFilled(false);
        SideBar.add(About_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 60));

        Settings_Button.setBackground(new java.awt.Color(51, 51, 56));
        Settings_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Settings_Button.setForeground(new java.awt.Color(240, 240, 240));
        Settings_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        Settings_Button.setText(" Settings");
        Settings_Button.setBorder(null);
        Settings_Button.setContentAreaFilled(false);
        Settings_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Settings_Button.setFocusPainted(false);
        SideBar.add(Settings_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        Profile_Button.setBackground(new java.awt.Color(51, 51, 56));
        Profile_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Profile_Button.setForeground(new java.awt.Color(240, 240, 240));
        Profile_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        Profile_Button.setText(" Profile");
        Profile_Button.setBorder(null);
        Profile_Button.setContentAreaFilled(false);
        SideBar.add(Profile_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        Activity_Button.setBackground(new java.awt.Color(51, 51, 56));
        Activity_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Activity_Button.setForeground(new java.awt.Color(240, 240, 240));
        Activity_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        Activity_Button.setText(" Activity");
        Activity_Button.setBorder(null);
        Activity_Button.setContentAreaFilled(false);
        SideBar.add(Activity_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        Feedback_Button.setBackground(new java.awt.Color(51, 51, 56));
        Feedback_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Feedback_Button.setForeground(new java.awt.Color(240, 240, 240));
        Feedback_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        Feedback_Button.setText(" Feedback");
        Feedback_Button.setBorder(null);
        Feedback_Button.setContentAreaFilled(false);
        SideBar.add(Feedback_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        NumPlayersMinus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        NumPlayersMinus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersMinus2MouseClicked(evt);
            }
        });
        add(NumPlayersMinus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, -1, 40));

        Training_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Training_Button1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Training_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Training_Button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Training_Button1.setText("Training");
        Training_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Training_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Training_Button1MouseClicked(evt);
            }
        });
        add(Training_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 210, 60));

        Competition_Button1.setBackground(new java.awt.Color(51, 51, 56));
        Competition_Button1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Competition_Button1.setForeground(new java.awt.Color(240, 240, 240));
        Competition_Button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Competition_Button1.setText("Competition");
        Competition_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Competition_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Competition_Button1MouseClicked(evt);
            }
        });
        add(Competition_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 210, 60));

        ComboModeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png"))); // NOI18N
        add(ComboModeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 30, 30));

        PunchChallengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        PunchChallengeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PunchChallengeButtonMouseClicked(evt);
            }
        });
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

        jPanel4.setBackground(new java.awt.Color(51, 51, 56));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        jPanel4.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        jPanel4.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        PunchForceGoalText.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        PunchForceGoalText.setForeground(new java.awt.Color(240, 240, 240));
        PunchForceGoalText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchForceGoalText.setText("Punch Force Goal:");
        add(PunchForceGoalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 290, 50));

        PunchForceGoal.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        PunchForceGoal.setForeground(new java.awt.Color(240, 240, 240));
        PunchForceGoal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchForceGoal.setText("0");
        add(PunchForceGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 50));

        PunchForceGoalPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        PunchForceGoalPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PunchForceGoalPlusMouseClicked(evt);
            }
        });
        add(PunchForceGoalPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 40));

        PunchForceGoalMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        PunchForceGoalMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PunchForceGoalMinusMouseClicked(evt);
            }
        });
        add(PunchForceGoalMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 40));

        PunchTimeGoalText.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        PunchTimeGoalText.setForeground(new java.awt.Color(240, 240, 240));
        PunchTimeGoalText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchTimeGoalText.setText(" Punch Time Goal:");
        add(PunchTimeGoalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 290, 50));

        PunchTimeGoal.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        PunchTimeGoal.setForeground(new java.awt.Color(240, 240, 240));
        PunchTimeGoal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchTimeGoal.setText("0");
        add(PunchTimeGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 50));

        PunchTimeGoalPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        PunchTimeGoalPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PunchTimeGoalPlusMouseClicked(evt);
            }
        });
        add(PunchTimeGoalPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, 40));

        PunchTimeGoalMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        PunchTimeGoalMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PunchTimeGoalMinusMouseClicked(evt);
            }
        });
        add(PunchTimeGoalMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, 40));

        NumPunchesPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        NumPunchesPlus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPunchesPlus1MouseClicked(evt);
            }
        });
        add(NumPunchesPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void StartButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButton1MouseClicked
        if (multiplayer == false) {
            Main.createComboMode();
        } else {
            Main.multiplayerTimed(numPlayers);
        }
    }//GEN-LAST:event_StartButton1MouseClicked

    private void NumPunchesPlus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPunchesPlus1MouseClicked
        if (punches < 8)
        {
            punches++;
            String punchNum = String.valueOf(punches);
            NumOfPunches.setText(punchNum);
            
        }
    }//GEN-LAST:event_NumPunchesPlus1MouseClicked

    private void NumPunchesMinus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPunchesMinus1MouseClicked
        if (punches > 1)
        {
            punches--;
            String punchNum = String.valueOf(punches);
            NumOfPunches.setText(punchNum);
            
               }    }//GEN-LAST:event_NumPunchesMinus1MouseClicked

    private void NumPlayersPlus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersPlus2MouseClicked
        if (Main.playerNum < 10)
        {
            Main.playerNum++;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumPlayersPlus2MouseClicked

    private void NumPlayersMinus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersMinus2MouseClicked
                if (Main.playerNum > 2)
        {
            Main.playerNum--;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumPlayersMinus2MouseClicked

    private void Training_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training_Button1MouseClicked
                if (multiplayer == true)
        {
            multiplayer = false ;
            Training_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            Competition_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            // Removes # of Players Visibility
            NumOfPlayersText2.setVisible(false);
            NumOfPlayers.setVisible(false);
            NumPlayersPlus2.setVisible(false);
            NumPlayersMinus2.setVisible(false);
        }
    }//GEN-LAST:event_Training_Button1MouseClicked

    private void Competition_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Competition_Button1MouseClicked
                if (multiplayer == false) // hi
        {
            multiplayer = true ;
            Competition_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            Training_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            // Visiblity to add players
            NumOfPlayersText2.setVisible(true);
            NumOfPlayers.setVisible(true);
            NumPlayersPlus2.setVisible(true);
            NumPlayersMinus2.setVisible(true);

        }
    }//GEN-LAST:event_Competition_Button1MouseClicked

    private void ForceModeButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForceModeButton3MouseClicked
        punches = 1;
        forceGoal = 0;
        timeGoal = 1;
        Main.setup(2);
    }//GEN-LAST:event_ForceModeButton3MouseClicked

    private void StrengthModeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StrengthModeButton1MouseClicked
        punches = 1;
        forceGoal = 0;
        timeGoal = 1;
        Main.setup(4);
    }//GEN-LAST:event_StrengthModeButton1MouseClicked

    private void TimedModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimedModeButtonMouseClicked
        punches = 1;
        forceGoal = 0;
        timeGoal = 1;
        Main.setup(3);
    }//GEN-LAST:event_TimedModeButtonMouseClicked

    private void About_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_About_ButtonMouseClicked

    private void Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_ButtonMouseClicked
        punches = 1;
        forceGoal = 0;
        timeGoal = 1;
        Main.transitionToPage(3);
    }//GEN-LAST:event_Settings_ButtonMouseClicked

    private void Profile_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Profile_ButtonMouseClicked

    private void Activity_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Activity_ButtonMouseClicked

    private void Feedback_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Feedback_ButtonMouseClicked
    /*
    The user uses this to add a force to their force per punch goal. 
    */
    private void PunchForceGoalPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PunchForceGoalPlusMouseClicked
        
            forceGoal = forceGoal+20;
            String comboForce = String.valueOf(forceGoal);
            PunchForceGoal.setText(comboForce);
        
    }//GEN-LAST:event_PunchForceGoalPlusMouseClicked
    /*
    The user uses this to add force to their force per punch goal. 
    */
    private void PunchForceGoalMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PunchForceGoalMinusMouseClicked
        if(forceGoal > 0) {
            forceGoal = forceGoal-20;
            String comboForce = String.valueOf(forceGoal);
            PunchForceGoal.setText(comboForce);
        }
    }//GEN-LAST:event_PunchForceGoalMinusMouseClicked

    /*
    The user uses this to add time to their split goal. Time is in seconds and a split time cannot be over 10 seconds
    */
    private void PunchTimeGoalPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PunchTimeGoalPlusMouseClicked
        if(timeGoal < 10) {
            timeGoal++;
            String comboTime = String.valueOf(timeGoal);
            PunchTimeGoal.setText(comboTime);
        }
    }//GEN-LAST:event_PunchTimeGoalPlusMouseClicked
    /*
    The user uses this to subtract time to their split goal. Time is in seconds and a split time cannot be over 10 seconds
    */
    private void PunchTimeGoalMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PunchTimeGoalMinusMouseClicked
        if(timeGoal > 1) {
            timeGoal--;
            String comboTime = String.valueOf(timeGoal);
            PunchTimeGoal.setText(comboTime);
        }
    }//GEN-LAST:event_PunchTimeGoalMinusMouseClicked

    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        if (Main.sidebarOpen == false)
        {
            SideBar.setVisible(true) ;
            Main.sidebarOpen = true ;
        }
        else if (Main.sidebarOpen == true)
        {
            SideBar.setVisible(false);
            Main.sidebarOpen = false ;
        }
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void PunchChallengeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PunchChallengeButtonMouseClicked
        Main.setup(5);
    }//GEN-LAST:event_PunchChallengeButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Button;
    private javax.swing.JButton Activity_Button;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JLabel ComboModeB;
    private javax.swing.JLabel ComboModeTitle;
    private javax.swing.JLabel Competition_Button1;
    private javax.swing.JButton Feedback_Button;
    private javax.swing.JLabel ForceModeButton3;
    private javax.swing.JLabel NumOfPlayers;
    private javax.swing.JLabel NumOfPlayersPunchesText;
    private javax.swing.JLabel NumOfPlayersText2;
    private javax.swing.JLabel NumOfPunches;
    private javax.swing.JLabel NumPlayersMinus2;
    private javax.swing.JLabel NumPlayersPlus2;
    private javax.swing.JLabel NumPunchesMinus1;
    private javax.swing.JLabel NumPunchesPlus1;
    private javax.swing.JButton Profile_Button;
    private javax.swing.JLabel PunchChallengeButton;
    private javax.swing.JLabel PunchForceGoal;
    private javax.swing.JLabel PunchForceGoalMinus;
    private javax.swing.JLabel PunchForceGoalPlus;
    private javax.swing.JLabel PunchForceGoalText;
    private javax.swing.JLabel PunchTimeGoal;
    private javax.swing.JLabel PunchTimeGoalMinus;
    private javax.swing.JLabel PunchTimeGoalPlus;
    private javax.swing.JLabel PunchTimeGoalText;
    private javax.swing.JButton Settings_Button;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JButton StartButton1;
    private javax.swing.JLabel StrengthModeButton1;
    private javax.swing.JLabel TimedModeButton;
    private javax.swing.JLabel Training_Button1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
