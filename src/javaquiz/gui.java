/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * gui.java
 *
 * Created on Jul 9, 2016, 11:13:11 AM
 */
package javaquiz;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;



/**
 *
 * @author Ideapad
 */
public class gui extends javax.swing.JFrame {
     int count=1;
  String ans="none";
  int marks=0;
   String rightanswer="";
 


    /** Creates new form gui */
    public gui() {
        initComponents();
           submit.setVisible(false);
        click.setVisible(false);
         status.setVisible(false);
        try
        {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");

PreparedStatement pstmt=con.prepareStatement("select * from Gui where qno=?");
pstmt.setInt(1,count);
ResultSet correct=pstmt.executeQuery();
if(correct.next())
{
    qno.setText(Integer.toString(count));
   question.setText(correct.getString(2));
   r1.setText(correct.getString(3));
      r2.setText(correct.getString(4));
         r3.setText(correct.getString(5));
            r4.setText(correct.getString(6));
            rightanswer=correct.getString(7);
        
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mygroup = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        qno = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        status = new javax.swing.JButton();
        click = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 150, 200, 200));
        setMinimumSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36));
        jLabel4.setText("      Applets,GUI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 40);

        jPanel1.setOpaque(false);

        jButton1.setText("Clear Response");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        qno.setText("jLabel2");

        question.setText("jLabel3");

        mygroup.add(r1);
        r1.setText("jRadioButton1");
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });

        mygroup.add(r2);
        r2.setText("jRadioButton2");
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });

        mygroup.add(r3);
        r3.setText("jRadioButton3");
        r3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r3MouseClicked(evt);
            }
        });
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        mygroup.add(r4);
        r4.setText("jRadioButton4");
        r4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r4MouseClicked(evt);
            }
        });
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3)
                    .addComponent(r2)
                    .addComponent(r1)
                    .addComponent(r4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(qno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r1)
                .addGap(18, 18, 18)
                .addComponent(r2)
                .addGap(18, 18, 18)
                .addComponent(r3)
                .addGap(22, 22, 22)
                .addComponent(r4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 380, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaquiz/quiz/quiz2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 400, 240);

        submit.setText("jButton3");
        getContentPane().add(submit);
        submit.setBounds(50, 90, 280, 80);

        status.setText("jButton4");
        getContentPane().add(status);
        status.setBounds(30, 190, 330, 30);

        click.setText("jButton3");
        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });
        getContentPane().add(click);
        click.setBounds(30, 233, 330, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_r3ActionPerformed

private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_r4ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    mygroup.clearSelection();
    count++;
    if(ans.equals(rightanswer))
{
    marks++;
    JOptionPane.showMessageDialog(null, "Right Answer");
}
     else
    {
        JOptionPane.showMessageDialog(null,"Wrong Answer");
    }
   
    mygroup.clearSelection();
    if(count==11)
    {
   JOptionPane.showMessageDialog(null,"You viewed all the questions"); 
   submit.setText("Marks of quiz = "+marks);
   
   jPanel1.setVisible(false);
   jLabel1.setVisible(false);
   
     submit.setVisible(true);
        click.setVisible(true);
         status.setVisible(true);
    if(marks>=5)
   {
      status.setText("Congrats! You Unlocked The Next Quiz"); 
      click.setText("Click Here To View Next Quiz");
   }
   else
   {
       status.setText("Try Again To Unlock Next Quiz");
        click.setText("Click Here to Give Quiz Again"); 
   }

    }
    
    else
    {
    try
        {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");

PreparedStatement pstmt=con.prepareStatement("select * from Gui where qno=?");
pstmt.setInt(1,count);
ResultSet correct=pstmt.executeQuery();
if(correct.next())
{
    qno.setText(Integer.toString(count));
   question.setText(correct.getString(2));
   r1.setText(correct.getString(3));
      r2.setText(correct.getString(4));
         r3.setText(correct.getString(5));
            r4.setText(correct.getString(6));
    rightanswer=correct.getString(7);

        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 mygroup.clearSelection();// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
if(r1.isSelected())
{
    ans=r1.getText();
    
}// TODO add your handling code here:
}//GEN-LAST:event_r1MouseClicked

private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
if(r2.isSelected())
{
    ans=r2.getText();
    
}
// TODO add your handling code here:
}//GEN-LAST:event_r2MouseClicked

private void r3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r3MouseClicked
if(r3.isSelected())
{
    ans=r3.getText();
    
}
// TODO add your handling code here:
}//GEN-LAST:event_r3MouseClicked

private void r4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r4MouseClicked
if(r4.isSelected())
{
    ans=r4.getText();
    
}
// TODO add your handling code here:
}//GEN-LAST:event_r4MouseClicked

private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
// TODO add your handling code here:
      this.dispose();
    new topic(marks,7,7).setVisible(true);
}//GEN-LAST:event_clickActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton click;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup mygroup;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel question;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JButton status;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
