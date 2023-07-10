/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aryaaazr_
 */
public class DaftarBarang2 extends javax.swing.JFrame {

    /**
     * Creates new form DaftarBarang
     */
    static DefaultTableModel model;
    static String id_barang;
    static String nama_barang;
    static String kode_batang;
    static String harga;
    public DaftarBarang2() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_daftarbarang.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
        tb_daftarbarang.getTableHeader().setOpaque(false);
        tb_daftarbarang.getTableHeader().setBackground(new Color(34, 48, 96));
        tb_daftarbarang.getTableHeader().setForeground(new Color(255,255,255));
        tb_daftarbarang.getRowHeight(25);
        tampilkan();
    }
    public static void tampilkan() {
        String [] judul = {"ID","Kode Batang","Nama Barang","Jenis","Jumlah","Harga Beli","Harga Jual"};
        model = new DefaultTableModel(judul,0);
        tb_daftarbarang.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_barang.*, tb_kategori.nama_kategori FROM tb_barang JOIN tb_kategori ON tb_barang.id_kategori = tb_kategori.id_kategori");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(6),rs.getString(7)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_cari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_daftarbarang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cari.setBorder(null);
        txt_cari.setOpaque(false);
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 460, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Rectangle 40.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 480, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/btn_pilih.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 80, 30));

        tb_daftarbarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_daftarbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_daftarbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_daftarbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_daftarbarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 580, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 51.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Frame 13.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_daftarbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_daftarbarangMouseClicked
        int baris = tb_daftarbarang.rowAtPoint(evt.getPoint());
        String namaBarang = tb_daftarbarang.getValueAt(baris, 2).toString();
        txt_cari.setText(namaBarang);
        if (tb_daftarbarang.getValueAt(baris, 2) == null) {
            txt_cari.setText("");
        } else {
            txt_cari.setText(tb_daftarbarang.getValueAt(baris, 2).toString());
        }
        
    }//GEN-LAST:event_tb_daftarbarangMouseClicked

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        String [] judul = {"ID","Kode Batang","Nama Barang","Jenis","Jumlah","Harga Beli","Harga Jual"};
        model = new DefaultTableModel(judul,0);
        tb_daftarbarang.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coolinarypos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_barang.*, tb_kategori.nama_kategori FROM tb_barang JOIN tb_kategori ON tb_barang.id_kategori = tb_kategori.id_kategori WHERE CONCAT (tb_barang.nama_barang, tb_barang.id_barang, tb_barang.kode_batang) LIKE '%"+txt_cari.getText()+"%'");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(6),rs.getString(7)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int row;
        row = tb_daftarbarang.getSelectedRow();
        id_barang = tb_daftarbarang.getValueAt(row, 0).toString();
        nama_barang = tb_daftarbarang.getValueAt(row, 2).toString();
//        pj.kode_batang = tb_daftarbarang.getValueAt(row, 2).toString();
        harga = tb_daftarbarang.getValueAt(row, 6).toString();
//        Penjualan.txt_idbarang.setText(id_barang);
//        Penjualan.txt_namabarang.setText(nama_barang);
//        Penjualan.txt_harga.setText(harga);
        Pembelian.txt_idbarang.setText(id_barang);
        Pembelian.txt_namabarang.setText(nama_barang);
        Pembelian.txt_harga.setText(harga);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarBarang2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tb_daftarbarang;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}