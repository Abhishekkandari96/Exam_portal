/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exam_portal;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author abhis
 */
public class controlHome extends javax.swing.JFrame {

    /**
     * Creates new form ControlHome
     */
    public controlHome() {
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

        panel1 = new java.awt.Panel();
        jTextField3 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        panel3 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        panel5 = new java.awt.Panel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Harlow Solid Italic", 3, 24)); // NOI18N
        jTextField3.setText("A.S.K School Of Higher Studies");
        jTextField3.setPreferredSize(new java.awt.Dimension(365, 39));
        panel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTextField38.setEditable(false);
        jTextField38.setText("NOTE->Do Not Schedule Two Exams On Same Day(see confirm toi see block after confirm)");
        panel1.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 500, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 724, 83));

        panel3.setBackground(new java.awt.Color(51, 51, 255));
        panel3.setForeground(new java.awt.Color(51, 51, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Schedule Exam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton2.setText("See Datesheet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-cancel-24.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/education back.jpg"))); // NOI18N
        panel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 130));

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 149, 428));

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("email : askschoolofhigherstudies@org.in");
        panel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Contact : +91-123456789");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 150, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-square-play-button-for-android-application-store-24.png"))); // NOI18N
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 56, 39));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-instagram-48.png"))); // NOI18N
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/Tech Back.jpg"))); // NOI18N
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 420));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-facebook-30.png"))); // NOI18N
        panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam_portal/icons8-twitter-48.png"))); // NOI18N
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 40));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 531, 724, 40));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField4.setText("Make Exam Schedule");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 93, -1, -1));

        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setEditable(false);
        jTextField5.setText("Physics");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 132, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("A.Physics");
        panel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, 132, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("Subject");
        panel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 0, 71, -1));

        jTextField8.setEditable(false);
        jTextField8.setText(" Date(dd/mm/yyyy)");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        panel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, -1));

        jTextField9.setEditable(false);
        jTextField9.setText("Confirm to see");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        panel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 0, 102, -1));

        jTextField10.setEditable(false);
        jTextField10.setText("Maths");
        panel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 132, -1));

        jTextField11.setEditable(false);
        jTextField11.setText("EM");
        panel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 132, -1));

        jTextField12.setEditable(false);
        jTextField12.setText("DBMS");
        panel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 132, -1));

        jTextField13.setEditable(false);
        jTextField13.setText("OS");
        panel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 153, 132, -1));

        jTextField14.setEditable(false);
        jTextField14.setText("A.Maths");
        panel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, 132, -1));

        jTextField15.setEditable(false);
        jTextField15.setText("A.EM");
        panel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 132, -1));

        jTextField16.setEditable(false);
        jTextField16.setText("A.DBMS");
        panel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 132, -1));

        jTextField17.setEditable(false);
        jTextField17.setText("A.OS");
        panel5.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 323, 132, -1));

        jTextField18.setEditable(false);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        panel5.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 141, -1));
        panel5.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 56, 140, -1));
        panel5.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 84, 140, -1));
        panel5.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 118, 140, -1));
        panel5.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 187, 140, -1));
        panel5.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 153, 140, -1));
        panel5.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 221, 140, -1));
        panel5.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 255, 140, -1));
        panel5.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 289, 140, -1));
        panel5.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 323, 140, -1));

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        panel5.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 28, 141, -1));

        jTextField29.setEditable(false);
        panel5.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 28, 141, -1));

        jTextField30.setEditable(false);
        panel5.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 56, 141, -1));

        jTextField31.setEditable(false);
        panel5.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 153, 141, -1));

        jTextField32.setEditable(false);
        panel5.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 187, 141, -1));

        jTextField33.setEditable(false);
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        panel5.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 124, 141, -1));

        jTextField34.setEditable(false);
        panel5.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 221, 141, -1));

        jTextField35.setEditable(false);
        panel5.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 323, 141, -1));

        jTextField36.setEditable(false);
        panel5.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 261, 141, -1));

        jTextField37.setEditable(false);
        panel5.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 289, 141, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 187, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Confirm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 124, -1, -1));

        getContentPane().add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 176, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setText("Technical Courses");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 143, -1, -1));

        jButton5.setText("NonTechnical Courses");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 143, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String physics=jTextField28.getText();
        String maths=jTextField19.getText();
        String em=jTextField20.getText();
        String dbms=jTextField21.getText();
        String os=jTextField23.getText();
        
        String aphysics=jTextField22.getText();
        String amaths=jTextField24.getText();
        String aem=jTextField25.getText();
        String adbms=jTextField26.getText();
        String aos=jTextField27.getText();
        if(physics.length()>0 && maths.length()>0 && em.length()>0 && dbms.length()>0 && os.length()>0 && aphysics.length()>0 && amaths.length()>0 && aos.length()>0 && aem.length()>0 && dbms.length()>0 ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","Abhik@123#");
                Statement st=con.createStatement();
               
                
                st.executeUpdate("update tech set date='" + maths + "' where subject='maths'"); 
                  st.executeUpdate("update tech set date=  '"+physics+"' where subject='physics'");
                 st.executeUpdate("update tech set date= '"+em+"' where subject='em'");
                 st.executeUpdate("update tech set date=  '"+dbms+"' where subject='dbms'");
                 st.executeUpdate("update tech set date= '"+os+"' where subject='os'");
                 
                 st.executeUpdate("update tech set  date=  '"+aphysics+"' where subject='advance_physics'");
                 st.executeUpdate("update tech set  date=  '"+amaths+"' where subject='advance_maths'");
                 st.executeUpdate("update tech set   date= '"+aem+"' where subject='advance_em'");
                 st.executeUpdate("update tech set  date=  '"+adbms+"' where subject='advance_dbms'");
                 st.executeUpdate("update tech set  date=  '"+aos+"' where subject='advance_os'");
                 
                    JOptionPane.showMessageDialog(null, "Updated");
                
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "any one or more of the field is empty");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new controlHomeNonTech().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new datesheetController().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(null, "Do not Skip Any exam Date and do not schedule Two exams on same day");
        String physics=jTextField28.getText();
        String maths=jTextField19.getText();
        String em=jTextField20.getText();
        String dbms=jTextField21.getText();
        String os=jTextField23.getText();
        
        String aphysics=jTextField22.getText();
        String amaths=jTextField24.getText();
        String aem=jTextField25.getText();
        String adbms=jTextField26.getText();
        String aos=jTextField27.getText();
        
        jTextField29.setText(physics);
        jTextField30.setText(maths);
        jTextField18.setText(em);
        jTextField33.setText(dbms);
        jTextField31.setText(os);
        jTextField32.setText(aphysics);
        jTextField34.setText(amaths);
        jTextField36.setText(aem);
        jTextField37.setText(adbms);
        jTextField35.setText(aos);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new examControllerHome().setVisible(true);
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
            java.util.logging.Logger.getLogger(controlHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables
}
