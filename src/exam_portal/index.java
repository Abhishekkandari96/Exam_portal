/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exam_portal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abhis
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
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

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addNewStudents = new javax.swing.JButton();
        insertnewresult = new javax.swing.JButton();
        registeredstudents = new javax.swing.JButton();
        allstudentsresult = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addNewStudents.setBackground(new java.awt.Color(102, 255, 102));
        addNewStudents.setText("Add New Student");
        addNewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(addNewStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 67, 131, -1));

        insertnewresult.setText("Insert New Result");
        insertnewresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertnewresultActionPerformed(evt);
            }
        });
        jPanel1.add(insertnewresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 142, 131, -1));

        registeredstudents.setText("Registered Student");
        registeredstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredstudentsActionPerformed(evt);
            }
        });
        jPanel1.add(registeredstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 229, -1, -1));

        allstudentsresult.setText("All Student Result");
        allstudentsresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allstudentsresultActionPerformed(evt);
            }
        });
        jPanel1.add(allstudentsresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 317, 131, -1));

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 398, 131, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/education back.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 59, 101, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Branch");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 115, 101, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Roll No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 169, 101, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 224, 101, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 288, 101, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 342, 101, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", "MTech", "BBA", "MBA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 53, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "ECE", "EEE", "Marketting", "Human Resource" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 109, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 163, 71, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 218, 71, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 282, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 336, 71, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-user-64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 129, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 14, 37, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 480, 360));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 480, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registeredstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredstudentsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new registeredstudents().setVisible(true);
    }//GEN-LAST:event_registeredstudentsActionPerformed

    private void addNewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_addNewStudentsActionPerformed

    private void insertnewresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertnewresultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new insertresult().setVisible(true);
        
    }//GEN-LAST:event_insertnewresultActionPerformed

    private void allstudentsresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allstudentsresultActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new allstudentsresult().setVisible(true);
    }//GEN-LAST:event_allstudentsresultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String course=(String)jComboBox1.getSelectedItem();
        String branch=(String)jComboBox2.getSelectedItem();
        String rollno=jTextField1.getText();
        String name=jTextField2.getText();
        String gender=(String)jComboBox3.getSelectedItem();
        String fathername=jTextField3.getText();
        
        //sql start
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");// calling the class
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","Abhik@123#");// creating connection with srm database
        
        Statement st=con.createStatement();
        st.executeUpdate("insert into student(rollno,course,branch,name,gender,fathername) values('"+rollno+"','"+course+"','"+branch+"','"+name+"','"+gender+"','"+fathername+"')");
        JOptionPane.showMessageDialog(null, "Updated SuccessFully");
        this.setVisible(false);
        new index().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudents;
    private javax.swing.JButton allstudentsresult;
    private javax.swing.JButton insertnewresult;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton registeredstudents;
    // End of variables declaration//GEN-END:variables
}
