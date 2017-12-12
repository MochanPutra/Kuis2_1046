-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 16.14
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mochan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1046`
--

CREATE TABLE `cv_1046` (
  `id_anggota` bigint(20) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `umur_anggota` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1046`
--

INSERT INTO `cv_1046` (`id_anggota`, `nama_anggota`, `umur_anggota`) VALUES
(1, 'jackson', '20'),
(2, 'linda', '15'),
(3, 'mine', '20'),
(4, 'reyhan', '15');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `nim` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jurusan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nim`, `nama`, `jurusan`) VALUES
(1, '1555301046', 'mochan', 'IT'),
(2, '123123123123', 'aasdadasd', 'asdasdasdasd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1046`
--

CREATE TABLE `nilai_1046` (
  `id_buku` bigint(20) NOT NULL,
  `kategori_buku` varchar(255) DEFAULT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `id_anggota` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1046`
--

INSERT INTO `nilai_1046` (`id_buku`, `kategori_buku`, `nama_buku`, `id_anggota`) VALUES
(1, 'mahal', 'minhajul muslim', 1),
(2, 'murah', 'gambar', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1046`
--
ALTER TABLE `cv_1046`
  ADD PRIMARY KEY (`id_anggota`),
  ADD UNIQUE KEY `UK_7ch8unpj69vai35634nrs1p5k` (`nama_anggota`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nilai_1046`
--
ALTER TABLE `nilai_1046`
  ADD PRIMARY KEY (`id_buku`),
  ADD UNIQUE KEY `UK_7gxwsf4cwdk920kjrinonrgmx` (`nama_buku`),
  ADD KEY `FKldy36ghkegrqvov543gbuam58` (`id_anggota`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1046`
--
ALTER TABLE `cv_1046`
  MODIFY `id_anggota` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `nilai_1046`
--
ALTER TABLE `nilai_1046`
  MODIFY `id_buku` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1046`
--
ALTER TABLE `nilai_1046`
  ADD CONSTRAINT `FKldy36ghkegrqvov543gbuam58` FOREIGN KEY (`id_anggota`) REFERENCES `cv_1046` (`id_anggota`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
