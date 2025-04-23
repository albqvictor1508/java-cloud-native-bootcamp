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

