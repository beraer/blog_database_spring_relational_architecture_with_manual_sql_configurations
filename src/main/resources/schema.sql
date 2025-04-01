
DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS articles;
DROP TABLE IF EXISTS blogs;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE user_role (
    user_id BIGINT,
    role_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE blogs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    manager_id BIGINT,
    FOREIGN KEY (manager_id) REFERENCES users(id)
);

CREATE TABLE articles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    name TEXT,
    author_id BIGINT,
    blog_id BIGINT,
    FOREIGN KEY (author_id) REFERENCES users(id),
    FOREIGN KEY (blog_id) REFERENCES blogs(id)
);