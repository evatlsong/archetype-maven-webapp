DROP TABLE if EXISTS USER;
create table user (
id IDENTITY,
username varchar(25) not null,
password varchar(25) not null
);