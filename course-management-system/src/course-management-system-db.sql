create database course_management;

create table signup(
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null,
user varchar(10),
primary key (username,email,phone)
);

use course_management;

select * from signup;

drop table signup;

show tables;

create table student(
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null,
primary key (username,email,phone)
);