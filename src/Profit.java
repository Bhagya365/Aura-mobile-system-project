
import java.awt.Image;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIYUMI PC
 */
public class Profit extends javax.swing.JFrame {

    /**
     * Creates new form Add_Component
     */
    public Profit() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = new Date();
        jLabel10.setText(sdf.format(d));

        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);

        try {
            ResultSet rs = DBC.search("SELECT * FROM profit");
            while (rs.next()) {                
                String id = rs.getString("id");
                String time = rs.getString("time");
                String profit = rs.getString("profit");
                Vector v = new Vector();
                v.add(id);
                v.add(time);
                v.add(profit);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0000/00/00");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, 140, 36));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/search.png"))); // NOI18N
        jLabel1.setText("DATE SEARCH");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 101, 217, 36));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 102, 639, 36));

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/add.png"))); // NOI18N
        jButton1.setText("ADD PROFIT REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 324, 382, -1));

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Time Range", "Profit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Time Range");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Profit");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 423, 926, 248));

        jButton9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/undo.png"))); // NOI18N
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 680, 153, 36));

        jButton10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/print.png"))); // NOI18N
        jButton10.setText("PRINT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, 153, 36));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/search.png"))); // NOI18N
        jLabel2.setText("TIME RANGE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 274, 217, 36));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 275, 639, 36));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INCOME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 145, 217, 36));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 145, 639, 36));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COST");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 188, 217, 36));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 188, 639, 36));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROFIT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 231, 217, 36));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 231, 639, 36));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DATE SEARCH");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 379, 217, 36));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 380, 654, 36));

        jTable3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cost"
            }
        ));
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setOpaque(false);
        jTable3.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 324, 111, 49));

        jTable2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "income"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setOpaque(false);
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 329, 97, 41));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/profits.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 72)); // NOI18N
        jLabel13.setText("Profit");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 926, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/123456.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //back
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        //search
        String n = jTextField1.getText();
        try {
            ResultSet rs = DBC.search("SELECT `income` FROM income WHERE `date` ='"+n+"' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            jLabel4.setText(" ");
            jLabel6.setText(" ");
            jLabel8.setText(" ");
            while (rs.next()) {                            
            String i = rs.getString("income");
            dtm.insertRow(dtm.getRowCount(), new Object[]{i});
            }
        } catch (Exception e) {
        }
        String n1 = jTextField1.getText();
        try {
            ResultSet rs = DBC.search("SELECT `cost` FROM cost WHERE `date` ='"+n1+"' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
            dtm.setRowCount(0);
            jLabel4.setText(" ");
            jLabel6.setText(" ");
            jLabel8.setText(" ");
            while (rs.next()) {                            
            String i = rs.getString("cost");
            dtm.insertRow(dtm.getRowCount(), new Object[]{i});
            }
        } catch (Exception e) {
        }
        int sum = 0;
        for (int i = 0; i < jTable2.getRowCount(); i++) {
           sum = sum + Integer.parseInt((jTable2.getValueAt(i, 0).toString()));                //total income
        }
        String inc = String.valueOf(sum);
        jLabel4.setText(inc);
        
        int sum1 = 0;
        for (int i = 0; i < jTable3.getRowCount(); i++) {
           sum1 = sum1 + Integer.parseInt((jTable3.getValueAt(i, 0).toString()));                //total cost
        }
        String cos = String.valueOf(sum1);
        jLabel6.setText(cos);
        
        double pro = Double.parseDouble(inc) - Double.parseDouble(cos);
        jLabel8.setText(String.valueOf(pro));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //profit report
        try {
            String inc = jLabel4.getText();
            String cos = jLabel6.getText();
            String pro = jLabel8.getText();
            String time = jTextField2.getText();
            DBC.iud("INSERT INTO profit (`income`,`cost`,`profit`,`time`) VALUES ('"+inc+"','"+cos+"','"+pro+"','"+time+"')");
            JOptionPane.showMessageDialog(this, "Profit Report Added Successfully!", "DONE!",JOptionPane.INFORMATION_MESSAGE);
            new Profit().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // search
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        String text =jTextField3.getText();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel> (dtm);                     //okkom rows awith thiyeddi oni eka pera gnnwa
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(text));
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        // print button
        MessageFormat header = new MessageFormat("Search Result Overview of Profit Report");
        MessageFormat footer = new MessageFormat("Piyumi Bhagya print,Thank You!");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Component.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Component.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Component.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Component.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
