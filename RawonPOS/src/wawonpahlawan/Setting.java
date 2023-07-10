/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Setting extends javax.swing.JInternalFrame {

    public Setting() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        tampilkan();
//        textField.setMargin(new Insets(10, 10, 10, 10));
    }
    public void tampilkan() {
            try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_karyawan WHERE nama_pengguna ='"+Login.namapengguna+"'");
            if(rs.next()){
                txt_idkaryawan.setText(rs.getString("id_karyawan"));
                txt_namakaryawan.setText(rs.getString("nama_karyawan"));
                txt_nohp.setText(rs.getString("nohp_karyawan"));
                txt_alamat.setText(rs.getString("alamat_karyawan"));
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_namakaryawan = new javax.swing.JTextField();
        txt_idkaryawan = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_nohp = new javax.swing.JTextField();
        btn_keluar = new javax.swing.JLabel();
        btn_ubahnamapengguna = new javax.swing.JLabel();
        btn_ubahkatasandi = new javax.swing.JLabel();
        labelPilihanTransaksi = new javax.swing.JLabel();
        fieldIdSupplier = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        labelKategori1 = new javax.swing.JLabel();
        fieldIdSupplier1 = new javax.swing.JLabel();
        labelKategori2 = new javax.swing.JLabel();
        labelKategori3 = new javax.swing.JLabel();
        fieldIdSupplier2 = new javax.swing.JLabel();
        fieldIdSupplier3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1036, 784));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_namakaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namakaryawan.setAlignmentX(10.0F);
        txt_namakaryawan.setBorder(null);
        txt_namakaryawan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_namakaryawan.setEnabled(false);
        txt_namakaryawan.setOpaque(false);
        txt_namakaryawan.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_namakaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 280, 30));

        txt_idkaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idkaryawan.setAlignmentX(10.0F);
        txt_idkaryawan.setBorder(null);
        txt_idkaryawan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_idkaryawan.setEnabled(false);
        txt_idkaryawan.setOpaque(false);
        txt_idkaryawan.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_idkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 280, 30));

        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setBorder(null);
        txt_alamat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_alamat.setEnabled(false);
        txt_alamat.setOpaque(false);
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 280, 30));

        txt_nohp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nohp.setBorder(null);
        txt_nohp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_nohp.setEnabled(false);
        txt_nohp.setOpaque(false);
        getContentPane().add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 280, 30));

        btn_keluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar.png"))); // NOI18N
        btn_keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_keluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_keluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_keluarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_keluarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_keluarMouseReleased(evt);
            }
        });
        btn_keluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_keluarKeyPressed(evt);
            }
        });
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 140, 60));

        btn_ubahnamapengguna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ubahnamapengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna.png"))); // NOI18N
        btn_ubahnamapengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ubahnamapengguna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ubahnamapengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahnamapenggunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ubahnamapenggunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ubahnamapenggunaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ubahnamapenggunaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ubahnamapenggunaMouseReleased(evt);
            }
        });
        getContentPane().add(btn_ubahnamapengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 200, 60));

        btn_ubahkatasandi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ubahkatasandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi.png"))); // NOI18N
        btn_ubahkatasandi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ubahkatasandi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ubahkatasandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahkatasandiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ubahkatasandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ubahkatasandiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ubahkatasandiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ubahkatasandiMouseReleased(evt);
            }
        });
        getContentPane().add(btn_ubahkatasandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 200, 60));

        labelPilihanTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPilihanTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/biodata.png"))); // NOI18N
        labelPilihanTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPilihanTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 430, 120));

        fieldIdSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 30));

        labelKategori.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori.setText("No. Handphone");
        getContentPane().add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, 30));

        labelKategori1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori1.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori1.setText("ID Karyawan");
        getContentPane().add(labelKategori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));

        fieldIdSupplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 30));

        labelKategori2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori2.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori2.setText("Nama Karyawan");
        getContentPane().add(labelKategori2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 30));

        labelKategori3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori3.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori3.setText("Alamat");
        getContentPane().add(labelKategori3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 30));

        fieldIdSupplier2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, 30));

        fieldIdSupplier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Internal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ubahnamapenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahnamapenggunaMouseClicked
        UbahUsername a = new UbahUsername();
        a.setVisible(true);
    }//GEN-LAST:event_btn_ubahnamapenggunaMouseClicked

    private void btn_ubahkatasandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahkatasandiMouseClicked
        UbahPassword a = new UbahPassword();
        a.setVisible(true);
    }//GEN-LAST:event_btn_ubahkatasandiMouseClicked

    private void btn_keluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_keluarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarKeyPressed

    private void btn_keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseClicked

        int logout = JOptionPane.showOptionDialog(null, "Anda yakin ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (logout == JOptionPane.YES_OPTION) {
            if(Login.status.equals("admin")){
            Navbar.DesktopPane.removeAll(); // remove item pada desktop pane
            this.dispose();
            } else if(Login.status.equals("kasir")){
            Navbar_Kasir.DesktopPane.removeAll(); // remove item pada desktop pane
            this.dispose();
            }
            new Login().setVisible(true);
                    Login.nama="";
        Login.namapengguna="";
        Login.katasandi="";
        Login.status="";
        } 
    }//GEN-LAST:event_btn_keluarMouseClicked

    private void btn_ubahnamapenggunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahnamapenggunaMouseEntered
        btn_ubahnamapengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Hover.png")));
    }//GEN-LAST:event_btn_ubahnamapenggunaMouseEntered

    private void btn_ubahnamapenggunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahnamapenggunaMouseExited
        btn_ubahnamapengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna.png")));
    }//GEN-LAST:event_btn_ubahnamapenggunaMouseExited

    private void btn_ubahnamapenggunaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahnamapenggunaMousePressed
        btn_ubahnamapengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Press.png")));
    }//GEN-LAST:event_btn_ubahnamapenggunaMousePressed

    private void btn_ubahnamapenggunaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahnamapenggunaMouseReleased
        btn_ubahnamapengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Nama Pengguna_Hover.png")));
    }//GEN-LAST:event_btn_ubahnamapenggunaMouseReleased

    private void btn_ubahkatasandiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahkatasandiMouseEntered
        btn_ubahkatasandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Hover.png")));
    }//GEN-LAST:event_btn_ubahkatasandiMouseEntered

    private void btn_ubahkatasandiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahkatasandiMouseExited
        btn_ubahkatasandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi.png")));
    }//GEN-LAST:event_btn_ubahkatasandiMouseExited

    private void btn_ubahkatasandiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahkatasandiMousePressed
        btn_ubahkatasandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Press.png")));
    }//GEN-LAST:event_btn_ubahkatasandiMousePressed

    private void btn_ubahkatasandiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahkatasandiMouseReleased
        btn_ubahkatasandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Ubah Kata Sandi_Hover.png")));
    }//GEN-LAST:event_btn_ubahkatasandiMouseReleased

    private void btn_keluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseEntered
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Hover.png")));
    }//GEN-LAST:event_btn_keluarMouseEntered

    private void btn_keluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseExited
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar.png")));
    }//GEN-LAST:event_btn_keluarMouseExited

    private void btn_keluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMousePressed
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Press.png")));
    }//GEN-LAST:event_btn_keluarMousePressed

    private void btn_keluarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseReleased
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Keluar_Hover.png")));
    }//GEN-LAST:event_btn_keluarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_keluar;
    private javax.swing.JLabel btn_ubahkatasandi;
    private javax.swing.JLabel btn_ubahnamapengguna;
    private javax.swing.JLabel fieldIdSupplier;
    private javax.swing.JLabel fieldIdSupplier1;
    private javax.swing.JLabel fieldIdSupplier2;
    private javax.swing.JLabel fieldIdSupplier3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelKategori1;
    private javax.swing.JLabel labelKategori2;
    private javax.swing.JLabel labelKategori3;
    private javax.swing.JLabel labelPilihanTransaksi;
    private static javax.swing.JTextField txt_alamat;
    private static javax.swing.JTextField txt_idkaryawan;
    private static javax.swing.JTextField txt_namakaryawan;
    private static javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}
