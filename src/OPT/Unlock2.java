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
public class Unlock2 extends javax.swing.JDialog {

    /**
     * Creates new form avisoUnlockB
     */
    public Unlock2(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("OPT/Bundle"); // NOI18N
        setTitle(bundle.getString("UNLOCK BOOTLOADER - INTRODUCTION")); // NOI18N
        setIconImage(null);
        setIconImages(null);
        setModal(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText(bundle.getString("Unlock2_explanation")); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setInheritsPopupMenu(false);

        jButton1.setText(bundle.getString("UNLOCK!")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText(bundle.getString("DOWNLOAD TWRP")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(bundle.getString("BOOT IMG")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText(bundle.getString("DOWNLOAD UNLOCKER")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        DevicesManager uu = new DevicesManager();
        if (uu.ADBConnected() == true) {
            LogWriter ub = new LogWriter("adb sideload Unlocker.zip","[Launching BAT]\ncd tools\\downloads\n" +
"tools\\adb_files\\adb.exe sideload downloads\\Unlocker.zip\n" +
"exit"
        + "[BAT END]\n\n");
        
        try {
            String fpathunlockb = path + "\\tools\\unlockb2.bat";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb };
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);      
            Process pr = pb.start();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if (uu.ADBConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        LogWriter ub = new LogWriter("[Downloading TWRP recovery]","[Launching BAT]\ncd tools\\downloads\n" +
"rmdir \"TWRP\" /s /q\n" +
"mkdir TWRP\n" +
"wget.exe -P TWRP http://tinyw.in/x6GA\n" +
"exit\n"
        + "[BAT END]\n\n");
        
        try {
            String fpathunlockb = path + "\\tools\\downloads\\TWRP.bat";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, ""};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);
            Process pr = pb.start();

        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       
        
        DevicesManager uu = new DevicesManager();
        if (uu.FastbootConnected() == true) {
            
            
            
        LogWriter ub = new LogWriter("fastboot boot openrecovery-twrp-2.8.0.1-bacon.img","[Direct cammand]\n"
                + "tools\\adb_files\\fastboot.exe boot tools\\downloads\\TWRP\\openrecovery-twrp-2.8.0.1-bacon.img\n[Command end]\n\n");

        
        try {
            String fpathunlockb = path + "\\tools\\adb_files\\fastboot.exe";
            String fpath = path + "\\tools\\downloads\\TWRP\\openrecovery-twrp-2.8.0.1-bacon.img";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, "boot" , fpath};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);
            Process pr = pb.start();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(root2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }else if (uu.FastbootConnected() == false){
            main uaa = new main();
            NotConnected uc = new NotConnected(uaa, true);
            uc.setVisible(true);
        }

        
        
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        LogWriter ub = new LogWriter("[Downloading Unlocker.zip]","[Launching BAT]\ncd tools\\downloads\n" +
"cd tools\\downloads\n" +
"del Unlocker.zip\n" +
"wget -O Unlocker.zip http://forum.xda-developers.com/attachment.php?attachmentid=2859187&d=1405749374\n" +
"exit"
        + "[BAT END]\n\n");
        
        try {
            String fpathunlockb = path + "\\tools\\downloads\\Unlocker.bat";
            String[] args = {"cmd","/c","start", "One Plus One Toolkit", fpathunlockb, ""};
            Runtime rt = Runtime.getRuntime();
            ProcessBuilder pb = new ProcessBuilder(args);
            Process pr = pb.start();

        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Unlock2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unlock2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unlock2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unlock2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Unlock2 dialog = new Unlock2(new javax.swing.JFrame(), true);
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

    public String path = System.getProperty("user.dir");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}