-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2023 at 10:52 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airline reservations system`
--

-- --------------------------------------------------------

--
-- Table structure for table `boardingpass`
--

CREATE TABLE `boardingpass` (
  `PassengerID` int(11) NOT NULL,
  `FlightID` int(11) NOT NULL,
  `SeatNumber` varchar(45) NOT NULL,
  `BoardingDateTime` datetime NOT NULL,
  `BoardingStatus` varchar(45) NOT NULL,
  `GateNo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `BookingID` int(11) NOT NULL,
  `PassengerID` int(11) NOT NULL,
  `FlightID` int(11) NOT NULL,
  `BookingDate` datetime NOT NULL,
  `PaymentDetails` varchar(45) NOT NULL,
  `BookingStatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `documentverfication`
--

CREATE TABLE `documentverfication` (
  `PassengerID` int(11) NOT NULL,
  `DocumentStatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE `flights` (
  `FlightID` int(11) NOT NULL,
  `ArrivalLocation` varchar(45) NOT NULL,
  `DepartureLocation` varchar(45) NOT NULL,
  `DepartureDate` datetime NOT NULL,
  `ClassOfService` varchar(45) NOT NULL,
  `Price` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE `passengers` (
  `PassengerID` int(11) NOT NULL,
  `PassengerName` varchar(45) NOT NULL,
  `ContacNumber` bigint(20) NOT NULL,
  `PassportNumber` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `refundticket`
--

CREATE TABLE `refundticket` (
  `RefundID` int(11) NOT NULL,
  `BookingID` int(11) NOT NULL,
  `RefundReason` varchar(45) NOT NULL,
  `RefundAmount` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boardingpass`
--
ALTER TABLE `boardingpass`
  ADD PRIMARY KEY (`SeatNumber`),
  ADD KEY `FlightID` (`FlightID`),
  ADD KEY `PassengerID` (`PassengerID`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`BookingID`),
  ADD KEY `PassengerID` (`PassengerID`),
  ADD KEY `FlightID` (`FlightID`);

--
-- Indexes for table `documentverfication`
--
ALTER TABLE `documentverfication`
  ADD KEY `PassengerID` (`PassengerID`);

--
-- Indexes for table `flights`
--
ALTER TABLE `flights`
  ADD PRIMARY KEY (`FlightID`);

--
-- Indexes for table `passengers`
--
ALTER TABLE `passengers`
  ADD PRIMARY KEY (`PassengerID`);

--
-- Indexes for table `refundticket`
--
ALTER TABLE `refundticket`
  ADD PRIMARY KEY (`RefundID`),
  ADD KEY `BookingID` (`BookingID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `BookingID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `flights`
--
ALTER TABLE `flights`
  MODIFY `FlightID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `passengers`
--
ALTER TABLE `passengers`
  MODIFY `PassengerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `refundticket`
--
ALTER TABLE `refundticket`
  MODIFY `RefundID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `boardingpass`
--
ALTER TABLE `boardingpass`
  ADD CONSTRAINT `boardingpass_ibfk_1` FOREIGN KEY (`FlightID`) REFERENCES `flights` (`FlightID`),
  ADD CONSTRAINT `boardingpass_ibfk_2` FOREIGN KEY (`PassengerID`) REFERENCES `passengers` (`PassengerID`);

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`PassengerID`) REFERENCES `passengers` (`PassengerID`),
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`FlightID`) REFERENCES `flights` (`FlightID`);

--
-- Constraints for table `documentverfication`
--
ALTER TABLE `documentverfication`
  ADD CONSTRAINT `documentverfication_ibfk_1` FOREIGN KEY (`PassengerID`) REFERENCES `passengers` (`PassengerID`);

--
-- Constraints for table `refundticket`
--
ALTER TABLE `refundticket`
  ADD CONSTRAINT `refundticket_ibfk_1` FOREIGN KEY (`BookingID`) REFERENCES `booking` (`BookingID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
