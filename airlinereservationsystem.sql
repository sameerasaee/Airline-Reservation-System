-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2023 at 07:16 PM
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `boardingpass`
--

INSERT INTO `boardingpass` (`PassengerID`, `FlightID`, `SeatNumber`, `BoardingDateTime`, `BoardingStatus`, `GateNo`) VALUES
(1, 1, 'A1', '2023-12-25 09:30:00', 'Issued', 'Gate 1'),
(2, 2, 'B2', '2023-12-26 11:00:00', 'Issued', 'Gate 2'),
(3, 3, 'C3', '2023-12-27 14:15:00', 'Used', 'Gate 3'),
(4, 4, 'D4', '2023-12-28 07:45:00', 'Used', 'Gate 4'),
(5, 5, 'E5', '2023-12-29 16:00:00', 'Issued', 'Gate 5'),
(6, 6, 'F6', '2023-12-30 08:15:00', 'Used', 'Gate 6'),
(7, 7, 'G7', '2024-01-02 13:30:00', 'Issued', 'Gate 7'),
(8, 8, 'H8', '2024-01-03 10:50:00', 'Used', 'Gate 8'),
(9, 9, 'I9', '2024-01-04 15:40:00', 'Issued', 'Gate 9'),
(10, 10, 'J10', '2024-01-05 17:15:00', 'Issued', 'Gate 10');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`BookingID`, `PassengerID`, `FlightID`, `BookingDate`, `PaymentDetails`, `BookingStatus`) VALUES
(101, 1, 1, '2023-12-15 08:00:00', 'Credit Card', 'Confirmed'),
(102, 2, 2, '2023-12-16 10:30:00', 'Debit Card', 'Pending'),
(103, 3, 3, '2023-12-17 12:45:00', 'Credit Card', 'Cancelled'),
(104, 4, 4, '2023-12-18 14:15:00', 'Debit Card', 'Confirmed'),
(105, 5, 5, '2023-12-19 16:30:00', 'Credit Card', 'Pending'),
(106, 6, 6, '2023-12-20 18:45:00', 'Debit Card', 'Confirmed'),
(107, 7, 7, '2023-12-21 20:00:00', 'Credit Card', 'Cancelled'),
(108, 8, 8, '2023-12-22 22:15:00', 'Debit Card', 'Confirmed'),
(109, 9, 9, '2023-12-23 09:30:00', 'Debit Card', 'Pending'),
(110, 10, 10, '2023-12-24 11:45:00', 'Credit Card', 'Confirmed');

-- --------------------------------------------------------

--
-- Table structure for table `documentverfication`
--

CREATE TABLE `documentverfication` (
  `PassengerID` int(11) NOT NULL,
  `DocumentStatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `documentverfication`
--

INSERT INTO `documentverfication` (`PassengerID`, `DocumentStatus`) VALUES
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
(1, 'Karachi', 'Dubai', '2023-12-27 12:30:00', 'Business', 100000),
(2, 'Islamabad', 'Istanbul', '2023-12-30 10:00:00', 'Economy', 95000),
(3, 'Lahore', 'Doha', '2023-12-30 15:30:00', 'First Class', 125000),
(4, 'Islamabad', 'Colombo', '2024-01-03 08:15:00', 'Economy', 65000),
(5, 'Karachi', 'Bangkok', '2023-12-29 11:30:00', 'Business', 78000),
(6, 'Islamabad', 'Tokyo', '2023-12-31 17:00:00', 'First Class', 92000),
(7, 'Karachi', 'Kuala Lumpur', '2024-01-01 09:15:00', 'Business', 85000),
(8, 'Lahore', 'Paris', '2024-01-02 12:30:00', 'Economy', 91000),
(9, 'Islamabad', 'London', '2024-01-03 15:45:00', 'First Class', 84000),
(10, 'Quetta', 'Dublin', '2024-01-06 14:30:00', 'First Class', 62000);

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
(1, 'Faraz Ahmed', 3452184403, 'AB123456'),
(2, 'Faiza Muneeb', 3458721693, 'CD789012'),
(3, 'Munawar Faizan', 3452196741, 'EF345678'),
(4, 'Iqbal Ahmed', 3258974136, 'GH901234'),
(5, 'Laraib Shakeel', 3215964785, 'IJ567890'),
(6, 'Areej Fatima', 3245896120, 'KL123456'),
(7, 'Saeed Ahmed', 3254821039, 'MN789012'),
(8, 'Ashfaq Khan', 3265987410, 'OP345678'),
(9, 'Raza Khan', 3254198760, 'QR901234'),
(10, 'Lubaba Musab', 3257841036, 'ST567890');

-- --------------------------------------------------------

--
-- Table structure for table `refundticket`
--

CREATE TABLE `refundticket` (
  `RefundID` int(11) NOT NULL,
  `BookingID` int(11) NOT NULL,
  `RefundReason` varchar(45) NOT NULL,
  `RefundAmount` bigint(20) NOT NULL,
  `RefundStatus` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `refundticket`
--

INSERT INTO `refundticket` (`RefundID`, `BookingID`, `RefundReason`, `RefundAmount`, `RefundStatus`) VALUES
(201, 101, 'Change in travel plans', 25000, 'Approved'),
(202, 102, 'Cancellation within 24 hours', 95000, 'Approved'),
(203, 103, 'Customer request', 0, 'Denied'),
(204, 104, 'Change in travel plans', 16250, 'Approved'),
(205, 105, 'Change in travel plans', 19500, 'Pending'),
(206, 106, 'Customer request', 0, 'Denied'),
(207, 107, 'Emergency situation', 42500, 'Approved'),
(208, 108, 'Change in travel plans', 22750, 'Approved'),
(209, 109, 'Customer request', 0, 'Denied'),
(210, 110, 'Change in travel plans', 15500, 'Approved');

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
  MODIFY `BookingID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;

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
  MODIFY `RefundID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=211;

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
