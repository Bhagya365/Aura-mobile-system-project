
import java.awt.Image;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIYUMI PC
 */
public class Add_Purchase extends javax.swing.JFrame {

    /**
     * Creates new form Add_Purchase
     */
    public Add_Purchase() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = new Date();
        jLabel4.setText(sdf.format(d));
        
        cbLoadData("distributor","name",jComboBox1);
        cbLoadData("brand","name",jComboBox2);                                  //combobox loading       
        cbLoadData("model","name",jComboBox3);
        
        AutoCompleteDecorator.decorate(jComboBox1);                               // combo box wala data filter wela ena eka
        AutoCompleteDecorator.decorate(jComboBox2);
        AutoCompleteDecorator.decorate(jComboBox3);
        
        try {
            ResultSet rs = DBC.search("SELECT `id` FROM purchase ORDER BY `id` DESC");                    //bill id auto genarate
            if (rs.next()) {
                String id = rs.getString("id");
                int id1 = Integer.parseInt(id) +1;               
                jLabel2.setText(String.valueOf(id1));
            } else {
                jLabel2.setText("1");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("PURCHASE ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 152, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 95, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BILL NO.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 198, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DISTRIBUTOR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 202, 26));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BRAND");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 202, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MODEL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 202, 26));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ITEM CODE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 202, 26));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QTY.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 202, 26));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SELL PRICE");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 202, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 202, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("TOTAL BILL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 202, 26));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 448, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("0");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 448, 26));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 448, 26));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 448, -1));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 448, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setMinimumSize(new java.awt.Dimension(64, 24));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 448, 26));

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox2.setMinimumSize(new java.awt.Dimension(64, 24));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 448, 26));

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox3.setMinimumSize(new java.awt.Dimension(64, 24));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 448, 26));

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/add.png"))); // NOI18N
        jButton1.setText("ADD PURCHASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 617, 270, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Billing/add.png"))); // NOI18N
        jButton2.setText("ADD BILL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 617, 209, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("BUY PRICE");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 202, 26));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 448, -1));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 355, -1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 680, 126, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 72)); // NOI18N
        jLabel10.setText("Add Purchase");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 102, 926, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("0000/00/00");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, -1, -1));

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

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        int qty = Integer.parseInt(jTextField2.getText());                                        //qty * bp
        int bp = Integer.parseInt(jTextField6.getText());
        int answer = qty * bp;
        jLabel18.setText(String.valueOf(answer));
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:   
        //add purchase
        try {
            String date = jLabel4.getText();
            String  bill = jTextField5.getText();
            String dis = jComboBox1.getSelectedItem().toString();
            String brand = jComboBox2.getSelectedItem().toString();
            String model = jComboBox3.getSelectedItem().toString();
            String code = jTextField1.getText();
            String qty = jTextField2.getText();
            String buy = jTextField6.getText();
            String sell = jTextField3.getText();
            String total = jLabel18.getText();
            DBC.iud("INSERT INTO purchase (`date`,`bill`,`distributor`,`brand`,`model`,`code`,`qty`,`buy`,`sell`,`total`) VALUES ('"+date+"','"+bill+"','"+dis+"','"+brand+"','"+model+"','"+code+"','"+qty+"','"+buy+"','"+sell+"','"+total+"') ");
            
            ResultSet rs = DBC.search("SELECT * FROM inventory WHERE `item` = '"+model+"'");                                         
            if (rs.next()) {
                String id = rs.getString("id");
                int qty1 = Integer.parseInt(rs.getString("qty"));
                int qty2 = Integer.parseInt(qty);
                int qty3 = qty1 + qty2;                                                                                                       //stock kirima
                DBC.iud("UPDATE inventory SET `qty` = '"+String.valueOf(qty3)+"' WHERE `id` = '"+id+"' ");
                JOptionPane.showMessageDialog(this,"Purchase Added Successfuly!","DONE",JOptionPane.INFORMATION_MESSAGE);
            } else {
                DBC.iud("INSERT INTO inventory (`item`,`qty`) VALUES ('"+model+"','"+qty+"')");
                JOptionPane.showMessageDialog(this,"Purchase Added Successfuly!","DONE",JOptionPane.INFORMATION_MESSAGE);
            }  
            int tb = Integer.parseInt(jLabel19.getText());                                                                  //total bill
            int ft = Integer.parseInt(total) + tb;
            jLabel19.setText(String.valueOf(ft));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //add bill
        try {
            String date = jLabel4.getText();
            String  bill = jTextField5.getText();
            String dis = jComboBox1.getSelectedItem().toString();
            String total = jLabel19.getText();
            String ex = "Purchases";
            DBC.iud("INSERT INTO purchase_bill (`date`,`bill`,`distributor`,`total`) VALUES ('"+date+"','"+bill+"','"+dis+"','"+total+"')");
            DBC.iud("INSERT INTO cost (`date`,`bill`,`distributor`,`expence`,`cost`) VALUES ('"+date+"','"+bill+"','"+dis+"','"+ex+"','"+total+"')");
            JOptionPane.showMessageDialog(this,"Purchase Bill Added Successfuly!","DONE",JOptionPane.INFORMATION_MESSAGE);
            new Add_Purchase().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //back
        this.dispose();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    public void cbLoadData(String table,String column, JComboBox cb){                                   //combobox loadind
        try {
            ResultSet rs = DBC.search("SELECT * FROM "+table+" ");
            while(rs.next()){
                String value = rs.getString(column);
                cb.addItem(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
