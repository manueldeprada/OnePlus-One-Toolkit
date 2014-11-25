/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT.unlocker;

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
public class worker extends Thread{
    
    
    public void run() {
           status= "Rebooting to bootloader...";
barper = 2;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot", "bootloader");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
status = "Getting root permissions...";
barper = 5;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "boot", "modified-boot.img");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line+ "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            
         try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }   
            
            status= "Injecting data (1/4)";
barper = 10;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "push", "unlocker/openrecoveryscript", "/cache/recovery/");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line+ "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
        
            
            
         try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }   
            
         
         status= "Injecting data (2/4)";
barper = 15;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "push", "unlocker/unlocker.zip", "/sdcard/");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line+ "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
         
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            status= "Rebooting...";
barper = 20;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot", "bootloader");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line+ "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            
            
status = "Unlocking....";
barper = 30;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "boot", "twrp.img");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line+ "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
           status= "Rebooting...";
barper = 35;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot", "bootloader");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
         
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            status = "Getting root permissions...";
barper = 40;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "boot", "modified-boot.img");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            status= "Injecting data (3/4)";
barper = 45;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "push", "openrecoveryscript", "/cache/recovery/");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
         
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
            status= "Injecting data (4/4)";
barper = 50;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "push", "2.zip", "/sdcard/");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
           status= "Rebooting...";
barper = 55;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot", "bootloader");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                               
status = "Restoring previous CM11S...";
barper = 65;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "boot", "twrp.img");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
             
           status= "Rebooting...";
barper = 75;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot", "bootloader");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             status = "Getting root permissions...";
barper = 80;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\fastboot.exe", "boot", "modified-boot.img");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            status= "Cleaning up files (1/2)...";
barper = 85;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "shell", "rm", "/sdcard/2.zip");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            status= "Cleaning up files (2/2)...";
barper = 90;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "shell", "rm", "/sdcard/unlocker.zip");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
         
            
            try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
              
           status= "Rebooting...";
barper = 95;
            try {
                List<String> command = Arrays.asList(path + "\\tools\\adb_files\\adb.exe", "wait-for-device", "reboot");
                File dir = new File(unzippath);
                ProcessBuilder builder = new ProcessBuilder();
                builder.redirectErrorStream(true); 
                builder.command(command);
                builder.directory(dir); 
                Process process = builder.start();        
                InputStream is = process.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                try {
                    String line = reader.readLine();
                    while (line != null) {
                        output = output + line + "\n";
                        line = reader.readLine();
                    }
                    try {
                        process.waitFor();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
                    }reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }            
            } catch (IOException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            status = "Done!!!! Output is stored in log.";
            barper = 100;
            
            
            
    }




public String statusgetter() {
return status;
}
public String outputgetter() {
return output;
}
public int barper(){
    return barper;
}
public String path = System.getProperty("user.dir");
private String output;
private String status;
private int barper;
public String unzippath = path + "\\tools\\downloads\\unlock";

}