CREATE INDEX idx_name ON users (name);
-- criei um index na coluna name dessa tabela, então esse index é gerado para todos os "name", ou seja, em vez do select buscar pelo nome, ele vai buscar pelo index, aumentando bem mais a performance, já que cada name terá seu index

EXPLAIN SELECT * FROM users WHERE name = "victor";