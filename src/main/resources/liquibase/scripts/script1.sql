-- liquibase formatted sql

-- changeset annaa:1

CREATE TABLE user(
    userId BIGSERIAL PRIMARY KEY,
    email TEXT,
    userName TEXT,
    password TEXT,
    firstName TEXT,
    lastName TEXT,
    phone TEXT,
    role ENUM('admin', 'user'),
    image TEXT

)

-- changeset annaa:2

CREATE TABLE ad(
    adId BIGSERIAL PRIMARY KEY,
    authorFirstName TEXT,
    authorLastName TEXT,
    description TEXT,
    email TEXT,
    image TEXT,
    phone TEXT,
    price LONG,
    title TEXT

)