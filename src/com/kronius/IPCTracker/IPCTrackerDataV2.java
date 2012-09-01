package com.kronius.IPCTracker;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class IPCTrackerDataV2 implements Serializable {
	
	private static final long serialVersionUID = 6969604483485414104L;
	
	private int SUTotal;
	private int GerTotal;
	private int UKTotal;
	private int JapTotal;
	private int USTotal;
	
	private List<String> TransactionHistorySU;
	private List<String> TransactionHistoryGer;
	private List<String> TransactionHistoryUK;
	private List<String> TransactionHistoryJap;
	private List<String> TransactionHistoryUS;
	
	private boolean isVictoryConditionNine;
	
	private boolean isVictoryCityWashingtonAxis;
	private boolean isVictoryCityLondonAxis;
	private boolean isVictoryCityLeningradAxis;
	private boolean isVictoryCityMoscowAxis;
	private boolean isVictoryCityCalcuttaAxis;
	private boolean isVictoryCityLosAngelesAxis;
	private boolean isVictoryCityBerlinAxis;
	private boolean isVictoryCityParisAxis;
	private boolean isVictoryCityRomeAxis;
	private boolean isVictoryCityShanghaiAxis;
	private boolean isVictoryCityManilaAxis;
	private boolean isVictoryCityTokyoAxis;
	
	
	public IPCTrackerDataV2(){
		SUTotal = 0;
		GerTotal = 0;
		UKTotal = 0;
		JapTotal = 0;
		USTotal = 0;
		
		TransactionHistorySU = new LinkedList<String>();
		TransactionHistoryGer = new LinkedList<String>();
		TransactionHistoryUK = new LinkedList<String>();
		TransactionHistoryJap = new LinkedList<String>();
		TransactionHistoryUS = new LinkedList<String>();
		
		isVictoryCityWashingtonAxis = false;
		isVictoryCityLondonAxis = false;
		isVictoryCityLeningradAxis = false;
		isVictoryCityMoscowAxis = false;
		isVictoryCityCalcuttaAxis = false;
		isVictoryCityLosAngelesAxis = false;
		isVictoryCityBerlinAxis = true;
		isVictoryCityParisAxis = true;
		isVictoryCityRomeAxis = true;
		isVictoryCityShanghaiAxis = true;
		isVictoryCityManilaAxis = true;
		isVictoryCityTokyoAxis = true;
	}
	
    public IPCTrackerDataV2(int SUTotalIn, int GerTotalIn, int UKTotalIn, int JapTotalIn, int USTotalIn, 
    		List<String> TransactionHistorySUIn, List<String> TransactionHistoryGerIn, 
    		List<String> TransactionHistoryUKIn, List<String> TransactionHistoryJapIn, 
    		List<String> TransactionHistoryUSIn, boolean isVictoryCityWashingtonAxisIn, 
    		boolean isVictoryCityLondonAxisIn, boolean isVictoryCityLeningradAxisIn, 
    		boolean isVictoryCityMoscowAxisIn, boolean isVictoryCityCalcuttaAxisIn, 
    		boolean isVictoryCityLosAngelesAxisIn, boolean isVictoryCityBerlinAxisIn, 
    		boolean isVictoryCityParisAxisIn, boolean isVictoryCityRomeAxisIn, 
    		boolean isVictoryCityShanghaiAxisIn, boolean isVictoryCityManilaAxisIn, 
    		boolean isVictoryCityTokyoAxisIn){
		
    	SUTotal = SUTotalIn;
		GerTotal = GerTotalIn;
		UKTotal = UKTotalIn;
		JapTotal = JapTotalIn;
		USTotal = USTotalIn;
		
		TransactionHistorySU = TransactionHistorySUIn;
		TransactionHistoryGer = TransactionHistoryGerIn;
		TransactionHistoryUK = TransactionHistoryUKIn;
		TransactionHistoryJap = TransactionHistoryJapIn;
		TransactionHistoryUS = TransactionHistoryUSIn;
		
		isVictoryCityWashingtonAxis = isVictoryCityWashingtonAxisIn;
		isVictoryCityLondonAxis = isVictoryCityLondonAxisIn;
		isVictoryCityLeningradAxis = isVictoryCityLeningradAxisIn;
		isVictoryCityMoscowAxis = isVictoryCityMoscowAxisIn;
		isVictoryCityCalcuttaAxis = isVictoryCityCalcuttaAxisIn;
		isVictoryCityLosAngelesAxis = isVictoryCityLosAngelesAxisIn;
		isVictoryCityBerlinAxis = isVictoryCityBerlinAxisIn;
		isVictoryCityParisAxis = isVictoryCityParisAxisIn;
		isVictoryCityRomeAxis = isVictoryCityRomeAxisIn;
		isVictoryCityShanghaiAxis = isVictoryCityShanghaiAxisIn;
		isVictoryCityManilaAxis = isVictoryCityManilaAxisIn;
		isVictoryCityTokyoAxis = isVictoryCityTokyoAxisIn;
	}
    
    public void setSUTotal(int SUTotalIn){
    	SUTotal = SUTotalIn;
    }
    
    public int getSUTotal(){
    	return SUTotal;
    }
    
    public void setGerTotal(int GerTotalIn){
    	GerTotal = GerTotalIn;
    }

    public int getGerTotal(){
    	return GerTotal;
    }
    
    public void setUKTotal(int UKTotalIn){
    	UKTotal = UKTotalIn;
    }

    public int getUKTotal(){
    	return UKTotal;
    }
    
    public void setJapTotal(int JapTotalIn){
    	JapTotal = JapTotalIn;
    }

    public int getJapTotal(){
    	return JapTotal;
    }
    
    public void setUSTotal(int USTotalIn){
    	USTotal = USTotalIn;
    }

    public int getUSTotal(){
    	return USTotal;
    }

    public void setTransactionHistorySU(List<String> TransactionHistorySUIn){
    	TransactionHistorySU = TransactionHistorySUIn;
    }
    
    public List<String> getTransactionHistorySU(){
    	return TransactionHistorySU;
    }
    
    public void setTransactionHistoryGer(List<String> TransactionHistoryGerIn){
    	TransactionHistoryGer = TransactionHistoryGerIn;
    }
    
    public List<String> getTransactionHistoryGer(){
    	return TransactionHistoryGer;
    }
    
    public void setTransactionHistoryUK(List<String> TransactionHistoryUKIn){
    	TransactionHistoryUK = TransactionHistoryUKIn;
    }
    
    public List<String> getTransactionHistoryUK(){
    	return TransactionHistoryUK;
    }
    
    public void setTransactionHistoryJap(List<String> TransactionHistoryJapIn){
    	TransactionHistoryJap = TransactionHistoryJapIn;
    }
    
    public List<String> getTransactionHistoryJap(){
    	return TransactionHistoryJap;
    }
    
    public void setTransactionHistoryUS(List<String> TransactionHistoryUSIn){
    	TransactionHistoryUS = TransactionHistoryUSIn;
    }
    
    public List<String> getTransactionHistoryUS(){
    	return TransactionHistoryUS;
    }
    
    public void setIsVictoryConditionNine(boolean isVictoryConditionNineIn){
    	isVictoryConditionNine = isVictoryConditionNineIn;
    }
    
    public boolean getIsVictoryConditionNine(){
    	return isVictoryConditionNine;
    }
    
    public void setIsVictoryCityWashingtonAxis(boolean isVictoryCityWashingtonAxisIn){
    	isVictoryCityWashingtonAxis = isVictoryCityWashingtonAxisIn;
    }
    
    public boolean getIsVictoryCityWashingtonAxis(){
    	return isVictoryCityWashingtonAxis;
    }
    
    public void setIsVictoryCityLondonAxis(boolean isVictoryCityLondonAxisIn){
    	isVictoryCityLondonAxis = isVictoryCityLondonAxisIn;
    }
    
    public boolean getIsVictoryCityLondonAxis(){
    	return isVictoryCityLondonAxis;
    }
    
	public void setIsVictoryCityLeningradAxis(boolean isVictoryCityLeningradAxisIn){
		isVictoryCityLeningradAxis = isVictoryCityLeningradAxisIn;
	}
    
    public boolean getIsVictoryCityLeningradAxis(){
    	return isVictoryCityLeningradAxis;
    }
    
	public void setIsVictoryCityMoscowAxis(boolean isVictoryCityMoscowAxisIn){
		isVictoryCityMoscowAxis = isVictoryCityMoscowAxisIn;
	}
    
    public boolean getIsVictoryCityMoscowAxis(){
    	return isVictoryCityMoscowAxis;
    }
    
	public void setIsVictoryCityCalcuttaAxis(boolean isVictoryCityCalcuttaAxisIn){
		isVictoryCityCalcuttaAxis = isVictoryCityCalcuttaAxisIn;
	}
    
    public boolean getIsVictoryCityCalcuttaAxis(){
    	return isVictoryCityCalcuttaAxis;
    }
    
	public void setIsVictoryCityLosAngelesAxis(boolean isVictoryCityLosAngelesAxisIn){
		isVictoryCityLosAngelesAxis = isVictoryCityLosAngelesAxisIn;
	}
    
    public boolean getIsVictoryCityLosAngelesAxis(){
    	return isVictoryCityLosAngelesAxis;
    }
    
	public void setIsVictoryCityBerlinAxis(boolean isVictoryCityBerlinAxisIn){
		isVictoryCityBerlinAxis = isVictoryCityBerlinAxisIn;
	}
    
    public boolean getIsVictoryCityBerlinAxis(){
    	return isVictoryCityBerlinAxis;
    }
    
	public void setIsVictoryCityParisAxis(boolean isVictoryCityParisAxisIn){
		isVictoryCityParisAxis = isVictoryCityParisAxisIn;
	}
    
    public boolean getIsVictoryCityParisAxis(){
    	return isVictoryCityParisAxis;
    }
    
	public void setIsVictoryCityRomeAxis(boolean isVictoryCityRomeAxisIn){
		isVictoryCityRomeAxis = isVictoryCityRomeAxisIn;
	}
    
    public boolean getIsVictoryCityRomeAxis(){
    	return isVictoryCityRomeAxis;
    }
    
	public void setIsVictoryCityShanghaiAxis(boolean isVictoryCityShanghaiAxisIn){
		isVictoryCityShanghaiAxis = isVictoryCityShanghaiAxisIn;
	}
    
    public boolean getIsVictoryCityShanghaiAxis(){
    	return isVictoryCityShanghaiAxis;
    }
    
	public void setIsVictoryCityManilaAxis(boolean isVictoryCityManilaAxisIn){
		isVictoryCityManilaAxis = isVictoryCityManilaAxisIn;
	}
    
    public boolean getIsVictoryCityManilaAxis(){
    	return isVictoryCityManilaAxis;
    }
    
	public void setIsVictoryCityTokyoAxis(boolean isVictoryCityTokyoAxisIn){
		isVictoryCityTokyoAxis = isVictoryCityTokyoAxisIn;
	}
	
	public boolean getIsVictoryCityTokyoAxis(){
    	return isVictoryCityTokyoAxis;
    }
}
