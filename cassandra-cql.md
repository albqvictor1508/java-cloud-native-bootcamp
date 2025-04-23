## CREATE KEYSPACE

  CREATE KEYSPACE arkham_knight WITH replication = {"class": "SimpleStrategy", "replication_factor": 1};

  KEYSPACE = database do SQL e o replication é um JSON de config

## Do something like git upstream in CQL

  USE arkham_knight;

## CREATE COLUMNFAMILY (TABLE) IN CQL

  CREATE COLUMNFAMILY clients (name TEXT PRIMARY KEY, age int)

## SELECT FROM COLUMNFAMILY (TABLE)

  SELECT * FROM clients;

## INSERT INTO CQL

  INSERT INTO clients VALUES ("vito", 18);

  igual o sql
