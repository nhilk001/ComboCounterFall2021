package Main;

import Modes.Setup.ForceModeSetup;
import Modes.TimedModePanel;
import Modes.ComboModePanel;
import Modes.ForceModePanel;
import Modes.PunchChallengePanel;
import Modes.Setup.ComboModeSetup;
import Modes.Setup.StrengthModeSetup;
import Modes.Setup.TimedModeSetup;
import Modes.StrengthModePanel;
import Multiplayer.MultiplayerForce;
import Multiplayer.MultiplayerStrength;
import Multiplayer.MultiplayerTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author Jonathan Zamora
 */
public class Main {
   public static JFrame Frame = new JFrame();
   static ArrayList<Activity> activityList = new ArrayList<Activity>();
    public static void main(String [] args){
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new FirstPage());
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.setVisible(true);
        Frame.revalidate();
    }
    
    /**
     * Transitions program to new page
     * @param i 1=Login 2=Register 3=Settings
     */
    
    public static void transitionToPage(int i)
    {
        switch (i) {
            case 1:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new LoginPanel());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
            case 2:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new RegisterPanel());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
            case 3:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new SettingsPanel());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
                break;
            default:
                break;
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////
    //  The following code needs to be completely reworked, the "save" button on     //
    //  any game mode must save the information but not take you to the activity     //
    //  panel. This means that the information must be sent to the activity panel    //
    //  but without opening said activity panel.                                     //
    ///////////////////////////////////////////////////////////////////////////////////
    public static void createActivity(int min, int sec, LocalTime time, LocalDate date, String mode, int totalForce)
    {
        Activity act = new Activity(min, sec, time, date, mode, totalForce);   
        activityList.add(act);
        
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new ActivityModePanel(activityList));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createActivity()
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new ActivityModePanel(activityList));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createComboMode ()
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new ComboModePanel());
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createForceMode (boolean multiplayer, int forceGoal, int timerMin, int timerSec)
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new ForceModePanel(multiplayer,forceGoal, timerMin, timerSec));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createTimedMode (int min, int sec)
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new TimedModePanel(min, sec));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createStrengthMode ()
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new StrengthModePanel());
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    public static void createPunchChallengeMode (int hours, int minutes, int seconds, int thresholdForce)
    {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new PunchChallengePanel(hours, minutes, seconds, thresholdForce));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    
    /**
     * Transition to match setup
     * @param numPlayers
     * @param i 1=ComboMode 2=ForceMode 3=TimedMode 4=StrengthMode 5=PunchChallenge
     */
    public static void multiplayer(int numPlayers){
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new MultiplayerForce(numPlayers));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    public static void multiplayerTimed(int numPlayers){
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new MultiplayerTime(numPlayers));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    public static void multiplayerStrength(int numPlayers){
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new MultiplayerStrength(numPlayers));
        Frame.setSize(768,1024);
        Frame.setResizable(false);
        Frame.repaint();
        Frame.revalidate();
    }
    public static void setup (int i)
    {
        switch (i){
            case 1:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               Frame.setContentPane(new ComboModeSetup());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
                break;
            case 2:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new ForceModeSetup());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
                break;
            case 3:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new TimedModeSetup());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
                Frame.revalidate();
                break;
            case 4:
                Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Frame.setContentPane(new StrengthModeSetup());
                Frame.setSize(768,1024);
                Frame.setResizable(false);
                Frame.repaint();
             Frame.revalidate();
               break;
            //case 5:
            //    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //    Frame.setContentPane(new PunchChallengeSetup());
            //    Frame.setSize(768,1024);
            //    Frame.setResizable(false);
            //    Frame.repaint();
            //    Frame.revalidate();
            //    break;
        }
    }
    
    public static void done(){
        // Reseting all variables
        name1 = "Player 1"; name2 = "Player 2"; name3 = "Player 3"; 
        name4 = "Player 4"; name5 = "Player 5"; name6 = "Player 6";
        
        score1= ""; score2= ""; score3= ""; score4= ""; score5= ""; score6= "";
        
        playerNum = 0; currentPlayer = -1 ;
        doneFlag = false ;
        
        setup(selectedGameMode);
    }
      public static void closeFrame(){
        Frame.dispose();
        System.exit(0);
    }
    // Var Declarations
    public static String name1 = "Player 1", name2 = "Player 2", 
            name3 = "Player 3", name4 = "Player 4", name5 = "Player 5",
                                                            name6 = "Player 6";
    
    public static String score1 = " ", score2 = " ", score3 = " ", score4 = " ", score5 = " ", score6 = " ";
    
    public static int currentPlayer = -1;
    public static int selectedGameMode = 2;
    public static int playerNum = 2;
    public static boolean priority = false;
    public static boolean doneFlag = false;
    public static boolean sidebarOpen = false;
    public static boolean countDown = false ;
}
