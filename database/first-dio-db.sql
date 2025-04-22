CREATE TABLE users (
	id INT,
 	name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL UNIQUE,
  address VARCHAR(50) NOT NULL,
  birth_date DATE NOT NULL
);
N
CREATE TABLE destinies (
	id INT,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(255) NOT NULL
);

CREATE TABLE reserves (
	id INT,
  user_id INT,
  destiny_id INT,
  reserve_date DATE NOT NULL,
  status VARCHAR(255) DEFAULT 'pending' COMMENT 'Reserve status (confirmed, pending, canceled)'
);


