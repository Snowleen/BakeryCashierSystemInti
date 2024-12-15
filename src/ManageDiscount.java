/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.Image;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.ResultSet;


public class ManageDiscount extends javax.swing.JFrame {

    
   
    
    
    public ManageDiscount() {
        initComponents();
        setButtonIcons();
        this.setLocationRelativeTo(null);
    }
    
     //  load and resize images
    public ImageIcon createResizedIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(path));
        Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    // set icons for buttons
    public void setButtonIcons() {
        jButton2.setIcon(createResizedIcon("plus.png", 30, 30)); 
        jButton1.setIcon(createResizedIcon("minus.png", 30, 30));
        jButton3.setIcon(createResizedIcon("compose.png", 30, 30));
       
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Discount Management");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minus.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compose.png"))); // NOI18N
        jButton3.setText("Modify");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(350, 350, 350))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Show dialog to enter discount details use JOptionPane
        JTextField productIdField = new JTextField(10);
        JTextField discountAmountField = new JTextField(5);
        JTextField descriptionField = new JTextField(20);

        JPanel addPanel = new JPanel();
        addPanel.add(new JLabel("Product ID:"));
        addPanel.add(productIdField);
        addPanel.add(new JLabel("Discount Amount:"));
        addPanel.add(discountAmountField);
        addPanel.add(new JLabel("Description:"));
        addPanel.add(descriptionField);

        int result = JOptionPane.showConfirmDialog(null, addPanel,
                "Enter Discount Details", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String productId = productIdField.getText();
            String discountAmount = discountAmountField.getText();

            // Check if discount is 0
            if (!discountAmount.equals("0")) {
                // Call method to add discount to the database
                addDiscountToDatabase(productId, discountAmount, descriptionField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Discount cannot be zero for add operation.");
            }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // Prompt for Product ID to delete the discount
        String productId = JOptionPane.showInputDialog(this, "Enter Product ID to delete discount:");
        if (productId != null && !productId.isEmpty()) {
            // Call method to delete the discount in the database
            deleteDiscountFromDatabase(productId);
    }//GEN-LAST:event_jButton1ActionPerformed

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Show dialog to enter discount details for modification
        JTextField productIdField = new JTextField(10);
        JTextField discountAmountField = new JTextField(5);
        JTextField descriptionField = new JTextField(20);

        JPanel modifyPanel = new JPanel();
        modifyPanel.add(new JLabel("Product ID:"));
        modifyPanel.add(productIdField);
        modifyPanel.add(new JLabel("Discount Amount:"));
        modifyPanel.add(discountAmountField);
        modifyPanel.add(new JLabel("Description:"));
        modifyPanel.add(descriptionField);

        int result = JOptionPane.showConfirmDialog(null, modifyPanel,
                "Modify Discount Details", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String productId = productIdField.getText();
            String discountAmount = discountAmountField.getText();

            // Settings to only modify if discount is not 0
            if (!discountAmount.equals("0")) {
                modifyDiscountInDatabase(productId, discountAmount, descriptionField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Cannot modify discount to zero.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        CashierDashboard cashierdashboard = new CashierDashboard();
        cashierdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addDiscountToDatabase(String productId, String discountAmount, String description) {
    //checking of current discount
    String checkSql = "SELECT discount FROM Product WHERE product_id = ?";
    
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
        
        // Set the parameter for the check based on product id
        checkStmt.setInt(1, Integer.parseInt(productId));

        // Execute the check query
        ResultSet rs = checkStmt.executeQuery();
        
        if (rs.next()) {
            // Get the current discount value
            BigDecimal currentDiscount = rs.getBigDecimal("discount");

            // Check if the current discount is zero
            if (currentDiscount.compareTo(BigDecimal.ZERO) != 0) {
                // If the discount is not zero, prevent adding a new discount in order to differentiate it from modify discount
                JOptionPane.showMessageDialog(this, "Discount already exists for this product. Cannot add a new discount.");
            } else {
                // Proceed to add the new discount
                String sql = "UPDATE Product SET discount = ?, discount_description = ? WHERE product_id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setBigDecimal(1, new BigDecimal(discountAmount));  // Set the discount
                    stmt.setString(2, description);                          // Set the discount description
                    stmt.setInt(3, Integer.parseInt(productId));             // get the product_id

                    // Execute the update statement to update to database
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Discount added successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No matching product found to update discount.");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No product found with the given ID.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
}

    

    private void deleteDiscountFromDatabase(String productId) {
        // SQL for deleting a discount (sets Discount to 0)
        String sql = "UPDATE Product SET discount = 0 , discount_description = 'NULL' WHERE product_id = ?";
        try (Connection conn = DBConnection.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set the parameter
            stmt.setInt(1, Integer.parseInt(productId));

            // Execute the update statement
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Discount deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "No matching product found to delete discount.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }

   private void modifyDiscountInDatabase(String productId, String discountAmount, String description) {
    // SQL to fetch the current discount value
    String fetchCurrentDiscountSql = "SELECT discount FROM Product WHERE product_id = ?";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmtFetch = conn.prepareStatement(fetchCurrentDiscountSql)) {

        // Set the product_id parameter
        stmtFetch.setInt(1, Integer.parseInt(productId));

        try (ResultSet rs = stmtFetch.executeQuery()) {
            if (rs.next()) {
                double currentDiscount = rs.getDouble("discount");

                // Check if the current discount is 0 before modifying(differentiate from add)
                if (currentDiscount == 0) {
                    JOptionPane.showMessageDialog(this, "The discount can only be modified if it is not 0.");
                    return;
                }

                // SQL for updating the discount details in product table
                String sqlUpdate = "UPDATE Product SET discount = ?, discount_description = ? WHERE product_id = ?";
                try (PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate)) {
                    // Set the parameters for update
                    stmtUpdate.setDouble(1, Double.parseDouble(discountAmount));  
                    stmtUpdate.setString(2, description);
                    stmtUpdate.setInt(3, Integer.parseInt(productId));

                    // Execute the update statement
                    int rowsAffected = stmtUpdate.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Discount modified successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No matching product found to modify discount.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product not found.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
}


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
            java.util.logging.Logger.getLogger(ManageDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new ManageDiscount().setVisible(true);
        }
    });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}