package com.kronius.IPCTracker;

import java.io.File;

public class IPCTrackerKeys {
	
	//TODO Change for production builds
	public static final boolean DEBUG_STATUS = false;
	
	public static class Strings{
		public static final String AppName = "IPC Tracker";
		public static final String AppNameFull = "IPC Tracker for Axis & Allies: Spring 1942";
		
		//TODO Change for production builds
		public static final String ApplicationVersion = "2.0.0.0";
		//TODO Change for production builds
		public static final String ApplicationVersionReleaseDate = "September 8th, 2012";
		
		public static final String SovietUnion = "Soviet Union";
		public static final String Germany = "Germany";
		public static final String UnitedKingdom = "United Kingdom";
		public static final String Japan = "Japan";
		public static final String UnitedStates = "United States";
		
		public static final String Total = "Total: ";
		
		public static final String StartingValueSU = "24";
		public static final String StartingValueGer = "40";
		public static final String StartingValueUK = "30";
		public static final String StartingValueJap = "30";
		public static final String StartingValueUS = "42";
		
		public static final String UpdateButtonText = "Update";
		public static final String VictoryCheckButtonText = "Check for Victory";
		
		public static final String FileMenuText = "File"; 
		public static final String HelpMenuText = "Help";
		
		public static final String NewMenuItemText = "New Game";
		public static final String OpenMenuItemText = "Open Game";
		public static final String SaveMenuItemText = "Save Game";
		public static final String QuitMenuitemText = "Quit";
		public static final String AboutMenuItemText = "About " + AppName;

		public static final String AboutMessageTitle = "About " + AppName;
		public static final String AboutMessage = "Created by Aaron Graham (aarongraham9@gmail.com).\n"
		 + ApplicationVersionReleaseDate + ".\nVersion " + ApplicationVersion + "\nKronius Productions (CC)";
		
		public static final String VictoryCheckMessageTitleSuffix = " Win!";
		public static final String VictoryCheckMessage1 = " Win!\nWith a score of:\n";
		public static final String VictoryCheckMessage2 = " cities for Axis\nand:\n";
		public static final String VictoryCheckMessage3 = " cities for Allies";
	}
	
	public static class FileNames{
		public static final String FileName = ".IPCT2";
		public static final String Version1FileName = ".ipctracker";
		public static final String LogName = "IPCTracker.log";
		public static final String IconAxis = "res" + File.separator + "avatar_gr_icon.gif";
		public static final String IconAllies = "res" + File.separator + "avatar_usa_icon.gif";
		public static final String IconError = "res" + File.separator + "error.png";
		public static final String IconAbout = "res" + File.separator + "Illuminati.png";
		public static final String IconWin = "res" + File.separator + "AppIcon.png";
	}
	
	public static class CountryCodes{
		public static final int SU = 1;
		public static final int Ger = 2;
		public static final int UK = 3;
		public static final int Jap = 4;
		public static final int US = 5;
	}
	
	public static class VictoryStrings{
		public static final String VictoryCondition = "Victory Conditions:";
		public static final String VictoryConditionCitiesToWin = "Cities to Win";
		public static final String VictoryConditionNine = "9";
		public static final String VictoryConditionTwelve = "12";
		
		public static final String Axis = "Axis";
		public static final String Allies = "Allies ";
		public static final String Washington = "Washington";
		public static final String London = "London";
		public static final String Leningrad = "Leningrad";
		public static final String Moscow = "Moscow";
		public static final String Calcutta = "Calcutta";
		public static final String LosAngeles = "Los Angeles";
		public static final String Berlin = "Berlin";
		public static final String Paris = "Paris";
		public static final String Rome = "Rome";
		public static final String Shanghai = "Shanghai";
		public static final String Manila = "Manila";
		public static final String Tokyo = "Tokyo";
	}
	
	public static class OS{
		public static final String Mac = "Mac OS X";
		public static final String Win = "Windows";
		public static final String Linux = "";
		
		public static final String OSNotSupportedMessageTitle = "Operating System Not Supported";
		public static final String OSNotSupportedMessage = "Your current operating system is not supported at this time." +
				"\nThe application will now close.";
	}
}
