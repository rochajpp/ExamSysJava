CREATE DATABASE pooDb;


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

INSERT INTO professor (name, user, password) VALUES ("João", "rocha", "joao1234");
INSERT INTO exam (name, id_professor) VALUES ("Teste", 1);

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
    option1 VARCHAR(20) NOT NULL,
    option2 VARCHAR(20) NOT NULL,
    option3 VARCHAR(20) NOT NULL,
    option4 VARCHAR(20) NOT NULL,
    option5 VARCHAR(20) NOT NULl
);


DROP TABLE student_exam;
DROP TABLE exam;
DROP TABLE student;
DROP TABLE professor;
DROP TABLE question;