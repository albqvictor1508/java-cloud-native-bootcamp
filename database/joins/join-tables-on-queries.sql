SELECT * FROM users u INNER JOIN reserves r ON r.user_id = u.id;

SELECT * FROM users u 
INNER JOIN reserves r ON r.user_id = u.id
INNER JOIN destinies d ON d.id = r.destiny_id;

SELECT * FROM reserves r 
INNER JOIN users u ON r.user_id = u.id
INNER JOIN destinies d ON r.destiny_id = d.id
WHERE u.id = 2;

SELECT * FROM users u
LEFT JOIN  reserves r ON r.user_id = u.id
WHERE u.id = 1;

SELECT r.id, r.user_id, r.destiny_id, r.reserve_date, u.name, d.name ,d.description FROM reserves r
LEFT JOIN users u ON r.user_id = u.id
LEFT JOIN destinies d ON r.destiny_id = d.id
ORDER BY destiny_id ASC;

SELECT * FROM reserves r 
RIGHT JOIN users u ON r.user_id = u.id
WHERE u.id = 1;

SELECT * FROM reserves r 
RIGHT JOIN destinies d ON d.id = r.destiny_id;
-- Retorna todas as reservas (lado direito) e 

SELECT * FROM destinies d 
LEFT JOIN reserves r ON r.destiny_id = d.id;
-- Retorna todos os destinos () e os correspondentes no lado direito 

SELECT * FROM destinies d 
LEFT JOIN reserves r ON r.destiny_id = d.id;
-- Retorna todos os destinos e apenas as reservas que tem destino 

SELECT * FROM destinies d 
RIGHT JOIN reserves r ON r.destiny_id = d.id;
-- Retorna todos as reservas que tem destinos, não pode existir uma reserva sem destino, então não vai ser retornada nenhuma reserva como null

SELECT * FROM reserves r 
RIGHT JOIN destinies d ON r.destiny_id = d.id;
-- Retorna todos os destinos em ligação com a tabela reservas, se o destino não tiver reserva, fica nulo

SELECT * FROM reserves r 
LEFT JOIN destinies d ON r.destiny_id = d.id;
-- Retorna todas as reservas em ligação com a tabela destinos, e como não pode existir reserva sem destino, nenhuma reserva será retornada como null
