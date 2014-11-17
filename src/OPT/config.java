/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Prada
 */
public class config {
    public String getValue(String key){
        File propfile = new File(path + "\\conf\\config.properties");
Properties prop = new Properties();
InputStream input = null;
try {
 
		input = new FileInputStream(propfile);
 
		// load a properties file
		prop.load(input);
 
		// get the property value and print it out
		return prop.getProperty(key);
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
                        }
                }
}
        return null;
    }
    public void setValue(String key, String value){
               File propfile = new File(path + "\\conf\\config.properties");

OutputStream output = null;
InputStream input = null;
try {


 input = new FileInputStream(propfile);		
 Properties prop = new Properties();
		prop.load(input);// load a properties file
		input.close();
 output = new FileOutputStream(propfile);
		// get the property value and print it out
		prop.setProperty(key, value);
                prop.store(output, null);
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
                        }
                }
}
    }
   public String path = System.getProperty("user.dir"); 
}
