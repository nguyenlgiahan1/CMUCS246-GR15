/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidatve;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Loc
 */
public class admin1 extends javax.swing.JFrame {

    private Connection conn;
    public admin1() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Họ Và Tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("CCCD");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Bậc");

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên ", "ID", "CCCD", "Bậc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phổ Thông", "Đặc Biệt ", "VIP", " " }));

        jButton5.setText("Tìm Kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton4)
                                .addGap(51, 51, 51)
                                .addComponent(jButton2)
                                .addGap(60, 60, 60)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jButton5)))))
                .addGap(28, 28, 28))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//lưu
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          
    String name = jTextField1.getText();
    String id = jTextField3.getText();
    String cccd = jTextField4.getText();
    String level = (String) jComboBox1.getSelectedItem();

    // Print the data to the console
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("CCCD: " + cccd);
    System.out.println("Level: " + level);
    
    // Kiểm tra nếu các trường name và id trống thì không thêm vào bảng
    if (name.isEmpty() || id.isEmpty()) {
        // Có thể thêm thông báo lỗi nếu cần
        JOptionPane.showMessageDialog(null, "Tên và ID không được để trống.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    } else {
        // Thêm dữ liệu mới vào bảng
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[]{name, id, cccd, level});

        // Xóa nội dung các trường nhập liệu sau khi đã thêm vào bảng
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
}
    
    }//GEN-LAST:event_jButton4ActionPerformed
//sửa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int selectedRowIndex = jTable2.getSelectedRow();

   
    if (selectedRowIndex != -1) {
        String name = (String) jTable2.getValueAt(selectedRowIndex, 0);
        String id = (String) jTable2.getValueAt(selectedRowIndex, 1);
        String cccd = (String) jTable2.getValueAt(selectedRowIndex, 2);
        String level = (String) jTable2.getValueAt(selectedRowIndex, 3);

        // Hiển thị cửa sổ hoặc hộp thoại sửa đổi thông tin
        JFrame frame = new JFrame("Sửa thông tin sản phẩm");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jTextField1.setText(name);
        jTextField3.setText(id);
        jTextField4.setText(cccd);
       
        jComboBox1.setSelectedItem(level);
        
        
        // Tạo các trường nhập liệu để người dùng có thể chỉnh sửa thông tin
        JTextField nameField = new JTextField(20); 
        JTextField idField = new JTextField(10); 
        JTextField cccdField = new JTextField(20); 
        JComboBox<String> levelComboBox = new JComboBox<>(new String[]{"Phổ Thông", "Đặc Biệt", "VIP"}); 
        levelComboBox.setSelectedItem("Phổ Thông"); 

        
        JButton saveButton = new JButton("Lưu");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin mới từ các trường nhập liệu
                String name = nameField.getText();
                String id = idField.getText();
                String cccd = cccdField.getText();
                String level =  levelComboBox.getSelectedItem().toString();

                // Thực hiện việc cập nhật dữ liệu trong bảng
                jTable2.setValueAt(name, selectedRowIndex, 0);
                jTable2.setValueAt(id, selectedRowIndex, 1);
                jTable2.setValueAt(cccd, selectedRowIndex, 2);
                jTable2.setValueAt(level, selectedRowIndex, 3);

                // Đóng cửa sổ sau khi đã lưu
                frame.dispose();
            }
        });
        frame.getContentPane().add(saveButton);
        frame.pack();
        frame.setVisible(true);
        
        JPanel panel = new JPanel(new GridLayout(5, 2));
panel.add(new JLabel("Họ và tên:")); // Đổi nội dung label thành "Họ và tên"
panel.add(nameField);
panel.add(new JLabel("ID:")); // Đổi nội dung label thành "ID"
panel.add(idField);
panel.add(new JLabel("CCCD:")); // Đổi nội dung label thành "CCCD"
panel.add(cccdField);
panel.add(new JLabel("Bậc:")); // Đổi nội dung label thành "Bậc"
panel.add(levelComboBox);
panel.add(saveButton);

// Thêm panel vào frame và hiển thị frame
frame.getContentPane().add(panel);
frame.pack();
frame.setLocationRelativeTo(null); // Hiển thị frame ở giữa màn hình
frame.setVisible(true);



// Câu lệnh SQL để cập nhật dữ liệu
String sql = "UPDATE ten_bang SET name = ?, level = ?, id = ?, cccd = ?";

try {
    PreparedStatement statement = conn.prepareStatement(sql);
    statement.setString(1, name);
    statement.setString(2, level);
    statement.setString(3, id);
    statement.setString(4, cccd);
    int rowsUpdated = statement.executeUpdate();
    if (rowsUpdated > 0) {
        System.out.println("Cập nhật thành công");
    } else {
        System.out.println("Không có dòng nào được cập nhật");
    }
} catch (SQLException e) {
    e.printStackTrace();
}

        
    } else {
        
        JOptionPane.showMessageDialog(this, "Please select a row to edit.", "No row selected", JOptionPane.WARNING_MESSAGE);
    }
    
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
//xóa
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int selectedRowIndex = jTable2.getSelectedRow();

    
    if (selectedRowIndex != -1) {
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.removeRow(selectedRowIndex);

       
    } else {
        
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No row selected", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_jButton3ActionPerformed
// tim kiem
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String searchQuery = JOptionPane.showInputDialog(this, "Enter search query:");

    
    if (searchQuery != null && !searchQuery.isEmpty()) {
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable2.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchQuery)); 

        
        if (jTable2.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching results found.", "No results", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        
        JOptionPane.showMessageDialog(this, "Please enter a search query.", "Empty search query", JOptionPane.WARNING_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}