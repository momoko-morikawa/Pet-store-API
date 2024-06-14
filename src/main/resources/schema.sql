DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS tags;
DROP TABLE IF EXISTS pet_tags;
DROP TABLE IF EXISTS petphotos;

create table categories (
id int primary key,
name varchar(255)
);

create table pets(
id int primary key auto_increment,
category_id int,
name varchar(255),
status varchar(50),
foreign key(category_id) references categories(id)
);

create table tags (
id int primary key,
name varchar(255)
);

create table pet_tags (
pet_id int,
tag_id int,
primary key(pet_id, tag_id),
foreign key(pet_id) references pets(id),
foreign key(tag_id) references tags(id)
);

create table petphotos(
id int primary key auto_increment,
pet_id int,
url varchar(255),
foreign key(pet_id) references pets(id)
);