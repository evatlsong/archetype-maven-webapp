create table if not exists user (
id int(4) auto_increment primary key,
username varchar(20),
password varchar(20)
) engine=InnoDB;