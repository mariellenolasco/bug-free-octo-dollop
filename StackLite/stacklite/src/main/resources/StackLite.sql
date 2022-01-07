-- drop table solutions
-- drop table issues

create table issues (
    Id serial primary key,
    Title VARCHAR(100) not null,
    Body varchar(500) not null
);

create table solutions(
    Id serial primary key,
    Answer varchar(1000) not null,
    Upvote int,
    Downvote int,
    Issue_Id int not null REFERENCES issues(id)
);

insert into issues (title, body) values 
('Stack Overflow', 'I run my program but it replies with stack overflow...'),
('Null pointer exception', 'I run my program and I get null pointer exception on line -1?');

insert into solutions(Answer, Upvote, Downvote, Issue_Id) values 
('Maybe check if you have an infinite loop or a circular reference', 10, 1, 1),
('Maybe check if you are missing a semi colon', 1, 10, 1),
('Maybe check if you are a java developer', 0, 10, 1),
('Maybe check if you are instantiating the object', 10, 1, 2);