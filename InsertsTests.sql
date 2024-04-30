-- Inserir registros de exemplo para a tabela student
INSERT INTO student (name, user, password) VALUES 
("Alice", "alice123", "senha123"),
("Bob", "bob456", "senha456"),
("Carol", "carol789", "senha789"),
("David", "david111", "senha111"),
("Eve", "eve222", "senha222");

-- Inserir registros de exemplo para a tabela professor
INSERT INTO professor (name, user, password) VALUES 
("João", "rocha", "joao1234"),
("Maria", "maria", "maria123"),
("Pedro", "pedro", "pedro123"),
("Ana", "ana", "ana123"),
("Carlos", "carlos", "carlos123");

-- Inserir registros de exemplo para a tabela exam
INSERT INTO exam (name, id_professor) VALUES 
("Exame 1", 1),
("Exame 2", 2),
("Exame 3", 3),
("Exame 4", 4),
("Exame 5", 5);

-- Inserir registros de exemplo para a tabela student_exam
-- Aqui assumindo que cada estudante faz todos os exames e recebe a mesma nota
INSERT INTO student_exam (id_student, id_exam, result) VALUES 
(1, 1, 8.5),
(1, 2, 7.5),
(1, 4, 6.5),
(2, 1, 7.0),
(2, 2, 8.0),
(2, 3, 9.5),
(2, 4, 7.5),
(2, 5, 8.5),
(3, 1, 9.0),
(3, 2, 8.5),
(3, 3, 7.0),
(3, 4, 6.0),
(3, 5, 7.5),
(4, 1, 8.0),
(4, 3, 8.5),
(4, 5, 9.0),
(5, 1, 7.5);

-- Inserir registros de exemplo para a tabela question
INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES 
(1, "Qual é o conceito principal de herança em POO?", "A) Reusabilidade", "B) Encapsulamento", "C) Polimorfismo", "D) Abstração", "E) Composição", "A"),
(1, "Quais são os pilares da programação orientada a objetos?", "A) Encapsulamento, herança e polimorfismo", "B) Herança, polimorfismo e sobrecarga", "C) Abstração, encapsulamento e sobrecarga", "D) Abstração, encapsulamento e polimorfismo", "E) Sobrecarga, reusabilidade e polimorfismo", "D"),
(1, "O que é polimorfismo em POO?", "A) Capacidade de uma classe herdar de várias outras classes", "B) Capacidade de uma classe ter múltiplos construtores", "C) Capacidade de uma classe esconder a implementação interna", "D) Capacidade de uma mesma operação ter diferentes implementações", "E) Nenhuma das anteriores", "D"),
(1, "O que é encapsulamento em POO?", "A) Proteção de acesso a membros de uma classe", "B) Herança múltipla", "C) Tipo de dados abstratos", "D) Técnica de programação funcional", "E) Todos os anteriores", "A"),
(1, "O que é abstração em POO?", "A) Capacidade de uma classe ter várias instâncias", "B) Capacidade de uma classe ser instanciada diretamente", "C) Capacidade de uma classe representar uma entidade do mundo real", "D) Capacidade de uma classe esconder os detalhes de implementação", "E) Nenhuma das anteriores", "D"),
(1, "O que é sobrecarga em POO?", "A) Capacidade de uma classe ter vários construtores", "B) Capacidade de uma classe ter várias instâncias", "C) Capacidade de uma classe implementar múltiplas interfaces", "D) Capacidade de uma classe ter métodos com o mesmo nome mas com diferentes parâmetros", "E) Nenhuma das anteriores", "D"),
(1, "O que é herança em POO?", "A) Capacidade de uma classe ter várias instâncias", "B) Capacidade de uma classe ter vários construtores", "C) Capacidade de uma classe estender outra classe, herdando seus atributos e métodos", "D) Capacidade de uma classe implementar múltiplas interfaces", "E) Nenhuma das anteriores", "C"),
(1, "O que é um objeto em POO?", "A) Instância de uma classe", "B) Classe que possui atributos e métodos", "C) Função que retorna um valor", "D) Atributo de uma classe", "E) Nenhuma das anteriores", "A"),
(1, "O que é uma classe em POO?", "A) Estrutura de controle", "B) Tipo de dado primitivo", "C) Coleção de objetos", "D) Modelo para criar objetos", "E) Nenhuma das anteriores", "D"),
(1, "O que é um método em POO?", "A) Tipo de dado primitivo", "B) Atributo de uma classe", "C) Função que retorna um valor", "D) Bloco de código que executa uma ação", "E) Nenhuma das anteriores", "D");

-- Inserir questões para o Exame 2
INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES 
(2, "O que é um ponteiro em C++?", "A) Um tipo de dado primitivo", "B) Uma variável que armazena endereços de memória", "C) Uma função que retorna um valor", "D) Uma estrutura de controle", "E) Nenhuma das anteriores", "B"),
(2, "Qual é a diferença entre o operador '=' e '==' em C++?", "A) Ambos são operadores de atribuição", "B) '=' é um operador de comparação, enquanto '==' é um operador de atribuição", "C) '==' é um operador de comparação, enquanto '=' é um operador de atribuição", "D) Ambos são operadores de comparação", "E) Nenhuma das anteriores", "C"),
(2, "O que é herança múltipla em C++?", "A) Capacidade de uma classe ter múltiplas instâncias", "B) Capacidade de uma classe ter múltiplas interfaces", "C) Capacidade de uma classe herdar de múltiplas classes base", "D) Capacidade de uma classe ter múltiplos construtores", "E) Nenhuma das anteriores", "C"),
(2, "Qual é o operador usado para acessar membros de uma classe em C++?", "A) ->", "B) ::", "C) .", "D) >", "E) Nenhuma das anteriores", "C"),
(2, "O que é uma função virtual em C++?", "A) Uma função que não pode ser sobrescrita", "B) Uma função que pode ser chamada apenas uma vez", "C) Uma função que pode ser sobrescrita em classes derivadas", "D) Uma função que retorna um valor booleano", "E) Nenhuma das anteriores", "C"),
(2, "Qual é a principal diferença entre classes e estruturas em C++?", "A) Classes têm membros públicos por padrão, enquanto estruturas têm membros privados por padrão", "B) Estruturas têm membros públicos por padrão, enquanto classes têm membros privados por padrão", "C) Classes têm construtores, enquanto estruturas não têm", "D) Estruturas podem ter métodos, enquanto classes não podem", "E) Nenhuma das anteriores", "A"),
(2, "O que é polimorfismo em C++?", "A) Capacidade de uma classe herdar de várias outras classes", "B) Capacidade de uma classe ter múltiplos construtores", "C) Capacidade de uma classe ter métodos com o mesmo nome mas com diferentes parâmetros", "D) Capacidade de uma mesma operação ter diferentes implementações", "E) Nenhuma das anteriores", "D"),
(2, "O que é encapsulamento em C++?", "A) Uma técnica para ocultar a implementação interna de uma classe", "B) Uma técnica para herdar de várias classes base", "C) Uma técnica para definir classes abstratas", "D) Uma técnica para criar instâncias de objetos", "E) Nenhuma das anteriores", "A"),
(2, "O que é um construtor em C++?", "A) Uma função que retorna um valor", "B) Uma função que destrói um objeto", "C) Uma função que inicializa um objeto", "D) Uma função que compara dois objetos", "E) Nenhuma das anteriores", "C"),
(2, "O que é um destrutor em C++?", "A) Uma função que compara dois objetos", "B) Uma função que inicializa um objeto", "C) Uma função que destrói um objeto", "D) Uma função que retorna um valor", "E) Nenhuma das anteriores", "C");

-- Inserir questões para o Exame 3
INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES 
(3, "O que é um banco de dados relacional?", "A) Um banco de dados que armazena dados em formato de árvore", "B) Um banco de dados que armazena dados em formato de lista", "C) Um banco de dados que armazena dados em formato de tabela", "D) Um banco de dados que armazena dados em formato de grafo", "E) Nenhuma das anteriores", "C"),
(3, "Qual é a linguagem de consulta padrão para bancos de dados relacionais?", "A) SQL", "B) Java", "C) Python", "D) C++", "E) Nenhuma das anteriores", "A"),
(3, "O que é uma chave primária em um banco de dados relacional?", "A) Uma chave que pode conter valores duplicados", "B) Uma chave que não pode conter valores nulos", "C) Uma chave que identifica exclusivamente uma linha em uma tabela", "D) Uma chave que é usada para indexar dados em uma tabela", "E) Nenhuma das anteriores", "C"),
(3, "O que é uma chave estrangeira em um banco de dados relacional?", "A) Uma chave que identifica exclusivamente uma linha em uma tabela", "B) Uma chave que é usada para indexar dados em uma tabela", "C) Uma chave que estabelece uma relação entre duas tabelas", "D) Uma chave que não pode conter valores nulos", "E) Nenhuma das anteriores", "C"),
(3, "O que é uma consulta SQL SELECT?", "A) Uma consulta que adiciona dados a uma tabela", "B) Uma consulta que exclui dados de uma tabela", "C) Uma consulta que modifica dados em uma tabela", "D) Uma consulta que recupera dados de uma tabela", "E) Nenhuma das anteriores", "D"),
(3, "O que é um índice em um banco de dados relacional?", "A) Uma estrutura de dados que organiza os dados em uma tabela", "B) Uma função que retorna um valor booleano", "C) Uma chave que identifica exclusivamente uma linha em uma tabela", "D) Uma estrutura de dados que melhora a velocidade de recuperação de dados", "E) Nenhuma das anteriores", "D"),
(3, "O que é normalização em bancos de dados relacionais?", "A) Processo de dividir uma tabela grande em tabelas menores", "B) Processo de adicionar redundância aos dados em uma tabela", "C) Processo de organizar dados em uma tabela", "D) Processo de garantir a integridade e consistência dos dados", "E) Nenhuma das anteriores", "D"),
(3, "O que é denormalização em bancos de dados relacionais?", "A) Processo de dividir uma tabela grande em tabelas menores", "B) Processo de remover redundância dos dados em uma tabela", "C) Processo de organizar dados em uma tabela", "D) Processo de adicionar redundância aos dados em uma tabela", "E) Nenhuma das anteriores", "D"),
(3, "Qual é a função do comando SQL INSERT?", "A) Atualizar dados em uma tabela", "B) Excluir dados de uma tabela", "C) Inserir novos dados em uma tabela", "D) Recuperar dados de uma tabela", "E) Nenhuma das anteriores", "C"),
(3, "Qual é a função do comando SQL UPDATE?", "A) Inserir novos dados em uma tabela", "B) Excluir dados de uma tabela", "C) Atualizar dados em uma tabela", "D) Recuperar dados de uma tabela", "E) Nenhuma das anteriores", "C");

-- Inserir questões para o Exame 4
INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES 
(4, "O que é uma estrutura de dados em programação?", "A) Uma coleção de algoritmos", "B) Um conjunto de variáveis", "C) Um formato de dados organizado", "D) Uma estrutura de controle", "E) Nenhuma das anteriores", "C"),
(4, "O que é uma pilha (stack) em estrutura de dados?", "A) Uma estrutura de dados que segue o princípio FIFO", "B) Uma estrutura de dados que segue o princípio LIFO", "C) Uma estrutura de dados que permite acesso aleatório", "D) Uma estrutura de dados que armazena elementos ordenados", "E) Nenhuma das anteriores", "B"),
(4, "O que é uma fila (queue) em estrutura de dados?", "A) Uma estrutura de dados que segue o princípio LIFO", "B) Uma estrutura de dados que segue o princípio FIFO", "C) Uma estrutura de dados que permite acesso aleatório", "D) Uma estrutura de dados que armazena elementos ordenados", "E) Nenhuma das anteriores", "B"),
(4, "O que é uma lista encadeada em estrutura de dados?", "A) Uma lista onde os elementos estão dispostos aleatoriamente", "B) Uma lista onde os elementos estão dispostos em ordem alfabética", "C) Uma lista onde cada elemento contém uma referência para o próximo elemento", "D) Uma lista onde os elementos estão dispostos em uma ordem específica", "E) Nenhuma das anteriores", "C"),
(4, "O que é uma árvore em estrutura de dados?", "A) Uma estrutura de dados que armazena elementos de forma não ordenada", "B) Uma estrutura de dados que armazena elementos em ordem alfabética", "C) Uma estrutura de dados hierárquica composta por nós", "D) Uma estrutura de dados que armazena elementos em uma pilha", "E) Nenhuma das anteriores", "C"),
(4, "O que é um grafo em estrutura de dados?", "A) Uma estrutura de dados que armazena elementos em ordem alfabética", "B) Uma estrutura de dados que armazena elementos de forma não ordenada", "C) Uma estrutura de dados hierárquica composta por nós", "D) Uma estrutura de dados que armazena elementos em uma fila", "E) Nenhuma das anteriores", "B"),
(4, "O que é uma tabela hash em estrutura de dados?", "A) Uma estrutura de dados que armazena elementos em uma lista encadeada", "B) Uma estrutura de dados que armazena elementos em uma pilha", "C) Uma estrutura de dados que armazena elementos em uma fila", "D) Uma estrutura de dados que armazena elementos em uma tabela bidimensional", "E) Nenhuma das anteriores", "D"),
(4, "O que é um algoritmo de ordenação em estrutura de dados?", "A) Um algoritmo que busca por um elemento específico em uma lista", "B) Um algoritmo que rearranja os elementos de uma lista em uma ordem específica", "C) Um algoritmo que verifica se uma lista está vazia", "D) Um algoritmo que adiciona um elemento ao final de uma lista", "E) Nenhuma das anteriores", "B"),
(4, "O que é uma matriz em estrutura de dados?", "A) Uma estrutura de dados que armazena elementos de forma não ordenada", "B) Uma estrutura de dados que armazena elementos em uma tabela bidimensional", "C) Uma estrutura de dados que armazena elementos em uma lista encadeada", "D) Uma estrutura de dados que armazena elementos em uma pilha", "E) Nenhuma das anteriores", "B"),
(4, "O que é um ponteiro em estrutura de dados?", "A) Uma variável que armazena endereços de memória", "B) Uma variável que armazena um valor inteiro", "C) Uma variável que armazena um valor booleano", "D) Uma variável que armazena um valor real", "E) Nenhuma das anteriores", "A");

-- Inserir questões para o Exame 5
INSERT INTO question (id_exam, statement, option1, option2, option3, option4, option5, result) VALUES 
(5, "O que é um algoritmo de busca em programação?", "A) Um algoritmo que rearranja os elementos de uma lista em uma ordem específica", "B) Um algoritmo que busca por um elemento específico em uma lista", "C) Um algoritmo que verifica se uma lista está vazia", "D) Um algoritmo que adiciona um elemento ao final de uma lista", "E) Nenhuma das anteriores", "B"),
(5, "Qual é a complexidade de tempo da busca binária?", "A) O(1)", "B) O(log n)", "C) O(n)", "D) O(n log n)", "E) O(n^2)", "B"),
(5, "O que é um algoritmo de ordenação em programação?", "A) Um algoritmo que busca por um elemento específico em uma lista", "B) Um algoritmo que rearranja os elementos de uma lista em uma ordem específica", "C) Um algoritmo que verifica se uma lista está vazia", "D) Um algoritmo que adiciona um elemento ao final de uma lista", "E) Nenhuma das anteriores", "B"),
(5, "Qual é a complexidade de tempo do algoritmo de ordenação Bolha (Bubble Sort)?", "A) O(1)", "B) O(log n)", "C) O(n)", "D) O(n log n)", "E) O(n^2)", "E"),
(5, "Qual é a complexidade de tempo do algoritmo de ordenação Quick Sort?", "A) O(n)", "B) O(log n)", "C) O(n^2)", "D) O(n log n)", "E) O(1)", "D"),
(5, "O que é um grafo em programação?", "A) Uma estrutura de dados que armazena elementos de forma não ordenada", "B) Uma estrutura de dados hierárquica composta por nós", "C) Uma estrutura de dados que armazena elementos em uma fila", "D) Uma estrutura de dados que armazena elementos em uma tabela bidimensional", "E) Nenhuma das anteriores", "A"),
(5, "O que é um loop em programação?", "A) Uma estrutura de dados que armazena elementos de forma não ordenada", "B) Uma estrutura de controle que repete um bloco de código várias vezes", "C) Uma estrutura de dados que armazena elementos em uma fila", "D) Uma estrutura de dados que armazena elementos em uma tabela bidimensional", "E) Nenhuma das anteriores", "B"),
(5, "O que é uma função em programação?", "A) Uma estrutura de controle que repete um bloco de código várias vezes", "B) Um bloco de código que executa uma ação específica", "C) Uma estrutura de dados que armazena elementos em uma fila", "D) Uma estrutura de dados que armazena elementos em uma tabela bidimensional", "E) Nenhuma das anteriores", "B"),
(5, "O que é uma estrutura de controle em programação?", "A) Uma estrutura que armazena dados em uma tabela", "B) Um bloco de código que executa uma ação específica", "C) Uma estrutura que organiza os dados em uma lista", "D) Uma estrutura que controla o fluxo de execução do programa", "E) Nenhuma das anteriores", "D"),
(5, "O que é uma variável em programação?", "A) Uma estrutura de dados que armazena elementos de forma não ordenada", "B) Um local de armazenamento para dados manipulados pelo programa", "C) Uma estrutura que organiza os dados em uma lista", "D) Uma estrutura que controla o fluxo de execução do programa", "E) Nenhuma das anteriores", "B");
