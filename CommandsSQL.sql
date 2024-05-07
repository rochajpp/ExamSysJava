CREATE DATABASE pooDb;

/*========== Actions Area ==========*/

SHOW TABLES;

SELECT * FROM student;

SELECT * FROM professor;

SELECT * FROM exam;

SELECT * FROM student_exam;

DELETE FROM student_exam WHERE id_student = 4;

DELETE FROM exam;
DELETE FROM student_exam;
DELETE FROM student;
DELETE FROM professor;
DELETE FROM question;

DELETE FROM exam WHERE name = "a";

/*==================================*/


/*========== Create Tables ==========*/

CREATE TABLE student(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    user VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
        
);

CREATE TABLE professor(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    user VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE exam(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    id_professor INT NOT NULL,
    FOREIGN KEY (id_professor) REFERENCES professor(id)
);

CREATE TABLE student_exam(
    id_student INT,
    id_exam INT,
    result FLOAT(3,1),
    PRIMARY KEY(id_student, id_exam),
    FOREIGN KEY (id_student) REFERENCES student(id),
    FOREIGN KEY (id_exam) REFERENCES Exam(id)
);

CREATE TABLE question(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_exam INT NOT NULL,
    statement VARCHAR(1000) NOT NULL,
    option1 VARCHAR(1000) NOT NULL,
    option2 VARCHAR(200) NOT NULL,
    option3 VARCHAR(200) NOT NULL,
    option4 VARCHAR(200) NOT NULL,
    option5 VARCHAR(200) NOT NULl,
    result VARCHAR(4) NOT NULL
);

/*===================================*/

/*========== Drop Tables ==========*/
DROP TABLE student_exam;
DROP TABLE exam;
DROP TABLE student;
DROP TABLE professor;
DROP TABLE question;
/*=================================*/


