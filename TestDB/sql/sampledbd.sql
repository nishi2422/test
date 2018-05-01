drop database if exists samplebd;
create database samplebd;
use samplebd;
create table samples_table(
user_id int,
user_name varchar(50),
user_age int,
Mail varchar(50)
);
insert into samples_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into samples_table values(2,"Sato",39,"yyy@google.com");
insert into samples_table values(3,"Harada",44,"zzz@yahoo.co.jp");

