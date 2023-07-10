/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import config.Config;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Penjualan extends javax.swing.JInternalFrame {

    Connection con;
    ResultSet rs;
    int total_bayar;
    String idpenjualan;
    String tgl_format;
    DefaultTableModel modelpj;
    TableModelListener tbmodel;
    static String selectedBarangID;
    boolean result;
    int row;
    int[] rows;
    ArrayList<String> idlist = new ArrayList<String>();

    public Penjualan() {
        initComponents();
        idTransaksi();
        tb_penjualan.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_penjualan.getTableHeader().setOpaque(false);
        tb_penjualan.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_penjualan.getTableHeader().setForeground(new Color(255, 255, 255));
        tb_penjualan.getRowHeight(25);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        txt_tunai.setEnabled(false);
        txt_tunai.setText("0");
        txt_kembalian.setText("0");
        txt_total.setText("0");
//        loadTable();
        tampilkanpenjualan();
    }

    public void idTransaksi() {
        try {
            java.util.Date tgl = new java.util.Date();
            java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("ddMMyy");
            tgl_format = kal.format(tgl);
            con = (Connection) Config.configDB();
            String sql = "SELECT MAX(id_penjualan) as id_penjualan FROM tb_penjualan WHERE id_penjualan LIKE 'TJ" + tgl_format + "%'";
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String Nol = "";
                if (rs.getString("id_penjualan")==null) {
                    Nol = "000";
                    txt_idtransaksi.setText("TJ" + tgl_format + Nol + "1");
                } else {
                    String NoJual = rs.getString("id_penjualan").substring(8);
                    String AN = "" + (Integer.valueOf(NoJual) + 1);
                    if (AN.length() == 1) {
                        Nol = "000";
                    } else if (AN.length() == 2) {
                        Nol = "00";
                    } else if (AN.length() == 3) {
                        Nol = "0";
                    } else if (AN.length() == 4) {
                        Nol = "";
                    }
                    txt_idtransaksi.setText("TJ" + tgl_format + Nol + AN);//sesuaikan dengan variable namenya
                }
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
    }

    private void _settotal() {
        int row = tb_penjualan.getRowCount();
        int total = 0;
        for (int i = 0; i < row; i++) {
            int harga_barang = Integer.parseInt(tb_penjualan.getValueAt(i, 2).toString()); //22000
            int jumlah = Integer.parseInt(tb_penjualan.getValueAt(i, 3).toString()); //11
            total = total + (harga_barang * jumlah);
        }
        this.total_bayar = total;
        txt_total.setText(String.valueOf(this.total_bayar));
    }

    public void tampilkanpenjualan() {
        String[] judul = {"ID", "Nama Barang", "Harga", "Jumlah"};
        modelpj = new DefaultTableModel(judul, 0);
        tb_penjualan.setModel(modelpj);

    }

    public void reset() {
        txt_idbarang.setText("");
        txt_jumlah.setText("0");
        txt_namabarang.setText("");
        txt_harga.setText("0");
        txt_kodebatang.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_penjualan = new javax.swing.JTable();
        LabelPenjualan = new javax.swing.JLabel();
        btn_daftarbarang = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        btn_bayar = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        ImageTxtTotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        label_kodebatang = new javax.swing.JLabel();
        txt_kodebatang = new javax.swing.JTextField();
        ImageTxtKembalian1 = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        ImageTxtKembalian = new javax.swing.JLabel();
        labelKembalian = new javax.swing.JLabel();
        txt_tunai = new javax.swing.JTextField();
        ImageTxtTunai = new javax.swing.JLabel();
        labelTunai = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        ImageTxtHarga = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        txt_namabarang = new javax.swing.JTextField();
        ImageTxtNamaBarang = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        ImageTxtJumlah = new javax.swing.JLabel();
        labelJumlah = new javax.swing.JLabel();
        txt_idbarang = new javax.swing.JTextField();
        ImageTxtIdBarang = new javax.swing.JLabel();
        labelIdBarang = new javax.swing.JLabel();
        txt_idtransaksi = new javax.swing.JTextField();
        ImageTxtIdTransaksi = new javax.swing.JLabel();
        labelIdTransaksi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_penjualan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tb_penjualan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_penjualan.setFocusable(false);
        tb_penjualan.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_penjualan.setRowHeight(25);
        tb_penjualan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_penjualan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 920, 280));

        LabelPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Icon Penjualan.png"))); // NOI18N
        getContentPane().add(LabelPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_daftarbarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang.png"))); // NOI18N
        btn_daftarbarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_daftarbarang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_daftarbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_daftarbarangMouseReleased(evt);
            }
        });
        getContentPane().add(btn_daftarbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 70));

        btn_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/tambah.png"))); // NOI18N
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahMousePressed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 60, 60));

        btn_bayar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout.png"))); // NOI18N
        btn_bayar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bayarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bayarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bayarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_bayarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_bayarMouseReleased(evt);
            }
        });
        getContentPane().add(btn_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 60, 60));

        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/hapus.png"))); // NOI18N
        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hapusMousePressed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 60, 60));

        txt_total.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txt_total.setText("0");
        txt_total.setBorder(null);
        txt_total.setEnabled(false);
        txt_total.setOpaque(false);
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 290, 80));

        ImageTxtTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field total.png"))); // NOI18N
        getContentPane().add(ImageTxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, 80));

        labelTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label Total.png"))); // NOI18N
        getContentPane().add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 100, 40));

        label_kodebatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kode_batang.png"))); // NOI18N
        getContentPane().add(label_kodebatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 30));

        txt_kodebatang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_kodebatang.setBorder(null);
        txt_kodebatang.setOpaque(false);
        txt_kodebatang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebatangActionPerformed(evt);
            }
        });
        txt_kodebatang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kodebatangKeyReleased(evt);
            }
        });
        getContentPane().add(txt_kodebatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 290, 30));

        ImageTxtKembalian1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtKembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 300, 30));

        txt_kembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_kembalian.setText("0");
        txt_kembalian.setBorder(null);
        txt_kembalian.setEnabled(false);
        txt_kembalian.setOpaque(false);
        getContentPane().add(txt_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 290, 30));

        ImageTxtKembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 30));

        labelKembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label Kembalian.png"))); // NOI18N
        getContentPane().add(labelKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 100, 30));

        txt_tunai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tunai.setText("0");
        txt_tunai.setBorder(null);
        txt_tunai.setOpaque(false);
        txt_tunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tunaiKeyReleased(evt);
            }
        });
        getContentPane().add(txt_tunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 290, 30));

        ImageTxtTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 30));

        labelTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label Tunai.png"))); // NOI18N
        getContentPane().add(labelTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        txt_harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_harga.setText("0");
        txt_harga.setBorder(null);
        txt_harga.setEnabled(false);
        txt_harga.setOpaque(false);
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 290, 30));

        ImageTxtHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 30));

        labelHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label Harga.png"))); // NOI18N
        getContentPane().add(labelHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));

        txt_namabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namabarang.setBorder(null);
        txt_namabarang.setEnabled(false);
        txt_namabarang.setOpaque(false);
        getContentPane().add(txt_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 290, 30));

        ImageTxtNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 30));

        labelNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label Nama Barang.png"))); // NOI18N
        getContentPane().add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        txt_jumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_jumlah.setText("0");
        txt_jumlah.setBorder(null);
        txt_jumlah.setOpaque(false);
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 60, 30));

        ImageTxtJumlah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field jumlah.png"))); // NOI18N
        getContentPane().add(ImageTxtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, 30));

        labelJumlah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label jumlah.png"))); // NOI18N
        getContentPane().add(labelJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 60, 30));

        txt_idbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idbarang.setBorder(null);
        txt_idbarang.setEnabled(false);
        txt_idbarang.setOpaque(false);
        getContentPane().add(txt_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, 30));

        ImageTxtIdBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text fielld id barang.png"))); // NOI18N
        ImageTxtIdBarang.setText("jLabel10");
        getContentPane().add(ImageTxtIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 30));

        labelIdBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label id Barang.png"))); // NOI18N
        getContentPane().add(labelIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 30));

        txt_idtransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idtransaksi.setBorder(null);
        txt_idtransaksi.setEnabled(false);
        txt_idtransaksi.setOpaque(false);
        getContentPane().add(txt_idtransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 290, 30));

        ImageTxtIdTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(ImageTxtIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, 30));

        labelIdTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/label id transaksi_1.png"))); // NOI18N
        getContentPane().add(labelIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Background Penjualan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_daftarbarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseEntered
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Hover.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseEntered

    private void btn_daftarbarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseExited
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseExited

    private void btn_daftarbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseClicked
        DaftarBarang a = new DaftarBarang();
        a.setVisible(true);
    }//GEN-LAST:event_btn_daftarbarangMouseClicked

    private void txt_tunaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tunaiKeyReleased
        txt_kembalian.setText(String.valueOf(Integer.parseInt(txt_tunai.getText()) - this.total_bayar));
    }//GEN-LAST:event_txt_tunaiKeyReleased

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        try {
    txt_tunai.setEnabled(true);
    int jumlah = Integer.parseInt(txt_jumlah.getText());
    this.idpenjualan = txt_idtransaksi.getText();
    String idbarang = txt_idbarang.getText();
    String namabarang = txt_namabarang.getText();
    String harga = txt_harga.getText();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
    String query = "SELECT jumlah FROM tb_barang WHERE id_barang= ?";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, idbarang);
    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
        if (txt_jumlah.getText().isEmpty() || jumlah == 0) {
            throw new CustomException("Masukkan jumlah barang");
        } else {
            int stok = Integer.parseInt(rs.getString("jumlah"));
            if (stok >= jumlah) {
                boolean result = idlist.contains(idbarang);
                if (!result) {
                    idlist.add(idbarang);
                    String data[] = {idbarang, namabarang, harga, String.valueOf(jumlah)};
                    modelpj.addRow(data);
                    _settotal();
                    reset();
                } else {
                    JOptionPane.showMessageDialog(null, "Data barang sudah terinput");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Jumlah barang tidak cukup");
            }
        }
    }
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Masukkan jumlah dengan benar");
} catch (SQLException ex) {
    Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

// User Defined Exception


    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        int row = tb_penjualan.getSelectedRow();//0
        idlist.remove(row);
        modelpj.removeRow(row);
        _settotal();
        reset();
        JOptionPane.showMessageDialog(null, "Data Transaksi Penjualan berhasil dihapus");
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void btn_bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bayarMouseClicked
        int rows = tb_penjualan.getRowCount();
        String idkaryawan = Login.idkaryawan;
        String query;
        PreparedStatement ps;
        try {
            txt_tunai.setEnabled(true);
            Integer.parseInt(txt_tunai.getText());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            try {
                con.setAutoCommit(false);
                query = "INSERT INTO tb_penjualan VALUES ('" + idpenjualan + "', now(),'" + this.total_bayar + "','" + idkaryawan + "','" + txt_tunai.getText() + "','" + txt_kembalian.getText() + "')";
                ps = con.prepareStatement(query);
                ps.execute();
                for (int i = 0; i < rows; i++) {
                    query = "INSERT INTO tb_detail_penjualan VALUES ('" + idpenjualan + "','" + tb_penjualan.getValueAt(i, 0).toString() + "',"
                            + "'" + tb_penjualan.getValueAt(i, 3).toString() + "')";
                    ps = con.prepareStatement(query);
                    ps.execute();
//                        System.out.println(Integer.parseInt(tb_penjualan.getValueAt(i, 3).toString()));
                    query = "UPDATE tb_barang SET jumlah = jumlah"
                            + " - " + (Integer.parseInt(tb_penjualan.getValueAt(i, 3).toString())) + " WHERE id_barang = '"
                            + "" + tb_penjualan.getValueAt(i, 0).toString() + "'";
                    ps = con.prepareStatement(query);
                    ps.execute();
                }
                if (Integer.valueOf(txt_tunai.getText()) >= this.total_bayar) {
                    con.commit();
                    JOptionPane.showMessageDialog(null, "Data Transaksi Penjualan berhasil ditambahkan");
                    idlist.clear();
                    reset();
                    txt_tunai.setText("0");
                    txt_kembalian.setText("0");
                    txt_total.setText("0");
                    modelpj.setRowCount(0);
                    idTransaksi();
                    //print
                    //--print
                    txt_tunai.setEnabled(false);
                    txt_kembalian.setText("0");
                } else {
                    JOptionPane.showMessageDialog(null, "Uang yang dibayarkan tidak cukup");
                    con.close();
                }
            } catch (Exception e) {
                con.rollback();
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukkan Uang Tunai dengan Benar");
        }
    }//GEN-LAST:event_btn_bayarMouseClicked

    private void txt_kodebatangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebatangActionPerformed

    }//GEN-LAST:event_txt_kodebatangActionPerformed

    private void txt_kodebatangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodebatangKeyReleased
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_barang WHERE kode_batang ='" + txt_kodebatang.getText() + "'");
            while (rs.next()) {
                txt_idbarang.setText(rs.getString("id_barang"));
                txt_namabarang.setText(rs.getString("nama_barang"));
                txt_harga.setText(rs.getString("harga_jual"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_kodebatangKeyReleased

    private void btn_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseEntered
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btn_tambahMouseEntered

    private void btn_hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseEntered
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btn_hapusMouseEntered

    private void btn_bayarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bayarMouseEntered
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Hover.png")));
    }//GEN-LAST:event_btn_bayarMouseEntered

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png")));
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseExited
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png")));
    }//GEN-LAST:event_btn_hapusMouseExited

    private void btn_bayarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bayarMouseExited
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout.png")));
    }//GEN-LAST:event_btn_bayarMouseExited

    private void btn_daftarbarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMousePressed
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Press.png")));
    }//GEN-LAST:event_btn_daftarbarangMousePressed

    private void btn_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMousePressed
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Press.png")));
    }//GEN-LAST:event_btn_tambahMousePressed

    private void btn_hapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMousePressed
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Press.png")));
    }//GEN-LAST:event_btn_hapusMousePressed

    private void btn_bayarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bayarMousePressed
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Press.png")));
    }//GEN-LAST:event_btn_bayarMousePressed

    private void btn_daftarbarangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarbarangMouseReleased
        btn_daftarbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Barang_Hover.png")));
    }//GEN-LAST:event_btn_daftarbarangMouseReleased

    private void btn_bayarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bayarMouseReleased
        btn_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Checkout_Hover.png")));
    }//GEN-LAST:event_btn_bayarMouseReleased

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageTxtHarga;
    private javax.swing.JLabel ImageTxtIdBarang;
    private javax.swing.JLabel ImageTxtIdTransaksi;
    private javax.swing.JLabel ImageTxtJumlah;
    private javax.swing.JLabel ImageTxtKembalian;
    private javax.swing.JLabel ImageTxtKembalian1;
    private javax.swing.JLabel ImageTxtNamaBarang;
    private javax.swing.JLabel ImageTxtTotal;
    private javax.swing.JLabel ImageTxtTunai;
    private javax.swing.JLabel LabelPenjualan;
    private javax.swing.JLabel btn_bayar;
    private javax.swing.JLabel btn_daftarbarang;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelIdTransaksi;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelKembalian;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTunai;
    private javax.swing.JLabel label_kodebatang;
    private javax.swing.JTable tb_penjualan;
    public static javax.swing.JTextField txt_harga;
    public static javax.swing.JTextField txt_idbarang;
    public javax.swing.JTextField txt_idtransaksi;
    public javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_kodebatang;
    public static javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_tunai;
    // End of variables declaration//GEN-END:variables
}
