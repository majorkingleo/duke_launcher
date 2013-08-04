/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.redeye.duke_launcher;

import at.redeye.FrameWork.base.AutoMBox;
import at.redeye.FrameWork.base.BaseDialog;
import at.redeye.FrameWork.base.Root;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author moberza
 */
public class MainWin extends BaseDialog {

    String last_path;
    String exe_location;
    String server_ip;
    int    num_of_clients = 2;;
    
    /**
     * Creates new form MainWin
     */
    public MainWin( Root root ) 
    {
        super(root,"DukeLauncher");
        initComponents();                
        
        last_path = root.getSetup().getLocalConfig("LastPath", "");
        
        exe_location = root.getSetup().getLocalConfig(AppConfigDefinitions.ExeLocation);
        server_ip = root.getSetup().getLocalConfig("ServerIp","");
        num_of_clients = Integer.valueOf(root.getSetup().getLocalConfig("NumOfClients","2"));
        
        jSClients.setValue(num_of_clients);
        jTServerIp.setText(server_ip);
        
        updateExeLocation();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonExe = new javax.swing.JButton();
        jTextExe = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBServer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSClients = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jBClient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTServerIp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Duke Exe:");

        jButtonExe.setText("...");
        jButtonExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExeActionPerformed(evt);
            }
        });

        jTextExe.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Server"));

        jBServer.setText("Starte Server");
        jBServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBServerActionPerformed(evt);
            }
        });

        jLabel3.setText("Anzahl Teilnehmer");

        jSClients.setModel(new javax.swing.SpinnerNumberModel(2, 2, 20, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jBServer))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jBServer)
                .addComponent(jSClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Client"));

        jBClient.setText("Starte Client");
        jBClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientActionPerformed(evt);
            }
        });

        jLabel4.setText("Server IP:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTServerIp, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBClient))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBClient)
                    .addComponent(jTServerIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Starte Single Player");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextExe, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExe)
                        .addGap(4, 4, 4))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextExe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonExe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void jBServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBServerActionPerformed
        
        
        new AutoMBox(last_path) {

            @Override
            public void do_stuff() throws Exception {
                String exe = jTextExe.getText();

                ArrayList<String> command = new ArrayList<String>();

                command.add(exe);
                command.add("/net");
                command.add("/n0:" + jSClients.getValue().toString());
                
                if( logger.isDebugEnabled() )
                {
                    int count = 0;
                    for( String c : command )
                    {
                        logger.debug(count + " '" + c + "'");
                        count++;
                    }
                }
                
                Process p = Runtime.getRuntime().exec(command.toArray(new String[command.size()]));

            }
        };
                
        
    }//GEN-LAST:event_jBServerActionPerformed

    private void jBClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientActionPerformed
        
         new AutoMBox(last_path) {

            @Override
            public void do_stuff() throws Exception {
                String exe = jTextExe.getText();

                ArrayList<String> command = new ArrayList<String>();

                command.add(exe);
                command.add("/net");
                command.add("/n0" );
                command.add(jTServerIp.getText());
                
                if( logger.isDebugEnabled() )
                {
                    int count = 0;
                    for( String c : command )
                    {
                        logger.debug(count + " '" + c + "'");
                        count++;
                    }
                }
                
                Process p = Runtime.getRuntime().exec(command.toArray(new String[command.size()]));

            }
        };
        
    }//GEN-LAST:event_jBClientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         new AutoMBox(last_path) {

            @Override
            public void do_stuff() throws Exception {
                String exe = jTextExe.getText();

                ArrayList<String> command = new ArrayList<String>();

                command.add(exe);               
                
                if( logger.isDebugEnabled() )
                {
                    int count = 0;
                    for( String c : command )
                    {
                        logger.debug(count + " '" + c + "'");
                        count++;
                    }
                }
                
                Process p = Runtime.getRuntime().exec(command.toArray(new String[command.size()]));

            }
        };        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void close()
    {
        root.getSetup().setLocalConfig(AppConfigDefinitions.ExeLocation.getConfigName(), exe_location);
        root.getSetup().setLocalConfig("LastPath", last_path);
        root.getSetup().setLocalConfig("ServerIp", jTServerIp.getText());
        root.getSetup().setLocalConfig("NumOfClients", String.valueOf((Integer)jSClients.getValue()));
        
        super.close();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClient;
    private javax.swing.JButton jBServer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSClients;
    private javax.swing.JTextField jTServerIp;
    private javax.swing.JTextField jTextExe;
    // End of variables declaration//GEN-END:variables

    private void updateExeLocation() 
    {
       jTextExe.setText(exe_location);
    }
}
