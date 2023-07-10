/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import config.Config;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aryaaazr_
 */
public class Login extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    static String status;
    static String nama;
    static String namapengguna;
    static String idkaryawan;
    static String katasandi;

    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBatal = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        navbar1 = new javax.swing.JPanel();
        logoAplikasi = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        labelNamaPengguna = new javax.swing.JLabel();
        labelKataSandi = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        fieldNamaPengguna = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        fieldKataSandi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/button batal_login.png"))); // NOI18N
        btnBatal.setBorder(null);
        btnBatal.setBorderPainted(false);
        btnBatal.setContentAreaFilled(false);
        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatal.setFocusable(false);
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBatalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBatalMouseReleased(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 200, 60));

        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Masuk Home.png"))); // NOI18N
        btnMasuk.setBorder(null);
        btnMasuk.setBorderPainted(false);
        btnMasuk.setContentAreaFilled(false);
        btnMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasuk.setFocusable(false);
        btnMasuk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMasukMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMasukMouseReleased(evt);
            }
        });
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 210, 60));

        navbar1.setBackground(new java.awt.Color(255, 255, 255));

        logoAplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Logo Aplikasi.png"))); // NOI18N

        judul.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        judul.setText("Coolinary POS - Dekstop Application");

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Close.png"))); // NOI18N
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusable(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbar1Layout = new javax.swing.GroupLayout(navbar1);
        navbar1.setLayout(navbar1Layout);
        navbar1Layout.setHorizontalGroup(
            navbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoAplikasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1115, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbar1Layout.setVerticalGroup(
            navbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbar1Layout.createSequentialGroup()
                .addGroup(navbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(judul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoAplikasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(navbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 20));

        labelNamaPengguna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNamaPengguna.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Label Nama Pengguna.png"))); // NOI18N
        getContentPane().add(labelNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 30));

        labelKataSandi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelKataSandi.setForeground(new java.awt.Color(34, 48, 96));
        labelKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Label Kata Sandi.png"))); // NOI18N
        getContentPane().add(labelKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, 30));

        usernameField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        usernameField.setBorder(null);
        usernameField.setCaretColor(new java.awt.Color(34, 48, 96));
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        usernameField.setOpaque(false);
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 370, 40));

        fieldNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field login.png"))); // NOI18N
        getContentPane().add(fieldNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        passwordField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setOpaque(false);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 370, 40));

        fieldKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field login.png"))); // NOI18N
        getContentPane().add(fieldKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Login.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        try {
    // Memeriksa input kosong
    String username = usernameField.getText();
    String password = passwordField.getText();
    if (username.isEmpty() || password.isEmpty()) {
        throw new CustomException("Nama pengguna dan kata sandi harus diisi");
    }
    
    // Query
    String sql = "SELECT * FROM tb_karyawan WHERE nama_pengguna = ? AND kata_sandi = ?";
    
    // Menjalankan query
    conn = (Connection) Config.configDB();
    pst = conn.prepareStatement(sql);
    pst.setString(1, username);
    pst.setString(2, password);
    rs = pst.executeQuery();
    
    if (rs.next()) {
        Login.status = rs.getString("status");
        Login.nama = rs.getString("nama_karyawan");
        Login.idkaryawan = rs.getString("id_karyawan");
        Login.namapengguna = username;
        Login.katasandi = rs.getString("kata_sandi");
        this.setVisible(false);
        
        if (Login.status.equals("admin")) {
            System.out.println("ini admin");
            new Navbar(Login.nama, Login.status).setVisible(true);
            Dashboard dashboard = new Dashboard();
            Navbar.DesktopPane.removeAll();
            Navbar.DesktopPane.repaint();
            Navbar.DesktopPane.add(dashboard).setVisible(true);
            this.dispose();
        } else if (Login.status.equals("kasir")) {
            System.out.println("ini kasir");
            new Navbar_Kasir(Login.nama, Login.status).setVisible(true);
            Dashboard dashboard = new Dashboard();
            Navbar_Kasir.DesktopPane.removeAll();
            Navbar_Kasir.DesktopPane.repaint();
            Navbar_Kasir.DesktopPane.add(dashboard).setVisible(true);
            this.dispose();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Nama pengguna atau kata sandi salah");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Kesalahan SQL: " + ex.getMessage());
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Kesalahan: " + ex.getMessage());
}
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Masuk Home_Hover.png")));
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Masuk Home.png")));
    }//GEN-LAST:event_btnMasukMouseExited

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Login_Hover.png")));
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Login.png")));
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        try {
            //query
            String sql = "SELECT * FROM tb_karyawan WHERE nama_pengguna='" + usernameField.getText() + "' AND kata_sandi='" + passwordField.getText() + "'";
            //menjalankan query
            conn = (Connection) Config.configDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            //*

            if (rs.next() && usernameField.getText().equals(rs.getString("nama_pengguna"))
                    && passwordField.getText().equals(rs.getString("kata_sandi"))) {
                this.status = rs.getString("status");
                this.nama = rs.getString("nama_karyawan");
                this.idkaryawan = rs.getString("id_karyawan");
//                JOptionPane.showMessageDialog(this,"Berhasil Login");
                Login.namapengguna = usernameField.getText();
                Login.katasandi = rs.getString("kata_sandi");
                this.setVisible(false);
                if (this.status.equals("admin")) {
                new Navbar(nama, status).setVisible(true);
                Dashboard dashboard = new Dashboard(); // instansiasi class dashboard
                Navbar.DesktopPane.removeAll(); // remove item pada desktop pane
                Navbar.DesktopPane.repaint(); // repaint item pada desktop pane
                Navbar.DesktopPane.add(dashboard).setVisible(true); // add item yang sudah di set pada desktop pane
                this.dispose();
                } else if(this.status.equals("kasir")){
                    new Navbar_Kasir(nama, status).setVisible(true);
                Dashboard dashboard = new Dashboard(); // instansiasi class dashboard
                Navbar_Kasir.DesktopPane.removeAll(); // remove item pada desktop pane
                Navbar_Kasir.DesktopPane.repaint(); // repaint item pada desktop pane
                Navbar_Kasir.DesktopPane.add(dashboard).setVisible(true); // add item yang sudah di set pada desktop pane
                this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nama pengguna atau kata sandi salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnMasukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMousePressed
        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Masuk Home_Press.png")));
    }//GEN-LAST:event_btnMasukMousePressed

    private void btnMasukMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseReleased
        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Masuk Home_Hover.png")));
    }//GEN-LAST:event_btnMasukMouseReleased

    private void btnBatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMousePressed
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Login_Press.png")));
    }//GEN-LAST:event_btnBatalMousePressed

    private void btnBatalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseReleased
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Login_Hover.png")));
    }//GEN-LAST:event_btnBatalMouseReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel fieldKataSandi;
    private javax.swing.JLabel fieldNamaPengguna;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelKataSandi;
    private javax.swing.JLabel labelNamaPengguna;
    private javax.swing.JLabel logoAplikasi;
    private javax.swing.JPanel navbar1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
