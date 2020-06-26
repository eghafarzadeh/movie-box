insert into artist (id, first_name, last_name) values
(1, 'شهاب', 'حسینی'),
(2, 'اصغر', 'فرهادی'),
(3, 'اصغر', 'فرهادی');

insert into actor(id, acting_start_date) values (1, '2020-01-01');
insert into director(id, directing_start_date) values (2, '2019-01-01');
insert into writer(id, writing_start_date) values (3, '2018-01-01');

insert into movie (id, name, description, poster, content, fk_director, fk_writer) values
(1,'درباره الی', 'این فیلم درباره الی است', '54455354', '54455354', 2, 3);

insert into movie_actor(movie_id, actor_id) values
(1,1);

