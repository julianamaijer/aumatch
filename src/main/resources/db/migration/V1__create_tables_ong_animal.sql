CREATE TABLE ong(
	id int auto_increment primary key,
    company_name varchar(255) not null,
    registered_number varchar(255) not null
);

CREATE TABLE animal(
	id int auto_increment primary key,
    name varchar(255) not null,
    breed varchar(255) not null,
    age int not null,
    stature varchar(255) not null,
    type varchar(255) not null,
    gender varchar(255) not null,
    status varchar(255) not null,
    ong_id int not null,
    FOREIGN KEY (ong_id) REFERENCES ong(id)
);
