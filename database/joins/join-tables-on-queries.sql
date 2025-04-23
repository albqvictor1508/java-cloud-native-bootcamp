SELECT * FROM users u INNER JOIN reserves r ON r.user_id = u.id;

SELECT * FROM users u 
INNER JOIN reserves r ON r.user_id = u.id
INNER JOIN destinies d ON d.id = r.destiny_id;