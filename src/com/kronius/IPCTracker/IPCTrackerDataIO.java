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
		    	ex.printStackTrace();
		    }
		    catch(ClassNotFoundException ex)
		    {
		    	ex.printStackTrace();
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
		    	ex.printStackTrace();
		    }
		    catch(ClassNotFoundException ex)
		    {
		    	ex.printStackTrace();
		    }
			
			//Here parse v1LoadedData data into the loadedData object.
			//Fill in the other loadedData with the defaults.
			loadedData.setSUTotal(v1LoadedData.getSUTotal());
			//etc
			
			loadedData.setIsVictoryConditionNine(true);
			//etc
		}
		else{
			//Error
		}
		
		return loadedData;
	}
}
