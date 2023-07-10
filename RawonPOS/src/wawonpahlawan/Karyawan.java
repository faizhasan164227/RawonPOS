/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import config.Config;
import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Karyawan extends javax.swing.JInternalFrame {

    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    String sql;
    static DefaultTableModel model;
    static String selectedKaryawanID;

    public Karyawan() {
        initComponents();
        tampilkan();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        tb_karyawan.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_karyawan.getTableHeader().setOpaque(false);
        tb_karyawan.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_karyawan.getTableHeader().setForeground(new Color(255, 255, 255));
        tb_karyawan.getRowHeight(25);
        idkaryawan();
    }

    public void idkaryawan() {
        try {
            con = (Connection) Config.configDB();
            String sql = "SELECT MAX(id_karyawan)as max FROM tb_karyawan";
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String NoJual = rs.getString("max").substring(3);
                String AN = "" + (Integer.valueOf(NoJual) + 1);
                String Nol = "";
                if (AN.length() == 1) {
                    Nol = "0";
                } else if (AN.length() == 2) {
                    Nol = "";
                }
                txt_idkaryawan.setText("KR" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                txt_idkaryawan.setText("KR01");//sesuaikan dengan variable namenya
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
    }

    public static void tampilkan() {
        String[] judul = {"ID", "Nama Karyawan", "Jenis Kelamin", "Alamat", "No HP"};
        model = new DefaultTableModel(judul, 0);
        tb_karyawan.setModel(model);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_karyawan");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reset() {
        txt_namakaryawan.setText("");
        txt_jeniskelamin.setText("Pria");
        txt_alamat.setText("");
        txt_nohp.setText("");
        txt_namapengguna.setText("");
        txt_katasandi.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_katasandi = new javax.swing.JPasswordField();
        fieldKataSandi = new javax.swing.JLabel();
        txt_namapengguna = new javax.swing.JTextField();
        labelIdKaryawan = new javax.swing.JLabel();
        labelNamaKaryawan = new javax.swing.JLabel();
        fieldNamaPengguna = new javax.swing.JLabel();
        txt_nohp = new javax.swing.JTextField();
        txt_idkaryawan = new javax.swing.JTextField();
        txt_namakaryawan = new javax.swing.JTextField();
        txt_jeniskelamin = new javax.swing.JLabel();
        cmb_jeniskelamin = new javax.swing.JComboBox<>();
        label_namapengguna = new javax.swing.JLabel();
        labelKataSandi = new javax.swing.JLabel();
        fieldNoHp = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        fieldAlamat = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelNoHp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_karyawan = new javax.swing.JTable();
        btnTambah = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        LabelNamaBarang1 = new javax.swing.JLabel();
        fieldIdKaryawan = new javax.swing.JLabel();
        fieldNamaKaryawan = new javax.swing.JLabel();
        btnSearch = new javax.swing.JPanel();
        LabelSearch = new javax.swing.JLabel();
        labelLine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_katasandi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_katasandi.setBorder(null);
        txt_katasandi.setOpaque(false);
        txt_katasandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_katasandiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_katasandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 280, 30));

        fieldKataSandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, 30));

        txt_namapengguna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namapengguna.setBorder(null);
        txt_namapengguna.setOpaque(false);
        getContentPane().add(txt_namapengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 280, 30));

        labelIdKaryawan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdKaryawan.setForeground(new java.awt.Color(34, 48, 96));
        labelIdKaryawan.setText("ID Karyawan");
        getContentPane().add(labelIdKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        labelNamaKaryawan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaKaryawan.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaKaryawan.setText("Nama Karyawan");
        getContentPane().add(labelNamaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        fieldNamaPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 30));

        txt_nohp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nohp.setBorder(null);
        txt_nohp.setOpaque(false);
        getContentPane().add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 280, 30));

        txt_idkaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idkaryawan.setBorder(null);
        txt_idkaryawan.setEnabled(false);
        txt_idkaryawan.setOpaque(false);
        getContentPane().add(txt_idkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 280, 30));

        txt_namakaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namakaryawan.setBorder(null);
        txt_namakaryawan.setOpaque(false);
        getContentPane().add(txt_namakaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, 30));

        txt_jeniskelamin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jeniskelamin.setForeground(new java.awt.Color(34, 48, 96));
        txt_jeniskelamin.setText("Jenis Kelamin");
        getContentPane().add(txt_jeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        cmb_jeniskelamin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));
        cmb_jeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jeniskelaminActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_jeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 300, -1));

        label_namapengguna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_namapengguna.setForeground(new java.awt.Color(34, 48, 96));
        label_namapengguna.setText("Nama Pengguna");
        getContentPane().add(label_namapengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 30));

        labelKataSandi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKataSandi.setForeground(new java.awt.Color(34, 48, 96));
        labelKataSandi.setText("Kata Sandi");
        getContentPane().add(labelKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 30));

        fieldNoHp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 30));

        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setBorder(null);
        txt_alamat.setOpaque(false);
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 30));

        fieldAlamat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 30));

        labelAlamat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(34, 48, 96));
        labelAlamat.setText("Alamat");
        getContentPane().add(labelAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        labelNoHp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNoHp.setForeground(new java.awt.Color(34, 48, 96));
        labelNoHp.setText("No. Handphone");
        getContentPane().add(labelNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        tb_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_karyawan.setRowHeight(25);
        tb_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_karyawan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 920, 320));

        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png"))); // NOI18N
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTambahMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTambahMouseReleased(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 60, 60));

        btnEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit.png"))); // NOI18N
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditMouseReleased(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 60, 60));

        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png"))); // NOI18N
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHapusMouseReleased(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 60, 60));

        txt_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cari.setText("Cari berdasarkan nama");
        txt_cari.setBorder(null);
        txt_cari.setOpaque(false);
        txt_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cariFocusLost(evt);
            }
        });
        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 470, 30));

        LabelNamaBarang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 48.png"))); // NOI18N
        getContentPane().add(LabelNamaBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        fieldIdKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        fieldNamaKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        btnSearch.setBackground(new java.awt.Color(246, 248, 249));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });

        LabelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/magnifying-glass (4) 1_1.png"))); // NOI18N
        LabelSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Line 28_1.png"))); // NOI18N

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchLayout.createSequentialGroup()
                .addComponent(labelLine, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLine, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(LabelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/background search_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
    String idkaryawan = txt_idkaryawan.getText();
    String nama = txt_namakaryawan.getText();
    String jk = cmb_jeniskelamin.getSelectedItem().toString();
    String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    
    try {
        Long.parseLong(txt_nohp.getText());
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan nomor HP dengan benar");
    }
    
    String alamat = txt_alamat.getText();
    String namapengguna = txt_namapengguna.getText();
    String katasandi = txt_katasandi.getText();
    
    PreparedStatement ps = con.prepareStatement("INSERT INTO tb_karyawan VALUES(?, ?, ?, ?, ?, ?, ?, 'kasirr')");
    ps.setString(1, idkaryawan);
    ps.setString(2, nama);
    ps.setString(3, jk);
    ps.setString(4, alamat);
    ps.setString(5, txt_nohp.getText());
    ps.setString(6, namapengguna);
    ps.setString(7, katasandi);
    
    ps.execute();
    
    JOptionPane.showMessageDialog(null, "Data karyawan berhasil ditambahkan");
    idkaryawan();
    tampilkan();
    reset();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Nama Pengguna telah terdaftar");
    Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

// User Defined Exception


    }//GEN-LAST:event_btnTambahMouseClicked

    private void cmb_jeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_jeniskelaminActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        try {
            int hapus = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus data Karyawan?", "Hapus",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (hapus == JOptionPane.YES_OPTION) {
                if (this.selectedKaryawanID == null) {
                    JOptionPane.showMessageDialog(null, "Pilih karyawan yang ingin dihapus");
                } else {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
                    PreparedStatement ps = con.prepareStatement("DELETE FROM tb_karyawan WHERE id_karyawan = '" + this.selectedKaryawanID + "'");
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "data karyawan berhasil dihapus");
                    idkaryawan();
                    tampilkan();
                    reset();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak bisa dihapus karena terdapat data karyawan di transaksi");
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void tb_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_karyawanMouseClicked
        int row = tb_karyawan.getSelectedRow();
        this.selectedKaryawanID = tb_karyawan.getValueAt(row, 0).toString();
        txt_namapengguna.setEnabled(false);
        txt_katasandi.setEnabled(false);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_karyawan WHERE id_karyawan ='" + this.selectedKaryawanID + "'");
            while (rs.next()) {
                txt_idkaryawan.setText(rs.getString("id_karyawan"));
                txt_namakaryawan.setText(rs.getString("nama_karyawan"));
                cmb_jeniskelamin.setSelectedItem(rs.getString("jenis_kelamin"));
                txt_alamat.setText(rs.getString("alamat_karyawan"));
                txt_nohp.setText(rs.getString("nohp_karyawan"));
                txt_namapengguna.setText(rs.getString("nama_pengguna"));
                txt_katasandi.setText(rs.getString("kata_sandi"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_karyawanMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
    String idkaryawan = txt_idkaryawan.getText();
    String nama = txt_namakaryawan.getText();
    String jk = cmb_jeniskelamin.getSelectedItem().toString();
    
    try {
        Long.parseLong(txt_nohp.getText());
        String nohp = txt_nohp.getText();
        String alamat = txt_alamat.getText();
        
        PreparedStatement ps = con.prepareStatement("UPDATE tb_karyawan SET nama_karyawan = ?, jenis_kelamin = ?, alamat_karyawan = ?, nohp_karyawan = ? WHERE id_karyawan = ?");
        ps.setString(1, nama);
        ps.setString(2, jk);
        ps.setString(3, alamat);
        ps.setString(4, nohp);
        ps.setString(5, idkaryawan);
        
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Data karyawan berhasil diedit");
        tampilkan();
        reset();
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan Nomor HP dengan benar");
    }
} catch (SQLException ex) {
    Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(this, ex.getMessage());
}
    }//GEN-LAST:event_btnEditMouseClicked

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        String[] judul = {"ID", "Nama Karyawan", "Jenis Kelamin", "Alamat", "No HP"};
        model = new DefaultTableModel(judul, 0);
        tb_karyawan.setModel(model);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_karyawan WHERE nama_karyawan LIKE '%" + txt_cari.getText() + "%'");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void txt_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusGained
        if (txt_cari.getText().equals("Cari berdasarkan nama")) {
            txt_cari.setText("");
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusGained

    private void txt_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusLost
        if (txt_cari.getText().equals("")) {
            txt_cari.setText("Cari berdasarkan nama");
            txt_cari.setForeground(new Color(153, 153, 153));
        } else {
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusLost

    private void txt_katasandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_katasandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_katasandiActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png")));
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMousePressed
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Press.png")));
    }//GEN-LAST:event_btnTambahMousePressed

    private void btnTambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseReleased
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseReleased

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit.png")));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Press.png")));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseReleased

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png")));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Press.png")));
    }//GEN-LAST:event_btnHapusMousePressed

    private void btnHapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseReleased
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseReleased

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        //        LabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori.png")));
    }//GEN-LAST:event_btnSearchMouseEntered

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNamaBarang1;
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JComboBox<String> cmb_jeniskelamin;
    private javax.swing.JLabel fieldAlamat;
    private javax.swing.JLabel fieldIdKaryawan;
    private javax.swing.JLabel fieldKataSandi;
    private javax.swing.JLabel fieldNamaKaryawan;
    private javax.swing.JLabel fieldNamaPengguna;
    private javax.swing.JLabel fieldNoHp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelIdKaryawan;
    private javax.swing.JLabel labelKataSandi;
    private javax.swing.JLabel labelLine;
    private javax.swing.JLabel labelNamaKaryawan;
    private javax.swing.JLabel labelNoHp;
    private javax.swing.JLabel label_namapengguna;
    private static javax.swing.JTable tb_karyawan;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_idkaryawan;
    private javax.swing.JLabel txt_jeniskelamin;
    private javax.swing.JPasswordField txt_katasandi;
    private javax.swing.JTextField txt_namakaryawan;
    private javax.swing.JTextField txt_namapengguna;
    private javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}
