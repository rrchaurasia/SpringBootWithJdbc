create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

insert into person(id,name,location,birth_date) values (1,'rahul','bangalore',sysdate());
insert into person(id,name,location,birth_date) values (2,'ravi','chausa',sysdate());
insert into person(id,name,location,birth_date) values (3,'soni','zabra',sysdate());