/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.UserDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

/**
 *
 * @author yanyanchen
 */
public class ManageUser extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern="^[0-9]*$"; 
    /**
     * Creates new form ManageUser
     */
    public ManageUser(String name) {
        initComponents();
        lblUsername.setText(name);
    }
    
    public void getAllRecords(String name){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<User> list = UserDao.getAllRecords(name);
        Iterator<User> itr = list.iterator();
        while(itr.hasNext()){
            User userObj = itr.next();
            if(!userObj.getEmail().equals("admin@gmail.com")){
                dtm.addRow(new Object[]{userObj.getId(),userObj.getName(),userObj.getEmail(),userObj.getCity(),userObj.getOrganization(),userObj.getRole(),userObj.getMobileNumber(),userObj.getStatus()});        }
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Verify User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "City", "Organization", "Role", "Mobile Number", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 169, 1151, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Search By Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 110, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 107, 356, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("*Click to Change the User Status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 639, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Hello,");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = lblUsername.getText();
        this.dispose();
        SystemAdminPage in=new SystemAdminPage(name);
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String userName = lblUsername.getText();
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String name = model.getValueAt(index,1).toString();
        String status = model.getValueAt(index,7).toString();
        if(status.equals("true")){
            status="false";
        }else{
            status="true";
        }
        int a =JOptionPane.showConfirmDialog(null,"Do you want to change status of "+name+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            UserDao.changeStatus(name,status);
            setVisible(false);
            new ManageUser(userName).setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String name=txtName.getText();
        getAllRecords(name);
    }//GEN-LAST:event_txtNameKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        getAllRecords("");
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
