/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OPT;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prada
 */
public class kernelFlash extends javax.swing.JDialog {

    /**
     * Creates new form recoveryInstall
     */
    public kernelFlash(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("OPT/Bundle"); // NOI18N
        setTitle(bundle.getString("FLASH A RECOVERY")); // NOI18N

        jLabel1.setText(bundle.getString("<HTML> SELECT WITCH KERNEL YOU WOULD LIKE TO FLASH...")); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText(bundle.getString("FRANCO.KERNEL R7")); // NOI18N
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText(bundle.getString("FURNACE KERNEL")); // NOI18N
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText(bundle.getString("DEFAULT")); // NOI18N
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText(bundle.getString("FLASH!")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        jPanel2.setVisible(false);

        jLabel2.setText(bundle.getString("PLEASE SELECT A KERNEL!")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jButton2.setText(bundle.getString("DOWNLOAD!")); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        recselected = 1;
        jPanel2.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        recselected = 2;
        jPanel2.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        recselected = 3;
        jPanel2.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        DevicesManager uu = new DevicesManager();
        if (uu.FastbootConnected() == true) {
            if (uu.getFastbootUnlocked() == true) {
        
                
                
                
        
        if( recselected == 0 && this.jRadioButton3.isSelected() == false) {
            jPanel2.setVisible(true);

        } else if(recselected == 1){
            
            LogWriter ub = new LogWriter("fastboot flash boot boot-r7.img","[Direct cammand]\n"
                + "tools\\adb_files\\fastboot.exe flash boot tools\\downloads\\franco.Kernel\\boot-r7.img\n"
                    + "[Command end]\n\n");
            
            try {
                String fpathunlockb = path + "\\tools\\adb_files\\fastboot.exe";
                String fpath = path + "\\tools\\downloads\\franco.Kernel\\boot-r7.img";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "flash", "boot", fpath};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }  else if(recselected == 2){
            
            LogWriter ub = new LogWriter("fastboot flash boot boot.img","[Direct cammand]\n"
                + "tools\\adb_files\\fastboot.exe flash boot tools\\downloads\\furnace\\boot.img\n"
                    + "[Command end]\n\n");
            
            try {
                String fpathunlockb = path + "\\tools\\adb_files\\fastboot.exe";
                String fpath = path + "\\tools\\downloads\\furnace\\boot.img";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "flash", "boot", fpath};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if(recselected == 3){
            
LogWriter ub = new LogWriter("fastboot flash boot boot.img","[Direct cammand]\n"
                + "tools\\adb_files\\fastboot.exe flash boot tools\\downloads\\stockkernel\\boot.img\n"
                    + "[Command end]\n\n");            
            
            try {
                String fpathunlockb = path + "\\tools\\adb_files\\fastboot.exe";
                String fpath = path + "\\tools\\downloads\\stockkernel\\boot.img";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "flash", "boot", fpath};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
                
                
                
           
            }else if (uu.getFastbootUnlocked() == false){
                main yy = new main();
                NotUnlocked ugg = new NotUnlocked(yy, true);
            }

        }else if (uu.FastbootConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if( recselected == 0 ) {
            jPanel2.setVisible(true);

        } else if(recselected == 1){
            
            LogWriter ub = new LogWriter("[Downloading franco.Kernel]","[Launching BAT]\n" +
"cd tools\\downloads\n" +
"rmdir \"franco.Kernel\" /s /q\n" +
"wget -P franco.Kernel http://kernels.franco-lnx.net/OnePlusOne/4.4/boot-r7.img\n" +
"exit\n"
        + "[BAT END]\n\n");
            
            try {
                String fpathunlockb = path + "\\tools\\downloads\\franco.bat";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }  else if(recselected == 2){
            
            LogWriter ub = new LogWriter("[Downloading Furnace Kernel]","[Launching BAT]\n" +
"cd tools\\downloads\n" +
"rmdir \"furnace\" /s /q\n" +
"wget -P furnace http://savoca.co/furnace/bacon/furnace-1.0.0-aosp_bacon.zip\n" +
"exit\n"
        + "[BAT END]\n\n");
            
            try {
                String fpathunlockb = path + "\\tools\\downloads\\furnace.bat";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if(recselected == 3){
            
           LogWriter ub = new LogWriter("[Downloading Stock Kernel]","[Launching BAT]\n" +
"cd tools\\downloads\n" +
"rmdir \"stockkernel\" /s /q\n" +
"wget -P stockkernel http://fs1.d-h.st/download/00134/RBd/boot.img\n" +
"exit\n"
        + "[BAT END]\n\n");
           
            try {
                String fpathunlockb = path + "\\tools\\downloads\\stockkernel.bat";
                String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb};
                Runtime rt = Runtime.getRuntime();
                ProcessBuilder pb = new ProcessBuilder(args);
                Process pr = pb.start();
                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kernelFlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kernelFlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kernelFlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kernelFlash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                kernelFlash dialog = new kernelFlash(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
public int recselected = 0;
   public String path = System.getProperty("user.dir");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
