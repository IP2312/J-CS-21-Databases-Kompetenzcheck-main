CREATE DATABASE IF NOT EXISTS pv DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


use pv;
create table if not exists PM (
    	id int primary key auto_increment,
    	location varchar(255)
    );

create table if not exists address (
    	id int primary key auto_increment,
    	street varchar(255),
        city varchar(255),
        state varchar(255),
        zipcode int,
        no int
    );

create table if not exists  person (
    	id int primary key auto_increment,
    	first_name varchar(255),
        last_name varchar(255),
        gender varchar(20),
        PM_Id int,
        address_Id int,
        foreign key (PM_Id) references PM(id),
        foreign key (address_Id) references address(id)
    );
