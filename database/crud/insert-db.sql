INSERT INTO users VALUES(
	1,"victor", "test@test.com", "Conjunto", "2006-11-08" 
)
INSERT INTO destinies (id, name, description) VALUES (1,"Canadá", "quero muito ir pro Canadá")

INSERT INTO reserves (id, user_id, destiny_id, reserve_date, status) VALUES (
    1,1,1,"2025-07-11", "confirmed"
)

ALTER TABLE users
DROP COLUMN address;