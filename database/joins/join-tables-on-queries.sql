SELECT * FROM users u INNER JOIN reserves r ON r.user_id = u.id;

SELECT * FROM users u 
INNER JOIN reserves r ON r.user_id = u.id
INNER JOIN destinies d ON d.id = r.destiny_id;

SELECT * FROM reserves r 
INNER JOIN users u ON r.user_id = u.id
INNER JOIN destinies d ON r.destiny_id = d.id
WHERE u.id = 2;