-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 28, 2017 at 07:43 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jersey`
--

-- --------------------------------------------------------

--
-- Table structure for table `USER`
--

CREATE TABLE `USER` (
  `USER_ID` int(11) NOT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `CREATED_DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `USER`
--

INSERT INTO `USER` (`USER_ID`, `USERNAME`, `CREATED_BY`, `CREATED_DATE`) VALUES
(0, 'Mukesh', 'Google', '2017-11-29'),
(1, 'Mukesh', 'Google', '2017-11-28'),
(11, 'Mukesh', 'Google', '2017-11-29'),
(12, 'Mukesh', 'Google', '2017-11-29'),
(13, 'Mukesh', 'Google', '2017-11-29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `USER`
--
ALTER TABLE `USER`
  ADD PRIMARY KEY (`USER_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
