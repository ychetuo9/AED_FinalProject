/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CommunityRequestDao;
import dao.UserDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Request;
import model.User;

/**
 *
 * @author yanyanchen
 */
public class HospitalAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    public HospitalAdminWorkArea() {
        initComponents();
        btnSave.setEnabled(false);
    }
    
    public HospitalAdminWorkArea(String name) {
        initComponents();
        lblUsername.setText(name);
        btnSave.setEnabled(false);
    }
    
    public void validateFields(){
        String name = lblName.getText();
        String date=lblDate.getText();
        String patientNumber=lblPatientNumber.getText();
        String victim=lblVictim.getText();
        String location=lblLocation.getText();
        String descriiption=lblDescription.getText();
        String requestObject=(String)cbbAssignedObject.getSelectedItem();
        
        if(!name.equals("--")&&!date.equals("--")&&!patientNumber.equals("--")&&!victim.equals("--")&&!location.equals("")&&!descriiption.equals("")&&!requestObject.equals(" "))
            btnSave.setEnabled(true);

        else
            btnSave.setEnabled(false);
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
        jLabel7 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        cbbAssignedObject = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPatientNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblVictim = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblRequestObject = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jLabel1.setText("Hospital Admin Work Area");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 15, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Hello,");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 15, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 15, -1, -1));

        cbbAssignedObject.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cbbAssignedObject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbAssignedObjectItemStateChanged(evt);
            }
        });
        getContentPane().add(cbbAssignedObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 296, -1));

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Assign to");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Patient Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("# of Potentially infected");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Location");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Description");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Current Request Object");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel12.setText("*Click a row to view request log");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        lblPatientNumber.setText("--");
        getContentPane().add(lblPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        lblName.setText("--");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        lblDate.setText("--");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        lblVictim.setText("--");
        getContentPane().add(lblVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        lblLocation.setText("--");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, -1, -1));

        lblDescription.setText("--");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));

        lblRequestObject.setText("--");
        getContentPane().add(lblRequestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, -1, -1));

        jLabel13.setText("Request Log ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        lblId.setText("--");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();
        String assignedObject = cbbAssignedObject.getSelectedItem().toString();
        int a =JOptionPane.showConfirmDialog(null,"Do you want to assign this request to "+assignedObject+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            CommunityRequestDao.assignTo(id,assignedObject);
            setVisible(false);
            new CarAdminWorkArea(name).setVisible(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbbAssignedObjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbAssignedObjectItemStateChanged
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_cbbAssignedObjectItemStateChanged

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
        
        String name1 = lblUsername.getText();
        User user = UserDao.getDetailInfo(name1);
        String organization=user.getOrganization();
        
        ArrayList<User> driverList = UserDao.getAllAssociatedDoctor(organization);
        Iterator<User> itrDriver = driverList.iterator();
        while(itrDriver.hasNext()){
            User driverObj = itrDriver.next();
            cbbAssignedObject.addItem(driverObj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you want to exit this page ?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            this.dispose();
            Login in=new Login();
            in.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbAssignedObject;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
