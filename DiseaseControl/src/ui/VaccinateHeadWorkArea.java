/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CommunityRequestDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Request;

/**
 *
 * @author yanyanchen
 */
public class VaccinateHeadWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form VaccinateHeadWorkArea
     */
    public VaccinateHeadWorkArea(String name) {
        initComponents();
        lblUsername.setText(name);
         btnAccept.setEnabled(false);
            btnReject.setEnabled(false);
            btnProcess.setEnabled(false);
            btnComplete.setEnabled(false);
    }
    
    public void validateFields(){
        String name = lblName.getText();
        String date=lblDate.getText();
        String patientNumber=lblPatientNumber.getText();
        String victim=lblVictim.getText();
        String location=lblLocation.getText();
        String descriiption=lblDescription.getText();
        
//        &&!date.equals("--")&&!patientNumber.equals("--")&&!victim.equals("--")&&!location.equals("--")&&!descriiption.equals("--")
        if(!name.equals("--")){
            btnAccept.setEnabled(true);
            btnReject.setEnabled(true);
            btnProcess.setEnabled(true);
            btnComplete.setEnabled(true);
        }else{
            btnAccept.setEnabled(false);
            btnReject.setEnabled(false);
            btnProcess.setEnabled(false);
            btnComplete.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        lblRequestObject = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        lblVictim = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblPatientNumber = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Name", "Patient Num", "Victim", "Location", "Description", "Request Object", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 1296, 238));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Vaccinate Head Work Area");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 15, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Hello,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 15, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 15, -1, -1));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));

        lblRequestObject.setText("--");
        getContentPane().add(lblRequestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, -1, -1));

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, -1));

        lblVictim.setText("--");
        getContentPane().add(lblVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Location");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Patient Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        getContentPane().add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        lblId.setText("--");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        lblName.setText("--");
        lblName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblNamePropertyChange(evt);
            }
        });
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("# of Potentially infected");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        lblDescription.setText("--");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, -1, -1));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        lblPatientNumber.setText("--");
        getContentPane().add(lblPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        lblDate.setText("--");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabel11.setText("Request Log ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setText("Description");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Current Request Object");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        lblLocation.setText("--");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id =model.getValueAt(index,0).toString();
        lblId.setText(id);
        String date = model.getValueAt(index,2).toString();
        lblDate.setText(date);
        String name = model.getValueAt(index,1).toString();
        lblName.setText(name);
        String patientNumber = model.getValueAt(index,3).toString();
        lblPatientNumber.setText(patientNumber);
        String victim = model.getValueAt(index,4).toString();
        lblVictim.setText(victim);
        String location = model.getValueAt(index,5).toString();
        lblLocation.setText(location);
        String description = model.getValueAt(index,6).toString();
        lblDescription.setText(description);
        String requestObject = model.getValueAt(index, 7).toString();
        lblRequestObject.setText(requestObject);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String name=lblUsername.getText();
        
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Request> requestList = CommunityRequestDao.getAssociatedRecords(name);
        Iterator<Request> itrRequest = requestList.iterator();
        while(itrRequest.hasNext()){
            Request requestObj = itrRequest.next();
            dtm.addRow(new Object[]{requestObj.getId(),requestObj.getName(),requestObj.getDate(),requestObj.getPatientNumber(),requestObj.getVictim(),requestObj.getLocation(),requestObj.getDescription(),requestObj.getRequestObject(),requestObj.getStatus()});
        }
    }//GEN-LAST:event_formComponentShown

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to accept this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"accept",name);
                setVisible(false);
                new DriverWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"process",name);
                setVisible(false);
                new DriverWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"reject",name);
                setVisible(false);
                new DriverWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void lblNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblNamePropertyChange
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_lblNamePropertyChange

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"complete",name);
                setVisible(false);
                new DriverWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VaccinateHeadWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VaccinateHeadWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VaccinateHeadWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VaccinateHeadWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VaccinateHeadWorkArea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientNumber;
    private javax.swing.JLabel lblRequestObject;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVictim;
    // End of variables declaration//GEN-END:variables
}