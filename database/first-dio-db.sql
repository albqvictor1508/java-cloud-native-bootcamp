CREATE TABLE users (
	id INT,
 	name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL UNIQUE,
  address VARCHAR(50) NOT NULL,
  birth_date DATE NOT NULL
);

CREATE TABLE destinies (
	id INT,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(255) NOT NULL
);
