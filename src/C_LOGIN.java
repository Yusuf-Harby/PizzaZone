package A_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class C_LOGIN extends javax.swing.JFrame {

    public C_LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
        ConnectPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login_button = new javax.swing.JButton();
        create_new_acc_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        back_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 100, 30));
        jLabel1.setText("LOG IN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 157, 63));

        Phone.setBackground(new java.awt.Color(236, 226, 210));
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 223, 38));

        pwd.setBackground(new java.awt.Color(236, 226, 210));
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 223, 38));

        jCheckBox1.setForeground(new java.awt.Color(217, 100, 30));
        jCheckBox1.setText("show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 113, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 100, 30));
        jLabel2.setText("Phone Number :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 100, 30));
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, -1));

        Login_button.setBackground(new java.awt.Color(217, 100, 30));
        Login_button.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        Login_button.setForeground(new java.awt.Color(255, 255, 255));
        Login_button.setText("LOG IN");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 223, 41));

        create_new_acc_button.setBackground(new java.awt.Color(217, 100, 30));
        create_new_acc_button.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        create_new_acc_button.setForeground(new java.awt.Color(255, 255, 255));
        create_new_acc_button.setText("CREATE NEW ACCOUNT");
        create_new_acc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_new_acc_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(create_new_acc_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 223, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled design.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 370, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled design (2).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 510, 420));

        jSeparator2.setBackground(new java.awt.Color(217, 100, 30));
        jSeparator2.setForeground(new java.awt.Color(217, 100, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 260, 10));

        back_button.setBackground(new java.awt.Color(65, 66, 58));
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/pngwing.com (2) (2).png"))); // NOI18N
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled (935 x 520 px).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectPerformed() {
        String url = "jdbc:mysql://localhost:3306/PIZZA_ZONE";
        String username = "root";
        String password = "132025";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(this, "Connected to the database successfully!");
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage());
        }
    }

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        String url = "jdbc:mysql://localhost:3306/PIZZA_ZONE";
        String username = "root";
        String password = "132025";

        String phone = Phone.getText();
        String inputPassword = new String(pwd.getPassword());

        if (phone.isEmpty() || inputPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both phone number and password.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT password FROM users WHERE phone_number = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, phone);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        String storedPassword = rs.getString("password");

                        if (inputPassword.equals(storedPassword)) {
                            JOptionPane.showMessageDialog(this, "Login successful!");
                            E_AdminFrame a = new E_AdminFrame();
                            a.setVisible(true);
                            this.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(this, "Incorrect password. Please try again.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "User not found. Please create an account.");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error during login: " + e.getMessage());
        }
    }//GEN-LAST:event_Login_buttonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            pwd.setEchoChar((char) 0);
        } else {
            pwd.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed

    }//GEN-LAST:event_pwdActionPerformed

    private void create_new_acc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_new_acc_buttonActionPerformed
        D_SIGNUP a = new D_SIGNUP();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_create_new_acc_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        B_Home a = new B_Home();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed

    }//GEN-LAST:event_PhoneActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_button;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton back_button;
    private javax.swing.JButton create_new_acc_button;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pwd;
    // End of variables declaration//GEN-END:variables
}
