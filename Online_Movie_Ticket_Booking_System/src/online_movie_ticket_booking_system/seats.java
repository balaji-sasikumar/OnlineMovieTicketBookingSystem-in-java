/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_movie_ticket_booking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static online_movie_ticket_booking_system.Display.bt;

/**
 *
 * @author taskmaster2502
 */
public class seats extends javax.swing.JFrame {

    float bill;
    String selected;

    /**
     * Creates new form seats
     */
    //following variables are obtained from Book Ticket bt class
    static String SQL;
    public seats(String M,String Th,String Ti,String D) throws ClassNotFoundException, SQLException {
        initComponents();
        Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssn","root","");
        Statement stmt = con.createStatement();
        JOptionPane.showMessageDialog(this,M);
        JOptionPane.showMessageDialog(this,Th);
        JOptionPane.showMessageDialog(this,Ti);
        JOptionPane.showMessageDialog(this,D);
        String sql = "select * from booking where movie_id="+M+" and theatre_id="+Th+" and time='"+Ti+"' and date_of_booking='"+D+"'";
        SQL = "insert into booking values("+M+","+Th+",'"+Ti+"','"+D+"'";
        ResultSet rs = stmt.executeQuery(sql);
        String seate;
        String[] seating = null;
        int j = 0;
        List<String> Seat = new ArrayList<String>();
        while(rs.next()){
            seate=rs.getString("seats");
            seating = seate.split(",");
        int i = 0;
        for(i=0;i<seating.length;i++){
            Seat.add(seating[i]);
        }
        }
        for(j=0;j<Seat.size();j++){
        if(Objects.equals(Seat.get(j), "a1"))
        {
            a1.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "a2"))
        {
            a2.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "a3"))
        {
            a3.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "a4"))
        {
            a4.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "b1"))
        {
            b1.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "b2"))
        {
            b2.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "b3"))
        {
            b3.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "b4"))
        {
           b4.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "c1"))
        {
            c1.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "c2"))
        {
            c2.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "c3"))
        {
            c3.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "c4"))
        {
            c4.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "d1"))
        {
            d1.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "d2"))
        {
            d2.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "d3"))
        {
           d3.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "d4"))
        {
            d4.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "e1"))
        {
            e1.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "e2"))
        {
            e2.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "e3"))
        {
            e3.setEnabled(false);
        }
        if(Objects.equals(Seat.get(j), "e4"))
        {
            e4.setEnabled(false);
        }
                  
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

        jLabel1 = new javax.swing.JLabel();
        a1 = new javax.swing.JToggleButton();
        a2 = new javax.swing.JToggleButton();
        a3 = new javax.swing.JToggleButton();
        a4 = new javax.swing.JToggleButton();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        c1 = new javax.swing.JToggleButton();
        c2 = new javax.swing.JToggleButton();
        c3 = new javax.swing.JToggleButton();
        c4 = new javax.swing.JToggleButton();
        d1 = new javax.swing.JToggleButton();
        d2 = new javax.swing.JToggleButton();
        d3 = new javax.swing.JToggleButton();
        d4 = new javax.swing.JToggleButton();
        e1 = new javax.swing.JToggleButton();
        e2 = new javax.swing.JToggleButton();
        e3 = new javax.swing.JToggleButton();
        e4 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setAlignmentX(0.5F);

        a1.setText("A1");

        a2.setText("A2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setText("A3");

        a4.setText("A4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        b1.setText("B1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("B5");

        b3.setText("B3");

        b4.setText("B4");

        c1.setText("C1");

        c2.setText("C2");

        c3.setText("C3");

        c4.setText("C4");

        d1.setText("D1");

        d2.setText("D2");

        d3.setText("D3");

        d4.setText("D4");

        e1.setText("E1");

        e2.setText("E2");

        e3.setText("E3");

        e4.setText("E4");

        jLabel2.setText("                                                 Screen Here");

        jButton1.setText("Book Selected seats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(e1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(e3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(d4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(c4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(e4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2)
                    .addComponent(c3)
                    .addComponent(c4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1)
                    .addComponent(d2)
                    .addComponent(d3)
                    .addComponent(d4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e1)
                    .addComponent(e2)
                    .addComponent(e3)
                    .addComponent(e4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        selected = null;
        bill = 0;
        if(a1.isSelected()){
            if(selected!=null)
                selected+=",a1";
            else
                selected="a1";
            bill+=250;}
        if(a2.isSelected()){
            if(selected!=null)
                selected+=",a2";
            else
                selected="a2";
            bill+=250;}
        if(a3.isSelected()){
            if(selected!=null)
                selected+=",a3";
            else
                selected="a3";
            bill+=250;}
        if(a4.isSelected()){
            if(selected!=null)
                selected+=",a4";
            else
                selected="a4";
            bill+=250;}
        if(b1.isSelected()){
            if(selected!=null)
                selected+=",b1";
            else
                selected="b1";
            bill+=200;}
        if(b2.isSelected()){
            if(selected!=null)
                selected+=",b2";
            else
                selected="b2";
            bill+=200;}
        if(b3.isSelected()){
            if(selected!=null)
                selected+=",b3";
            else
                selected="b3";
            bill+=200;}
        if(b4.isSelected()){
            if(selected!=null)
                selected+=",b4";
            else
                selected="b4";
            bill+=200;}
        if(c1.isSelected()){
            if(selected!=null)
                selected+=",c1";
            else
                selected="c1";
            bill+=150;}
        if(c2.isSelected()){
            if(selected!=null)
                selected+=",c2";
            else
                selected="c2";
            bill+=150;}
        if(c3.isSelected()){
            if(selected!=null)
                selected+=",c3";
            else
                selected="c3";
            bill+=150;}
        if(c4.isSelected()){
            if(selected!=null)
                selected+=",c4";
            else
                selected="c4";
            bill+=150;}
        if(d1.isSelected()){
            if(selected!=null)
                selected+=",d1";
            else
                selected="d1";
            bill+=150;}
        if(d2.isSelected()){
            if(selected!=null)
                selected+=",d2";
            else
                selected="d2";
            bill+=150;}
        if(d3.isSelected()){
            if(selected!=null)
                selected+=",d3";
            else
                selected="d3";
            bill+=150;}
        if(d4.isSelected()){
            if(selected!=null)
                selected+=",d4";
            else
                selected="d4";
            bill+=150;}
        if(e1.isSelected()){
            if(selected!=null)
                selected+=",e1";
            else
                selected="e1";
            bill+=100;}
        if(e2.isSelected()){
            if(selected!=null)
                selected+=",e2";
            else
                selected="e2";
            bill+=100;}
        if(e3.isSelected()){
            if(selected!=null)
                selected+=",e3";
            else
                selected="e3";
            bill+=100;}
        if(e4.isSelected()){
            if(selected!=null)
                selected+=",e4";
            else
                selected="e4";
            bill+=100;}
        SQL += ",'"+selected+"')";
        Payment pt = new Payment(bill,selected,SQL);
        pt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new seats(bt.Movie_id,bt.Theatre_id,bt.Time,bt.Date).setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(seats.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(seats.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton a1;
    private javax.swing.JToggleButton a2;
    private javax.swing.JToggleButton a3;
    private javax.swing.JToggleButton a4;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton c1;
    private javax.swing.JToggleButton c2;
    private javax.swing.JToggleButton c3;
    private javax.swing.JToggleButton c4;
    private javax.swing.JToggleButton d1;
    private javax.swing.JToggleButton d2;
    private javax.swing.JToggleButton d3;
    private javax.swing.JToggleButton d4;
    private javax.swing.JToggleButton e1;
    private javax.swing.JToggleButton e2;
    private javax.swing.JToggleButton e3;
    private javax.swing.JToggleButton e4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
