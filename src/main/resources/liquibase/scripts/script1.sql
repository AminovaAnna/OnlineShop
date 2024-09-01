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
    author_First_Name TEXT,
    author_Last_Name TEXT,
    description TEXT,
    email TEXT,
    image TEXT,
    phone TEXT,
    price BIGINT,
    title TEXT

);