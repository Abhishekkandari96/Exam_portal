/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exam_portal;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author abhis
 */
public class bbaResult extends javax.swing.JFrame {

    /**
     * Creates new form bbaResult
     */
    public bbaResult() {
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

        jPanel2 = new javax.swing.JPanel();
        addNewStudents1 = new javax.swing.JButton();
        insertnewresult1 = new javax.swing.JButton();
        registeredstudents1 = new javax.swing.JButton();
        allstudentsresult1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addNewStudents1.setText("Add New Student");
        addNewStudents1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudents1ActionPerformed(evt);
            }
        });
        jPanel2.add(addNewStudents1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 67, 131, -1));

        insertnewresult1.setBackground(new java.awt.Color(51, 255, 51));
        insertnewresult1.setText("Insert New Result");
        insertnewresult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertnewresult1ActionPerformed(evt);
            }
        });
        jPanel2.add(insertnewresult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 142, 131, -1));

        registeredstudents1.setText("Registered Student");
        registeredstudents1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredstudents1ActionPerformed(evt);
            }
        });
        jPanel2.add(registeredstudents1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 229, -1, -1));

        allstudentsresult1.setText("All Student Result");
        allstudentsresult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allstudentsresult1ActionPerformed(evt);
            }
        });
        jPanel2.add(allstudentsresult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 317, 131, -1));

        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 398, 131, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/education back.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 370));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 195, 445));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 167, 154, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 223, 154, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 277, 154, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 59, 90, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 329, 154, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Human Resource");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 108, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-save-24.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 369, 154, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Accounts");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 170, 90, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Econimics");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 229, 90, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bussiness");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 283, 90, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Soft Skills");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 335, 87, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 53, 154, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 102, 154, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setText("BBA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton3.setText("MBA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton4.setText("B.tech");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jButton7.setText("M.tech");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 500, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 500, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewStudents1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudents1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_addNewStudents1ActionPerformed

    private void insertnewresult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertnewresult1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new insertresult().setVisible(true);
    }//GEN-LAST:event_insertnewresult1ActionPerformed

    private void registeredstudents1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredstudents1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredstudents().setVisible(true);
    }//GEN-LAST:event_registeredstudents1ActionPerformed

    private void allstudentsresult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allstudentsresult1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allstudentsresult().setVisible(true);
    }//GEN-LAST:event_allstudentsresult1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rollno=jTextField1.getText();
        String humanresource=jTextField2.getText();
        String account=jTextField3.getText();
        String economics=jTextField4.getText();
        String bussiness=jTextField5.getText();
        String softskill=jTextField6.getText();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","Abhik@123#");
            Statement st=con.createStatement();
            // check for enter roll number present in database or not;
            ResultSet rs=st.executeQuery("select * from student where rollno='"+rollno+"'") ;                 //for checking if student present in student database, if yes we add result        // rs=store data from a sql , this is a class which store data from database
            // rs noramally points on null to chech we got anything in rs we have to check for next
            if(rs.next()){
                st.executeUpdate("insert into resultbb(rollno,humanresource,account,economics,bussiness,softskill) values('"+rollno+"','"+humanresource+"','"+account+"','"+economics+"','"+bussiness+"','"+softskill+"') ");
                JOptionPane.showMessageDialog(null, "Students result is saved ");
                int a=Integer.parseInt(humanresource);
                if(a<33){
                     st.executeUpdate("insert into back(rollno,course,subject) values('"+rollno+"','"+"BBA"+"','"+"humanresource"+"') ");
                }
                int b=Integer.parseInt(account);
                 if(b<33){
                     st.executeUpdate("insert into back(rollno,course,subject) values('"+rollno+"','"+"BBA"+"','"+"account"+"') ");
                }
                int c=Integer.parseInt(economics);
                 if(c<33){
                     st.executeUpdate("insert into back(rollno,course,subject) values('"+rollno+"','"+"BBA"+"','"+"economics"+"') ");
                }
                int d=Integer.parseInt(bussiness);
                 if(d<33){
                     st.executeUpdate("insert into back(rollno,course,subject) values('"+rollno+"','"+"BBA"+"','"+"bussiness"+"') ");
                }
                int e=Integer.parseInt(softskill);
                 if(e<33){
                     st.executeUpdate("insert into back(rollno,course,subject) values('"+rollno+"','"+"BBA"+"','"+"softskill"+"') ");
                }
                setVisible(false);
                new insertresult().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Student is Not Registered");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new mbaResult().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new insertresult().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new mtechResult().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(bbaResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bbaResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bbaResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bbaResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bbaResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudents1;
    private javax.swing.JButton allstudentsresult1;
    private javax.swing.JButton insertnewresult1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton registeredstudents1;
    // End of variables declaration//GEN-END:variables
}
