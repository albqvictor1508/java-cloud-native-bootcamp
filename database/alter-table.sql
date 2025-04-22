ALTER TABLE users RENAME userss;

ALTER TABLE users MODIFY COLUMN address VARCHAR(150);

-- setando o user_id para auto increment 
ALTER TABLE reserves
MODIFY COLUMN user_id INT AUTO_INCREMENT,
ADD CONSTRAINT fk_reserves_users
FOREIGN KEY(user_id) REFERENCES users(id); 

ALTER TABLE reserves
MODIFY COLUMN destiny_id INT AUTO_INCREMENT,
ADD CONSTRAINT fk_reserves_destinies
FOREIGN KEY(destiny_id) REFERENCES destinies(id);

ALTER TABLE destinies
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);