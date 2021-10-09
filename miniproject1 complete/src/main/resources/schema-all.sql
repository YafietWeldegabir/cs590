DROP TABLE IF EXISTS people;
CREATE TABLE people  (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         first_name VARCHAR(20),
                         last_name VARCHAR(20),
                         gpa DOUBLE,
                         dob date,
                         PRIMARY KEY (id)
);



