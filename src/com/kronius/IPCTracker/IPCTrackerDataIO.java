package com.kronius.IPCTracker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IPCTrackerDataIO {
	
	private static BasicLogger logger;
	private static String CLASS_NAME;
	
	public static void SaveData(String path, IPCTrackerDataV2 dataToSave){
		
		CLASS_NAME = IPCTrackerDataIO.class.getName();
		logger = BasicLogger.getInstance();
		logger.setLogName("IPCTracker.log");
		
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
				
		try{
			fos = new FileOutputStream(path);
		    out = new ObjectOutputStream(fos);
		    out.writeObject(dataToSave);
		    out.close();
		}
		catch(IOException ex){
			logger.log(CLASS_NAME, "ERROR: " + ex.getMessage().toString());
		}
	}
	
	public static IPCTrackerDataV2 LoadData(String path){
		
		IPCTrackerDataV2 loadedData = new IPCTrackerDataV2();
		IPCTrackerData v1LoadedData = new IPCTrackerData();
		
		FileInputStream fis = null;
		ObjectInputStream in = null;
	    
		if(path.endsWith(IPCTrackerKeys.FileNames.FileName)){
			
			try
		    {
		    	fis = new FileInputStream(path);
		    	in = new ObjectInputStream(fis);
		    	loadedData = (IPCTrackerDataV2)in.readObject(); 
		    	in.close();
		    }
		    catch(IOException ex)
		    {
		    	logger.log(CLASS_NAME, "ERROR: " + ex.getMessage());
		    }
		    catch(ClassNotFoundException ex)
		    {
		    	logger.log(CLASS_NAME, "ERROR: " + ex.getMessage());
		    }
			
		}else if (path.endsWith(IPCTrackerKeys.FileNames.Version1FileName)){
		
			try
		    {
		    	fis = new FileInputStream(path);
		    	in = new ObjectInputStream(fis);
		    	v1LoadedData = (IPCTrackerData)in.readObject(); 
		    	in.close();
		    }
		    catch(IOException ex)
		    {
		    	logger.log(CLASS_NAME, "ERROR: " + ex.getMessage());
		    }
		    catch(ClassNotFoundException ex)
		    {
		    	logger.log(CLASS_NAME, "ERROR: " + ex.getMessage());
		    }
			
			//Here parse v1LoadedData data into the loadedData object.
			//Fill in the other loadedData with the defaults.
			loadedData.setSUTotal(v1LoadedData.getSUTotal());
			loadedData.setGerTotal(v1LoadedData.getGerTotal());
			loadedData.setUKTotal(v1LoadedData.getUKTotal());
			loadedData.setJapTotal(v1LoadedData.getJapTotal());
			loadedData.setUSTotal(v1LoadedData.getUSTotal());
			
			loadedData.setTransactionHistorySU(v1LoadedData.getTransactionHistorySU());
			loadedData.setTransactionHistoryGer(v1LoadedData.getTransactionHistoryGer());
			loadedData.setTransactionHistoryUK(v1LoadedData.getTransactionHistoryUK());
			loadedData.setTransactionHistoryJap(v1LoadedData.getTransactionHistoryJap());
			loadedData.setTransactionHistoryUS(v1LoadedData.getTransactionHistoryUS());
			
			loadedData.setIsVictoryConditionNine(true);
			
			loadedData.setIsVictoryCityWashingtonAxis(false);
			loadedData.setIsVictoryCityLondonAxis(false);
			loadedData.setIsVictoryCityLeningradAxis(false);
			loadedData.setIsVictoryCityMoscowAxis(false);
			loadedData.setIsVictoryCityCalcuttaAxis(false);
			loadedData.setIsVictoryCityLosAngelesAxis(false);
			loadedData.setIsVictoryCityBerlinAxis(true);
			loadedData.setIsVictoryCityParisAxis(true);
			loadedData.setIsVictoryCityRomeAxis(true);
			loadedData.setIsVictoryCityShanghaiAxis(true);
			loadedData.setIsVictoryCityTokyoAxis(true);
		}
		else{
			logger.log(CLASS_NAME, "ERROR: Unknown fileName returning empty object.");
		}
		
		return loadedData;
	}
}
