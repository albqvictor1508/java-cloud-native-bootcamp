## Create Node

  CREATE (:Client {name: "Batman", age: 40, hobbies: ["matar bandido", "matar policia", "matar todo mundo"] })

## Find All Nodes

  MATCH(batman) RETURN batman;
   criei uma variável batman com tudo que tem nesse node e retornei ela
