/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.CIS3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class readEasyUI extends javax.swing.JFrame {

    /**
     * Creates new form readEasyUI
     */
    public readEasyUI() throws FileNotFoundException {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        readEasyLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchTextField = new java.awt.TextField();
        wpmLabel = new javax.swing.JLabel();
        etaLabel = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        recentFiles = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        wpmSet = new javax.swing.JMenuItem();
        timerSet = new javax.swing.JMenuItem();
        colorSet = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        readEasyLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        readEasyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readEasyLabel.setText("ReadEasy");

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchLabel.setText("Search");

        searchTextField.setText("textField1");
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        wpmLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wpmLabel.setText("WPM:");

        etaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etaLabel.setText("ETA:");

        playButton.setText("Play");

        pauseButton.setText("Pause");

        fileMenu.setText("File");

        openFile.setText("Open");
        fileMenu.add(openFile);

        recentFiles.setText("Recent");
        fileMenu.add(recentFiles);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        fileMenu.add(exitFile);

        jMenuBar1.add(fileMenu);

        settingsMenu.setText("Settings");

        wpmSet.setText("WPM");
        wpmSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpmSetActionPerformed(evt);
            }
        });
        settingsMenu.add(wpmSet);

        timerSet.setText("Timer");
        settingsMenu.add(timerSet);

        colorSet.setText("Color");
        colorSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorSetActionPerformed(evt);
            }
        });
        settingsMenu.add(colorSet);

        jMenuBar1.add(settingsMenu);

        helpMenu.setText("Help");
        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(searchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wpmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(readEasyLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(playButton)
                                .addGap(18, 18, 18)
                                .addComponent(pauseButton)))
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134)
                .addComponent(readEasyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(pauseButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wpmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etaLabel)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitFileActionPerformed

    private void wpmSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpmSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wpmSetActionPerformed

    private void colorSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorSetActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        readEasyUI r = null;
        r = new readEasyUI();
        r.setVisible(true);

        Scanner s = new Scanner(new File("/Users/Ali/Downloads/Lab1.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        for (int i = 0; i < list.size(); i++) {
            readEasyLabel.setText(list.get(i));
            try {
                Thread.sleep(1000); // we can use the user input here linked with the GUI text field
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readEasyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new readEasyUI().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(readEasyUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem colorSet;
    private javax.swing.JLabel etaLabel;
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private static javax.swing.JLabel readEasyLabel;
    private javax.swing.JMenuItem recentFiles;
    private javax.swing.JLabel searchLabel;
    private java.awt.TextField searchTextField;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JMenuItem timerSet;
    private javax.swing.JLabel wpmLabel;
    private javax.swing.JMenuItem wpmSet;
    // End of variables declaration//GEN-END:variables
}
