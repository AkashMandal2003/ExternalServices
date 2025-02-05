CREATE DATABASE EXTERNAL_SERVICES;

CREATE TABLE PAN (
                     id INT PRIMARY KEY,
                     pan_num VARCHAR(10),
                     full_name VARCHAR(255),
                     dob DATE,
                     issue_date DATE,
                     status VARCHAR(20)
);

CREATE TABLE Aadhar (
                        id INT PRIMARY KEY,
                        aadhar_id VARCHAR(12),
                        full_name VARCHAR(255),
                        dob DATE,
                        gender VARCHAR(10),
                        address TEXT,
                        email VARCHAR(255),
                        contact_number VARCHAR(15),
                        status VARCHAR(20),
                        issue_date DATE
);

CREATE TABLE CIBIL (
                       id INT PRIMARY KEY,
                       pan_id VARCHAR(10),
                       credit_score INT,
                       credit_history TEXT,
                       total_outstanding_balance DECIMAL(15, 2),
                       recent_credit_inquiries TEXT,
                       payment_history TEXT,
                       credit_limit DECIMAL(15, 2),
                       status VARCHAR(20),
                       report_date DATE
);
