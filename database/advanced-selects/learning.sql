SELECT * FROM reserves r INNER JOIN (
	SELECT user_id, MIN(id) AS min_id
  FROM reserves
  GROUP BY user_id
) first_reserve ON r.id = first_reserve.min_id;