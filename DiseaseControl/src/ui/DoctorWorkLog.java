/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger.Level;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author yanyanchen
 */
public class DoctorWorkLog extends javax.swing.JFrame {

    /**
     * Creates new form DoctorWorkLog
     */
    public DoctorWorkLog(String userName,String id,String request,String patientNumber,String date) {
        initComponents();
        txtPhotoPath2.setEditable(false);
        
        lblUsername.setText(userName);
        lblPatientNumber.setText(patientNumber);
        lblPatientNumber.setText(patientNumber);
        lblId.setText(id);
        lblRequest.setText(request);
        lblDate.setText(date);
        
        btnPrint.setEnabled(false);
    }
    
    public void validateFields(){
        String diagnose = txtDiagnose.getText();
        String photo=txtPhotoPath2.getText();
        
//        &&!date.equals("--")&&!patientNumber.equals("--")&&!victim.equals("--")&&!location.equals("--")&&!descriiption.equals("--")
        if(!diagnose.equals("")&&!photo.equals("")){
            btnPrint.setEnabled(true);
        }else{
            btnPrint.setEnabled(false);
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

        btnPrint = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVictim = new javax.swing.JLabel();
        lblRequest = new javax.swing.JLabel();
        txtDiagnose = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPatientNumber = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPhotoPath2 = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnPrint.setText("Print Work Log");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Please add work result");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("# of Potentially infected:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Request Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lblVictim.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblVictim.setText("--");
        getContentPane().add(lblVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        lblRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRequest.setText("--");
        getContentPane().add(lblRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        txtDiagnose.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnoseActionPerformed(evt);
            }
        });
        txtDiagnose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiagnoseKeyReleased(evt);
            }
        });
        getContentPane().add(txtDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 252, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lblDate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDate.setText("--");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Patient Number:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblPatientNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPatientNumber.setText("--");
        getContentPane().add(lblPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Request Log ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblId.setText("--");
        lblId.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblIdPropertyChange(evt);
            }
        });
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("Work Photo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        txtPhotoPath2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        txtPhotoPath2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhotoPath2KeyReleased(evt);
            }
        });
        getContentPane().add(txtPhotoPath2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 230, -1));

        btnBrowse.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        lblPic.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblPic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 400, 350));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Doctor Work Log");
        jPanel1.add(jLabel1);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel9.setText("Hello,");
        jPanel1.add(jLabel9);

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblUsername.setText("--");
        jPanel1.add(lblUsername);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String path = "/Users/yanyanchen/Desktop/";
        String userName=lblUsername.getText();
        String id=lblId.getText();
        String request=lblRequest.getText();
        String patientNumber=lblPatientNumber.getText();
        String date=lblDate.getText();
        //        userName,id,request,patientNumber,date
        String diagnose=txtDiagnose.getText();

        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+userName+"WorkLog"+".pdf"));
            doc.open();
            Paragraph fileName=new Paragraph("                                                 Disease Control System");
            doc.add(fileName);
            Paragraph stringLine=new Paragraph("*********************************************************************************************************************");
            doc.add(stringLine);
            Paragraph paragraph = new Paragraph("\tRequest ID: "+id+"\nDate: "+date);
            doc.add(paragraph);
            Paragraph paragraph1 = new Paragraph("\nRequest Name: "+request+"\nDoctor Name:"+userName);
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("\nPatient Number: "+patientNumber+"\nDiagnose: "+diagnose);
            doc.add(paragraph2);

            String path1="";
            path1=txtPhotoPath2.getText();

            Image image1 = Image.getInstance(path1);
            image1.setAbsolutePosition(325f, 575f);
            image1.scaleAbsolute(200, 200);
            doc.add(image1);

            doc.add(stringLine);

            Paragraph thankMsg = new Paragraph("Thank you for your hard work!");
            doc.add(thankMsg);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(HotelWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        doc.close();
        setVisible(false);

        new DoctorWorkArea(userName).setVisible(true);
        //        new DoctorWorkLog(userName,id,request,String patientNumber,String date).setVisible(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnoseActionPerformed

    private void txtDiagnoseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnoseKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtDiagnoseKeyReleased

    private void lblIdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblIdPropertyChange
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_lblIdPropertyChange

    private void txtPhotoPath2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhotoPath2KeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPhotoPath2KeyReleased

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);
        if(load == fileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            String path3 = f.getAbsolutePath();
            txtPhotoPath2.setText(path3);
            ImageIcon ii =new ImageIcon(path3);
            java.awt.Image img =ii.getImage().getScaledInstance(400, 400,java.awt.Image.SCALE_SMOOTH);
            lblPic.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

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
//            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoctorWorkLog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPatientNumber;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblRequest;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVictim;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtPhotoPath2;
    // End of variables declaration//GEN-END:variables
}
