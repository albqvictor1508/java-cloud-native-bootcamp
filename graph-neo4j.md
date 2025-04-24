## Create Node

  CREATE (:Client {name: "Batman", age: 40, hobbies: ["matar bandido", "matar policia", "matar todo mundo"] })

## Find All Nodes

  MATCH(batman) RETURN batman;
   criei uma variável batman com tudo que tem nesse node e retornei ela

## Creating 2 clients with relationship and label

  CREATE (:Client {name: "Robin", age: 20, hobbies: ["dar", "pro", "Batman"]}) -[:Bloqueado]-> (:Client {name: "Curinga", age: 35, hobbies: ["dar", "pro", "batman"]})

  "-[]->" indica o relacionamento, já ":Bloqueado" é o nome dado a label
