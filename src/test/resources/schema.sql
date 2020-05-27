-- DROP DATABASE IF EXISTS dienynas_test;
CREATE DATABASE IF NOT EXISTS dienynas_test;


DROP TABLE IF EXISTS studentai, pazymiai;
 
    ------------------------- studentai ------------------------
  CREATE TABLE studentai
  (
      `Id`        INT          NOT NULL AUTO_INCREMENT,
      `vardas`    VARCHAR(100) NOT NULL,
      `pavarde`   VARCHAR(100) NOT NULL,
      `el_pastas` VARCHAR(200) NOT NULL,
      PRIMARY KEY (`Id`)
  );
      --------------- pazymiai----------------------
  CREATE TABLE pazymiai
  (
      `Id`           INT AUTO_INCREMENT,
      `studentas_id` INT,
      `data`         DATE,
      `pazymys`      INT,
      PRIMARY KEY (`Id`),
      FOREIGN KEY (studentas_id) REFERENCES studentai (id) ON DELETE CASCADE
  );

USE dienynas_test;
INSERT INTO `studentai` (`vardas`, `pavarde`, `el_pastas`)
VALUES ('Gediminas', 'Jonaitis', 'g.jonaitis@gmail.com'),
('Jonas', 'Petraitis', 'j.petraitis@gmail.com'),
('Kazimieras', 'Lukšys', 'k.luksys@gmail.com'),
 ('Rimas', 'Motuza', 'r.motuza@gmail.com'),
 ('bandymui', 'bandymui', 'bandymas@gmail.com');

INSERT into pazymiai (studentas_id, data, pazymys)
VALUES (1, '2018.08.12', 10),
       (2, '2018.08.12', 8),
       (3, '2018.08.12', 8),
       (4, '2018.08.12', 9),
       (1, '2018.08.16', 9),
       (2, '2018.08.16', 8),
       (3, '2018.08.16', 9),
       (1, '2018.08.17', 10);




