/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static uber.Login.s;

/**
 *
 * @author NITJ
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
        initComponents();
        
        try {  
            
            Class.forName("com.mysql.jdbc.Driver");
           Connection obj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
            String query="SELECT * FROM `users` WHERE  UserId = '"+Login.userid+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){  
              
               b.setText(rs.getString("Wallet"));
               a.setText(RideDetails.amount);
               }
       } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error "+ex.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(385, 500));
        setMinimumSize(new java.awt.Dimension(385, 500));
        setPreferredSize(new java.awt.Dimension(385, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thanks for Riding with S.RIDE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 400, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount deducted is ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount left in wallet ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 220, 50);

        a.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(a);
        a.setBounds(220, 140, 170, 40);

        b.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b);
        b.setBounds(230, 200, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 410, 120, 40);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("One");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(20, 320, 60, 23);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Two");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(110, 320, 70, 23);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Three");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(220, 320, 70, 23);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Four");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(60, 370, 70, 23);

        jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Five");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(170, 370, 70, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rate your Ride");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 280, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uber/feedback.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, 0, 410, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            this.setVisible(false);
            new Home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

double y=Double.parseDouble(RideDetails.rat);
y=(9*y+1)/10;
try{
    Class.forName("com.mysql.jdbc.Driver");
           
    Connection obj=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
    if(Ride.mini==1)
    {
    String query="UPDATE `mini` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
    if(Ride.mini==0)
    {
    String query="UPDATE `xuv` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
}

        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }     
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
double y=Double.parseDouble(RideDetails.rat);
y=(9*y+2)/10;
try{
    Class.forName("com.mysql.jdbc.Driver");
           
    Connection obj=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
    if(Ride.mini==1)
    {
    String query="UPDATE `mini` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
    if(Ride.mini==0)
    {
    String query="UPDATE `xuv` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
}

        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }             // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        double y=Double.parseDouble(RideDetails.rat);
y=(9*y+3)/10;
try{
    Class.forName("com.mysql.jdbc.Driver");
           
    Connection obj=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
    if(Ride.mini==1)
    {
    String query="UPDATE `mini` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
    if(Ride.mini==0)
    {
    String query="UPDATE `xuv` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
            ps.executeUpdate();
            }
}

        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }     // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        double y=Double.parseDouble(RideDetails.rat);
y=(9*y+4)/10;
try{
    Class.forName("com.mysql.jdbc.Driver");
           
    Connection obj=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
    if(Ride.mini==1)
    {
    String query="UPDATE `mini` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
           ps.executeUpdate();
            }
    if(Ride.mini==0)
    {
    String query="UPDATE `xuv` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
           ps.executeUpdate(); 
    }
}

        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }             // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
double y=Double.parseDouble(RideDetails.rat);
y=(9*y+5)/10;
try{
    Class.forName("com.mysql.jdbc.Driver");
           
    Connection obj=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/uber", "root", "");
    if(Ride.mini==1)
    {
    String query="UPDATE `mini` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
           ps.executeUpdate();
            }
    if(Ride.mini==0)
    {
    String query="UPDATE `xuv` SET `Rating`=? WHERE CarNo= '"+Ride.carno+"'";
           PreparedStatement ps=(PreparedStatement) obj.prepareStatement(query);
           ps.setString(1,String.valueOf(y));
           ps.executeUpdate();
            }
}

        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error"+ex.getMessage());
       }             // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
}
