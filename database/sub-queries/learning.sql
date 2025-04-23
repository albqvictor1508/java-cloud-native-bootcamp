SELECT id, name, (SELECT COUNT(*) FROM reserves r WHERE r.user_id = u.id) AS total FROM users u;
-- Entre parênteses, uma sub query que conta todos as reservas feitas no id daquele usuário, com um alias nomeando essa subquery como o atributo "total" na tabela. 

SELECT COUNT(*) as total_users FROM users;

SELECT COUNT(*) users u AS total_users_reserves INNER JOIN reserves r ON r.user_id = u.id; 

SELECT COUNT(*) AS total_users_with_reserves FROM users u INNER JOIN reserves r ON u.id = r.user_id;
-- vai retornar um count de todas as reservas, era melhor da um select na tabela de reservas toda ne 

SELECT COUNT(DISTINCT user_id) AS total_users_with_reserves 
FROM users u 
INNER JOIN reserves r ON r.id = u.id;
-- vai contar todos os users que tem reservas, DISTINCT = não vai contar com user id repetido, sem o distinct somaria os repetido e cagava tudo

SELECT MAX(TIMESTAMPDIFF(YEAR, birth_date, CURRENT_DATE())) FROM users;

SELECT COUNT(*) AS total_reserves, destiny_id
FROM reserves
GROUP BY destiny_id;

SELECT COUNT(*) AS total_reserves, user_id
FROM reserves
GROUP BY user_id;
-- Retorna o total de reservas por id de usuário, ou seja, usando o group by, o count vai executar de acordo com os ids