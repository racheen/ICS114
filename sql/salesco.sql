-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2016 at 02:05 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tumulak-3csa-ics114-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `salesco`
--

CREATE TABLE `salesco` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `code` varchar(3) NOT NULL,
  `amount` double NOT NULL,
  `grossCommission` double NOT NULL,
  `Commission` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salesco`
--

INSERT INTO `salesco` (`id`, `name`, `code`, `amount`, `grossCommission`, `Commission`) VALUES
(1, 'Rachel Monique', 'A', 3000, 1675, 225),
(2, 'Juan Dela Cruz', 'A', 3400, 1875, 255),
(3, 'Abandoned Man', 'B', 39102, 7920.4, 2932.65);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `salesco`
--
ALTER TABLE `salesco`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `salesco`
--
ALTER TABLE `salesco`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

create table salesco (
   id integer not null GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)
  ,name varchar(30) not null
  ,code varchar(1) not null
  ,amount double not null
  ,grossCommission double not null
  ,commission double not null
  ,PRIMARY KEY (id) 
);