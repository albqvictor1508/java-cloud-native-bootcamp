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

## TTL - acessar o tempo que aquele dado tem de vida até ser removido

  TTL user2:name

 Se não tiver tempo de expiração, vai retornar -1, se tiver, vai retornar quantos segundos faltam

## PTTL - mesma coisa de TTL mas em milisegundos

  PTTL user2:name

## PERSIST - remove o tempo de expiração, deixando a propriedade lá mantida

  PERSIST user2:name

  Somente em dados que possuem tempo de expiração

## DEL - deletar chave

  DEL user2:name

### Além de tudo isso, pode manipular sets e hash sets, adicionar tempo de expiração para propriedades persistidas, entre outras coisas que ele é capaz de fazer como um banco de dados não relacional, um manager para cache, entre outras funções
