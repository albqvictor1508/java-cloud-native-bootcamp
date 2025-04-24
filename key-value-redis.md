## Create User - REDIS

  SET user '{"name": "Patrick", "age": 18}'

## GET USER

  GET user;

## EX - Set time to expiration in seconds

SET user2:name "Batman" EX 10

## Exists - Checar se existe (poderia usar o GET pra isso tb, mas é melhor usar o exists ne)

  EXISTS user2:name

## LPUSH - Adicionar em uma lista

  LPUSH user1:hobbies "mandar um salve"

  user1 = a chave, hobbies = a lista, "mandar um salve" = valor

# Acessar os dados da lista

## LINDEX acessar via index
  LINDEX user1:hobbies 0

  LINDEX user1:hobbies 0

## LRANGE acessar via index com intervalo

  LRANGE user1:hobbies 0 2

  vai acessar os dados do 0 ao 2

