create database course_management;

use course_management;

create table student(
student_id int primary key auto_increment,
username varchar(20) not null,
email varchar(50) not null,
password varchar(50) not null,
phone varchar(10) not null
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

create table courses(
course_id int primary key auto_increment,
course_name varchar(20) not null
);

create table instructor_activity(
instructor_id int,
module_id int,
foreign key (instructor_id) references instructor(instructor_id),
foreign key(module_id) references modules(module_id)
);

create table student_activity(
student_id int,
course_id int,
foreign key (student_id) references student(student_id),
foreign key(course_id) references courses(course_id)
);

update admin
set password =  'lamjung'
where username = 'pritam';



insert into instructor (username,email,password,phone)
values('Ashish Aacharya', 'ashishacharya8@gmail.com', 'ashish' , '9876543210'),
('Rohit', 'rohit@gmail.com','rohit','9865321470');

insert into courses(course_name)
values('BBIM'),
('BIT');

select*from student;

delete from student where username = 'Amit12' or username = 'Amit';

insert into student_activity
values(4,1);

insert into student( username, email,password, phone)
values('Pritam G', 'pritam@gmail.com' ,'pritam','9866544445'),
('Anil G', 'anil@gmail.com' ,'anil','9876543210'), 
('Amita G', 'amita@gmail.com' ,'amita','9865327410'), 
('Susma G', 'susma@gmail.com' ,'susma','9845126307');

insert into instructor( username, email,password, phone)
values('Sangay Lama', 'sangaylama@gmail.com' ,'sangay','9866544445'),
('Rohit Parajuli', 'rohitparajuli@gmail.com' ,'rohit','9876543210'); 

select student.student_id,username,email,phone,modules.module_name,courses.course_name
from
student inner join student_activity
on student.student_id = student_activity.student_id
inner join courses
on student_activity.course_id = courses.course_id
inner join modules
on courses.course_id = modules.course_id
where student.username = 'Pritam G';

create table modules(
course_id int primary key auto_increment,
course_name varchar(20),
module_id int,
foreign key(module_id) references modules(module_id)
);

select *from student_activity;

alter table courses
rename column module_name to course_name;

insert into modules(course_name, module_id)
values('Fundamentals of Programming', 2),
('Computational Mathematics',2),
('Academic Skills and Team Based Learning',2),
('Embedded System Programming',2),
('Internet Software Arhitecture',2),
('Introductory Programming',2),
('Collaborative Development',2),
('Distributed and Cloud System Programming',2),
('Numerical Method and Concurrency',2),
('Object-Oriented Design and Programming',2),
('Concepts and Technologies of AI',2),
('Human-Computer Interaction',2),
('Big Data',2),
('Hign Performance Computing',2),
('Project and Professionalism',2),
('Artificial Intelligence and Machine Learning',2),
('Complex Systems',2);