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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Supplier extends javax.swing.JInternalFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    String sql;
    static DefaultTableModel model;
    static String selectedSupplierID;
    public Supplier() {
        initComponents();
        tampilkan();
        idsupplier();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        tb_supplier.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_supplier.getTableHeader().setOpaque(false);
        tb_supplier.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_supplier.getTableHeader().setForeground(new Color(255,255,255));
        tb_supplier.getRowHeight(25);
    }
public void idsupplier() {
        try {
            con=(Connection)Config.configDB();
            String sql = "SELECT MAX(id_supplier)as max FROM tb_supplier";
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String NoJual = rs.getString("max").substring(3);
                String AN = "" + (Integer.valueOf(NoJual) + 1);
                String Nol = "";
                
                if(AN.length()==1){
                    Nol = "0";
                }else if(AN.length()==2){
                    Nol = "";
                }
                txt_idsupplier.setText("SP" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                txt_idsupplier.setText("SP01");//sesuaikan dengan variable namenya
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
    }
    public static void tampilkan() {
        String [] judul = {"ID","Nama Supplier","Alamat","No HP"};
        model = new DefaultTableModel(judul,0);
        tb_supplier.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_supplier");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void reset(){
    txt_namasupplier.setText("");
    txt_alamat.setText("");
    txt_nohp.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIdSupplier = new javax.swing.JLabel();
        labelNamaSupplier = new javax.swing.JLabel();
        txt_idsupplier = new javax.swing.JTextField();
        txt_namasupplier = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        labelNoHp = new javax.swing.JLabel();
        txt_nohp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_supplier = new javax.swing.JTable();
        btnTambah = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        LabelNamaBarang = new javax.swing.JLabel();
        btnSearch = new javax.swing.JPanel();
        LabelSearch = new javax.swing.JLabel();
        labelLine = new javax.swing.JLabel();
        fieldNoHp = new javax.swing.JLabel();
        fieldAlamat = new javax.swing.JLabel();
        fieldNamaSupplier = new javax.swing.JLabel();
        fieldIdSupplier = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1036, 778));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIdSupplier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelIdSupplier.setForeground(new java.awt.Color(34, 48, 96));
        labelIdSupplier.setText("ID Supplier");
        getContentPane().add(labelIdSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        labelNamaSupplier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNamaSupplier.setForeground(new java.awt.Color(34, 48, 96));
        labelNamaSupplier.setText("Nama Supplier");
        getContentPane().add(labelNamaSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        txt_idsupplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idsupplier.setBorder(null);
        txt_idsupplier.setEnabled(false);
        txt_idsupplier.setOpaque(false);
        getContentPane().add(txt_idsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 280, 30));

        txt_namasupplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namasupplier.setBorder(null);
        txt_namasupplier.setOpaque(false);
        getContentPane().add(txt_namasupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, 30));

        labelAlamat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelAlamat.setForeground(new java.awt.Color(34, 48, 96));
        labelAlamat.setText("Alamat");
        getContentPane().add(labelAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setBorder(null);
        txt_alamat.setOpaque(false);
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 280, 30));

        labelNoHp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNoHp.setForeground(new java.awt.Color(34, 48, 96));
        labelNoHp.setText("No. Handphone");
        getContentPane().add(labelNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 30));

        txt_nohp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nohp.setBorder(null);
        txt_nohp.setOpaque(false);
        getContentPane().add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 280, 30));

        tb_supplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_supplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_supplier.setRowHeight(25);
        tb_supplier.setShowGrid(true);
        tb_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_supplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_supplier);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 920, 380));

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
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 60, 60));

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
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 60, 60));

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
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 60, 60));

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
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 480, 30));

        LabelNamaBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 49_1.png"))); // NOI18N
        getContentPane().add(LabelNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

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

        fieldNoHp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 30));

        fieldAlamat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 30));

        fieldNamaSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldNamaSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        fieldIdSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/text field.png"))); // NOI18N
        getContentPane().add(fieldIdSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/background search_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
    String idsupplier = txt_idsupplier.getText();
    String nama = txt_namasupplier.getText();
    String nohp = txt_nohp.getText();
    
    if (nama.isEmpty() || nohp.isEmpty()) {
        throw new CustomException("Input tidak boleh kosong");
    }
    
    try {
        Long.parseLong(nohp);
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan nomor HP dengan benar");
    }
    
    String alamat = txt_alamat.getText();
    PreparedStatement ps = con.prepareStatement("INSERT INTO tb_supplier VALUES(?, ?, ?, ?)");
    ps.setString(1, idsupplier);
    ps.setString(2, nama);
    ps.setString(3, alamat);
    ps.setLong(4, Long.parseLong(nohp));
    
    ps.execute();
    
    JOptionPane.showMessageDialog(null, "Data supplier berhasil ditambahkan");
    idsupplier();
    tampilkan();
    reset();
} catch (SQLException ex) {
    Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        try{
            int hapus = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus data supplier?", "Hapus", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (hapus == JOptionPane.YES_OPTION) {
                if(this.selectedSupplierID==null){
                JOptionPane.showMessageDialog(null,"Pilih supplier yang ingin dihapus");
                } else {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            PreparedStatement ps = con.prepareStatement("DELETE FROM tb_supplier WHERE id_supplier = '"+this.selectedSupplierID+"'");
            ps.execute();
            JOptionPane.showMessageDialog(null,"Data supplier berhasil dihapus");
            tampilkan();
            reset();
                }
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Tidak bisa dihapus karena terdapat data supplier di transaksi");
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
    }                
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
    String idsupplier = txt_idsupplier.getText();
    String nama = txt_namasupplier.getText();
    
    try {
        Long.parseLong(txt_nohp.getText());
        String nohp = txt_nohp.getText();
        String alamat = txt_alamat.getText();
        
        PreparedStatement ps = con.prepareStatement("UPDATE tb_supplier SET nama_supplier = ?, alamat_supplier = ?, nohp_supplier = ? WHERE id_supplier = ?");
        ps.setString(1, nama);
        ps.setString(2, alamat);
        ps.setString(3, nohp);
        ps.setString(4, idsupplier);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Data supplier berhasil diubah");
        idsupplier();
        tampilkan();
        reset();
    } catch (NumberFormatException e) {
        throw new CustomException("Masukkan Nomor HP dengan benar");
    }
} catch (SQLException ex) {
    Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
} catch (CustomException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

    }//GEN-LAST:event_btnEditMouseClicked

    private void tb_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_supplierMouseClicked
        int row = tb_supplier.getSelectedRow();
        this.selectedSupplierID = tb_supplier.getValueAt(row, 0).toString();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_supplier WHERE id_supplier ='"+this.selectedSupplierID+"'");
            while(rs.next()){
                txt_idsupplier.setText(rs.getString("id_supplier"));
                txt_namasupplier.setText(rs.getString("nama_supplier"));
                txt_alamat.setText(rs.getString("alamat_supplier"));
                txt_nohp.setText(rs.getString("nohp_supplier"));
            }
            
        }
        catch (SQLException ex){
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_supplierMouseClicked

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
       String [] judul = {"ID","Nama Supplier","Alamat","No HP"};
        model = new DefaultTableModel(judul,0);
        tb_supplier.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_supplier WHERE nama_supplier LIKE '%"+txt_cari.getText()+"%'");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void txt_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusLost
        if(txt_cari.getText().equals("")) {
            txt_cari.setText("Cari berdasarkan nama");
            txt_cari.setForeground(new Color(153, 153, 153));
        } else {
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusLost

    private void txt_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusGained
        if(txt_cari.getText().equals("Cari berdasarkan nama")) {
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
    class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNamaBarang;
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel fieldAlamat;
    private javax.swing.JLabel fieldIdSupplier;
    private javax.swing.JLabel fieldNamaSupplier;
    private javax.swing.JLabel fieldNoHp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelIdSupplier;
    private javax.swing.JLabel labelLine;
    private javax.swing.JLabel labelNamaSupplier;
    private javax.swing.JLabel labelNoHp;
    private static javax.swing.JTable tb_supplier;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_idsupplier;
    private javax.swing.JTextField txt_namasupplier;
    private javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables
}
