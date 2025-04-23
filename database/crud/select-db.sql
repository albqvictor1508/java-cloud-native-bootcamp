SELECT id, name FROM users WHERE (id = 1 OR id = 2) AND address = "Mané Goiana"; --Saida = somente lexsa
SELECT id, name FROM users WHERE (id = 1 OR id = 2) AND address = "Conjunto"; --Saida = somente eu

SELECT * FROM users WHERE id = 1 OR name LIKE '%lexsa%' --Saída = eu e lexsa

SELECT * FROM users ORDER BY id;