/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorDirectory;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author anushkadarade
 */
public class SystemView extends javax.swing.JPanel {

    /**
     * Creates new form SystemView
     */
    PatientDirectory patientDirectory;
    private JSplitPane SplitPane;
    PersonDirectory personDirectory;
    public SystemView(JSplitPane SplitPane,PatientDirectory patientDirectory, PersonDirectory personDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.SplitPane = SplitPane;
        this.personDirectory = personDirectory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPatients = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnDeleteVital = new javax.swing.JButton();
        btnAddVitals = new javax.swing.JButton();
        btnEditVital = new javax.swing.JButton();
        btnViewVitals = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblViewPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Residence", "City", "Community", "Patient ID"
            }
        ));
        jScrollPane1.setViewportView(tblViewPatients);

        btnDelete.setText("Delete Patient");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Patient");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Doctor ID", "Age", "Gender"
            }
        ));
        jScrollPane2.setViewportView(tblDoctor);

        btnDeleteVital.setText("Delete Doctor");
        btnDeleteVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVitalActionPerformed(evt);
            }
        });

        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        btnEditVital.setText("Edit Vitals");
        btnEditVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditVitalActionPerformed(evt);
            }
        });

        btnViewVitals.setText("View Vitals");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewVitals)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddVitals)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditVital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteVital))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo)
                            .addComponent(btnRefresh)
                            .addComponent(btnBack)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit)
                            .addComponent(btnAddVitals)
                            .addComponent(btnViewVitals))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteVital)
                    .addComponent(btnEditVital))
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Patient to delete it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        patientDirectory.deletePatient(selectedPatient);

        JOptionPane.showMessageDialog(this, "Selected Patient was deleted.");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        EditPatient editPatient = new EditPatient(SplitPane,patientDirectory,personDirectory,selectedPatient.getPatientID());
        SplitPane.setRightComponent(editPatient);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        String SearchString = txtSearch.getText();
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        model.setRowCount(0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getName());
            if(p.getName().equals(SearchString))
            {
                Object[] row = new Object[7];
                row[0]=p;
                row[1]=p.getAge();
                row[2]=p.getGender();
                row[3]=p.getResidence();
                row[4]=p.getCity();
                row[5]=p.getCommunity();
                row[6]=p.getPatientID();

                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVitalActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a doctor to delete it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            if(p.getPatientID()==selectedPatient.getPatientID())
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    if(e.getBloodPressure() == (int) model.getValueAt(selectedRowIndex, 3) && e.getPulse() == (int) model.getValueAt(selectedRowIndex, 2) && e.getTemperature() == (int) model.getValueAt(selectedRowIndex, 4) && e.getUpdateTime().equals((String) model.getValueAt(selectedRowIndex, 5)))
                    {
                        p.getEH().deleteEncounter(e);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(this, "Selected Vital Signs was deleted.");
        model.setRowCount(0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            if(p.getPatientID()==selectedPatient.getPatientID())
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    row[0]=p;
                    row[1]=p.getPatientID();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteVitalActionPerformed

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblViewPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to add Vital Sign.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        int PatientID = selectedPatient.getPatientID();

        AddVitalSigns addVitalSigns = new AddVitalSigns(SplitPane,patientDirectory,personDirectory,PatientID);
        SplitPane.setRightComponent(addVitalSigns);
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnEditVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditVitalActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        int patientSelectedIndex = tblViewPatients.getSelectedRow();
        Patient selectedPatient = (Patient) model.getValueAt(patientSelectedIndex, 0);

        EditVitals editVitals = new EditVitals(SplitPane,patientDirectory,personDirectory,selectedPatient,selectedRowIndex);
        SplitPane.setRightComponent(editVitals);
    }//GEN-LAST:event_btnEditVitalActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPatients.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a patient to view Vital Signs.");
            return;
        }

        DefaultTableModel modelpat = (DefaultTableModel) tblViewPatients.getModel();
        Patient selectedPatient = (Patient) modelpat.getValueAt(selectedRowIndex, 0);
        int PatientID = selectedPatient.getPatientID();

        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            if(p.getPatientID()==PatientID)
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEH().getEncounterHistory())
                {
                    row[0]=p;
                    row[1]=p.getPatientID();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_btnViewVitalsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PatientDetails addPatientDetails = new PatientDetails(SplitPane,patientDirectory,personDirectory,-1);
        SplitPane.setRightComponent(addPatientDetails);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteVital;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditVital;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblViewPatients;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        model.setRowCount(0);
        
        DefaultTableModel modelvital = (DefaultTableModel) tblDoctor.getModel();
        modelvital.setRowCount(0);
         
         for(Patient p: patientDirectory.getPatientDirectory())
         {
             Object[] row = new Object[7];
             row[0]=p;
             row[1]=p.getAge();
             row[2]=p.getGender();
             row[3]=p.getResidence();
             row[4]=p.getCity();
             row[5]=p.getCommunity();
             row[6]=p.getPatientID();
             
             model.addRow(row);
         }
    }

}
