CREATE TABLE IF NOT EXISTS employee (

    id BIGSERIAL  PRIMARY KEY,
    name varchar(20),
    email varchar(150),
    date_of_birth timestamp not null

);