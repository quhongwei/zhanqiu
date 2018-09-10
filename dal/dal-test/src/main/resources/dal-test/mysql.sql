SET MODE Mysql;

create table student (
	id VARCHAR(36)  not null,
	name VARCHAR(36)  not null,
	address varchar(64)  not null,
	primary key (id)
);

create table classes (
	id VARCHAR(36)  not null,
	name VARCHAR(36)  not null,
	student_id VARCHAR(36)  not null,
	primary key (id)
);

