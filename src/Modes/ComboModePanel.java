package Modes;

import Main.Main;
import Modes.Setup.ComboModeSetup;
import static java.lang.Thread.sleep;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Kelly
 */
public class ComboModePanel extends javax.swing.JPanel {
    
    // Declaring vars
    int timerMin = 0;
    int timerSec = 0;
    int initialMin = 0;
    int initialSec = 0;
    int playerNum = 2;
    boolean countDown = false;
    boolean paused = true;
    int index = 0;
    int totalForce = 0;
    boolean start;
    String numPunch = String.valueOf(ComboModeSetup.punches);
    int punchTracker = 0;
    int i = 1;
    
    //store force values matched to each punch for displaying data later
    int[] punchNum = new int[ComboModeSetup.punches]; 
                                
        
    /**
     * Initiates ComboModePanel components
     * @param timerMin
     * @param timerSec
     */
    public ComboModePanel() 
    {
        initComponents();
        jPanel1.setVisible(true); //adding this temporarily until i find a solution
        jLabel13.setText(numPunch);
        this.timerMin = 0;
        this.timerSec = 0;
        initialMin = 0;
        initialSec = 0;
        update();
        
        // Setting states
        setInvisible();
        SideBar.setVisible(false);
        NextPlayer.setVisible(false);
        PreviousPlayer.setVisible(false);
    }
    
    /**
     * Set all game panels invisible on start up
     */
    public void setInvisible() {
       
        Punch1.setVisible(false);
        Punch2.setVisible(false);
        Punch3.setVisible(false);
        Punch4.setVisible(false);
        Punch5.setVisible(false);
        
        Time1.setVisible(false);
        Time2.setVisible(false);
        Time3.setVisible(false);
        Time4.setVisible(false);
        Time5.setVisible(false);
        
        Force1.setVisible(false);
        Force2.setVisible(false);
        Force3.setVisible(false);
        Force4.setVisible(false);
        Force5.setVisible(false);
    }
    
    public int gameInfo(int i, int totalForce, int currPunch, int timerMin, int timerSec) {                     
        
        
        String punch = String.valueOf(currPunch);  
        String tf = String.valueOf(totalForce);
        String minute_str = String.format("%02d", timerMin);
        String second_str = String.format("%02d", timerSec);
        
        
        switch (i) {
            
            case (1) :
                Punch1.setText(punch);
                Time1.setText(minute_str + ":" + second_str);
                Force1.setText(tf);
                
                Punch1.setVisible(true);
                Time1.setVisible(true);
                Force1.setVisible(true);
                return 2;
                
                case (2) :
                Punch2.setText(punch);
                Time2.setText(minute_str + ":" + second_str);
                Force2.setText(tf);
                
                Punch2.setVisible(true);
                Time2.setVisible(true);
                Force2.setVisible(true);
                return 3;
                
                case (3) :
                Punch3.setText(punch);
                Time3.setText(minute_str + ":" + second_str);
                Force3.setText(tf);
                
                Punch3.setVisible(true);
                Time3.setVisible(true);
                Force3.setVisible(true);
                return 4;
                
                case (4) :
                Punch4.setText(punch);
                Time4.setText(minute_str + ":" + second_str);
                Force4.setText(tf);
                
                Punch4.setVisible(true);
                Time4.setVisible(true);
                Force4.setVisible(true);
                return 5;
                
                case (5) :
                Punch5.setText(punch);
                Time5.setText(minute_str + ":" + second_str);
                Force5.setText(tf);
                
                Punch5.setVisible(true);
                Time5.setVisible(true);
                Force5.setVisible(true);
                return 6;
                
                case (6) :
                
                setInvisible();
                
                Punch1.setText(punch);
                Time1.setText(minute_str + ":" + second_str);
                Force1.setText(tf);
                
                Punch1.setVisible(true);
                Time1.setVisible(true);
                Force1.setVisible(true);
                return 2;
        }
        
        return 0;
    }
    
    /**
     * Updates the timer text
     */
    public void update()
    {
        String minute_str = String.format("%02d", timerMin);
        String second_str = String.format("%02d", timerSec);
        timer.setText(minute_str + ":" + second_str);
    }
    
  

    
    public  int[] generateRandNums(int max, int[] randNums){
        Random r = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = r.nextInt(max) + 1000;
        }
        Arrays.sort(randNums);
        return randNums;
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
        Punch5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Punch2 = new javax.swing.JLabel();
        Punch3 = new javax.swing.JLabel();
        Punch4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Time4 = new javax.swing.JLabel();
        Force5 = new javax.swing.JLabel();
        Time2 = new javax.swing.JLabel();
        Time3 = new javax.swing.JLabel();
        Time5 = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PlayPauseButton = new javax.swing.JLabel();
        PreviousPlayer = new javax.swing.JLabel();
        ResetButton = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        NextPlayer = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ComboCounterTitle = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JLabel();
        SidebarButton = new javax.swing.JLabel();
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
        Time1 = new javax.swing.JLabel();
        Force1 = new javax.swing.JLabel();
        Force2 = new javax.swing.JLabel();
        Force3 = new javax.swing.JLabel();
        Force4 = new javax.swing.JLabel();
        Punch1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Combo Mode");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 500, -1));

        Punch5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Punch5.setForeground(new java.awt.Color(240, 240, 240));
        Punch5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punch5.setText("Hit 5");
        Punch5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Punch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 140, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Force");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, 60));

        Punch2.setBackground(new java.awt.Color(181, 14, 0));
        Punch2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Punch2.setForeground(new java.awt.Color(240, 240, 240));
        Punch2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punch2.setText("Punch 2");
        Punch2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        Punch2.setOpaque(true);
        add(Punch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 80));

        Punch3.setBackground(new java.awt.Color(212, 192, 17));
        Punch3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Punch3.setForeground(new java.awt.Color(240, 240, 240));
        Punch3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punch3.setText("Punch 3");
        Punch3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        Punch3.setOpaque(true);
        add(Punch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, 80));

        Punch4.setBackground(new java.awt.Color(21, 140, 75));
        Punch4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Punch4.setForeground(new java.awt.Color(240, 240, 240));
        Punch4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punch4.setText("Punch 4");
        Punch4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        Punch4.setOpaque(true);
        add(Punch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        Time4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Time4.setForeground(new java.awt.Color(240, 240, 240));
        Time4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time4.setText("Time 4");
        Time4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Time4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 140, 80));

        Force5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Force5.setForeground(new java.awt.Color(240, 240, 240));
        Force5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Force5.setText("Force 5");
        Force5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Force5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 140, 80));

        Time2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Time2.setForeground(new java.awt.Color(240, 240, 240));
        Time2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time2.setText("Time 2");
        Time2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 140, 80));

        Time3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Time3.setForeground(new java.awt.Color(240, 240, 240));
        Time3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time3.setText("Time 3");
        Time3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Time3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, 80));

        Time5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Time5.setForeground(new java.awt.Color(240, 240, 240));
        Time5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time5.setText("Time 5");
        Time5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Time5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 140, 80));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backIcon.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png"))); // NOI18N
        PlayPauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayPauseButtonMouseClicked(evt);
            }
        });
        jPanel3.add(PlayPauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 300, 290));

        PreviousPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backPlayerIcon.png"))); // NOI18N
        jPanel3.add(PreviousPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 80, 80));

        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retryIcon.png"))); // NOI18N
        ResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButtonMouseClicked(evt);
            }
        });
        jPanel3.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 80, 80));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon2.png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });
        jPanel3.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 80, 80));

        NextPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextPlayerIcon.png"))); // NOI18N
        jPanel3.add(NextPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 80));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 755, 350));

        timer.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        timer.setForeground(new java.awt.Color(240, 240, 240));
        timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer.setText("--:--");
        add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 500, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Punches");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 110, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 56));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("ComboCounter");
        jPanel1.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backIcon.png"))); // NOI18N
        BackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton1MouseClicked(evt);
            }
        });
        jPanel1.add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        SidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButtonMouseClicked(evt);
            }
        });
        jPanel1.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

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

        Time1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Time1.setForeground(new java.awt.Color(240, 240, 240));
        Time1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time1.setText("Time 1");
        Time1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 80));

        Force1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Force1.setForeground(new java.awt.Color(240, 240, 240));
        Force1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Force1.setText("Force 1");
        Force1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Force1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 140, 80));

        Force2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Force2.setForeground(new java.awt.Color(240, 240, 240));
        Force2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Force2.setText("Force 2");
        Force2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Force2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, 80));

        Force3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Force3.setForeground(new java.awt.Color(240, 240, 240));
        Force3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Force3.setText("Force 3");
        Force3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Force3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 140, 80));

        Force4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Force4.setForeground(new java.awt.Color(240, 240, 240));
        Force4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Force4.setText("Force 4");
        Force4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Force4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 140, 80));

        Punch1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Punch1.setForeground(new java.awt.Color(240, 240, 240));
        Punch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punch1.setText("Punch 1");
        Punch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(Punch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Punch #");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Time");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 216, 230)));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 140, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Force: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Punches:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private int minute;
    private int second;
    private int ms;
    
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        ComboModeSetup.punches = 1;
        Main.setup(1);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void PlayPauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayPauseButtonMouseClicked
      
        PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pauseIcon.png")));
        
        if (paused == true)
        {
            int[] randNumbs = new int [40];
            generateRandNums(8000, randNumbs);
            paused = false;
            
            start = true;
            Thread th;

            th = new Thread(){
                @Override
                public void run(){
                    while(start == true && (punchTracker < ComboModeSetup.punches)){ //testing purposes
                        try{
                            sleep(1000);
                            timerSec+= 1;

                            // Increases Total Force randomly
                            if (timerSec % 2 == 0)
                            {
                                totalForce += randNumbs[index];
                                String tf = String.valueOf(totalForce);
                                jLabel12.setText(tf);
                                punchNum[punchTracker] = randNumbs[index];
                                punchTracker++; //testing purposes
                                
                               i = gameInfo(i, totalForce, punchTracker, timerMin, timerSec);
                                index++;
                                
                            }

                            if(timerSec == -1){
                                timerMin--;
                                timerSec = 59;
                            }

                            if(timerSec == 0 && timerMin == 0){
                                update();
                                return;
                            }
                            
                            if(paused == true) { // i have no idea how this worked
                                PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
                            }
                            
                            if (ComboModeSetup.punches == punchTracker) { // i have no idea how this worked
                                PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
                            }
                            update();
                        }catch(InterruptedException e){
                            System.out.println("Error");
                        }
                    }
                }
            };
            th.start();
        }
        else if (paused == false || (ComboModeSetup.punches == punchTracker) ) //testing purposes
        {
           PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
            start = false; 
            paused = true;
        }
         
    }//GEN-LAST:event_PlayPauseButtonMouseClicked

    private void ResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonMouseClicked

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        DateTimeFormatter date = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.now();

        Main.createActivity(initialMin, initialSec, localTime, localDate, "Timed Mode", totalForce);
        ComboModeSetup.punches = 1;
    }//GEN-LAST:event_SaveButtonMouseClicked

    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        if (Main.sidebarOpen == false) {
            SideBar.setVisible(true);
            Main.sidebarOpen = true;
        } else if (Main.sidebarOpen == true) {
            SideBar.setVisible(false);
            Main.sidebarOpen = false;
        }
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void About_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_About_ButtonMouseClicked

    private void Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Settings_ButtonMouseClicked
        start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)", "Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        Main.transitionToPage(3);
    }//GEN-LAST:event_Settings_ButtonMouseClicked

    private void Profile_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Profile_ButtonMouseClicked

    private void Activity_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activity_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Activity_ButtonMouseClicked

    private void Feedback_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_ButtonMouseClicked
        /*start = false;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        // Page to transition to*/
    }//GEN-LAST:event_Feedback_ButtonMouseClicked

    private void BackButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton1MouseClicked
        Main.setup(3);
    }//GEN-LAST:event_BackButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_Button;
    private javax.swing.JButton Activity_Button;
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel BackButton1;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JButton Feedback_Button;
    private javax.swing.JLabel Force1;
    private javax.swing.JLabel Force2;
    private javax.swing.JLabel Force3;
    private javax.swing.JLabel Force4;
    private javax.swing.JLabel Force5;
    private javax.swing.JLabel NextPlayer;
    private javax.swing.JLabel PlayPauseButton;
    private javax.swing.JLabel PreviousPlayer;
    private javax.swing.JButton Profile_Button;
    private javax.swing.JLabel Punch1;
    private javax.swing.JLabel Punch2;
    private javax.swing.JLabel Punch3;
    private javax.swing.JLabel Punch4;
    private javax.swing.JLabel Punch5;
    private javax.swing.JLabel ResetButton;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JButton Settings_Button;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JLabel Time1;
    private javax.swing.JLabel Time2;
    private javax.swing.JLabel Time3;
    private javax.swing.JLabel Time4;
    private javax.swing.JLabel Time5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables

}

