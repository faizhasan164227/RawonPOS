/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import config.Config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Font;

/**
 *
 * @author Aryaaazr_
 */
public class Barang extends javax.swing.JInternalFrame {

    /**
     * Creates new form Barang
     */
    String sql;
    static String selectedBarangID;
    static String idlama;
    static String idbaru;
    static String selectedKategori;
    static String idbarang;
    static DefaultTableModel model;

    public Barang() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        tb_barang.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_barang.getTableHeader().setOpaque(false);
        tb_barang.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_barang.getTableHeader().setForeground(new Color(255, 255, 255));
        tb_barang.getRowHeight(25);
        tampilkan();
        tampilCombo();
    }

    public void idbarang(String kodejenis) {
        try {
            Connection con = (Connection) Config.configDB();
            String sql = "SELECT MAX(id_barang)as id_kategori FROM tb_barang WHERE id_barang LIKE '%" + kodejenis + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (kodejenis.equals("")) {
                txt_idbarang.setText("");
            } else {
                if (rs.next()) {
                    String Nol = "";
                    if (rs.getString("id_kategori") == null) {
                        Nol = "0";
                        txt_idbarang.setText(kodejenis + Nol + "1");
                    } else {
                        String NoJual = rs.getString("id_kategori").substring(2);
                        String AN = "" + (Integer.valueOf(NoJual) + 1);

                        if (AN.length() == 1) {
                            Nol = "0";
                        } else if (AN.length() == 2) {
                            Nol = "";
                        }
                        txt_idbarang.setText(kodejenis + Nol + AN);//sesuaikan dengan variable namenya
                    }
                    rs.close();
                    con.close();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();//penanganan masalah
        }
    }

    public static void tampilkan() {
        String[] judul = {"ID", "Kode Batang", "Nama Barang", "Jenis", "Jumlah", "Harga Beli", "Harga Jual"};
        model = new DefaultTableModel(judul, 0);
        tb_barang.setModel(model);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_barang.*, tb_kategori.nama_kategori FROM tb_barang JOIN tb_kategori ON tb_barang.id_kategori = tb_kategori.id_kategori");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(7)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void tampilCombo() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinaryPOS", "root", "");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tb_kategori");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cmb_kategori.addItem(rs.getString("nama_kategori"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        } catch (Exception e) {
        }
    }
//    public static void cekHarga(){
//    try{
//        if(Integer.parseInt(txt_hargajual.getText())<Integer.parseInt(txt_hargabeli.getText())){
//            JOptionPane.showMessageDialog(null, "Masukkan Harga Jual dengan Benar");
//        }
//    }
//    catch(Exception e){}
//    
//    }

    public void reset() {
        txt_kodebatang.setText("");
        txt_namabarang.setText("");
        cmb_kategori.setSelectedItem("Pilih Kategori Barang");
        txt_jumlah.setText("");
        txt_hargabeli.setText("");
        txt_hargajual.setText("");
    }

    public void setIdKategori() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_kategori");
            while (rs.next()) {
//                txt_idbarang.setText(rs.getString("id_barang"));
//                txt_kodebatang.setText(rs.getString("kode_batang"));
//                txt_namabarang.setText(rs.getString("nama_barang"));
//                cmb_kategori.setSelectedItem(rs.getString("nama_kategori"));
//                txt_jumlah.setText(rs.getString("jumlah"));
//                txt_hargabeli.setText(rs.getString("harga_beli"));
//                txt_hargajual.setText(rs.getString("harga_jual"));
                if (cmb_kategori.getSelectedItem().toString().toLowerCase().equals(rs.getString("nama_kategori").toLowerCase())) {
                    idbarang(rs.getString("id_kategori"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }

//        if(cmb_kategori.getSelectedItem().equals("Makanan Kemasan")){
//        idbarang("MK");
//    } else if (cmb_kategori.getSelectedItem().equals("Makanan Non Kemasan")){
//         idbarang("MN");
//    } else if (cmb_kategori.getSelectedItem().equals("Minuman Non Kemasan")){
//         idbarang("NN");
//    } else if (cmb_kategori.getSelectedItem().equals("Minuman Kemasan")){
//         idbarang("NK");
//    } else if (cmb_kategori.getSelectedItem().equals("Pilih Kategori Barang")){
//         idbarang("");
//    } else idbarang("TB");

//        if(cmb_kategori.getSelectedItem().equals("Makanan Kemasan")){
//        idbarang("MK");
//    } else if (cmb_kategori.getSelectedItem().equals("Makanan Non Kemasan")){
//         idbarang("MN");
//    } else if (cmb_kategori.getSelectedItem().equals("Minuman Non Kemasan")){
//         idbarang("NN");
//    } else if (cmb_kategori.getSelectedItem().equals("Minuman Kemasan")){
//         idbarang("NK");
//    } else if (cmb_kategori.getSelectedItem().equals("Pilih Kategori Barang")){
//         idbarang("");
//    } else idbarang("TB");
    }

    public static void refreshCombo() {
            System.out.println(cmb_kategori.getItemCount());
        for (int i =cmb_kategori.getItemCount()-1 ; i >0; i--) {
            cmb_kategori.removeItemAt(i);
        }
            tampilCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_daftarkategori = new javax.swing.JLabel();
        LabelNamaBarang = new javax.swing.JLabel();
        labelHargaJual = new javax.swing.JLabel();
        txt_hargajual = new javax.swing.JTextField();
        labelHargaBeli = new javax.swing.JLabel();
        txt_hargabeli = new javax.swing.JTextField();
        labelKategori = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        txt_namabarang = new javax.swing.JTextField();
        labelKodeBatang = new javax.swing.JLabel();
        txt_idbarang = new javax.swing.JTextField();
        labelIdBarang = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_barang = new javax.swing.JTable();
        cmb_kategori = new javax.swing.JComboBox<>();
        labelIdBarang5 = new javax.swing.JLabel();
        txt_kodebatang = new javax.swing.JTextField();
        labelNamaBarang = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        fieldStok = new javax.swing.JLabel();
        fieldIdBarang = new javax.swing.JLabel();
        fieldHargaJual = new javax.swing.JLabel();
        fieldHargaBeli = new javax.swing.JLabel();
        fieldNamaBarang = new javax.swing.JLabel();
        fieldKodeBatang = new javax.swing.JLabel();
        btnSearch = new javax.swing.JPanel();
        LabelSearch = new javax.swing.JLabel();
        labelLine = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_daftarkategori.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_daftarkategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori.png"))); // NOI18N
        btn_daftarkategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_daftarkategori.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_daftarkategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_daftarkategoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarkategoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarkategoriMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_daftarkategoriMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_daftarkategoriMouseReleased(evt);
            }
        });
        getContentPane().add(btn_daftarkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 160, 70));

        LabelNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 47.png"))); // NOI18N
        getContentPane().add(LabelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        labelHargaJual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHargaJual.setForeground(new java.awt.Color(34, 48, 96));
        labelHargaJual.setText("Harga Jual");
        labelHargaJual.setPreferredSize(new java.awt.Dimension(92, 17));
        getContentPane().add(labelHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 80, 30));

        txt_hargajual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hargajual.setBorder(null);
        txt_hargajual.setOpaque(false);
        txt_hargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargajualActionPerformed(evt);
            }
        });
        getContentPane().add(txt_hargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 280, 30));

        labelHargaBeli.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHargaBeli.setForeground(new java.awt.Color(34, 48, 96));
        labelHargaBeli.setText("Harga Beli");
        getContentPane().add(labelHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 30));

        txt_hargabeli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hargabeli.setBorder(null);
        txt_hargabeli.setOpaque(false);
        getContentPane().add(txt_hargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 280, 30));

        labelKategori.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKategori.setForeground(new java.awt.Color(34, 48, 96));
        labelKategori.setText("Kategori");
        getContentPane().add(labelKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        txt_jumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_jumlah.setBorder(null);
        txt_jumlah.setOpaque(false);
        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 60, 30));

        txt_namabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namabarang.setBorder(null);
        txt_namabarang.setOpaque(false);
        getContentPane().add(txt_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 280, 30));

        labelKodeBatang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelKodeBatang.setForeground(new java.awt.Color(34, 48, 96));
        labelKodeBatang.setText("Kode Batang");
        getContentPane().add(labelKodeBatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        txt_idbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idbarang.setBorder(null);
        txt_idbarang.setEnabled(false);
        txt_idbarang.setOpaque(false);
        getContentPane().add(txt_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, 30));

        labelIdBarang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdBarang.setForeground(new java.awt.Color(34, 48, 96));
        labelIdBarang.setText("ID Barang");
        getContentPane().add(labelIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        tb_barang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_barang.setRowHeight(25);
        tb_barang.setRowMargin(0);
        tb_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_barang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 338, 920, 350));

        cmb_kategori.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori Barang" }));
        cmb_kategori.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmb_kategoriFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmb_kategoriFocusLost(evt);
            }
        });
        cmb_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_kategoriMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmb_kategoriMouseReleased(evt);
            }
        });
        cmb_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kategoriActionPerformed(evt);
            }
        });
        cmb_kategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_kategoriKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_kategoriKeyReleased(evt);
            }
        });
        getContentPane().add(cmb_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 300, 30));

        labelIdBarang5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdBarang5.setForeground(new java.awt.Color(34, 48, 96));
        labelIdBarang5.setText("Jumlah");
        getContentPane().add(labelIdBarang5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 30));

        txt_kodebatang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_kodebatang.setBorder(null);
        txt_kodebatang.setOpaque(false);
        getContentPane().add(txt_kodebatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, 30));

        labelNamaBarang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaBarang.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaBarang.setText("Nama Barang");
        getContentPane().add(labelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 100, 30));

        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/add (4) 1.png"))); // NOI18N
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
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 60, 60));

        btnEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/edit-text 1.png"))); // NOI18N
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
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 60, 60));

        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/delete (2) 1.png"))); // NOI18N
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
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 60, 60));

        fieldStok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field stok.png"))); // NOI18N
        getContentPane().add(fieldStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 30));

        fieldIdBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text fielld id barang.png"))); // NOI18N
        getContentPane().add(fieldIdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 30));

        fieldHargaJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, 30));

        fieldHargaBeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 30));

        fieldNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 30));

        fieldKodeBatang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldKodeBatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLine, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(LabelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 40, 30));

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
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 490, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/background search_2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_barangMouseClicked
        int row = tb_barang.getSelectedRow();
        this.selectedBarangID = tb_barang.getValueAt(row, 0).toString();
//        System.out.println(this.selectedBarangID);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_barang.*, tb_kategori.nama_kategori FROM tb_barang JOIN tb_kategori ON tb_barang.id_kategori = tb_kategori.id_kategori WHERE id_barang ='" + selectedBarangID + "'");
            while (rs.next()) {
                txt_idbarang.setText(this.selectedBarangID);
                txt_kodebatang.setText(rs.getString("kode_batang"));
                txt_namabarang.setText(rs.getString("nama_barang"));
                cmb_kategori.setSelectedItem(rs.getString("nama_kategori"));
                txt_jumlah.setText(rs.getString("jumlah"));
                txt_hargabeli.setText(rs.getString("harga_beli"));
                txt_hargajual.setText(rs.getString("harga_jual"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_barangMouseClicked

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
    String idbarang = txt_idbarang.getText();
    String kodebatang = this.txt_kodebatang.getText();
    String nama = txt_namabarang.getText();
    String kategori = cmb_kategori.getSelectedItem().toString();
    String id_kategori = "";
    String sql = "SELECT id_kategori FROM tb_kategori WHERE nama_kategori = ?";
    
    PreparedStatement psKategori = con.prepareStatement(sql);
    psKategori.setString(1, kategori);
    ResultSet rsKategori = psKategori.executeQuery();
    
    while (rsKategori.next()) {
        id_kategori = rsKategori.getString("id_kategori");
    }
    
    try {
        Long.parseLong(txt_jumlah.getText());
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan jumlah barang dengan benar");
    }
    
    try {
        Long.parseLong(txt_hargajual.getText());
        Long.parseLong(txt_hargabeli.getText());
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan harga dengan benar");
    }
    
    String stok = txt_jumlah.getText();
    String hargabeli = txt_hargabeli.getText();
    String hargajual = txt_hargajual.getText();
    
    if (Integer.parseInt(txt_hargajual.getText()) <= Integer.parseInt(txt_hargabeli.getText())) {
        throw new CustomException("Masukkan Harga Jual dengan Benar");
    } else {
        PreparedStatement ps = con.prepareStatement("INSERT INTO tb_barang VALUES(?, ?, ?, ?, ?, ?, ?)");
        ps.setString(1, idbarang);
        ps.setString(2, kodebatang);
        ps.setString(3, nama);
        ps.setString(4, id_kategori);
        ps.setString(5, stok);
        ps.setLong(6, Long.parseLong(hargabeli));
        ps.setLong(7, Long.parseLong(hargajual));
        
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Data barang berhasil ditambahkan");
        idbarang("");
        tampilkan();
        reset();
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Pilih kategori terlebih dahulu");
    Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

// User Defined Exception


    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
    btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
    String idbarang = txt_idbarang.getText();
    System.out.println(idbarang);
    String kodebatang = this.txt_kodebatang.getText();
    String nama = txt_namabarang.getText();
    String kategori = cmb_kategori.getSelectedItem().toString();
    String id_kategori = "";
    String sql = "SELECT id_kategori FROM tb_kategori WHERE nama_kategori = ?";
    
    PreparedStatement psKategori = con.prepareStatement(sql);
    psKategori.setString(1, kategori);
    ResultSet rsKategori = psKategori.executeQuery();
    
    while (rsKategori.next()) {
        id_kategori = rsKategori.getString("id_kategori");
    }
    
    try {
        Long.parseLong(txt_jumlah.getText());
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan jumlah barang dengan benar");
    }
    
    try {
        Long.parseLong(txt_hargajual.getText());
        Long.parseLong(txt_hargabeli.getText());
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan harga dengan benar");
    }
    
    String stok = txt_jumlah.getText();
    String hargabeli = txt_hargabeli.getText();
    String hargajual = txt_hargajual.getText();
    
    if (Integer.parseInt(txt_hargajual.getText()) < Integer.parseInt(txt_hargabeli.getText())) {
        throw new CustomException("Masukkan Harga Jual dengan Benar");
    } else {
        System.out.println(idbarang);
        PreparedStatement ps = con.prepareStatement("UPDATE tb_barang SET id_barang = ?, kode_batang = ?, nama_barang = ?, id_kategori = ?, jumlah = ?, harga_beli = ?, harga_jual = ? WHERE id_barang = ?");
        ps.setString(1, idbarang);
        ps.setString(2, kodebatang);
        ps.setString(3, nama);
        ps.setString(4, id_kategori);
        ps.setString(5, stok);
        ps.setString(6, hargabeli);
        ps.setString(7, hargajual);
        ps.setString(8, this.selectedBarangID);
        
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Data barang berhasil diedit");
        tampilkan();
        reset();
    }
} catch (SQLException ex) {
    Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        try {
            btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Press.png")));
            int hapus = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus data barang?", "Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (hapus == JOptionPane.YES_OPTION) {
                if (this.selectedBarangID == null) {
                    JOptionPane.showMessageDialog(null, "Pilih barang yang ingin dihapus");
                } else {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
                    PreparedStatement ps = con.prepareStatement("DELETE FROM tb_barang WHERE id_barang = '" + this.selectedBarangID + "'");
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "data barang berhasil dihapus");
                    tampilkan();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak bisa dihapus karena terdapat data barang di transaksi");
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void cmb_kategoriKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_kategoriKeyReleased

    }//GEN-LAST:event_cmb_kategoriKeyReleased

    private void cmb_kategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_kategoriKeyPressed
//        setIdKategori();
    }//GEN-LAST:event_cmb_kategoriKeyPressed

    private void cmb_kategoriFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmb_kategoriFocusGained
//        setIdKategori();
    }//GEN-LAST:event_cmb_kategoriFocusGained

    private void cmb_kategoriFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmb_kategoriFocusLost
        setIdKategori();
    }//GEN-LAST:event_cmb_kategoriFocusLost

    private void cmb_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_kategoriMouseClicked
//    setIdKategori();
    }//GEN-LAST:event_cmb_kategoriMouseClicked

    private void cmb_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kategoriActionPerformed
        txt_kodebatang.grabFocus();
    }//GEN-LAST:event_cmb_kategoriActionPerformed

    private void txt_hargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargajualActionPerformed

    private void btn_daftarkategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarkategoriMouseClicked
        DaftarKategori a = new DaftarKategori();
        a.setVisible(true);
    }//GEN-LAST:event_btn_daftarkategoriMouseClicked

    private void btn_daftarkategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarkategoriMouseEntered
        btn_daftarkategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori_Hover.png")));
    }//GEN-LAST:event_btn_daftarkategoriMouseEntered

    private void btn_daftarkategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarkategoriMouseExited
        btn_daftarkategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori.png")));
    }//GEN-LAST:event_btn_daftarkategoriMouseExited

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        String[] judul = {"ID", "Kode Batang", "Nama Barang", "Jenis", "Jumlah", "Harga Beli", "Harga Jual"};
        model = new DefaultTableModel(judul, 0);
        tb_barang.setModel(model);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos", "root", "");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_barang.*, tb_kategori.nama_kategori FROM tb_barang JOIN tb_kategori ON tb_barang.id_kategori = tb_kategori.id_kategori WHERE tb_barang.nama_barang LIKE '%" + txt_cari.getText() + "%'");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(7)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void txt_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusLost
        if (txt_cari.getText().equals("")) {
            txt_cari.setText("Cari berdasarkan nama");
            txt_cari.setForeground(new Color(153, 153, 153));
        } else {
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusLost

    private void txt_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusGained
        if (txt_cari.getText().equals("Cari berdasarkan nama")) {
            txt_cari.setText("");
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusGained

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
//        LabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori.png")));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah.png")));
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit.png")));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus.png")));
    }//GEN-LAST:event_btnHapusMouseExited

    private void btn_daftarkategoriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarkategoriMousePressed
        btn_daftarkategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori_Press.png")));
    }//GEN-LAST:event_btn_daftarkategoriMousePressed

    private void btnTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMousePressed
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Press.png")));
    }//GEN-LAST:event_btnTambahMousePressed

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Press.png")));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Press.png")));
    }//GEN-LAST:event_btnHapusMousePressed

    private void btn_daftarkategoriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarkategoriMouseReleased
        btn_daftarkategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Daftar Kategori_Hover.png")));
    }//GEN-LAST:event_btn_daftarkategoriMouseReleased

    private void btnTambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseReleased
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Tambah_Hover.png")));
    }//GEN-LAST:event_btnTambahMouseReleased

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Edit_Hover.png")));
    }//GEN-LAST:event_btnEditMouseReleased

    private void btnHapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseReleased
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Button Hapus_Hover.png")));
    }//GEN-LAST:event_btnHapusMouseReleased

    private void cmb_kategoriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_kategoriMouseReleased
//        setIdKategori();
    }//GEN-LAST:event_cmb_kategoriMouseReleased

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNamaBarang;
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel btn_daftarkategori;
    private static javax.swing.JComboBox<String> cmb_kategori;
    private javax.swing.JLabel fieldHargaBeli;
    private javax.swing.JLabel fieldHargaJual;
    private javax.swing.JLabel fieldIdBarang;
    private javax.swing.JLabel fieldKodeBatang;
    private javax.swing.JLabel fieldNamaBarang;
    private javax.swing.JLabel fieldStok;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHargaBeli;
    private javax.swing.JLabel labelHargaJual;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelIdBarang5;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelKodeBatang;
    private javax.swing.JLabel labelLine;
    private javax.swing.JLabel labelNamaBarang;
    private static javax.swing.JTable tb_barang;
    private javax.swing.JTextField txt_cari;
    private static javax.swing.JTextField txt_hargabeli;
    private static javax.swing.JTextField txt_hargajual;
    private javax.swing.JTextField txt_idbarang;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kodebatang;
    private javax.swing.JTextField txt_namabarang;
    // End of variables declaration//GEN-END:variables
}
