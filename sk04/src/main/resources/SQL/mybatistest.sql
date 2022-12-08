CREATE DATABASE mybatis;

use mybatis;
create table users(
    uid int primary key auto_increment,
    uname varchar(20) not null,
    uage int not null
);
insert into users(uid,uname,uage) values(null,'张三',20),(null,'李四',18);

use mybatis;
create table users1(
    uid int primary key auto_increment,
    user_name varchar(20) not null,
    uage int not null
);
insert into users1(uid,user_name,uage) values(null,'张三',20),(null,'李四',18);


USE mybatis;
CREATE TABLE t_student(
   sid INT PRIMARY KEY AUTO_INCREMENT,
   sname VARCHAR(50),
   sage INT
);
INSERT INTO t_student(sname,sage) VALUES('Lucy',25);
INSERT INTO t_student(sname,sage) VALUES('Lili',20);
INSERT INTO t_student(sname,sage) VALUES('Jim',20);

use mybatis;
create table employee(
    id int primary key auto_increment,
    name varchar(20) not null,
    age int not null,
    position varchar(20)
);
insert into employee(id,name,age,position) values(null,'张三',20,'员工  	'),(null,'李四',18, '员工'),(null,'王五',35,'经理');

