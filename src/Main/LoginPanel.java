package Main;

import static Main.Main.Frame;
import javax.swing.JFrame;

/**
 * @author Jonathan Zamora
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }
    
    boolean hiding = false ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboCounterTitle = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JButton();
        EmailField = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        HidePassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 55));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCounterTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboCounterTitle.setForeground(new java.awt.Color(0, 122, 203));
        ComboCounterTitle.setText("ComboCounter");
        add(ComboCounterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        SignUpButton.setBackground(new java.awt.Color(51, 51, 51));
        SignUpButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(240, 240, 240));
        SignUpButton.setText("Sign Up");
        SignUpButton.setBorder(null);
        SignUpButton.setBorderPainted(false);
        SignUpButton.setFocusable(false);
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
        });
        add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 150, 40));

        EmailField.setBackground(new java.awt.Color(0, 0, 55));
        EmailField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EmailField.setForeground(new java.awt.Color(255, 255, 255));
        EmailField.setText("Email");
        EmailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 330, 50));

        LogInButton.setBackground(new java.awt.Color(51, 51, 51));
        LogInButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(240, 240, 240));
        LogInButton.setText("Log In");
        LogInButton.setBorder(null);
        LogInButton.setBorderPainted(false);
        LogInButton.setFocusable(false);
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInButtonMouseClicked(evt);
            }
        });
        add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 150, 40));

        PasswordField.setBackground(new java.awt.Color(0, 0, 55));
        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setText("Password");
        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        PasswordField.setEchoChar((char)0);
        add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 330, 50));

        HidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png"))); // NOI18N
        HidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HidePasswordMouseClicked(evt);
            }
        });
        add(HidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseClicked
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new RegisterPanel());
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }//GEN-LAST:event_SignUpButtonMouseClicked

    private void LogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseClicked
        Main.setup(2);
    }//GEN-LAST:event_LogInButtonMouseClicked

    private void HidePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidePasswordMouseClicked
        if (hiding == false)
        {
            HidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emptyCircleIcon.png")));
            PasswordField.setEchoChar('*');
            hiding = true;
        }
        else if (hiding == true)
        {
            HidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/filledCircleIcon.png")));
            PasswordField.setEchoChar((char)0);
            hiding = false;
        }
            
    }//GEN-LAST:event_HidePasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComboCounterTitle;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel HidePassword;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignUpButton;
    // End of variables declaration//GEN-END:variables
}
