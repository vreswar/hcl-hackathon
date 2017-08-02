insert into app_user(id,name,username,password) values (1,'Samraj Timmapuram','parent','parent');
insert into app_user(id,name,username,password) values (2,'Sudhakar KR','child','child');

insert into app_user_roles(app_user_id,roles) values (1,'PARENT');
insert into app_user_roles(app_user_id,roles) values (1,'CHILD');
insert into app_user_roles(app_user_id,roles) values (2,'CHILD');
