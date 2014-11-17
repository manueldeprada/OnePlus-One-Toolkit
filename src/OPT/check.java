/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

/**
 *
 * @author Prada
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// This class downloads a file from a URL.
class check extends Observable implements Runnable {

// Max size of download buffer.
private static final int MAX_BUFFER_SIZE = 1024;

// These are the status names.
public static final String STATUSES[] = {"Downloading",
"Paused", "Complete", "Cancelled", "Error"};

// These are the status codes.
public static final int DOWNLOADING = 0;
public static final int PAUSED = 1;
public static final int COMPLETE = 2;
public static final int CANCELLED = 3;
public static final int ERROR = 4;
public static int status1 = 5;
public static int finished;
public static boolean error;

private URL url; // download URL
private int size; // size of download in bytes
private int downloaded; // number of bytes downloaded
public int status; // current status of download

// Constructor for Download.
public check() {
    

    download();
}

public String getversion(){
    return version;
}
public boolean getError(){
    return error;
}
public String getlink(){
    return link;
}
public String getchangelog(){
    return changelog;
}
public int finished(){
    return finished;
}
    
// Start or resume downloading.
public void download() {
    thread = new Thread(this);
    thread.start();
}

// Get file name portion of URL.


// Download file.
public void run() {
    finished = 0;
    error = false;
    try {
            
            URL url = new URL("https://www.dropbox.com/s/6j85pwjh9wmbhrr/version?dl=1");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str1;
            
            while ((str1 = in.readLine()) != null) {
                
                            

version = str1;
            }
            //this.jLabel3.setText("");
            
           
            in.close();
            
            
    
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            error = true;
            
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    try {
            
            URL url = new URL("https://www.dropbox.com/s/ko8sjmla69p8bf0/link?dl=1");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String str3;
            while ((str3 = in.readLine()) != null) {
link = str3;
            }
            
                in.close();
            
            
    
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
            
            URL url = new URL("https://www.dropbox.com/s/c3sb5xodwxivxkn/changelog?dl=1");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String str3;
            while ((str3 = in.readLine()) != null) {
changelog = str3;
            }
            
                in.close();
            
            
    
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    finished = 1;
    
}
public String path = System.getProperty("user.dir");
String version; 
String link;
String changelog;
Thread thread;
// Notify observers that this download's status has changed.

}

