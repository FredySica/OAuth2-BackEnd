/* Clientes */
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 1','Sica 1','fredysica1@yahoo.com','2018-01-01');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 2','Sica 2','fredysica2@yahoo.com','2018-01-02');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 3','Sica 3','fredysica3@yahoo.com','2018-01-03');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 4','Sica 4','fredysica4@yahoo.com','2018-01-04');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 5','Sica 5','fredysica5@yahoo.com','2018-01-05');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 6','Sica 6','fredysica6@yahoo.com','2018-01-06');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 7','Sica 7','fredysica7@yahoo.com','2018-01-07');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 8','Sica 8','fredysica8@yahoo.com','2018-01-08');
INSERT INTO clientes (nombre, apellido, email, create_at) values ('Fredy 9','Sica 9','fredysica9@yahoo.com','2018-01-09');

/* Monedas */
INSERT INTO monedas(code_alpha,currency,country_region) values ('GTQ','Guatemalan Quetzal','Guatemala');
INSERT INTO monedas(code_alpha,currency,country_region) values ('USD','US Dollar','United States of America');

/* Creamos algunos usuarios con sus roles */
insert into usuarios(username,password,enabled,nombre,apellido,email) values ('fsica','$2a$10$WrFhQ7E6TM9hrJvAFCXsP.25ONkQqGrl0kZe89nj6Hhnnj5s3vVIu',1,'Fredy','Sica','fredysica@yahoo.com');
insert into usuarios(username,password,enabled,nombre,apellido,email) values ('admin','$2a$10$HHqt5UMiFwk/3nB0z0MJHuw7LYof9IpcyUn5If6blzdNtRjJsuprC',1,'usrgle','usrgle','usrgle@yahoo.com');

insert into roles(nombre) values('ROLE_USER');
insert into roles(nombre) values('ROLE_ADMIN');

insert into usuarios_roles(usuarios_id, roles_id) values (1,1);
insert into usuarios_roles(usuarios_id, roles_id) values (2,2);
insert into usuarios_roles(usuarios_id, roles_id) values (2,1);
