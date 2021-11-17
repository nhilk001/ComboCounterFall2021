package Modes.Setup;

import Main.Main;
import Modes.TimedModePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Jonathan Zamora
 */
public class TimedModeSetup extends javax.swing.JPanel {
    // Declaring vars
        int timerMin = 0;
        int timerSec = 15;
        int numOfPlayers = 2;
        boolean countDown = true;
        boolean multiplayer = false;
        
    /**
     * Creates new form homePagePanel
     */
    Timer timer;
    public TimedModeSetup() 
    {
        //Main.playerNum = 2;
        initComponents();       
        
        // Setting Visibility States
        SideBar.setVisible(false);
        TimerPlus.setVisible(false);
        TimerMinus.setVisible(false);
        NumPlayersMinus.setVisible(false);
        NumPlayersPlus.setVisible(false);
        Training_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        NumOfPlayersText.setVisible(false);
        NumOfPlayers.setVisible(false);
        NumPlayersPlus.setVisible(false);
        NumPlayersMinus.setVisible(false);
    }
    
    public void update()
    {
        String sec = String.format("%02d", timerSec);
        String min = String.valueOf(timerMin);
        Timer.setText(min + ":" + sec);
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
        jPanel3 = new javax.swing.JPanel();
        ComboCounterTitle1 = new javax.swing.JLabel();
        SidebarButton1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Timer1 = new javax.swing.JLabel();
        NumPlayersPlus1 = new javax.swing.JLabel();
        NumPlayersMinus1 = new javax.swing.JLabel();
        StartButton1 = new javax.swing.JButton();
        Competition_Button1 = new javax.swing.JLabel();
        Training_Button1 = new javax.swing.JLabel();
        NumOfPlayers1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NumOfPlayersText1 = new javax.swing.JLabel();
        TimerMinus1 = new javax.swing.JLabel();
        TimerPlus1 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        ComboCounterTitle = new javax.swing.JLabel();
        SidebarButton = new javax.swing.JLabel();
        PunchChallengeButton1 = new javax.swing.JLabel();
        ForceModeButton = new javax.swing.JLabel();
        TimedModeButton = new javax.swing.JLabel();
        ComboModeButton = new javax.swing.JLabel();
        StrengthModeButton = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        NumPlayersPlus = new javax.swing.JLabel();
        NumPlayersMinus = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        Competition_Button = new javax.swing.JLabel();
        Training_Button = new javax.swing.JLabel();
        NumOfPlayers = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NumOfPlayersText = new javax.swing.JLabel();
        TimerMinus = new javax.swing.JLabel();
        TimerPlus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(768, 1024));
        setMinimumSize(new java.awt.Dimension(768, 1024));
        setPreferredSize(new java.awt.Dimension(768, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 55));
        jPanel1.setMaximumSize(new java.awt.Dimension(768, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(768, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 1024));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle1.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle1.setText("ComboCounter");
        jPanel3.add(ComboCounterTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        SidebarButton1.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton1.setOpaque(true);
        SidebarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButton1MouseClicked(evt);
            }
        });
        jPanel3.add(SidebarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Timer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 280, 180, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Timed Mode");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, 50));

        Timer1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Timer1.setForeground(new java.awt.Color(240, 240, 240));
        Timer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer1.setText("0:15");
        Timer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Timer1MouseClicked(evt);
            }
        });
        jPanel1.add(Timer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 170, 40));

        NumPlayersPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        NumPlayersPlus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersPlus1MouseClicked(evt);
            }
        });
        jPanel1.add(NumPlayersPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, -1, 40));

        NumPlayersMinus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        NumPlayersMinus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersMinus1MouseClicked(evt);
            }
        });
        jPanel1.add(NumPlayersMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, 40));

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
        jPanel1.add(StartButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 790, 180, 70));

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
        jPanel1.add(Competition_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 210, 60));

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
        jPanel1.add(Training_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 210, 60));

        NumOfPlayers1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumOfPlayers1.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayers1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayers1.setText("2");
        jPanel1.add(NumOfPlayers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 60, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player Setting");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 260, 50));

        NumOfPlayersText1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NumOfPlayersText1.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayersText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayersText1.setText("# of Players:");
        jPanel1.add(NumOfPlayersText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 220, 50));

        TimerMinus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        TimerMinus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerMinus1MouseClicked(evt);
            }
        });
        jPanel1.add(TimerMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, 40));

        TimerPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        TimerPlus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerPlus1MouseClicked(evt);
            }
        });
        jPanel1.add(TimerPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        About_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                About_ButtonMouseClicked(evt);
            }
        });
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
        Settings_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Settings_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Settings_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        Profile_Button.setBackground(new java.awt.Color(51, 51, 56));
        Profile_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Profile_Button.setForeground(new java.awt.Color(240, 240, 240));
        Profile_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        Profile_Button.setText(" Profile");
        Profile_Button.setBorder(null);
        Profile_Button.setContentAreaFilled(false);
        Profile_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Profile_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        Activity_Button.setBackground(new java.awt.Color(51, 51, 56));
        Activity_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Activity_Button.setForeground(new java.awt.Color(240, 240, 240));
        Activity_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        Activity_Button.setText(" Activity");
        Activity_Button.setBorder(null);
        Activity_Button.setContentAreaFilled(false);
        Activity_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Activity_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Activity_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        Feedback_Button.setBackground(new java.awt.Color(51, 51, 56));
        Feedback_Button.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Feedback_Button.setForeground(new java.awt.Color(240, 240, 240));
        Feedback_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        Feedback_Button.setText(" Feedback");
        Feedback_Button.setBorder(null);
        Feedback_Button.setContentAreaFilled(false);
        Feedback_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Feedback_ButtonMouseClicked(evt);
            }
        });
        SideBar.add(Feedback_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        jPanel2.setBackground(new java.awt.Color(51, 51, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        jPanel2.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

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

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        PunchChallengeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        add(PunchChallengeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 30, 30));

        ForceModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        ForceModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForceModeButtonMouseClicked(evt);
            }
        });
        add(ForceModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));

        TimedModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png"))); // NOI18N
        add(TimedModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 30, 30));

        ComboModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        ComboModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboModeButtonMouseClicked(evt);
            }
        });
        add(ComboModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 30, 30));

        StrengthModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png"))); // NOI18N
        StrengthModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StrengthModeButtonMouseClicked(evt);
            }
        });
        add(StrengthModeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Timer");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 280, 180, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Timed Mode");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, 50));

        Timer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Timer.setForeground(new java.awt.Color(240, 240, 240));
        Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer.setText("0:15");
        Timer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerMouseClicked(evt);
            }
        });
        add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 170, 40));

        NumPlayersPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circlePlusIcon.png"))); // NOI18N
        NumPlayersPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersPlusMouseClicked(evt);
            }
        });
        add(NumPlayersPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, -1, 40));

        NumPlayersMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circleMinusIcon.png"))); // NOI18N
        NumPlayersMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumPlayersMinusMouseClicked(evt);
            }
        });
        add(NumPlayersMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, 40));

        StartButton.setBackground(new java.awt.Color(51, 51, 56));
        StartButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        StartButton.setForeground(new java.awt.Color(240, 240, 240));
        StartButton.setText("Start");
        StartButton.setContentAreaFilled(false);
        StartButton.setFocusPainted(false);
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
        });
        add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 790, 180, 70));

        Competition_Button.setBackground(new java.awt.Color(51, 51, 56));
        Competition_Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Competition_Button.setForeground(new java.awt.Color(240, 240, 240));
        Competition_Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Competition_Button.setText("Competition");
        Competition_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Competition_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Competition_ButtonMouseClicked(evt);
            }
        });
        add(Competition_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 210, 60));

        Training_Button.setBackground(new java.awt.Color(51, 51, 56));
        Training_Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Training_Button.setForeground(new java.awt.Color(240, 240, 240));
        Training_Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Training_Button.setText("Training");
        Training_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Training_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Training_ButtonMouseClicked(evt);
            }
        });
        add(Training_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 210, 60));

        NumOfPlayers.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumOfPlayers.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayers.setText("2");
        add(NumOfPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 60, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Player Setting");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 260, 50));

        NumOfPlayersText.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        NumOfPlayersText.setForeground(new java.awt.Color(240, 240, 240));
        NumOfPlayersText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumOfPlayersText.setText("# of Players:");
        add(NumOfPlayersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 220, 50));

        TimerMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minusIcon.png"))); // NOI18N
        TimerMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerMinusMouseClicked(evt);
            }
        });
        add(TimerMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, 40));

        TimerPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plusIcon.png"))); // NOI18N
        TimerPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimerPlusMouseClicked(evt);
            }
        });
        add(TimerPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void TimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerMouseClicked
        TimerMinus.setVisible(true);
        TimerPlus.setVisible(true);
        ActionListener taskPerformer = (ActionEvent evt1) -> {
            TimerMinus.setVisible(false);
            TimerPlus.setVisible(false);
        };
        Timer time = new Timer(10000, taskPerformer);
        time.setRepeats(false);
        time.start();
    }//GEN-LAST:event_TimerMouseClicked

    private void Competition_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Competition_ButtonMouseClicked
        if (multiplayer == false)
        {
            multiplayer = true ;
            Competition_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            Training_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            
            // Visiblity to add players
            NumOfPlayersText.setVisible(true);
            NumOfPlayers.setVisible(true);
            NumPlayersPlus.setVisible(true);
            NumPlayersMinus.setVisible(true);
            
        }
    }//GEN-LAST:event_Competition_ButtonMouseClicked

    private void Training_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training_ButtonMouseClicked
        if (multiplayer == true)
        {
            multiplayer = false ;
            Training_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            Competition_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            
            // Removes # of Players Visibility
            NumOfPlayersText.setVisible(false);
            NumOfPlayers.setVisible(false);
            NumPlayersPlus.setVisible(false);
            NumPlayersMinus.setVisible(false);
        }
    }//GEN-LAST:event_Training_ButtonMouseClicked

    private void TimerMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerMinusMouseClicked
        // 0:15 - 2:00 decreases by 15s | 2:00-5:00 decreases by 30s
        // 5:00 - 20:00 decreases by 1m | 20:00 - 30:00 decreases by 5m
        if (timerMin == 0 && timerSec == 15)
            return;
        
        if (timerMin < 2)
        {   
            if(timerSec == 00)
            {
                timerMin--;
                timerSec = 45;
            }
            else
                timerSec -= 15;

            update();
        }
        else if (timerMin < 5)
        {
            if(timerSec == 00)
            {
                timerMin--;
                timerSec = 30;
            }
            else
                timerSec -= 30;

            update();
        }
        else if (timerMin < 20)
        {
            timerMin-= 1;
            update();
        }
        else if (timerMin < 30)
        {
            timerMin-= 5;
            update();
        }
    }//GEN-LAST:event_TimerMinusMouseClicked

    private void TimerPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerPlusMouseClicked
        // 0:15 - 2:00 increases by 15s | 2:00-5:00 increases by 30s
        // 5:00 - 20:00 increases by 1m | 20:00 - 30:00 increases by 5m
        if (timerMin < 2)
        {   
            if(timerSec == 45)
            {
                timerMin++;
                timerSec = 0;
            }
            else
                timerSec += 15;

            update();
        }
        else if (timerMin < 5)
        {   
            if(timerSec == 30)
            {
                timerMin++;
                timerSec = 0;
            }
            else
                timerSec += 30;

            update();
        }
        else if (timerMin < 20)
        {
            timerMin+= 1;
            update();
        }
        else if (timerMin < 30)
        {
            timerMin+= 5;
            update();
        }
    }//GEN-LAST:event_TimerPlusMouseClicked

    private void NumPlayersPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersPlusMouseClicked
        if (Main.playerNum < 10)
        {
            Main.playerNum++;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumPlayersPlusMouseClicked

    private void NumPlayersMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersMinusMouseClicked
        if (Main.playerNum > 2)
        {
            Main.playerNum--;
            String num = String.valueOf(Main.playerNum);
            NumOfPlayers.setText(num);
        }
    }//GEN-LAST:event_NumPlayersMinusMouseClicked

    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
        if (multiplayer == false)
            Main.createTimedMode(timerMin, timerSec);
        else {
          Main.multiplayerTimed(numOfPlayers);
                    }
        
    }//GEN-LAST:event_StartButtonMouseClicked

    private void About_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_About_ButtonMouseClicked

    private void Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_ButtonMouseClicked
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

    private void Timer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Timer1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Timer1MouseClicked

    private void NumPlayersPlus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersPlus1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NumPlayersPlus1MouseClicked

    private void NumPlayersMinus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPlayersMinus1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NumPlayersMinus1MouseClicked

    private void StartButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButton1MouseClicked

    private void Competition_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Competition_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Competition_Button1MouseClicked

    private void Training_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Training_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Training_Button1MouseClicked

    private void TimerMinus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerMinus1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TimerMinus1MouseClicked

    private void TimerPlus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimerPlus1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TimerPlus1MouseClicked

    private void SidebarButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SidebarButton1MouseClicked

    private void StrengthModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StrengthModeButtonMouseClicked
        // TODO add your handling code here:
        Main.setup(4);
    }//GEN-LAST:event_StrengthModeButtonMouseClicked

    private void ComboModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboModeButtonMouseClicked
        // TODO add your handling code here:
        Main.setup(1);
    }//GEN-LAST:event_ComboModeButtonMouseClicked

    private void ForceModeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForceModeButtonMouseClicked
        // TODO add your handling code here:
        Main.setup(2);
    }//GEN-LAST:event_ForceModeButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Button;
    private javax.swing.JButton Activity_Button;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JLabel ComboCounterTitle1;
    private javax.swing.JLabel ComboModeButton;
    private javax.swing.JLabel Competition_Button;
    private javax.swing.JLabel Competition_Button1;
    private javax.swing.JButton Feedback_Button;
    private javax.swing.JLabel ForceModeButton;
    private javax.swing.JLabel NumOfPlayers;
    private javax.swing.JLabel NumOfPlayers1;
    private javax.swing.JLabel NumOfPlayersText;
    private javax.swing.JLabel NumOfPlayersText1;
    private javax.swing.JLabel NumPlayersMinus;
    private javax.swing.JLabel NumPlayersMinus1;
    private javax.swing.JLabel NumPlayersPlus;
    private javax.swing.JLabel NumPlayersPlus1;
    private javax.swing.JButton Profile_Button;
    private javax.swing.JLabel PunchChallengeButton1;
    private javax.swing.JButton Settings_Button;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JLabel SidebarButton1;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StartButton1;
    private javax.swing.JLabel StrengthModeButton;
    private javax.swing.JLabel TimedModeButton;
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel Timer1;
    private javax.swing.JLabel TimerMinus;
    private javax.swing.JLabel TimerMinus1;
    private javax.swing.JLabel TimerPlus;
    private javax.swing.JLabel TimerPlus1;
    private javax.swing.JLabel Training_Button;
    private javax.swing.JLabel Training_Button1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
