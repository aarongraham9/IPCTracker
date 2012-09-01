package com.kronius.IPCTracker;

import java.io.FileOutputStream;
import java.io.IOException;
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
		
		
		
		return loadedData;
	}
}
