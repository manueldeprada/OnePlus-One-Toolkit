/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prada
 */


public class DevicesManager {
  
    public boolean  ADBConnected() 
            {
ArrayList ub = getADBDevices(true);
        return !ub.isEmpty();
    
    

}
    
    public boolean  FastbootConnected() 
            {
ArrayList ub = getFastbootDevices(true);
        return !ub.isEmpty();
    
    

}
    public boolean getFastbootUnlocked() {
        ArrayList<String> ret = new ArrayList<String>();
        try {
            List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "oem", "device-info");
            File dir = new File(path);
            // CWD for process
            
            ProcessBuilder builder = new ProcessBuilder();
            builder.redirectErrorStream(true); // This is the important part
            builder.command(command);
            
            builder.directory(dir);
            
            Process process = builder.start();
            
            InputStream is = process.getInputStream();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            try {
                String line = reader.readLine();
                while (line != null) {
                    ret.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        String unlockedline = null;
        for (int i = 0; i < ret.size(); i++){
            
            if (ret.get(i).contains("unlocked")) {
                
                unlockedline = ret.get(i);
                
            }
        }
        return unlockedline.contains("true");
        
    }
    public ArrayList<String> getADBDevices(boolean log)
	{
		 ArrayList<String> ret = new ArrayList<String>();
		 InputStream processIN = null;
		 BufferedReader br = null;
		 try 
		 {
			Process process = new ProcessBuilder(path + "\\tools\\adb_files\\adb.exe", "devices").start();			
			processIN = process.getInputStream();
			br = new BufferedReader(new InputStreamReader(processIN));
			
			br.readLine();
			String line;
			while((line = br.readLine() )!= null && line.length() > 0)
			{
				
                            String[] split = line.split("\t");
				if(split.length >= 1)
				{
					ret.add(split[0]);
				}
			}
		 } 
		 catch (IOException e) 
		 {
			e.printStackTrace();
			LogWriter ube = new LogWriter(e.getMessage(), "");
		 }
		 finally
		 {
			 try
			 {
				 if(br != null)
					 br.close();
				 if(processIN != null)
					 processIN.close();
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }
		 }
		 if(log)
		 {
			 LogWriter uv = new LogWriter(ret.size() + " devices found","");
        
		 }
		 return ret;
	}
    
    public ArrayList<String> getFastbootDevices(boolean log)
	{
            
            ArrayList<String> ret = new ArrayList<String>();
		 InputStream processIN = null;
		 BufferedReader br = null;
		 try 
		 {
			Process process = new ProcessBuilder(path + "\\tools\\adb_files\\fastboot.exe", "devices").start();			
			processIN = process.getInputStream();
			br = new BufferedReader(new InputStreamReader(processIN));
			
			
			String line;
                        String woop = br.readLine();
                        if (woop != null) { 
                        ret.add(woop.replace("fastboot", "")); }
			while((line = br.readLine() )!= null && line.length() > 0)
			{
				
                            String[] split = line.split("\t");
				if(split.length >= 1)
				{
					
                                    
                                    ret.add(split[0]);
                                    
				}
			}
                        
                 
		 } 
		 catch (IOException e) 
		 {
			e.printStackTrace();
			LogWriter ube = new LogWriter(e.getMessage(), "");
		 }
		 finally
		 {
			 try
			 {
				 if(br != null)
					 br.close();
				 if(processIN != null)
					 processIN.close();
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }
		 }
		 if(log)
		 {
			 LogWriter uv = new LogWriter(ret.size() + " devices found","");
        
		 }
		 return ret;
	}
    public String path = System.getProperty("user.dir");
}
