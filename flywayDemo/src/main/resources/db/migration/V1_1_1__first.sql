CREATE TABLE IF NOT EXISTS address (

    id BIGSERIAL  PRIMARY KEY,
    street varchar(20),
    flatNum int,
    wing char(3),
    societyName varchar(200),
    city varchar(200),
    state varchar(200),
    countryCode int,
    zipcode varchar(7)
    

);