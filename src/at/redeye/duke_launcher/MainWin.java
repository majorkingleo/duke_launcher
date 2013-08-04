/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.redeye.duke_launcher;

import at.redeye.FrameWork.base.BaseDialog;
import at.redeye.FrameWork.base.Root;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author moberza
 */
public class MainWin extends BaseDialog {

    String last_path;
    String exe_location;
    
    /**
     * Creates new form MainWin
     */
    public MainWin( Root root ) 
    {
        super(root,"DukeLauncher");
        initComponents();                
        
        last_path = root.getSetup().getLocalConfig("LastPath", "");
        
        exe_location = root.getSetup().getLocalConfig(AppConfigDefinitions.ExeLocation);
        
        updateExeLocation();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonExe = new javax.swing.JButton();
        jTextExe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Duke Exe:");

        jButtonExe.setText("...");
        jButtonExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExeActionPerformed(evt);
            }
        });

        jTextExe.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextExe, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExe)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExe)
                    .addComponent(jLabel1)
                    .addComponent(jTextExe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExeActionPerformed
        
        JFileChooser fc = new JFileChooser();

        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new ExeFileFilter(root));
        fc.setMultiSelectionEnabled(false);

        logger.info("last path: " + last_path);

        if (last_path != null) {
            fc.setCurrentDirectory(new File(last_path));            
        }

        int retval = fc.showOpenDialog(this);

        if (retval != 0) {
            return;
        }

        final File file = fc.getSelectedFile();

        exe_location = file.getPath();
        last_path = file.getPath();
        updateExeLocation();            
        
    }//GEN-LAST:event_jButtonExeActionPerformed

    @Override
    public void close()
    {
        root.getSetup().setLocalConfig(AppConfigDefinitions.ExeLocation.getConfigName(), exe_location);
        root.getSetup().setLocalConfig("LastPath", last_path);
        
        super.close();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextExe;
    // End of variables declaration//GEN-END:variables

    private void updateExeLocation() 
    {
       jTextExe.setText(exe_location);
    }
}
