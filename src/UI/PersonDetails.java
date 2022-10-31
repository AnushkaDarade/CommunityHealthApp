/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person;
import model.PersonDirectory;
import javax.swing.JSplitPane;
import model.PatientDirectory;
import model.DoctorDirectory;

/**
 *
 * @author anushkadarade
 */
public class PersonDetails extends javax.swing.JPanel {

    /**
     * Creates new form PersonDetails
     */
    PersonDirectory personDirectory;
    private JSplitPane SplitPane;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    
    public PersonDetails(JSplitPane SplitPane, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.SplitPane = SplitPane;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePerson = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblResidence = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtResidence = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        txtCity = new javax.swing.JComboBox<>();
        txtCommunity = new javax.swing.JComboBox<>();

        titlePerson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titlePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePerson.setText("Person Details");
        titlePerson.setToolTipText("");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblResidence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResidence.setText("Residence:");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        txtCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Boston", "Salem", "Cambridge", "Quincy", "Brookline" }));

        txtCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Roxbury", "Huntington Ave", "Jamaica Plain", "Bolyston", "Park Drive" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResidence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImport))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE)
                                .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtResidence, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePerson)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResidence)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnView)
                    .addComponent(btnImport))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Name Feild is empty");
       }
       else if(txtAge.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Age Feild is empty");
       }
       else if(txtGender.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Gender Feild is empty");
       }
       else if(txtResidence.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Residence Feild is empty");
       }
       else if(txtCity.getSelectedItem().toString().equals(""))
       {
        JOptionPane.showMessageDialog(this, "City Feild is empty");
       }
       else if(txtCommunity.getSelectedItem().toString().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Community Feild is empty");
       }
       else if(!isInteger(txtAge.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(txtAge.getText())>200)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 200");
       }
       else if(!(txtGender.getText().equals("Male") || txtGender.getText().equals("Female") || txtGender.getText().equals("male") || txtGender.getText().equals("female")))
       {
        JOptionPane.showMessageDialog(this, "Gender Feild Invalid");
       }
       else
       {
        String Name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String Gender = txtGender.getText();
        String Residence = txtResidence.getText();
        String City = txtCity.getSelectedItem().toString();
        String Community = txtCommunity.getSelectedItem().toString();
        
        Person p = personDirectory.addNewPerson();
        p.setName(Name);
        p.setAge(age);
        p.setGender(Gender);
        p.setResidence(Residence);
        p.setCity(City);
        p.setCommunity(Community);
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
        txtName.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtResidence.setText("");
        txtCity.setSelectedIndex(-1);
        txtCommunity.setSelectedIndex(-1);
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewPerson viewPersonDetails = new ViewPerson(SplitPane,personDirectory,patientDirectory,doctorDirectory);
        SplitPane.setRightComponent(viewPersonDetails);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
   //         String path = "C:\\Users\\bhuva\\OneDrive\\Desktop\\Java Assignment 1 photos\\Car Datacsv.csv";
            String line = "";
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null) {
                    String [] values = line.split(",");   
                    String Name = String.valueOf(values[0]);
                    int Age = Integer.parseInt(String.valueOf(values[1]));
                    String Gender = String.valueOf(values[2]);
                    String Residence = String.valueOf(values[3]);
                    String City = String.valueOf(values[4]);
                    String Community = String.valueOf(values[5]);
                    Person pr = personDirectory.addNewPerson();
                    pr.setName(Name);
                    pr.setAge(Age);
                    pr.setGender(Gender);
                    pr.setResidence(Residence);
                    pr.setCity(City);
                    pr.setCommunity(Community);
                }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                }
        }
    }//GEN-LAST:event_btnImportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JLabel titlePerson;
    private javax.swing.JTextField txtAge;
    private javax.swing.JComboBox<String> txtCity;
    private javax.swing.JComboBox<String> txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration//GEN-END:variables
}
