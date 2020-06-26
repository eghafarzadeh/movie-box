create sequence artist_seq start with 1 increment by 1;
create sequence movie_seq start with 1 increment by 1;

create table actor (
    acting_start_date date,
    id bigint not null,
    primary key (id)
);

create table artist (
    id bigint not null,
    first_name NVARCHAR2(50) not null,
    last_name NVARCHAR2(50) not null,
    primary key (id)
);

create table director (
    directing_start_date date,
    id bigint not null,
    primary key (id)
);

create table movie (
    id bigint not null,
    description NVARCHAR2(256),
    name NVARCHAR2(100) not null,
    fk_director bigint not null,
    fk_writer bigint not null,
    content BLOB not null,
    poster BLOB not null,
    primary key (id)
);

create table writer (
    writing_start_date date,
    id bigint not null,
    primary key (id)
);

create table movie_actor (
    movie_id bigint not null,
    actor_id bigint not null,
    primary key (movie_id, actor_id)
);

create index ARTIST_NAME on artist (first_name, last_name);
create index MOVIE_NAME on movie (name);
create index MOVIE_DESCRIPTION on movie (description);

alter table movie
    add constraint UK_MOVIE_1 unique (name);

alter table actor
    add constraint FK_ACTOR_ARTIST_1
    foreign key (id)
    references artist;

alter table director
    add constraint FK_DIRECTOR_ARTIST_1
    foreign key (id)
    references artist;

alter table writer
    add constraint FK_WRITER_ARTIST_1
    foreign key (id)
    references artist;

alter table movie
    add constraint FK_MOVIE_DIRECTOR_1
    foreign key (fk_director)
    references director;

alter table movie
    add constraint FK_MOVIE_WRITER_1
    foreign key (fk_writer)
    references writer;

alter table movie_actor
    add constraint FK_MOVIE_ACTOR_1
    foreign key (actor_id)
    references actor;

alter table movie_actor
       add constraint FK_MOVIE_ACTOR_2
       foreign key (movie_id)
       references movie;
