-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 10, 2019 at 02:01 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `TestManagementSystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `int_login_id` int(10) NOT NULL,
  `vch_user_id` varchar(50) NOT NULL,
  `vch_username` varchar(50) NOT NULL,
  `vch_password` varchar(50) NOT NULL,
  `ch_active_status` varchar(2) DEFAULT 'y'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`int_login_id`, `vch_user_id`, `vch_username`, `vch_password`, `ch_active_status`) VALUES
(2, 'h', 'h', 'h', 'y'),
(3, 'a', 'a', 'a', 'y'),
(4, 'b', 'b', 'ab', 'y'),
(5, 'q', 'q', 'q', 'y'),
(6, 'k', 'k', 'k', 'y');

-- --------------------------------------------------------

--
-- Table structure for table `User_data`
--

CREATE TABLE `User_data` (
  `vch_user_id` varchar(50) NOT NULL,
  `vch_name` varchar(50) NOT NULL,
  `vch_email_id` varchar(50) NOT NULL,
  `bint_phone_number` bigint(10) NOT NULL,
  `ch_active_status` char(2) NOT NULL DEFAULT 'y'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `User_data`
--

INSERT INTO `User_data` (`vch_user_id`, `vch_name`, `vch_email_id`, `bint_phone_number`, `ch_active_status`) VALUES
('a', 'a', 'a', 2, 'y'),
('b', 'ab', 'b', 9003987711, 'y'),
('h', 'h', 'h', 9, 'y'),
('k', 'k', 'k', 7, 'y'),
('q', 'q', 'q', 2, 'y');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`int_login_id`),
  ADD KEY `vch_user_id` (`vch_user_id`);

--
-- Indexes for table `User_data`
--
ALTER TABLE `User_data`
  ADD PRIMARY KEY (`vch_user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Login`
--
ALTER TABLE `Login`
  MODIFY `int_login_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Login`
--
ALTER TABLE `Login`
  ADD CONSTRAINT `Login_ibfk_1` FOREIGN KEY (`vch_user_id`) REFERENCES `User_data` (`vch_user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
