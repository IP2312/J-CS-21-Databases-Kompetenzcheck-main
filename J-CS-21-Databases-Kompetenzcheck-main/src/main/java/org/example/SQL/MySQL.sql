# CREATE DATABASE IF NOT EXISTS pm DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;



Drop table if exists person;
Drop table if exists PM;
Drop table if exists address;

create table PM
(
    id int primary key auto_increment,
    location varchar(255) NOT NULL,
    Unique (location)
);


create table address
(
    id      int primary key auto_increment,
    street  varchar(255),
    city    varchar(255),
    state   varchar(255),
    zipcode int,
    no      int
);

create table person
(
    id         int primary key auto_increment,
    first_name varchar(255),
    last_name  varchar(255),
    gender     varchar(20),
    PM_Id      int,
    address_Id int,
    foreign key (PM_Id) references PM (id) on delete cascade,
    foreign key (address_Id) references address (id) on delete cascade
);


SELECT * FROM PM;


