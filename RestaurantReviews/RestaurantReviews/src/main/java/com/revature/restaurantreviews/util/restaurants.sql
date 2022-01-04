create table restaurants
(
    id serial primary key,
    name varchar(50) not null
);

insert into restaurants (name) values 
('Balajadias'),
('Canto'),
('Totos Grill');

select * from restaurants;