create table students(emailid varchar(40) not null primary key, password varchar(30) not null,name varchar(30) not null,gender varchar(6) not null,fname varchar(30) not null,foccupation varchar(30) not null, mname varchar(30) not null,dob varchar(30) not null,pic varchar(30) not null);
create table presentadsress varchar(100) not null,permaddress varchar(100) not null,smobno int(10),fmobno int(10),tnoe varchar(30) not null,tyop varchar(30) not null,tboeard varchar(30) not null,tsname varchar(30) not null,tmos varchar(30) not null,tsper varchar(30) not null,tactper varchar(30) not null,
twnoe varchar(30) not null,twyop varchar(30) not null,twboeard varchar(30) not null,twsname varchar(30) not null,twmos varchar(30) not null,twsper varchar(30) not null,twactper varchar(30) not null,dnou varchar(30) not null,stream varchar(30) not null,dyop varchar(30) not null,dsper varchar(30) not null
uregno int(30) not null,urollno int(30) not null,marks1 int(30) not null,marks2 int(30) not null,marks3 int(30) not null,marks4 int(30) not null,marks5 int(30) not null,marks6 int(30) not null,marks7 int(30) not null,marks8 int(30) not null);
ALTER TABLE students CHANGE twnoe twnoe varchar(50) DEFAULT NULL;
create table coordinators(name varchar(30) not null, email varchar(30) not null,mobno varchar(30) not null,userid varchar(30) primary key,password varchar(30) not null);
create table documents(name varchar(30) not nullvarchar(30) not null, subject varchar(30) not null);