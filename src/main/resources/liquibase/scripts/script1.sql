-- liquibase formatted sql

-- changeset annaa:1

--CREATE TABLE roles (
--    role_id BIGSERIAL PRIMARY KEY,
--    roleName TEXT UNIQUE
--);
--INSERT INTO roles (roleName) VALUES ('USER'),('ADMIN');

CREATE TABLE users (
    user_Id BIGSERIAL PRIMARY KEY,
    user_name TEXT,
    email TEXT,
    password TEXT,
    first_Name TEXT,
    last_Name TEXT,
    phone TEXT,
    role VARCHAR,
    image TEXT
);

-- changeset annaa:2

CREATE TABLE ad(
    ad_Id BIGSERIAL PRIMARY KEY,
    app_user_user_Id BIGINT REFERENCES users(user_Id),
    author_First_Name TEXT,
    author_Last_Name TEXT,
    description TEXT,
    email TEXT,
    image TEXT,
    phone TEXT,
    price BIGINT,
    title TEXT

);

-- changeset annaa:3

CREATE TABLE comments(
    pk BIGINT PRIMARY KEY,
    sent_time TIMESTAMP,
    text TEXT NOT NULL,
    ad_id integer NOT NULL,
    user_id integer NOT NULL

);

-- changeset annaa:4

CREATE TABLE images(
    id serial NOT NULL,
    file_size bigint,
    media_type character varying(255),
    path character varying(255),
    ad_id integer,

    CONSTRAINT images_pkey PRIMARY KEY (id),
    CONSTRAINT ad_id_unique UNIQUE (ad_id)
);
