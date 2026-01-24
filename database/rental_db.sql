
CREATE DATABASE IF NOT EXISTS rental_db
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE rental_db;

-- ============================
-- room_types
-- ============================
CREATE TABLE room_types (
  id INT AUTO_INCREMENT PRIMARY KEY,
  type_name VARCHAR(50) NOT NULL UNIQUE
) ENGINE=InnoDB;

-- ============================
-- floors
-- ============================
CREATE TABLE floors (
  id INT AUTO_INCREMENT PRIMARY KEY,
  floor_name VARCHAR(50) NOT NULL UNIQUE
) ENGINE=InnoDB;

-- ============================
-- room_numbers
-- ============================
CREATE TABLE room_numbers (
  id INT AUTO_INCREMENT PRIMARY KEY,
  room_number VARCHAR(10) NOT NULL UNIQUE
) ENGINE=InnoDB;

-- ============================
-- roles
-- ============================
CREATE TABLE roles (
  id INT AUTO_INCREMENT PRIMARY KEY,
  role VARCHAR(30) NOT NULL UNIQUE
) ENGINE=InnoDB;

-- ============================
-- users
-- ============================
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  role_id INT NOT NULL,
  FOREIGN KEY (role_id) REFERENCES roles(id)
) ENGINE=InnoDB;

-- ============================
-- prices
-- normal type NOT required to relate yet
-- ============================
CREATE TABLE prices (
  id INT AUTO_INCREMENT PRIMARY KEY,
  price DECIMAL(10,2) NOT NULL,
  per ENUM('1/month','1/year') NOT NULL,
  type_id INT NULL
) ENGINE=InnoDB;

-- ============================
-- rental_room
-- ============================
CREATE TABLE rental_room (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id_fk INT NOT NULL,
  type_id_fk INT NULL,
  price_id_fk INT NOT NULL,
  status ENUM('available','unavailable') NOT NULL,
  floor_fk INT NOT NULL,
  room_number_id_fk INT NOT NULL,
  create_by_fk INT NOT NULL,

  FOREIGN KEY (user_id_fk) REFERENCES users(id),
  FOREIGN KEY (price_id_fk) REFERENCES prices(id),
  FOREIGN KEY (floor_fk) REFERENCES floors(id),
  FOREIGN KEY (room_number_id_fk) REFERENCES room_numbers(id),
  FOREIGN KEY (create_by_fk) REFERENCES users(id)
) ENGINE=InnoDB;
