CREATE DATABASE enadeSys;

CREATE TABLE exam(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    question VARCHAR(10000) NOT NULL,
    option1 VARCHAR(10),
    option2 VARCHAR(10),
    option3 VARCHAR(10),
    option4 VARCHAR(10),
    option5 VARCHAR(10),
    answer VARCHAR(10));


INSERT INTO exam (question) VALUES ("Teste");