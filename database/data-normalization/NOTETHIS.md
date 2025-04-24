## 1FN

As colunas devem possuir dados que não podem ser divididos, ou seja, não posso receber um `endereço` que pode ser dividido em `rua`, `cidade`, `estado`, entre outros, é bem melhor eu receber do usuário esse endereço completo e manipular por via de splits para salvar cada um no seu devido lugar.

## 2FN 

esqueci cara 

## 3FN

"Uma coluna não-chave não pode depender de outra coluna não-chave"

Um exemplo disso seria, por exemplo, a coluna `cidade` depender da coluna `cep`, as duas não sendo colunas chave, seria uma má prática terrível.

Uma forma de conter esse problema seria salvar o cep do usuário, e apartir desse cep capturar todas as informações necessárias, ou em casos mais simples, armazenar a cidade apartir do cep, para caso mais específicos, eu poderia armazenar os dois, contanto que não dependessem um do outro