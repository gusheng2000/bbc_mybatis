use  mybatis;

create table tb_idcard(
id int primary key auto_increment,
code varchar(18)
);

insert into tb_idcard (CODE) values ('342225199910084561');
insert into tb_idcard (CODE) values ('342225199910084915');


create table tb_person(
id int  primary key auto_increment,
name varchar(32),
age int,
sex varchar(8),
code_id int unique ,
foreign key (code_id) references tb_idcard(id)
);

 insert into tb_person ( name, age, sex, code_id) values ('rose',21,'女',1);
 insert into tb_person ( name, age, sex, code_id) values ('jack',21,'男',2);