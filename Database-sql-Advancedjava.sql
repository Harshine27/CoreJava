create database Adavancedjava;
use Adavancedjava;
create table students(studid int , stdname varchar(20),srdmarks decimal(10,2) check (srdmarks>95) );
insert into students values(100,'Harshine',95);
desc students;

select * from students;
insert into students values(101,'Divya',99);
insert into students values(101,'Prashanti',100);
drop table students;

update students set studid = 120 where stdname = 'Prashanti';

alter table students add stdadd varchar(20);

alter table students drop stdadd;

truncate  table students;

drop table students;

create table employees (empid int primary key,emp_Name varchar(20),dept_id int );
create table departments(dept_id int primary key , dept_name varchar(20));

insert into employees values(106,'Harshine',5);
insert into employees values(125,'Divya',6);
insert into employees values(112,'Prashanti',3);
insert into employees values(163,'Keerthi',1);
drop table employees;

select * from employees;

delete from students where studid = 102;

insert into students (srdmarks , stdname) values(96,'Keerthi');

insert into departments values(5,'HR');
insert into departments values(3,'Software Engineer');
insert into departments values(1,'Trainer');
insert into departments values(6,'Teacher');

select * from departments;
select * from employees;
drop table departments;

select empid,emp_Name from employees;

select empid,emp_Name,dept_name
from employees
right join departments
on employees.dept_id = departments.dept_id;

drop table employees;

insert into employees values(175,'Keerthi',9);

insert into departments values(8,'Lawyer');

