-- usar timestamps ao invés desse "001" no nome do arquivo, mais seguro contra conflitos

CREATE TABLE employees (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary decimal(10,2) NOT NULL, --vai possuir 10 casas e duas delas são depois da virgula
    birth_day TIMESTAMP NOT NULL,
    created_at TIMESTAMP DEFAULT NOW
)engine=InnoDB default charset=utf8;