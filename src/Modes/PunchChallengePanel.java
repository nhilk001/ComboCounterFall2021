package Modes;

import Main.Main;
import static java.lang.Thread.sleep;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Jonathan Attias Khoudari
 * Cell #: 305-343-5864
 */
public final class PunchChallengePanel extends javax.swing.JPanel {
    int playerNum = 2; // placeholder variable for future functionality
    boolean countDown = true; // placeholder variable for future functionality
    private final int originalHours;
    private final int originalMinutes;
    private final int originalSeconds;
    private final int originalMs;
    private int hours;
    private int minutes;
    private int seconds;
    private int ms;
    private int[] punchForces;
    private int punchCounter = 0;
    private int invalidPunches = 0;
    private int validPunches = 0;
    private final int thresholdForce;
    private boolean paused = true;
    
    // TODO
    public PunchChallengePanel(int hours, int minutes, int seconds, int thresholdForce) {
        initComponents();
        
        this.originalHours = hours;
        this.originalMinutes = minutes;
        this.originalSeconds = seconds;
        this.originalMs = 0;
        this.hours = this.originalHours;
        this.minutes = this.originalMinutes;
        this.seconds = this.originalSeconds;
        this.ms = this.originalMs;
        updateTimeLabel();
        
        this.thresholdForce = thresholdForce;
        int numOfPunches = (hours * 3600) + (minutes * 60) + seconds;
        punchForces = new int[numOfPunches];
        int maxForce = this.thresholdForce * 2;
        punchForces = fillArray(punchForces, maxForce);
        
        SideBar.setVisible(false);
        
        // Person working on multiplayer will use these
        NextPlayer.setVisible(false);
        PreviousPlayer.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideBar = new javax.swing.JPanel();
        jPanel1.setVisible(false);
        SettingsButton = new javax.swing.JButton();
        AboutButton.setOpaque(false);
        AboutButton.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        ProfileButton = new javax.swing.JButton();
        AboutButton.setOpaque(false);
        AboutButton.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        ActivityButton = new javax.swing.JButton();
        AboutButton.setOpaque(false);
        AboutButton.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        FeedbackButton = new javax.swing.JButton();
        AboutButton.setOpaque(false);
        AboutButton.setContentAreaFilled(false);
        //jButton1.setBorderPainted(false);
        TopBar = new javax.swing.JPanel();
        ComboCounterTitle = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        SidebarButton = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        ValidPunchesTitle = new javax.swing.JLabel();
        ValidPunchesLabel = new javax.swing.JLabel();
        InvalidPunchesTitle = new javax.swing.JLabel();
        InvalidPunchesLabel = new javax.swing.JLabel();
        AverageForceTitle = new javax.swing.JLabel();
        AverageForceLabel = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        PreviousPlayer = new javax.swing.JLabel();
        NextPlayer = new javax.swing.JLabel();
        PlayPauseButton = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        ResetButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(768, 1024));
        setMinimumSize(new java.awt.Dimension(768, 1024));
        setPreferredSize(new java.awt.Dimension(768, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(51, 51, 56));
        SideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SettingsButton.setBackground(new java.awt.Color(51, 51, 56));
        SettingsButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(240, 240, 240));
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settingsIcon.png"))); // NOI18N
        SettingsButton.setText(" Settings");
        SettingsButton.setBorder(null);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SettingsButton.setFocusPainted(false);
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseClicked(evt);
            }
        });
        SideBar.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        ProfileButton.setBackground(new java.awt.Color(51, 51, 56));
        ProfileButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(240, 240, 240));
        ProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileIcon.png"))); // NOI18N
        ProfileButton.setText(" Profile");
        ProfileButton.setBorder(null);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseClicked(evt);
            }
        });
        SideBar.add(ProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 60));

        ActivityButton.setBackground(new java.awt.Color(51, 51, 56));
        ActivityButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        ActivityButton.setForeground(new java.awt.Color(240, 240, 240));
        ActivityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/activityIcon.png"))); // NOI18N
        ActivityButton.setText(" Activity");
        ActivityButton.setBorder(null);
        ActivityButton.setContentAreaFilled(false);
        ActivityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivityButtonMouseClicked(evt);
            }
        });
        SideBar.add(ActivityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 60));

        FeedbackButton.setBackground(new java.awt.Color(51, 51, 56));
        FeedbackButton.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        FeedbackButton.setForeground(new java.awt.Color(240, 240, 240));
        FeedbackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedbackIcon.png"))); // NOI18N
        FeedbackButton.setText(" Feedback");
        FeedbackButton.setBorder(null);
        FeedbackButton.setContentAreaFilled(false);
        FeedbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackButtonMouseClicked(evt);
            }
        });
        SideBar.add(FeedbackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 80, 250, 530));

        TopBar.setBackground(new java.awt.Color(51, 51, 56));
        TopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(240, 240, 240));
        ComboCounterTitle.setText("Punch Challenge");
        TopBar.add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backIcon.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        TopBar.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SidebarButton.setBackground(new java.awt.Color(51, 51, 56));
        SidebarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        SidebarButton.setOpaque(true);
        SidebarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarButtonMouseClicked(evt);
            }
        });
        TopBar.add(SidebarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 55));

        add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 80));

        TimeLabel.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(240, 240, 240));
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("--:--");
        add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 570, -1));

        ValidPunchesTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        ValidPunchesTitle.setForeground(new java.awt.Color(240, 240, 240));
        ValidPunchesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValidPunchesTitle.setText("Valid Punches:");
        add(ValidPunchesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, 80));

        ValidPunchesLabel.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        ValidPunchesLabel.setForeground(new java.awt.Color(240, 240, 240));
        ValidPunchesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ValidPunchesLabel.setText("0");
        add(ValidPunchesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 210, 60));

        InvalidPunchesTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        InvalidPunchesTitle.setForeground(new java.awt.Color(240, 240, 240));
        InvalidPunchesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InvalidPunchesTitle.setText("Invalid Punches:");
        add(InvalidPunchesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 350, 80));

        InvalidPunchesLabel.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        InvalidPunchesLabel.setForeground(new java.awt.Color(240, 240, 240));
        InvalidPunchesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InvalidPunchesLabel.setText("0");
        add(InvalidPunchesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 210, 60));

        AverageForceTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        AverageForceTitle.setForeground(new java.awt.Color(240, 240, 240));
        AverageForceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AverageForceTitle.setText("Average Force:");
        add(AverageForceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 330, 80));

        AverageForceLabel.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        AverageForceLabel.setForeground(new java.awt.Color(240, 240, 240));
        AverageForceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AverageForceLabel.setText("0");
        add(AverageForceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 210, 60));

        ControlPanel.setBackground(new java.awt.Color(51, 51, 56));
        ControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PreviousPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backPlayerIcon.png"))); // NOI18N
        ControlPanel.add(PreviousPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 80, 80));

        NextPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextPlayerIcon.png"))); // NOI18N
        ControlPanel.add(NextPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 80));

        PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png"))); // NOI18N
        PlayPauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayPauseButtonMouseClicked(evt);
            }
        });
        ControlPanel.add(PlayPauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 300, 290));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon2.png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });
        ControlPanel.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 80, 80));

        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retryIcon.png"))); // NOI18N
        ResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButtonMouseClicked(evt);
            }
        });
        ControlPanel.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 80, 80));

        add(ControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 635, 755, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void PlayPauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayPauseButtonMouseClicked
        Thread timer = new Thread() {
            public void run() {
                while (paused == false) {
                    try {
                        
                        sleep(10);
                        ms--;
                        
                        if (ms <= -1) {
                            if (seconds % 2 == 0) {
                                validPunches++;
                                renderValidInvalidPunches();
                            }
                            
                            if (seconds % 3 == 0) {
                                invalidPunches++;
                                renderValidInvalidPunches();
                            }
                            seconds--;
                            ms = 99;
                        }
                        if(seconds == -1) {
                            minutes--;
                            seconds = 59;
                        }
                        if (minutes == -1) {
                            hours--;
                            minutes = 59;
                        }
                        updateTimeLabel();
                                                
                        if(ms == 0 && seconds == 0 && minutes == 0 && hours == 0) {
                            break;
                        }
                        
                        
                    } catch(InterruptedException e) {
                        System.out.println("Error in Timer thread.");
                    }
                }
            }
        };
        
        Thread avgForceCalc = new Thread() {
            public void run() {
                while (paused == false) {
                    try {
                        sleep(1000);
                        punchCounter++;
                        int avgForce = calculateAvgForce();
                        AverageForceLabel.setText(Integer.toString(avgForce));
                    } catch(Exception e) {
                        System.out.println("Error in Average Force thread.");
                    }
                }
            }
        };
        
        if (paused == true && !(hours == 0 && minutes == 0 && seconds == 0)) {
            paused = false;
            PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pauseIcon.png")));
            
            timer.start();
            avgForceCalc.start();
        } else if (paused == false) {
            paused = true;
            PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
        }
    }//GEN-LAST:event_PlayPauseButtonMouseClicked

    private void ResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseClicked
            paused = true;
            PlayPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playIcon.png")));
            
            this.hours = this.originalHours;
            this.minutes = this.originalMinutes;
            this.seconds = this.originalSeconds;
            this.ms = this.originalMs;
            updateTimeLabel();
    }//GEN-LAST:event_ResetButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        paused = true;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        Main.setup(5);
    }//GEN-LAST:event_BackButtonMouseClicked

    // TODO
    private void SettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) Main.transitionToPage(2);
    }//GEN-LAST:event_SettingsButtonMouseClicked

    // TODO
    private void ProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseClicked
        /*paused = true;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
           // Page to transition to*/
    }//GEN-LAST:event_ProfileButtonMouseClicked

    // TODO
    private void ActivityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityButtonMouseClicked
        Main.ActivityHistory();
        /*paused = true;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
           // Page to transition to*/
    }//GEN-LAST:event_ActivityButtonMouseClicked
    
    // TODO
    private void FeedbackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackButtonMouseClicked
        /*paused = true;
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? (Progress is not saved)","Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
           // Page to transition to*/
    }//GEN-LAST:event_FeedbackButtonMouseClicked
    
    public void updateTimeLabel() {
        String hoursString = String.format("%02d", hours);
        String minutesString = String.format("%02d", minutes);
        String secondsString = String.format("%02d", seconds);
        String msString = String.format("%02d", ms);
        TimeLabel.setText(hoursString + ":" + minutesString + ":" + secondsString + "." + msString);
    }
    
    private void SidebarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarButtonMouseClicked
        if (Main.sidebarOpen == false) {
            paused = true;
            SideBar.setVisible(true) ;
            Main.sidebarOpen = true ;
        } else if (Main.sidebarOpen == true) {
            SideBar.setVisible(false);
            Main.sidebarOpen = false ;
        }
    }//GEN-LAST:event_SidebarButtonMouseClicked

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        // TODO add your handling code here:

        DateTimeFormatter date = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        String inDate = localDate.format(date);

        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.now();
        String inTime = localTime.format(time);
        
        //Main.createActivity( timerMin, timerSec, inTime, inDate, "Combo Mode", totalForce, punchTracker, ComboModeSetup.punches );
        Main.db.insertPunchActivity(Main.username, thresholdForce, validPunches, invalidPunches ,seconds, minutes, inTime, inDate);
        
        JOptionPane.showMessageDialog(null, 
            "Saved", 
            "Punch Mode", 
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SaveButtonMouseClicked

    private int[] fillArray(int[] array, int max) {
    Random randomGenerator = new Random();
    for (int i = 0; i < array.length; i++) {
        array[i] = randomGenerator.nextInt(max) + 1;
    }
    return array;
  }

    private int calculateAvgForce() {
    // TODO figure out if we need to use locks for this
    int avgForce = 0;
    for (int i = 0; i < punchCounter; i++) {
        avgForce += punchForces[i] / punchCounter;
    }
    return avgForce;
  }
    
    private void renderValidInvalidPunches() {
        ValidPunchesLabel.setText(Integer.toString(validPunches));
        InvalidPunchesLabel.setText(Integer.toString(invalidPunches));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivityButton;
    private javax.swing.JLabel AverageForceLabel;
    private javax.swing.JLabel AverageForceTitle;
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton FeedbackButton;
    private javax.swing.JLabel InvalidPunchesLabel;
    private javax.swing.JLabel InvalidPunchesTitle;
    private javax.swing.JLabel NextPlayer;
    private javax.swing.JLabel PlayPauseButton;
    private javax.swing.JLabel PreviousPlayer;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JLabel ResetButton;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JPanel SideBar;
    private javax.swing.JLabel SidebarButton;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel ValidPunchesLabel;
    private javax.swing.JLabel ValidPunchesTitle;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JButton AboutButton = new javax.swing.JButton();
}
