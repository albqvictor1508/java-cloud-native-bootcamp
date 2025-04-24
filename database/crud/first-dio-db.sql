CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
 	name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL UNIQUE,
  address VARCHAR(50) NOT NULL,
  birth_date DATE NOT NULL
);
N
CREATE TABLE destinies (
	id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(255) NOT NULL
);

CREATE TABLE reserves (
	id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  destiny_id INT,
  reserve_date DATE NOT NULL,
  status VARCHAR(255) DEFAULT 'pending' COMMENT 'Reserve status (confirmed, pending, canceled)'
);

ALTER TABLE reserves
ADD CONSTRAINT fk_reserves_users
FOREIGN KEY(user_id) REFERENCES users (id);

ALTER TABLE reserves
ADD CONSTRAINT fk_reserves_destinies
FOREIGN KEY(destiny_id) REFERENCES destinies (id);


ALTER TABLE users
ADD birth_date DATE NOT NULL;

UPDATE users
SET birth_date = "2006-11-08"
WHERE id = 2;

UPDATE users
SET birth_date = "2007-08-15"
WHERE id = 2;
