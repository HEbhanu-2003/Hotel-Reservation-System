-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 03, 2026 at 03:44 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelreservationsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `hotelregistration`
--

CREATE TABLE `hotelregistration` (
  `fullName` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `userName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hotelregistration`
--

INSERT INTO `hotelregistration` (`fullName`, `email`, `password`, `userName`) VALUES
('bhanuka', 'bhanukagmail.com', '123', 'bhanu'),
('ewrty', 'sadfghj', 'asdgfh', 'erty'),
('qq', 'qq', 'qq', 'qq'),
('r3r32', '2r32r3', 'r2r23r32', 'r2e2r2'),
('rr', 'rr', '1', 'rr'),
('rrr', 'rrrr', 'rr', 'rrr'),
('rtyui', '567', '1', 'ee'),
('t', 'wr', '121', 'fefew'),
('tt', 'tt', '1', 'tt'),
('ttt', 'frgrgrr32', '1', 'ff4f4'),
('yui', 'ertyuio', 'ertyuio', 'ertyui');

-- --------------------------------------------------------

--
-- Table structure for table `managerooms`
--

CREATE TABLE `managerooms` (
  `RoomNumber` int(100) NOT NULL,
  `RoomType` varchar(10) NOT NULL,
  `Bed` varchar(10) NOT NULL,
  `Days` int(100) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `managerooms`
--

INSERT INTO `managerooms` (`RoomNumber`, `RoomType`, `Bed`, `Days`, `Price`) VALUES
(0, 'Ac', 'Double', 2, 7000),
(1, 'Non Ac', 'Triple', 1, 4500),
(2, 'Non Ac', 'Double', 1, 3500),
(3, 'Ac', 'Single', 2, 0),
(5, 'Ac', 'Single', 3, 0),
(6, 'Ac', 'Single', 3, 0),
(7, 'Ac', 'Single', 3, 10500),
(8, 'Ac', 'Single', 2, 7000),
(9, 'Ac', 'Single', 3, 10500),
(11, 'Ac', 'Double', 1, 5000),
(67, 'Ac', 'Double', 3, 21000),
(444, 'Non Ac', 'Double', 2, 12000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hotelregistration`
--
ALTER TABLE `hotelregistration`
  ADD PRIMARY KEY (`fullName`);

--
-- Indexes for table `managerooms`
--
ALTER TABLE `managerooms`
  ADD PRIMARY KEY (`RoomNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
