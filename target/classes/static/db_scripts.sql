

-- Script for creating sites DB --

CREATE DATABASE oraiyan;

USE oraiyan;

DROP TABLE IF EXISTS `site`;
CREATE TABLE `site` (
  `SiteId` int(11) NOT NULL PRIMARY KEY,
  `Pincode` int(10) NOT NULL,
  `Length` varchar(10),
  `Width` varchar(10),
  `Area` varchar(50)
);

DROP TABLE IF EXISTS `dealer`;
CREATE TABLE `dealer` (
  `DealerId` int(11) NOT NULL PRIMARY KEY,
  `DealerName` varchar(64),
  `PhoneNo` varchar(12),
  `Email` varchar(128) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `Pincode` int(11) NOT NULL PRIMARY KEY,
  `Name` varchar(25),
  `DealerId` int(11) NOT NULL
);



INSERT INTO site( SiteId, Pincode, Length, Width, Area) VALUES ( 10, 560041 ,'30sqft', '40sqft', 'Jayanagar'),
                                                                ( 11, 560042 ,'40sqft', '60sqft', 'Jayanagar 1st block'),
                                                                ( 12, 560043 ,'30sqft', '40sqft', 'Jayanagar 3rd block');

INSERT INTO dealer( DealerId, DealerName, PhoneNo, Email) VALUES (3, 'JOHN', '8764564723', 'JOHNSMITH@GMAIL.COM'),
                                                                  (4, 'DILIP', '9742549069', 'DILIP7@GMAIL.COM'),
                                                                  (5, 'NAVEEN', '9164130711', 'NAVEEN23@GMAIL.COM');

INSERT INTO area( Pincode, Name, DealerId) VALUES (560041, 'Jayanagar', 3),
                                                   (560042, 'Jayanagar 1st block', 4),
                                                   (560043, 'Jayanagar 3rd block', 5);




