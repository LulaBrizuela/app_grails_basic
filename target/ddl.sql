drop table book if exists;
create table book (id bigint generated by default as identity (start with 1), version bigint not null, author varchar(255) not null, title varchar(255) not null, primary key (id));
