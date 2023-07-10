-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2022 at 08:45 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_coolinarypos`
--

-- --------------------------------------------------------

--
-- Table structure for table `log_akun`
--

CREATE TABLE `log_akun` (
  `namapengguna_lama` varchar(18) NOT NULL,
  `namapengguna_baru` varchar(18) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `log_akun`
--

INSERT INTO `log_akun` (`namapengguna_lama`, `namapengguna_baru`, `tanggal`) VALUES
('0', '0', '2022-05-09'),
('0', '0', '2022-05-09'),
('0', '0', '2022-05-09'),
('0', '0', '2022-05-09'),
('0', '0', '2022-05-09'),
('adminn', 'admin', '2022-05-09'),
('admin', 'adminn', '2022-05-11'),
('adminn', 'admin', '2022-05-11'),
('rinaws', 'rinaws', '2022-05-11'),
('rinaws', 'rina', '2022-05-11'),
('rina', 'rina', '2022-05-11'),
('yuliaa', 'yuliaa', '2022-05-30'),
('rina', 'rina', '2022-06-01'),
('satr1a', 'satr1a', '2022-06-11'),
('qweqw', 'qweqw', '2022-06-11'),
('qweqw', 'qweqw', '2022-06-11'),
('rina', 'rina', '2022-06-11'),
('admin', 'admin', '2022-06-11'),
('admin', 'adminn', '2022-06-12'),
('adminn', 'admin', '2022-06-12'),
('admin', 'admin', '2022-06-12'),
('admin', 'admin', '2022-06-12');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` char(12) NOT NULL,
  `kode_batang` char(13) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `id_kategori` char(4) NOT NULL,
  `jumlah` int(3) NOT NULL,
  `harga_beli` int(5) NOT NULL,
  `harga_jual` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `kode_batang`, `nama_barang`, `id_kategori`, `jumlah`, `harga_beli`, `harga_jual`) VALUES
('MK02', '000054491184', 'Sari Roti Keju', 'MK', 880, 5000, 5500),
('MK04', '000004855754', 'Taro', 'MK', 940, 6500, 7000),
('MK06', '000045564476', 'Nasi Rawon', 'MK', 12, 12500, 14000),
('MN03', '', 'Teri Goreng', 'MN', 89, 7500, 9000),
('MN04', '123123', 'Kopi ABC Susu', 'MN', 1, 3000, 3500),
('NK01', '000004976400', 'Sprite Botol', 'NK', 90, 2270, 3500),
('NK02', '000004976402', 'Coca Cola Botol 125ml', 'NK', 28, 2500, 3000),
('NK03', '100', 'Lalapan Ayam ', 'NK', 9, 9500, 11000),
('NK04', '123213123', 'Pocari', 'NK', 3, 6700, 7000),
('NN01', '', 'Es Teh', 'TB', 1980, 2500, 4000),
('NN02', '', 'Es Jeruk', 'NN', 60, 3000, 4000),
('TB01', '899898930039', 'Surya Pro Mild', 'TB', 5, 20000, 21000),
('TB02', '000087656765', 'Surya 12', 'TB', 1069, 5000, 5500),
('TB03', '000004566545', 'Chitato', 'MK', 1, 15000, 16000),
('TB04', '8999909982000', 'Sampoerna 16', 'TB', 27, 23000, 25000),
('TB05', '', 'Korek', 'TB', 7, 1500, 2500);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_pembelian`
--

CREATE TABLE `tb_detail_pembelian` (
  `id_pembelian` char(13) NOT NULL,
  `id_barang` char(12) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_pembelian`
--

INSERT INTO `tb_detail_pembelian` (`id_pembelian`, `id_barang`, `jumlah`) VALUES
('TB1106220001', 'MK02', 30),
('TB1206220002', 'NK02', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_penjualan`
--

CREATE TABLE `tb_detail_penjualan` (
  `id_penjualan` char(13) NOT NULL,
  `id_barang` char(12) NOT NULL,
  `jumlah` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_detail_penjualan`
--

INSERT INTO `tb_detail_penjualan` (`id_penjualan`, `id_barang`, `jumlah`) VALUES
('TJ1106220001', 'NK02', 50),
('TJ1106220002', 'MK02', 10),
('TJ1106220002', 'MK04', 10),
('TJ1206220006', 'NN02', 2),
('TJ1206220007', 'MK02', 10),
('TJ1206220007', 'MK04', 2),
('TJ1206220008', 'NK01', 2),
('TJ1206220008', 'TB04', 3),
('TJ1206220009', 'NK04', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` char(4) NOT NULL,
  `nama_karyawan` varchar(30) NOT NULL,
  `jenis_kelamin` enum('Pria','Wanita') NOT NULL,
  `alamat_karyawan` varchar(200) NOT NULL,
  `nohp_karyawan` char(13) NOT NULL,
  `nama_pengguna` varchar(8) NOT NULL,
  `kata_sandi` varchar(16) NOT NULL,
  `status` enum('admin','kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `alamat_karyawan`, `nohp_karyawan`, `nama_pengguna`, `kata_sandi`, `status`) VALUES
('AD01', 'Admin', 'Wanita', '-', '082332443433', 'admin', 'admin', 'admin'),
('AD02', 'Satria Yuda Pamungkas', 'Pria', 'Jl Pemuda No 141s', '082332991989', 'satr1a', 'kasir', 'admin'),
('KR01', 'Dian Kristin', 'Pria', 'Jl Batu Gilang', '082432112345', 'dian', 'dian', 'kasir'),
('KR03', 'Rina', 'Wanita', 'Banyuwangi', '82332991898', 'rina', 'rina12', 'kasir');

--
-- Triggers `tb_karyawan`
--
DELIMITER $$
CREATE TRIGGER `ubah_namapengguna` AFTER UPDATE ON `tb_karyawan` FOR EACH ROW BEGIN
INSERT INTO log_akun
 SET namapengguna_lama = OLD.nama_pengguna,
 namapengguna_baru = NEW.nama_pengguna,
 tanggal = NOW();
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `id_kategori` char(4) NOT NULL,
  `nama_kategori` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_kategori`
--

INSERT INTO `tb_kategori` (`id_kategori`, `nama_kategori`) VALUES
('MK', 'Makanan Kemasan'),
('MN', 'Makanan Non Kemasan'),
('NK', 'Minuman Kemasan'),
('NN', 'Minuman Non Kemasan'),
('TB', 'Tambahan');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembelian`
--

CREATE TABLE `tb_pembelian` (
  `id_pembelian` char(13) NOT NULL,
  `tgl_pembelian` datetime NOT NULL,
  `total_harga` int(7) NOT NULL,
  `id_supplier` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pembelian`
--

INSERT INTO `tb_pembelian` (`id_pembelian`, `tgl_pembelian`, `total_harga`, `id_supplier`) VALUES
('TB1106220001', '2022-06-11 06:29:40', 150000, 'SP01'),
('TB1206220002', '2022-06-12 01:33:51', 6000, 'SP03');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pengeluaran`
--

CREATE TABLE `tb_pengeluaran` (
  `id_pengeluaran` char(13) NOT NULL,
  `tgl_pengeluaran` datetime NOT NULL,
  `nama_pengeluaran` varchar(50) NOT NULL,
  `harga_pengeluaran` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pengeluaran`
--

INSERT INTO `tb_pengeluaran` (`id_pengeluaran`, `tgl_pengeluaran`, `nama_pengeluaran`, `harga_pengeluaran`) VALUES
('TL1106220005', '2022-06-11 11:22:27', 'Gaji Bulan Mei', 400000),
('TL1206220007', '2022-06-12 00:17:12', 'Gaji Bulan Juni', 400000),
('TL1206220008', '2022-06-12 01:34:30', 'Gaji Bulan Maret', 450000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `id_penjualan` char(13) NOT NULL,
  `tgl_penjualan` datetime NOT NULL,
  `total_harga` int(7) NOT NULL,
  `id_karyawan` char(4) NOT NULL,
  `tunai` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_penjualan`
--

INSERT INTO `tb_penjualan` (`id_penjualan`, `tgl_penjualan`, `total_harga`, `id_karyawan`, `tunai`, `kembalian`) VALUES
('TJ1106220001', '2022-06-11 06:25:05', 150000, 'AD01', 200000, 50000),
('TJ1106220002', '2022-06-11 20:14:06', 125000, 'AD01', 130000, 5000),
('TJ1206220006', '2022-06-12 00:16:45', 8000, 'AD01', 10000, 2000),
('TJ1206220007', '2022-06-12 01:27:05', 69000, 'AD01', 70000, 3000),
('TJ1206220008', '2022-06-12 01:28:32', 82000, 'AD01', 90000, 8000),
('TJ1206220009', '2022-06-12 01:32:22', 7000, 'AD01', 10000, 3000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `id_supplier` char(4) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `alamat_supplier` varchar(30) NOT NULL,
  `nohp_supplier` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_supplier`
--

INSERT INTO `tb_supplier` (`id_supplier`, `nama_supplier`, `alamat_supplier`, `nohp_supplier`) VALUES
('SP01', 'Toko Biru Daun', 'Jl Cempaka No 121', '082332113246'),
('SP02', 'Toko Umbul Jaya', 'Jl Pandeglang No 12', '082132344567'),
('SP03', 'Toko Maju Jaya', 'Jl Riau', '082332112345'),
('SP04', 'asdsad', 'asdsa', '234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `jenis` (`id_kategori`);

--
-- Indexes for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pembelian` (`id_pembelian`);

--
-- Indexes for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD KEY `id_transaksi` (`id_penjualan`,`id_barang`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`),
  ADD UNIQUE KEY `nama_pengguna` (`nama_pengguna`);

--
-- Indexes for table `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `tb_pengeluaran`
--
ALTER TABLE `tb_pengeluaran`
  ADD PRIMARY KEY (`id_pengeluaran`);

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_kasir` (`id_karyawan`);

--
-- Indexes for table `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD CONSTRAINT `tb_barang_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `tb_kategori` (`id_kategori`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_detail_pembelian`
--
ALTER TABLE `tb_detail_pembelian`
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON DELETE CASCADE,
  ADD CONSTRAINT `tb_detail_pembelian_ibfk_2` FOREIGN KEY (`id_pembelian`) REFERENCES `tb_pembelian` (`id_pembelian`);

--
-- Constraints for table `tb_detail_penjualan`
--
ALTER TABLE `tb_detail_penjualan`
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_detail_penjualan_ibfk_2` FOREIGN KEY (`id_penjualan`) REFERENCES `tb_penjualan` (`id_penjualan`);

--
-- Constraints for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD CONSTRAINT `tb_pembelian_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `tb_supplier` (`id_supplier`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD CONSTRAINT `tb_penjualan_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id_karyawan`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
