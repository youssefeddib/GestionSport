CREATE DATABASE SportFlow;
USE SportFlow;

 CREATE TABLE Membre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telephone VARCHAR(20)
);

CREATE TABLE Entraineur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    specialite VARCHAR(100),
    telephone VARCHAR(20),
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Seance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date_heure DATETIME NOT NULL,
    duree INT NOT NULL,
    id_Entraineur INT NOT NULL,
    FOREIGN KEY (id_Entraineur) REFERENCES Entraineur(id) ON DELETE CASCADE
);

 insert into Membre (nom, prenom, email, telephone) values
 ('youssef', 'hanafi', 'hanafi@email.com', '0172937829'),
 ('rahim', 'doran', 'doran@email.com', '0182736593'),
 ('ahmed', 'drag', 'drag@email.com', '016724894è');

 INSERT INTO Entraineur (nom, prenom, specialite, telephone, email) VALUES
('Durand', 'Pierre', 'Musculation', '0623456789', 'pierre.durand@email.com'),
('Rousseau', 'Marie', 'Yoga', '0687654321', 'marie.rousseau@email.com');

INSERT INTO Seance (date_heure, duree, id_entraineur, capacite_max) VALUES
('2024-03-12 18:00:00', 60, 1, 10),
('2024-03-13 10:00:00', 45, 2, 15);