
INSERT INTO users(name) VALUES ('Alice');
INSERT INTO users(name) VALUES ('Bob');
INSERT INTO users(name) VALUES ('Charlie');
INSERT INTO users(name) VALUES ('Diana');


INSERT INTO roles(name) VALUES ('ROLE_ADMIN');
INSERT INTO roles(name) VALUES ('ROLE_USER');
INSERT INTO roles(name) VALUES ('ROLE_EDITOR');
INSERT INTO roles(name) VALUES ('ROLE_BLOGGER');


INSERT INTO blogs(name, manager_id) VALUES ('TechBlog', 1);
INSERT INTO blogs(name, manager_id) VALUES ('FoodieBlog', 2);
INSERT INTO blogs(name, manager_id) VALUES ('TravelBlog', 3);

INSERT INTO articles(title, name, author_id, blog_id) VALUES ('Spring Data JPA Basics', 'Intro text', 1, 1);
INSERT INTO articles(title, name, author_id, blog_id) VALUES ('Delicious Pasta', 'Recipe text', 2, 2);
INSERT INTO articles(title, name, author_id, blog_id) VALUES ('Backpacking Europe', 'Travel tips', 3, 3);

INSERT INTO user_role(user_id, role_id) VALUES (1, 1);
INSERT INTO user_role(user_id, role_id) VALUES (1, 2);
INSERT INTO user_role(user_id, role_id) VALUES (2, 2);
INSERT INTO user_role(user_id, role_id) VALUES (3, 3);
