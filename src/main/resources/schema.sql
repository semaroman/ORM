drop table if exists public.Persons;
create table if not exists public.Persons(
    id serial primary key,
    name varchar(20) not null,
    surname varchar(20) not null,
    age int not null check(age > 0),
    phone_number char(16),
    city_of_living varchar(40)
);
