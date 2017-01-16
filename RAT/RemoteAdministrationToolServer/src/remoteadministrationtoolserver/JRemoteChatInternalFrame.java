/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JRemoteChatInternalFrame.java
 *
 * Created on Dec 17, 2012, 12:58:39 PM
 */

package remoteadministrationtoolserver;

import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cyber
 */
public class JRemoteChatInternalFrame extends javax.swing.JInternalFrame {

    private Socket client;
    private PrintWriter pw;
    
    /** Creates new form JRemoteChatInternalFrame */
    public JRemoteChatInternalFrame(Socket client,PrintWriter pw) {
        initComponents();
        this.client = client;
        this.pw = pw;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChatMessages = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Remote Chat");

        jSplitPane1.setDividerLocation(301);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTextAreaChatMessages.setBackground(new java.awt.Color(0, 204, 255));
        jTextAreaChatMessages.setColumns(20);
        jTextAreaChatMessages.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jTextAreaChatMessages.setRows(5);
        jTextAreaChatMessages.setText("[Chat Messages]\n");
        jTextAreaChatMessages.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Chat Messages"), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jScrollPane1.setViewportView(jTextAreaChatMessages);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Message:");

        jTextAreaMessage.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jTextAreaMessage.setRows(5);
        jTextAreaMessage.setText("[Message]\n");
        jTextAreaMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 4));
        jScrollPane2.setViewportView(jTextAreaMessage);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .add(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jButtonSend.setBackground(new java.awt.Color(51, 153, 0));
        jButtonSend.setFont(new java.awt.Font("Lucida Console", 1, 12));
        jButtonSend.setForeground(new java.awt.Color(102, 153, 0));
        jButtonSend.setText("Send");
        jButtonSend.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jButtonSend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .add(jButtonSend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        
        this.pw.println("[ChatMessage]:"+this.jTextAreaMessage.getText());
        this.pw.flush();
        
        this.jTextAreaChatMessages.append("PC:"+this.jTextAreaMessage.getText()+"\r\n");
    }//GEN-LAST:event_jButtonSendActionPerformed

    public void receiveMessage(String message) {
        final String message1 = message;
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                jTextAreaChatMessages.append("Device:"+message1+"\r\n");
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextAreaChatMessages;
    private javax.swing.JTextArea jTextAreaMessage;
    // End of variables declaration//GEN-END:variables

}