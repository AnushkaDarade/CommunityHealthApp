/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author anushkadarade
 */
public class Appointment extends javax.swing.JPanel {

    /**
     * Creates new form Appointment
     */
    public Appointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jcmb_hosp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jcmb_doc = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jcmb_hosp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston Hospital", "Mass General", "Tufts Medical Center", " ", " " }));
        Jcmb_hosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_hospActionPerformed(evt);
            }
        });
        add(Jcmb_hosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 76, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book an Appointment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 400, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Hospital:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 78, 70, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Doctor:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 119, 70, -1));

        add(Jcmb_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 117, 156, -1));

        btnSubmit.setText("Confirm");
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 178, 139, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Jcmb_hospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_hospActionPerformed
        // TODO add your handling code here:
        if(Jcmb_hosp.getSelectedItem().equals("Boston Hospital"))
        {
            Jcmb_doc.removeAllItems();
            Jcmb_doc.setSelectedItem(null);
            Jcmb_doc.addItem("Sam");
            Jcmb_doc.addItem("Ash");
            Jcmb_doc.addItem("Jacob");
        }else 
        if(Jcmb_hosp.getSelectedItem().equals("Mass General"))
        {
            Jcmb_doc.removeAllItems();
            Jcmb_doc.setSelectedItem(null);
            Jcmb_doc.addItem("Anushka");
            Jcmb_doc.addItem("Khushi");
        }else 
        if(Jcmb_hosp.getSelectedItem().equals("Tufts Medical Center"))
         {
            Jcmb_doc.removeAllItems();
            Jcmb_doc.setSelectedItem(null); 
            Jcmb_doc.addItem("Laura");
            Jcmb_doc.addItem("Liza");
            Jcmb_doc.addItem("Annie");
        }
    }//GEN-LAST:event_Jcmb_hospActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcmb_doc;
    private javax.swing.JComboBox<String> Jcmb_hosp;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}