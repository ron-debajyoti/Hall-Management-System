/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallmanagement;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author ron_debajyoti
 */
public class Update extends javax.swing.JFrame {

    private final String name;
    /**
     * Creates new form Update
     */
    public Update(String input) {
        initComponents();
        this.name=input;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameArea = new javax.swing.JTextField();
        rollnoArea = new javax.swing.JTextField();
        hallArea = new javax.swing.JTextField();
        emailIDArea = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 19)); // NOI18N
        jLabel1.setText("  Update Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 12, 145, 51));

        jLabel2.setText("Roll Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, 154, 35));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, 154, 35));

        jLabel4.setText("Hall of Residence");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, 154, 35));

        jLabel5.setText("Email ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 217, 154, 35));

        nameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAreaActionPerformed(evt);
            }
        });
        getContentPane().add(nameArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 79, 181, -1));

        rollnoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoAreaActionPerformed(evt);
            }
        });
        getContentPane().add(rollnoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 126, 181, -1));

        hallArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallAreaActionPerformed(evt);
            }
        });
        getContentPane().add(hallArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 173, 181, -1));

        emailIDArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDAreaActionPerformed(evt);
            }
        });
        getContentPane().add(emailIDArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 220, 181, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 288, 110, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 352, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallmanagement/template3.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAreaActionPerformed

    private void rollnoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnoAreaActionPerformed

    private void hallAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallAreaActionPerformed

    private void emailIDAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDAreaActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            FileWriter out = new FileWriter("student.txt",true);
            PrintWriter o = new PrintWriter(out);
            o.close();
            out.close();
            FileWriter fwOb = new FileWriter("std-"+name+".txt", false); 
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
            File f = new File("std-"+name+".txt");
            out = new FileWriter(f,true);
            o = new PrintWriter(out);
            o.println("Profile of Student:-");
            o.println("Username: "+name);                        
            o.println("Name: "+nameArea.getText());
            o.println("Roll Number: "+rollnoArea.getText());
            o.println("Hall of Residence::"+hallArea.getText()+"$$");
            o.println("E-mail ID: "+emailIDArea.getText());
            o.close();
            out.close();
            JOptionPane.showMessageDialog(this,"You have sucessfully Updated","Update Info",JOptionPane.INFORMATION_MESSAGE);
        }  
        catch(IOException e){
                        JOptionPane.showMessageDialog(this,"Couldn't open the file","Error",JOptionPane.ERROR_MESSAGE);
                    }
        dispose();
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailIDArea;
    private javax.swing.JTextField hallArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameArea;
    private javax.swing.JTextField rollnoArea;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
