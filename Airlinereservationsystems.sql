-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2023 at 08:17 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airlinereservationsystem`
--
CREATE DATABASE IF NOT EXISTS `airlinereservationsystem` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `airlinereservationsystem`;

-- --------------------------------------------------------

--
-- Table structure for table `boardingpass`
--

CREATE TABLE `boardingpass` (
  `PassengerID` int(11) NOT NULL,
  `FlightID` int(11) NOT NULL,
  `SeatNumber` varchar(45) NOT NULL,
  `BoardingDateAndTime` datetime NOT NULL,
  `Gate` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `boardingpass`
--

INSERT INTO `boardingpass` (`PassengerID`, `FlightID`, `SeatNumber`, `BoardingDateAndTime`, `Gate`) VALUES
(1, 1, 'A1', '2023-12-25 09:30:00', 'Gate 1'),
(2, 2, 'B2', '2023-12-26 11:00:00', 'Gate 2'),
(3, 3, 'C3', '2023-12-27 14:15:00', 'Gate 3'),
(4, 4, 'D4', '2023-12-28 07:45:00', 'Gate 4'),
(5, 5, 'E5', '2023-12-29 16:00:00', 'Gate 5'),
(6, 6, 'F6', '2023-12-30 08:15:00', 'Gate 6'),
(7, 7, 'G7', '2024-01-02 13:30:00', 'Gate 7'),
(8, 8, 'H8', '2024-01-03 10:50:00', 'Gate 8'),
(9, 9, 'I9', '2024-01-04 15:40:00', 'Gate 9'),
(10, 10, 'J10', '2024-01-05 17:15:00', 'Gate 10');

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
  `Status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`BookingID`, `PassengerID`, `FlightID`, `BookingDate`, `PaymentDetails`, `Status`) VALUES
(1, 1, 1, '2023-12-15 08:00:00', 'Credit Card', 'Confirmed'),
(2, 2, 2, '2023-12-16 10:30:00', 'Debit Card ', 'Pending'),
(3, 3, 3, '2023-12-17 12:45:00', 'Credit Card', 'Cancelled'),
(4, 4, 4, '2023-12-18 14:15:00', 'Debit Card ', 'Confirmed'),
(5, 5, 5, '2023-12-19 16:30:00', 'Credit Card', 'Pending'),
(6, 6, 6, '2023-12-20 18:45:00', 'Debit Card ', 'Confirmed'),
(7, 7, 7, '2023-12-21 20:00:00', 'Credit Card', 'Cancelled'),
(8, 8, 8, '2023-12-22 22:15:00', 'Debit Card ', 'Confirmed'),
(9, 9, 9, '2023-12-23 09:30:00', 'Debit Card ', 'Pending'),
(10, 10, 10, '2023-12-24 11:45:00', 'Credit Card ', 'Confirmed');

-- --------------------------------------------------------

--
-- Table structure for table `documentverfication`
--

CREATE TABLE `documentverfication` (
  `PassengerID` int(11) NOT NULL,
  `VerificationStatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `documentverfication`
--

INSERT INTO `documentverfication` (`PassengerID`, `VerificationStatus`) VALUES
(1, 'Verified'),
(2, 'Pending'),
(3, 'Verified'),
(4, 'Verified'),
(5, 'Pending'),
(6, 'Verified'),
(7, 'Rejected'),
(8, 'Verified'),
(9, 'Verified'),
(10, 'Verified');

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE `flights` (
  `FlightID` int(11) NOT NULL,
  `DepartureLocation` varchar(45) NOT NULL,
  `ArrivalLocation` varchar(45) NOT NULL,
  `DepartureDate` datetime NOT NULL,
  `ClassOfService` varchar(45) NOT NULL,
  `Price` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flights`
--

INSERT INTO `flights` (`FlightID`, `DepartureLocation`, `ArrivalLocation`, `DepartureDate`, `ClassOfService`, `Price`) VALUES
(1, 'Islamabad, Pakistan', 'Dubai, United Arab Emirates', '2023-12-25 10:00:00', 'Business', 150000),
(2, 'Karachi, Pakistan', 'Istanbul, Turkey', '2023-12-26 12:30:00', 'Economy', 80000),
(3, 'Lahore, Pakistan', 'Doha, Qatar', '2023-12-27 15:45:00', 'First Class', 200000),
(4, 'Islamabad, Pakistan', 'Colombo, Sri Lanka', '2023-12-28 08:15:00', 'Economy', 70000),
(5, 'Karachi, Pakistan', 'Bangkok, Thailand', '2023-12-29 11:30:00', 'Business', 180000),
(6, 'Lahore, Pakistan', 'Singapore', '2023-12-30 14:45:00', 'Economy', 90000),
(7, 'Islamabad, Pakistan', 'Tokyo, Japan', '2023-12-31 17:00:00', 'First Class', 220000),
(8, 'Karachi, Pakistan', 'Kuala Lumpur, Malaysia', '2024-01-01 09:15:00', 'Business', 160000),
(9, 'Lahore, Pakistan', 'Paris, France', '2024-01-02 12:30:00', 'Economy', 110000),
(10, 'Islamabad, Pakistan', 'London, UK', '2024-01-03 15:45:00', 'First Class', 240000);

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE `passengers` (
  `PassengerID` int(11) NOT NULL,
  `PassengerName` varchar(45) NOT NULL,
  `ContactNumber` bigint(20) NOT NULL,
  `PassportNumber` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`PassengerID`, `PassengerName`, `ContactNumber`, `PassportNumber`) VALUES
(1, 'Alishba Iqbal', 3215964785, 'AB123456'),
(2, 'Sameera Saeed', 3245896120, 'CD789012'),
(3, 'Zoella Malik', 3254821039, 'EF345678'),
(4, 'Abdullah Khan', 3257841036, 'GH901234'),
(5, 'Raza Ahmed', 3265987410, 'IJ567890'),
(6, 'Ashfaq Khan', 3257841031, 'KL123456'),
(7, 'Musab Siddiqui', 3258741236, 'MN789012'),
(8, 'Laraib Shakeel', 3245987631, 'OP345678'),
(9, 'Abdul Ahad', 3321478520, 'QR901234'),
(10, 'Hamza Raza', 3265987413, 'ST567890');

-- --------------------------------------------------------

--
-- Table structure for table `refundticket`
--

CREATE TABLE `refundticket` (
  `RefundID` int(11) NOT NULL,
  `BookingID` int(11) NOT NULL,
  `RefundReason` varchar(45) NOT NULL,
  `RefundStatus` varchar(45) NOT NULL,
  `RefundAmount` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `refundticket`
--

INSERT INTO `refundticket` (`RefundID`, `BookingID`, `RefundReason`, `RefundStatus`, `RefundAmount`) VALUES
(1, 1, 'Change in travel plans', 'Approved', 37500),
(2, 2, 'Cancellation within 24 hours', 'Approved', 80000),
(3, 3, 'Customer request', 'Denied', 0),
(4, 4, 'Change in travel plans', 'Approved', 17500),
(5, 5, 'Change in travel plans', 'Pending', 45000),
(6, 6, 'Customer request', 'Denied', 0),
(7, 7, 'Emergency situation', 'Approved', 110000),
(8, 8, 'Change in travel plans', 'Approved', 40000),
(9, 9, 'Customer request', 'Denied', 0),
(10, 10, 'Change in travel plans', 'Approved', 60000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boardingpass`
--
ALTER TABLE `boardingpass`
  ADD KEY `PassengerID` (`PassengerID`),
  ADD KEY `FlightID` (`FlightID`);

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
  MODIFY `BookingID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `flights`
--
ALTER TABLE `flights`
  MODIFY `FlightID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `passengers`
--
ALTER TABLE `passengers`
  MODIFY `PassengerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `refundticket`
--
ALTER TABLE `refundticket`
  MODIFY `RefundID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `boardingpass`
--
ALTER TABLE `boardingpass`
  ADD CONSTRAINT `boardingpass_ibfk_1` FOREIGN KEY (`PassengerID`) REFERENCES `passengers` (`PassengerID`),
  ADD CONSTRAINT `boardingpass_ibfk_2` FOREIGN KEY (`FlightID`) REFERENCES `flights` (`FlightID`);

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
