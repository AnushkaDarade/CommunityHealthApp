/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JSplitPane;
import model.DoctorDirectory;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author anushkadarade
 */
public class SystemAdmin extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdmin
     */
    private JSplitPane SplitPane;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    
    public SystemAdmin(JSplitPane SplitPane,PatientDirectory patientDirectory,PersonDirectory personDirectory,DoctorDirectory doctorDirectory) {
        initComponents();
        this.SplitPane = SplitPane;
        this.patientDirectory=patientDirectory;
        this.personDirectory=personDirectory;
        this.doctorDirectory=doctorDirectory;
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
        btnPerson = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Admin");

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnHospital.setText("Hospital");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnCommunity.setText("Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(btnPerson)
                .addGap(18, 18, 18)
                .addComponent(btnHospital)
                .addGap(18, 18, 18)
                .addComponent(btnCommunity)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        ViewPerson viewP= new ViewPerson(SplitPane,personDirectory,patientDirectory,doctorDirectory);
        SplitPane.setRightComponent(viewP);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        SystemView viewPatientDetails = new SystemView(SplitPane,patientDirectory,personDirectory,doctorDirectory);
        SplitPane.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        CommunitySearch communitySearch = new CommunitySearch(SplitPane,patientDirectory,personDirectory);
        SplitPane.setRightComponent(communitySearch); 
    }//GEN-LAST:event_btnCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPerson;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}