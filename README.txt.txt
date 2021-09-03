Project Structure

ComboCounter - Main Folder With the source code
|- nbproject
	|- build-impl - Necessary file so that NetBeans can import source code
	|- genfiles.properties 
	|- project.properties
	|- project
|- database -> contains all SQL database files
	|- combocounter_forcemode.sql
	|- combocounter_login.sql
	|- combocounter_strengthmode.sql
	|- combocounter_timedmode.sql
	|- combocounter_user.sql
|- src - Contains all the class files
	|- Images -> holds all the images for icons in the program
	|- Main -> contains main files for the basic panels
		|- Activity.java
		|- ActivityModePanel.java
		|- FirstPage.java
		|- LoginPanel.java
		|- Main.java
		|- RegisterPanel.java
		|- SettingsPanel.java
	|- Modes -> contains all mode panel files
		|- ComboModePanel.java
		|- ForceModePanel.java
		|- PunchChallengeModePanel.java
		|- StrengthModePanel.java
		|- TimedModePanel.java
		|- Setup - holds all files for the setup of each mode
			|- ComboModeSetup.java
			|- ForceModeSetup.java
			|- PunchChallengeModeSetup.java
			|- StrengthModeSetup.java
			|- TimedModeSetup.java
	|- Multiplayer -> contains all multiplayer/competitive files
		|- MultiplayerCombo.java
		|- MultiplayerForce.java
		|- MultiplayerStrength.java
		|- MultiplayerTime.java
|- build
|- manifest.mf
|- README.txt