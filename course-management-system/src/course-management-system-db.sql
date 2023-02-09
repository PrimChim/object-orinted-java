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
values('Rukesh Shrestha', 'rukesh@gmail.com' ,'rukesh','9815426307'),
('Subash Bista', 'subash@gmail.com' ,'subash','9854126307'),
('Jenny', 'jenny@gmail.com' ,'jenny','9748152603'),
('Anmol Adhikari', 'anmol@gmail.com' ,'anmol','9784516230'); 

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
module_id int primary key auto_increment,
module_name varchar(20),
course_id int,
foreign key(course_id) references courses(course_id)
);

select *from student_activity;

alter table courses
rename column module_name to course_name;

insert into modules(module_name, course_id)
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

alter table modules
add level int not null;

update modules
set level = 4
where module_id <= 6;

select*from instructor_activity;

insert into instructor( username, email,password, phone)
values('Simon Giri', 'simon@gmail.com' ,'simon','9748150263');

select modules.module_id, modules.module_name, instructor_id
from modules
inner join student 
on student.level = modules.level
inner join instructor_activity as ins
on modules.module_id = ins.module_id
where student.username = 'Pritam G';

insert into instructor_activity
values(1,1),
(1,2),
(3,3),
(6,4),
(2,5),
(8,6),
(8,7),
(4,8),
(6,9),
(5,10),
(9,11),
(9,12),
(8,13),
(1,14),
(3,15),
(9,16),
(7,17);

 select * from modules
 inner join instructor_activity as ins
 on modules.module_id = ins.module_id;
 
 select modules.module_id, modules.module_name, instructor_id
 from modules
 inner join student
 on student.level = modules.level
 inner join instructor_activity as ins
 on modules.module_id = ins.module_id
 where student.username = 'Pritam G';
 select *from student;
 select count(course_id) from courses;
