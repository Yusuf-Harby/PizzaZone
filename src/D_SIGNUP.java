package A_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class D_SIGNUP extends javax.swing.JFrame {

    public D_SIGNUP() {
        initComponents();
        this.setLocationRelativeTo(null);
        ConnectPerformed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        confirm_pwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SignUp_Button = new javax.swing.JButton();
        show_pwd = new javax.swing.JCheckBox();
        show_confirm_pwd = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled design (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 490, 360));

        jLabel3.setBackground(new java.awt.Color(217, 100, 30));
        jLabel3.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 100, 30));
        jLabel3.setText("Sign up");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 240, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(217, 100, 30));
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        phone.setBackground(new java.awt.Color(236, 226, 210));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 223, 38));

        pwd.setBackground(new java.awt.Color(236, 226, 210));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 223, 38));

        confirm_pwd.setBackground(new java.awt.Color(236, 226, 210));
        confirm_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_pwdActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 223, 38));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 100, 30));
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 100, 30));
        jLabel6.setText("Confirm password :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        SignUp_Button.setBackground(new java.awt.Color(217, 100, 30));
        SignUp_Button.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        SignUp_Button.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Button.setText("SIGN UP");
        SignUp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 223, 41));

        show_pwd.setForeground(new java.awt.Color(217, 100, 30));
        show_pwd.setText("Show password");
        show_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pwdActionPerformed(evt);
            }
        });
        jPanel1.add(show_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        show_confirm_pwd.setForeground(new java.awt.Color(217, 100, 30));
        show_confirm_pwd.setText("Show password");
        show_confirm_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_confirm_pwdActionPerformed(evt);
            }
        });
        jPanel1.add(show_confirm_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(217, 100, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 260, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled design.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 330, 70));

        back_button.setBackground(new java.awt.Color(65, 66, 58));
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/pngwing.com (2) (2).png"))); // NOI18N
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        address.setBackground(new java.awt.Color(236, 226, 210));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 223, 38));

        username.setBackground(new java.awt.Color(236, 226, 210));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 223, 38));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 100, 30));
        jLabel8.setText("Address :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 130, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 100, 30));
        jLabel9.setText("Phone Number :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, -1));

        jLabel2.setForeground(new java.awt.Color(217, 100, 30));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/Untitled (935 x 520 px).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        B_Home a = new B_Home();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
        String name = username.getText();
        String Address = address.getText();
        String PWD = new String(pwd.getPassword());
        String CPWD = new String(confirm_pwd.getPassword());
        String Phone = phone.getText();

        if (name.isEmpty() || Address.isEmpty() || PWD.isEmpty() || CPWD.isEmpty() || Phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        if (!PWD.equals(CPWD)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/PIZZA_ZONE";
        String dbUsername = "root";
        String dbPassword = "132025";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "SELECT * FROM users WHERE username = ? OR phone_number = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, name);
                pstmt.setString(2, Phone);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "User with this username or phone number already exists! \n Go to Login Page!");
                        return;
                    }
                }
            }

            // Insert new user
            String insertQuery = "INSERT INTO users (username, phone_number, password, address) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setString(1, name);
                pstmt.setString(2, Phone);
                pstmt.setString(3, PWD);
                pstmt.setString(4, Address);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "User registered successfully!");
                    username.setText("");
                    address.setText("");
                    pwd.setText("");
                    confirm_pwd.setText("");
                    phone.setText("");
                    C_LOGIN a = new C_LOGIN();
                    a.setVisible(true);
                    this.setVisible(false);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    private void show_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pwdActionPerformed
        if (show_pwd.isSelected()) {
            pwd.setEchoChar((char) 0);
        } else {
            pwd.setEchoChar('*');
        }
    }//GEN-LAST:event_show_pwdActionPerformed

    private void show_confirm_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_confirm_pwdActionPerformed
        if (show_confirm_pwd.isSelected()) {
            confirm_pwd.setEchoChar((char) 0);
        } else {
            confirm_pwd.setEchoChar('*');
        }
    }//GEN-LAST:event_show_confirm_pwdActionPerformed

    private void confirm_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_pwdActionPerformed

    }//GEN-LAST:event_confirm_pwdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D_SIGNUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JTextField address;
    private javax.swing.JButton back_button;
    private javax.swing.JPasswordField confirm_pwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JCheckBox show_confirm_pwd;
    private javax.swing.JCheckBox show_pwd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
