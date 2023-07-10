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

public class UbahPassword extends javax.swing.JFrame {

    public UbahPassword() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_katasandilama = new javax.swing.JPasswordField();
        txt_katasandibaru = new javax.swing.JPasswordField();
        txt_kkatasandi = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnKirim = new javax.swing.JLabel();
        btnBatal = new javax.swing.JLabel();
        labelKategori2 = new javax.swing.JLabel();
        labelKategori1 = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        fieldKodeBatang2 = new javax.swing.JLabel();
        fieldKodeBatang1 = new javax.swing.JLabel();
        fieldKodeBatang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_katasandilama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_katasandilama.setForeground(new java.awt.Color(153, 153, 153));
        txt_katasandilama.setText("Kata Sandi");
        txt_katasandilama.setBorder(null);
        txt_katasandilama.setOpaque(false);
        txt_katasandilama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_katasandilamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_katasandilamaFocusLost(evt);
            }
        });
        txt_katasandilama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_katasandilamaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_katasandilama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 280, 30));

        txt_katasandibaru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_katasandibaru.setForeground(new java.awt.Color(153, 153, 153));
        txt_katasandibaru.setText("Kata Sandi");
        txt_katasandibaru.setBorder(null);
        txt_katasandibaru.setOpaque(false);
        txt_katasandibaru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_katasandibaruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_katasandibaruFocusLost(evt);
            }
        });
        txt_katasandibaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_katasandibaruActionPerformed(evt);
            }
        });
        getContentPane().add(txt_katasandibaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 280, 30));

        txt_kkatasandi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_kkatasandi.setForeground(new java.awt.Color(153, 153, 153));
        txt_kkatasandi.setText("Kata Sandi");
        txt_kkatasandi.setBorder(null);
        txt_kkatasandi.setOpaque(false);
        txt_kkatasandi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_kkatasandiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_kkatasandiFocusLost(evt);
            }
        });
        txt_kkatasandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kkatasandiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kkatasandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo asalan@2x_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 310, 80));

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

        labelKategori2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori2.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori2.setText("Konfirmasi Kata Sandi");
        getContentPane().add(labelKategori2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 30));

        labelKategori1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori1.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori1.setText("Kata Sandi Baru");
        getContentPane().add(labelKategori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 30));

        labelKategori.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori.setText("Kata Sandi Lama");
        getContentPane().add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 30));

        fieldKodeBatang2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKodeBatang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 30));

        fieldKodeBatang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKodeBatang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 30));

        fieldKodeBatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKodeBatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Ubah Nama Pengguna.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 48, 96), 6));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 670, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBatalMouseClicked

    private void btnKirimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKirimMouseClicked
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            PreparedStatement ps = con.prepareStatement("UPDATE tb_karyawan SET kata_sandi='"+txt_katasandibaru.getText()+"' "
                    + "WHERE nama_pengguna='"+Login.namapengguna+"'");
            if(txt_katasandilama.getText().equals(Login.katasandi)){
                if(txt_katasandibaru.getText().equals(txt_kkatasandi.getText())){
                    ps.execute();
                    JOptionPane.showMessageDialog(null,"Berhasil mengganti kata sandi");
                    this.setVisible(false);
                    new Login().setVisible(true);
                    Login.nama="";
                    Login.status="";
                    Login.namapengguna="";
                } else JOptionPane.showMessageDialog(this, "Masukkan konfirmasi kata sandi dengan benar");
            } else JOptionPane.showMessageDialog(this, "Masukkan kata sandi lama dengan benar");
        }
            
        catch (SQLException ex){
            Logger.getLogger(UbahPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKirimMouseClicked

    private void txt_katasandilamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandilamaFocusGained
        if(txt_katasandilama.getText().equals("Kata Sandi")) {
            txt_katasandilama.setText("");
            txt_katasandilama.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandilamaFocusGained

    private void txt_katasandilamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandilamaFocusLost
        if(txt_katasandilama.getText().equals("")) {
            txt_katasandilama.setText("Kata Sandi");
            txt_katasandilama.setForeground(new Color(153, 153, 153));
        } else {
            txt_katasandilama.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandilamaFocusLost

    private void txt_katasandilamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_katasandilamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_katasandilamaActionPerformed

    private void txt_katasandibaruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandibaruFocusGained
        if(txt_katasandibaru.getText().equals("Kata Sandi")) {
            txt_katasandibaru.setText("");
            txt_katasandibaru.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandibaruFocusGained

    private void txt_katasandibaruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_katasandibaruFocusLost
        if(txt_katasandibaru.getText().equals("")) {
            txt_katasandibaru.setText("Kata Sandi");
            txt_katasandibaru.setForeground(new Color(153, 153, 153));
        } else {
            txt_katasandibaru.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_katasandibaruFocusLost

    private void txt_katasandibaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_katasandibaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_katasandibaruActionPerformed

    private void txt_kkatasandiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_kkatasandiFocusGained
            if(txt_kkatasandi.getText().equals("Kata Sandi")) {
            txt_kkatasandi.setText("");
            txt_kkatasandi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_kkatasandiFocusGained

    private void txt_kkatasandiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_kkatasandiFocusLost
        if(txt_kkatasandi.getText().equals("")) {
            txt_kkatasandi.setText("Kata Sandi");
            txt_kkatasandi.setForeground(new Color(153, 153, 153));
        } else {
            txt_kkatasandi.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_kkatasandiFocusLost

    private void txt_kkatasandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kkatasandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kkatasandiActionPerformed

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
            java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBatal;
    private javax.swing.JLabel btnKirim;
    private javax.swing.JLabel fieldKodeBatang;
    private javax.swing.JLabel fieldKodeBatang1;
    private javax.swing.JLabel fieldKodeBatang2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelKategori1;
    private javax.swing.JLabel labelKategori2;
    private javax.swing.JPasswordField txt_katasandibaru;
    private javax.swing.JPasswordField txt_katasandilama;
    private javax.swing.JPasswordField txt_kkatasandi;
    // End of variables declaration//GEN-END:variables
}
