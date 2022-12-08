CREATE DATABASE mybatis;
USE mybatis

CREATE TABLE t_customer(
     id INT(32) PRIMARY KEY AUTO_INCREMENT,
     username VARCHAR (50),
     jobs VARCHAR(50),
     phone VARCHAR(16)
)

    INSERT  INTO t_customer VALUES ('1','joy','teacher','10086521');
INSERT  INTO t_customer VALUES ('2','jack','teacher','10010521');
INSERT  INTO t_customer VALUES ('3','jack','worker','1000051');