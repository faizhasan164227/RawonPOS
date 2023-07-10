/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wawonpahlawan;

import config.Config;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Navbar extends javax.swing.JFrame {

    String id,  status;
    public Navbar(String username, String Status) {
        id = username;  //mengambil parameter admin id
        status = Status;    //mengambil nilai parameter hak akses
        //validasi apakah sudah login atau belum
        if (username == null) {
             JOptionPane.showMessageDialog(null, "Silahkan login terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
             new Login().setVisible(true);
        }
        Config db = new Config();   //instansiasi class Conn()
        initComponents();
        setLocationRelativeTo(this);    // atur jframe berada ditengah
        setExtendedState(MAXIMIZED_BOTH);   // full Jframe
        getUsername(username);  //menjalankan method getUsername dengan parameter nama admin dari navbar
        getStatus(Status);  // menjalankan method getStatus dengan parameter status dari navbar
        
    }
    
    //setter nama admin di pojok kanan atas
    public void getUsername(String username){
        labelUsername.setText(Login.namapengguna);
    }
    public void getStatus(String Status) {
        labelStatus.setText(Status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        btnBarang = new javax.swing.JPanel();
        labelBarang = new javax.swing.JLabel();
        iconBarang = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JPanel();
        labelTransaksi = new javax.swing.JLabel();
        iconTransaksi = new javax.swing.JLabel();
        btnKaryawan = new javax.swing.JPanel();
        labelKaryawan = new javax.swing.JLabel();
        iconKaryawan = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JPanel();
        labelTransaksi2 = new javax.swing.JLabel();
        iconSupplier = new javax.swing.JLabel();
        btnSetting = new javax.swing.JPanel();
        labelSetting = new javax.swing.JLabel();
        iconSetting = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        iconDashboard = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 48, 96));

        jPanel2.setBackground(new java.awt.Color(101, 113, 156));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/user 1_1.png"))); // NOI18N

        labelUsername.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Username");

        labelStatus.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        btnBarang.setBackground(new java.awt.Color(34, 48, 96));
        btnBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarangMouseExited(evt);
            }
        });

        labelBarang.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelBarang.setForeground(new java.awt.Color(255, 255, 255));
        labelBarang.setText("Barang");

        iconBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/barang 2_5.png"))); // NOI18N

        javax.swing.GroupLayout btnBarangLayout = new javax.swing.GroupLayout(btnBarang);
        btnBarang.setLayout(btnBarangLayout);
        btnBarangLayout.setHorizontalGroup(
            btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBarangLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBarang)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        btnBarangLayout.setVerticalGroup(
            btnBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnTransaksi.setBackground(new java.awt.Color(34, 48, 96));
        btnTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseExited(evt);
            }
        });

        labelTransaksi.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        labelTransaksi.setText("Transaksi");

        iconTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Icon shoping 2.png"))); // NOI18N

        javax.swing.GroupLayout btnTransaksiLayout = new javax.swing.GroupLayout(btnTransaksi);
        btnTransaksi.setLayout(btnTransaksiLayout);
        btnTransaksiLayout.setHorizontalGroup(
            btnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTransaksiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnTransaksiLayout.setVerticalGroup(
            btnTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnKaryawan.setBackground(new java.awt.Color(34, 48, 96));
        btnKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKaryawanMouseExited(evt);
            }
        });

        labelKaryawan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        labelKaryawan.setText("Karyawan");

        iconKaryawan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/employees 1_1.png"))); // NOI18N

        javax.swing.GroupLayout btnKaryawanLayout = new javax.swing.GroupLayout(btnKaryawan);
        btnKaryawan.setLayout(btnKaryawanLayout);
        btnKaryawanLayout.setHorizontalGroup(
            btnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKaryawanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelKaryawan)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        btnKaryawanLayout.setVerticalGroup(
            btnKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKaryawanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSupplier.setBackground(new java.awt.Color(34, 48, 96));
        btnSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierMouseExited(evt);
            }
        });

        labelTransaksi2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelTransaksi2.setForeground(new java.awt.Color(255, 255, 255));
        labelTransaksi2.setText("Supplier");

        iconSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/delivery-man 1_1.png"))); // NOI18N

        javax.swing.GroupLayout btnSupplierLayout = new javax.swing.GroupLayout(btnSupplier);
        btnSupplier.setLayout(btnSupplierLayout);
        btnSupplierLayout.setHorizontalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTransaksi2)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnSupplierLayout.setVerticalGroup(
            btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTransaksi2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSetting.setBackground(new java.awt.Color(34, 48, 96));
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingMouseExited(evt);
            }
        });

        labelSetting.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelSetting.setForeground(new java.awt.Color(255, 255, 255));
        labelSetting.setText("Setting");

        iconSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/setting baru 2_2.png"))); // NOI18N

        javax.swing.GroupLayout btnSettingLayout = new javax.swing.GroupLayout(btnSetting);
        btnSetting.setLayout(btnSettingLayout);
        btnSettingLayout.setHorizontalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSettingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSetting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSettingLayout.setVerticalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnDashboard.setBackground(new java.awt.Color(34, 48, 96));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDashboardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDashboardMouseReleased(evt);
            }
        });

        labelDashboard.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboard.setText("Dashboard");

        iconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/home (4) 1_2.png"))); // NOI18N

        javax.swing.GroupLayout btnDashboardLayout = new javax.swing.GroupLayout(btnDashboard);
        btnDashboard.setLayout(btnDashboardLayout);
        btnDashboardLayout.setHorizontalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDashboardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDashboard)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        btnDashboardLayout.setVerticalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 350, 750));

        navbar.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo aplikasiii.png"))); // NOI18N

        judul.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        judul.setText("Coolinary POS - Dekstop Application");

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/close (1) 1.png"))); // NOI18N
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1107, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(judul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 20));

        DesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        DesktopPane.setLayout(new java.awt.BorderLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Frame 12.png"))); // NOI18N
        DesktopPane.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(DesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 1020, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btnBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseEntered
        btnBarang.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnBarangMouseEntered

    private void btnBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseExited
        btnBarang.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnBarangMouseExited

    private void btnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarangMouseClicked
        Barang barang1 = new Barang();//instansiasi class Dashboard
        DesktopPane.removeAll();//remove item pada dekstop pane
        DesktopPane.repaint();//repaint item pada dekstop pane
        DesktopPane.add(barang1).setVisible(true);//add item yang sudah di set pada dekstop pane
        btnBarang.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnBarangMouseClicked

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        Transaksi transaksi = new Transaksi();//instansiasi class Dashboard
        DesktopPane.removeAll();//remove item pada dekstop pane
        DesktopPane.repaint();//repaint item pada dekstop pane
        DesktopPane.add(transaksi).setVisible(true);
        btnTransaksi.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseEntered
        btnTransaksi.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnTransaksiMouseEntered

    private void btnTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseExited
        btnTransaksi.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnTransaksiMouseExited

    private void btnKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseClicked
        Karyawan karyawan = new Karyawan();
        DesktopPane.removeAll();
        DesktopPane.repaint();
        DesktopPane.add(karyawan).setVisible(true);
        btnKaryawan.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnKaryawanMouseClicked

    private void btnKaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseEntered
        btnKaryawan.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnKaryawanMouseEntered

    private void btnKaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKaryawanMouseExited
        btnKaryawan.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnKaryawanMouseExited

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        Supplier supplier = new Supplier();//instansiasi class Dashboard
        DesktopPane.removeAll();//remove item pada dekstop pane
        DesktopPane.repaint();//repaint item pada dekstop pane
        DesktopPane.add(supplier).setVisible(true);//add item yang sudah di set pada dekstop pane
        btnSupplier.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        btnSupplier.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        btnSupplier.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        Setting setting = new Setting();//instansiasi class Dashboard
        DesktopPane.removeAll();//remove item pada dekstop pane
        DesktopPane.repaint();//repaint item pada dekstop pane
        DesktopPane.add(setting).setVisible(true);//add item yang sudah di set pada dekstop pane
        btnSetting.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnSettingMouseClicked

    private void btnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseEntered
        btnSetting.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnSettingMouseEntered

    private void btnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseExited
        btnSetting.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnSettingMouseExited

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        Dashboard dashboard = new Dashboard();//instansiasi class Dashboard
        DesktopPane.removeAll();//remove item pada dekstop pane
        DesktopPane.repaint();//repaint item pada dekstop pane
        DesktopPane.add(dashboard).setVisible(true);//add item yang sudah di set pada dekstop pane
        btnDashboard.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        btnDashboard.setBackground(new Color(34, 48, 96));
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnDashboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseReleased
        btnDashboard.setBackground(new Color(101, 113, 156));
    }//GEN-LAST:event_btnDashboardMouseReleased

    private void btnDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMousePressed
        btnDashboard.setBackground(new Color(91, 103, 146));
    }//GEN-LAST:event_btnDashboardMousePressed

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
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navbar(null, ""); // default apabila tidak login
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JPanel btnBarang;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnKaryawan;
    private javax.swing.JPanel btnSetting;
    private javax.swing.JPanel btnSupplier;
    private javax.swing.JPanel btnTransaksi;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel iconBarang;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconKaryawan;
    private javax.swing.JLabel iconSetting;
    private javax.swing.JLabel iconSupplier;
    private javax.swing.JLabel iconTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelBarang;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelKaryawan;
    private javax.swing.JLabel labelSetting;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTransaksi;
    private javax.swing.JLabel labelTransaksi2;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
}
