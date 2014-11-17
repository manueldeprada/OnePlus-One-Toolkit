/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Prada
 */
public class LogWriter {
    public LogWriter(String text, String advancedtext){
        try
        {
        FileWriter fileWriter = new FileWriter(writeFileName, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.newLine();

        // Always close files.
        
        bufferedWriter.close();

        
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ writeFileName + "'");}
    try
        {
        FileWriter fileWriter = new FileWriter(writeFileNameDebug, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(advancedtext);
        bufferedWriter.newLine();

        // Always close files.
        bufferedWriter.close();

        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ writeFileNameDebug + "'");}
    
    
    }
    public void clean(){
        try
        {
        FileWriter fileWriter = new FileWriter(writeFileNameDebug);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("");
        

        // Always close files.
        bufferedWriter.close();

        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ writeFileNameDebug + "'");}
        
        try
        {
        FileWriter fileWriter = new FileWriter(writeFileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
        

        // Always close files.
        
        bufferedWriter.close();

        
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ writeFileName + "'");}
        
    }
    String path = System.getProperty("user.dir");
    String writeFileName = path + "\\conf\\log.txt";
    String writeFileNameDebug = path + "\\conf\\debuglog.txt";
}
