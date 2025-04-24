# MongoDB

## Intro

### Schema Free

Dá pra adicionar tipos de dados diferentes em uma mesma collection, não deve ser uma boa prática, mas é sim possível

### Utiliza JSON (Mongo utiliza BSON)

### Auto-Sharding (escalamento horizontal)

### Map-Reduce

### GridFS

### Alta linguagem de consulta

## Estruturação

### Document ==> Tupla / Registro

### Collection ==> Tabela

### Embedding / Linking ==> Join

## Quando Utilizar

- Grande volume de dados
- Dados não necessariamente estruturados

## Quando não Utilizar

- Necessidade de relacionamentos / joins.
- Propriedades ACID e transações são importantes.
- Curiosidade: Diversas entidades de pagamento não homologam em bancos não relacionais

Não significa que o MongoDB é pior por isso, só não é adaptado para esse tipo de demanda, em projetos, o ideal é ter um armazenamento poliglota, sejam utilizados diferentes tipos de bancos que performam melhor em partes específicas, e **deixar o mongodb longe da parte financeira se possível**, mas se for deixar, prestar bem atenção se isso não prejudica seu negócio

### Studio 3T downloaded 

### Mongo DB Compass tried to download but not works

### create a cluster
