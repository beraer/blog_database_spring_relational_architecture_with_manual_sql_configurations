INSERT INTO users (name, email) VALUES ('User1', 'user1@example.com');
INSERT INTO users (name, email) VALUES ('User2', 'user2@example.com');
INSERT INTO users (name, email) VALUES ('User3', 'user3@example.com');
INSERT INTO users (name, email) VALUES ('User4', 'user4@example.com');
INSERT INTO users (name, email) VALUES ('User5', 'user5@example.com');
INSERT INTO users (name, email) VALUES ('User6', 'user6@example.com');
INSERT INTO users (name, email) VALUES ('User7', 'user7@example.com');
INSERT INTO users (name, email) VALUES ('User8', 'user8@example.com');
INSERT INTO users (name, email) VALUES ('User9', 'user9@example.com');
INSERT INTO users (name, email) VALUES ('User10', 'user10@example.com');
INSERT INTO users (name, email) VALUES ('User11', 'user11@example.com');
INSERT INTO users (name, email) VALUES ('User12', 'user12@example.com');
INSERT INTO users (name, email) VALUES ('User13', 'user13@example.com');
INSERT INTO users (name, email) VALUES ('User14', 'user14@example.com');
INSERT INTO users (name, email) VALUES ('User15', 'user15@example.com');
INSERT INTO users (name, email) VALUES ('User16', 'user16@example.com');
INSERT INTO users (name, email) VALUES ('User17', 'user17@example.com');
INSERT INTO users (name, email) VALUES ('User18', 'user18@example.com');
INSERT INTO users (name, email) VALUES ('User19', 'user19@example.com');
INSERT INTO users (name, email) VALUES ('User20', 'user20@example.com');
INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_EDITOR');
INSERT INTO roles (name) VALUES ('ROLE_BLOGGER');
INSERT INTO roles (name) VALUES ('ROLE_BOMBER');
INSERT INTO roles (name) VALUES ('ROLE_IRANIAN');
INSERT INTO roles (name) VALUES ('ROLE_COUSIN');
INSERT INTO roles (name) VALUES ('ROLE_OLD');
INSERT INTO roles (name) VALUES ('ROLE_GRANDMA');
INSERT INTO roles (name) VALUES ('ROLE_GRANDPA');
INSERT INTO roles (name) VALUES ('ROLE_CHILD');
INSERT INTO roles (name) VALUES ('ROLE_LOVER');
INSERT INTO roles (name) VALUES ('ROLE_RAPPER');
INSERT INTO roles (name) VALUES ('ROLE_VETERAN');
INSERT INTO roles (name) VALUES ('ROLE_ANONYMOUS');
INSERT INTO roles (name) VALUES ('ROLE_STUDENT');
INSERT INTO roles (name) VALUES ('ROLE_TEACHER');
INSERT INTO roles (name) VALUES ('ROLE_EXPERT');
INSERT INTO roles (name) VALUES ('ROLE_VEGAN');
INSERT INTO user_role (user_id, role_id) VALUES (1, 4);
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO user_role (user_id, role_id) VALUES (2, 4);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO user_role (user_id, role_id) VALUES (4, 3);
INSERT INTO user_role (user_id, role_id) VALUES (4, 2);
INSERT INTO user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO user_role (user_id, role_id) VALUES (5, 4);
INSERT INTO user_role (user_id, role_id) VALUES (5, 3);
INSERT INTO user_role (user_id, role_id) VALUES (6, 1);
INSERT INTO user_role (user_id, role_id) VALUES (6, 3);
INSERT INTO user_role (user_id, role_id) VALUES (6, 4);
INSERT INTO user_role (user_id, role_id) VALUES (7, 4);
INSERT INTO user_role (user_id, role_id) VALUES (8, 4);
INSERT INTO user_role (user_id, role_id) VALUES (8, 2);
INSERT INTO user_role (user_id, role_id) VALUES (9, 1);
INSERT INTO user_role (user_id, role_id) VALUES (9, 2);
INSERT INTO user_role (user_id, role_id) VALUES (10, 1);
INSERT INTO user_role (user_id, role_id) VALUES (10, 3);
INSERT INTO user_role (user_id, role_id) VALUES (11, 2);
INSERT INTO user_role (user_id, role_id) VALUES (12, 1);
INSERT INTO user_role (user_id, role_id) VALUES (12, 4);
INSERT INTO user_role (user_id, role_id) VALUES (12, 2);
INSERT INTO user_role (user_id, role_id) VALUES (13, 4);
INSERT INTO user_role (user_id, role_id) VALUES (14, 4);
INSERT INTO user_role (user_id, role_id) VALUES (15, 3);
INSERT INTO user_role (user_id, role_id) VALUES (15, 2);
INSERT INTO user_role (user_id, role_id) VALUES (15, 4);
INSERT INTO user_role (user_id, role_id) VALUES (16, 2);
INSERT INTO user_role (user_id, role_id) VALUES (16, 3);
INSERT INTO user_role (user_id, role_id) VALUES (16, 1);
INSERT INTO user_role (user_id, role_id) VALUES (17, 4);
INSERT INTO user_role (user_id, role_id) VALUES (18, 1);
INSERT INTO user_role (user_id, role_id) VALUES (19, 1);
INSERT INTO user_role (user_id, role_id) VALUES (20, 3);
INSERT INTO user_role (user_id, role_id) VALUES (20, 2);
INSERT INTO blogs (name, manager_id) VALUES ('Blog1', 6);
INSERT INTO blogs (name, manager_id) VALUES ('Blog2', 8);
INSERT INTO blogs (name, manager_id) VALUES ('Blog3', 6);
INSERT INTO blogs (name, manager_id) VALUES ('Blog4', 4);
INSERT INTO blogs (name, manager_id) VALUES ('Blog5', 10);
INSERT INTO blogs (name, manager_id) VALUES ('Blog6', 17);
INSERT INTO blogs (name, manager_id) VALUES ('Blog7', 2);
INSERT INTO blogs (name, manager_id) VALUES ('Blog8', 17);
INSERT INTO blogs (name, manager_id) VALUES ('Blog9', 5);
INSERT INTO blogs (name, manager_id) VALUES ('Blog10', 18);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 1', 'Content of article 1', 12, 1);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 2', 'Content of article 2', 5, 1);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 3', 'Content of article 3', 1, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 4', 'Content of article 4', 16, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 5', 'Content of article 5', 20, 4);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 6', 'Content of article 6', 20, 10);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 7', 'Content of article 7', 11, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 8', 'Content of article 8', 20, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 9', 'Content of article 9', 6, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 10', 'Content of article 10', 1, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 11', 'Content of article 11', 20, 1);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 12', 'Content of article 12', 16, 10);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 13', 'Content of article 13', 3, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 14', 'Content of article 14', 4, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 15', 'Content of article 15', 9, 7);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 16', 'Content of article 16', 16, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 17', 'Content of article 17', 14, 7);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 18', 'Content of article 18', 3, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 19', 'Content of article 19', 20, 7);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 20', 'Content of article 20', 17, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 21', 'Content of article 21', 19, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 22', 'Content of article 22', 7, 5);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 23', 'Content of article 23', 16, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 24', 'Content of article 24', 4, 10);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 25', 'Content of article 25', 16, 8);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 26', 'Content of article 26', 5, 1);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 27', 'Content of article 27', 12, 1);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 28', 'Content of article 28', 2, 10);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 29', 'Content of article 29', 16, 2);
INSERT INTO articles (title, name, author_id, blog_id) VALUES ('Article 30', 'Content of article 30', 8, 7);