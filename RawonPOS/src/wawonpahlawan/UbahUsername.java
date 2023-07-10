/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UbahUsername extends javax.swing.JFrame {

    public UbahUsername() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_katasandi = new javax.swing.JPasswordField();
        txt_namapenggunabaru = new javax.swing.JTextField();
        txt_namapenggunalama = new javax.swing.JTextField();
        labelUbahNamaPengguna = new javax.swing.JLabel();
        btnKirim = new javax.swing.JLabel();
        btnBatal = new javax.swing.JLabel();
        labelKataSandi = new javax.swing.JLabel();
        labelNamaPenggunaBaru = new javax.swing.JLabel();
        labelNamaPenggunaLama = new javax.swing.JLabel();
        fieldKataSandi = new javax.swing.JLabel();
        fieldNamaPenggunaBaru = new javax.swing.JLabel();
        fieldNamaPenggunaLama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_katasandi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_katasandi.setForeground(new java.awt.Color(153, 153, 153));
        txt_katasandi.setText("Kata Sandi");
        txt_katasandi.setBorder(null);
        txt_katasandi.setOpaque(false);
        txt_katasandi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_katasandiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_katasandiFocusLost(evt);
            }
        });
        getContentPane().add(txt_katasandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 280, 30));

        txt_namapenggunabaru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namapenggunabaru.setForeground(new java.awt.Color(153, 153, 153));
        txt_namapenggunabaru.setText("Masukkan Nama Pengguna Baru");
        txt_namapenggunabaru.setBorder(null);
        txt_namapenggunabaru.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_namapenggunabaru.setOpaque(false);
        txt_namapenggunabaru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_namapenggunabaruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_namapenggunabaruFocusLost(evt);
            }
        });
        getContentPane().add(txt_namapenggunabaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 280, 30));

        txt_namapenggunalama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namapenggunalama.setForeground(new java.awt.Color(153, 153, 153));
        txt_namapenggunalama.setText("Masukkan Nama Pengguna Lama");
        txt_namapenggunalama.setBorder(null);
        txt_namapenggunalama.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_namapenggunalama.setOpaque(false);
        txt_namapenggunalama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_namapenggunalamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_namapenggunalamaFocusLost(evt);
            }
        });
        getContentPane().add(txt_namapenggunalama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 280, 30));

        labelUbahNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo asalan.png"))); // NOI18N
        getContentPane().add(labelUbahNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 310, 80));

        btnKirim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Kirim Setting.png"))); // NOI18N
        btnKirim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKirim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKirim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKirimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKirimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKirimMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKirimMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnKirimMouseReleased(evt);
            }
        });
        getContentPane().add(btnKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, 50));

        btnBatal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Setting.png"))); // NOI18N
        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
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
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 90, 50));

        labelKataSandi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKataSandi.setForeground(new java.awt.Color(34, 48, 96));
        labelKataSandi.setText("Kata Sandi");
        getContentPane().add(labelKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 30));

        labelNamaPenggunaBaru.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaPenggunaBaru.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaPenggunaBaru.setText("Nama Pengguna Baru");
        getContentPane().add(labelNamaPenggunaBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 30));

        labelNamaPenggunaLama.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaPenggunaLama.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaPenggunaLama.setText("Nama Pengguna Lama");
        getContentPane().add(labelNamaPenggunaLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 30));

        fieldKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 30));

        fieldNamaPenggunaBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaPenggunaBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 30));

        fieldNamaPenggunaLama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaPenggunaLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Ubah Nama Pengguna.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 48, 96), 6));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBatalMouseClicked

    private void btnKirimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseClicked
       try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            PreparedStatement ps = con.prepareStatement("UPDATE tb_karyawan SET nama_pengguna='"+txt_namapenggunabaru.getText()+"' "
                    + "WHERE nama_pengguna='"+Login.namapengguna+"'");
            if(txt_namapenggunalama.getText().equals(Login.namapengguna)){
                if(txt_namapenggunalama.getText().equals(Login.namapengguna) && txt_katasandi.getText().equals(Login.katasandi)){
                    ps.execute();
                    JOptionPane.showMessageDialog(null,"Berhasil mengganti nama pengguna");
                    this.setVisible(false);
                    new Login().setVisible(true);
                    Login.nama="";
                    Login.status="";
                    Login.namapengguna="";
                } else JOptionPane.showMessageDialog(this, "Masukkan kata sandi dengan benar");
            } else JOptionPane.showMessageDialog(this, "Masukkan nama pengguna lama dengan benar");
        }
//        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "Nama pengguna telah dipakai oleh karyawan lain");
            Logger.getLogger(UbahUsername.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKirimMouseClicked

    private void txt_namapenggunalamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namapenggunalamaFocusGained
        if(txt_namapenggunalama.getText().equals("Masukkan Nama Pengguna Lama")) {
            txt_namapenggunalama.setText("");
            txt_namapenggunalama.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_namapenggunalamaFocusGained

    private void txt_namapenggunalamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namapenggunalamaFocusLost
        if(txt_namapenggunalama.getText().equals("")) {
            txt_namapenggunalama.setText("Masukkan Nama Pengguna Lama");
            txt_namapenggunalama.setForeground(new Color(153, 153, 153));
        } else {
            txt_namapenggunalama.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_namapenggunalamaFocusLost

    private void txt_namapenggunabaruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namapenggunabaruFocusGained
        if(txt_namapenggunabaru.getText().equals("Masukkan Nama Pengguna Baru")) {
            txt_namapenggunabaru.setText("");
            txt_namapenggunabaru.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_namapenggunabaruFocusGained

    private void txt_namapenggunabaruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namapenggunabaruFocusLost
        if(txt_namapenggunabaru.getText().equals("")) {
            txt_namapenggunabaru.setText("Masukkan Nama Pengguna Baru");
            txt_namapenggunabaru.setForeground(new Color(153, 153, 153));
        } else {
            txt_namapenggunabaru.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_namapenggunabaruFocusLost

    private void txt_katasandiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandiFocusLost
        if(txt_katasandi.getText().equals("")) {
            txt_katasandi.setText("Kata Sandi");
            txt_katasandi.setForeground(new Color(153, 153, 153));
        } else {
            txt_katasandi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandiFocusLost

    private void txt_katasandiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandiFocusGained
        if(txt_katasandi.getText().equals("Kata Sandi")) {
            txt_katasandi.setText("");
            txt_katasandi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandiFocusGained

    private void btnKirimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseEntered
        btnKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Kirim Setting_Hover.png")));
    }//GEN-LAST:event_btnKirimMouseEntered

    private void btnKirimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseExited
        btnKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Kirim Setting.png")));
    }//GEN-LAST:event_btnKirimMouseExited

    private void btnKirimMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMousePressed
        btnKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Kirim Setting_Press.png")));
    }//GEN-LAST:event_btnKirimMousePressed

    private void btnKirimMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseReleased
        btnKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Kirim Setting_Hover.png")));
    }//GEN-LAST:event_btnKirimMouseReleased

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Setting_Hover.png")));
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Setting.png")));
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnBatalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMousePressed
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Setting_Press.png")));
    }//GEN-LAST:event_btnBatalMousePressed

    private void btnBatalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseReleased
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Batal Setting_Hover.png")));
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
            java.util.logging.Logger.getLogger(UbahUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahUsername().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBatal;
    private javax.swing.JLabel btnKirim;
    private javax.swing.JLabel fieldKataSandi;
    private javax.swing.JLabel fieldNamaPenggunaBaru;
    private javax.swing.JLabel fieldNamaPenggunaLama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelKataSandi;
    private javax.swing.JLabel labelNamaPenggunaBaru;
    private javax.swing.JLabel labelNamaPenggunaLama;
    private javax.swing.JLabel labelUbahNamaPengguna;
    private javax.swing.JPasswordField txt_katasandi;
    private static javax.swing.JTextField txt_namapenggunabaru;
    private javax.swing.JTextField txt_namapenggunalama;
    // End of variables declaration//GEN-END:variables
}
