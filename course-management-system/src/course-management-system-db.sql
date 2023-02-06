create database course_management;

use course_management;

create table student(
student_id int primary key auto_increment,
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null,
module_id int,
foreign key (module_id) references modules(module_id)
);

create table admin(
admin_id int primary key auto_increment,
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null
);

create table instructor(
instructor_id int primary key auto_increment,
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null
);

create table modules(
module_id int primary key auto_increment,
module_name varchar(20) not null
);

create table instructor_activity(
instructor_id int,
module_id int,
foreign key (instructor_id) references instructor(instructor_id),
foreign key(module_id) references modules(module_id)
);

create table student_activity(
student_id int,
module_id int,
foreign key (student_id) references student(student_id),
foreign key(module_id) references modules(module_id)
);

update admin
set password =  'lamjung'
where username = 'pritam';

select*from admin;