DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS articles;
DROP TABLE IF EXISTS blogs;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255)

);

CREATE TABLE roles (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255)
);

CREATE TABLE blogs (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255),
                       manager_id INT
);

CREATE TABLE articles (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          title VARCHAR(255),
                          name VARCHAR(255),
                          author_id INT,
                          blog_id INT
);

CREATE TABLE user_role (
                           user_id INT,
                           role_id INT
);

ALTER TABLE blogs
    ADD CONSTRAINT fk_blogs_manager
        FOREIGN KEY (manager_id) REFERENCES users(id);

ALTER TABLE articles
    ADD CONSTRAINT fk_articles_author
        FOREIGN KEY (author_id) REFERENCES users(id);

ALTER TABLE articles
    ADD CONSTRAINT fk_articles_blog
        FOREIGN KEY (blog_id) REFERENCES blogs(id);

ALTER TABLE user_role
    ADD CONSTRAINT fk_user_role_user
        FOREIGN KEY (user_id) REFERENCES users(id);

ALTER TABLE user_role
    ADD CONSTRAINT fk_user_role_role
        FOREIGN KEY (role_id) REFERENCES roles(id);
