# Modelagem de Tipo Abstrato de Dados (TAD)

#### Objetivo
O objetivo desta atividade é permitir que os alunos pratiquem a modelagem de tipos abstratos de dados. Os novos tipos devem possuir uma especificação de um conjunto de dados e operações que podem ser executadas sobre esses dados.

Cada exemplo deve ser implementado em C, Java e Haskell.

### 1. Gerenciamento de Biblioteca

Considere um sistema de gerenciamento de biblioteca. Os requisitos são os seguintes:

Cada livro na biblioteca deve ter os seguintes atributos:
- Título
- Autor
- Ano de publicação
- Número de cópias disponíveis

As operações que devem ser suportadas para os livros são:
- Emprestar uma cópia do livro (reduzindo o número de cópias disponíveis)
- Devolver uma cópia do livro (aumentando o número de cópias disponíveis)
- Verificar se há cópias disponíveis do livro
- Obter informações do livro (título, autor, ano de publicação)


### 2. Jogo de Tabuleiro - Xadrez

O jogo de xadrez é composto por um tabuleiro de 8x8 casas.

Cada peça de xadrez tem um tipo (rei, rainha, torre, bispo, cavalo, peão), uma cor (branco ou preto) e uma posição no tabuleiro. As operações que devem ser suportadas para as peças de xadrez são:
- Mover a peça para uma nova posição no tabuleiro
- Capturar uma peça adversária
- Verificar se é possível mover a peça para uma determinada posição
- Obter informações sobre o tipo, cor e posição da peça

### 3. Sistema de Gerenciamento de Empregados e Departamentos

Cada empregado na empresa tem os seguintes atributos:
- Nome
- ID
- Cargo
- Salário
- Departamento ao qual está associado

Cada departamento na empresa tem os seguintes atributos:
- Nome
- ID
- Localização

As operações que devem ser suportadas para os empregados são:
- Atualizar informações pessoais (nome, cargo, salário)
- Transferir para outro departamento
- Obter informações sobre o departamento ao qual está associado

As operações que devem ser suportadas para os departamentos são:
- Adicionar um novo empregado
- Remover um empregado existente
- Obter informações sobre os empregados associados ao departamento
