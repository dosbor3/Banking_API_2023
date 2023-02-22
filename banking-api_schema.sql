DROP DATABASE IF EXISTS bankingApi;

CREATE DATABASE bankingApi;

USE bankingApi;

CREATE TABLE Customer (
	Customer_number INT PRIMARY KEY AUTO_INCREMENT,
    First_name VARCHAR(50), 
    Last_name VARCHAR(50),
    Address VARCHAR(100),
    Phone VARCHAR(50),
    Email VARCHAR(100),     
    IsActive BOOLEAN
);

CREATE TABLE Account (
	Account_number INT PRIMARY KEY AUTO_INCREMENT,
    Customer_number INT, 
    Current_balance DOUBLE,
    Available_balance DOUBLE,
    Account_type INT, 
    IsActive BOOLEAN,
    FOREIGN KEY fk_Account_Customer (Customer_number)
		REFERENCES Customer(Customer_number)
);
CREATE TABLE Address (
	AddressId INT PRIMARY KEY AUTO_INCREMENT,
	Street VARCHAR(75),
	City VARCHAR(50),
	STATE VARCHAR(25),
	Zip VARCHAR(12)
);





