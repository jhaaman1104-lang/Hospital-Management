CREATE DATABASE IF NOT EXISTS hospital_db;
USE hospital_db;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(30) DEFAULT 'ADMIN'
);
INSERT INTO users(username,password,role) VALUES ('admin','admin123','ADMIN');

CREATE TABLE patients (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    gender VARCHAR(20),
    dob DATE,
    phone VARCHAR(20),
    address VARCHAR(255),
    disease VARCHAR(255)
);

CREATE TABLE doctors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100),
    department VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE appointments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    reason VARCHAR(255),
    status VARCHAR(30) DEFAULT 'Scheduled',
    FOREIGN KEY(patient_id) REFERENCES patients(id) ON DELETE CASCADE,
    FOREIGN KEY(doctor_id) REFERENCES doctors(id) ON DELETE CASCADE
);

CREATE TABLE rooms (
    id INT PRIMARY KEY AUTO_INCREMENT,
    room_number VARCHAR(20) UNIQUE NOT NULL,
    room_type VARCHAR(50) NOT NULL,
    status VARCHAR(30) DEFAULT 'Available',
    patient_id INT NULL,
    FOREIGN KEY(patient_id) REFERENCES patients(id) ON DELETE SET NULL
);

INSERT INTO rooms(room_number,room_type,status) VALUES
('101','General','Available'),('102','General','Available'),
('201','Private','Available'),('202','ICU','Available');

CREATE TABLE bills (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    consultation_fee DECIMAL(10,2) DEFAULT 0,
    room_charge DECIMAL(10,2) DEFAULT 0,
    medicine_charge DECIMAL(10,2) DEFAULT 0,
    other_charge DECIMAL(10,2) DEFAULT 0,
    total DECIMAL(10,2) DEFAULT 0,
    bill_date DATE,
    payment_status VARCHAR(30) DEFAULT 'Pending',
    FOREIGN KEY(patient_id) REFERENCES patients(id) ON DELETE CASCADE
);
