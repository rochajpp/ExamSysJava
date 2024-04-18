CREATE DATABASE enadeSys;

CREATE TABLE exam(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    question VARCHAR(10000) NOT NULL,
    option1 VARCHAR(1000),
    option2 VARCHAR(1000),
    option3 VARCHAR(1000),
    option4 VARCHAR(1000),
    option5 VARCHAR(1000),
    answer VARCHAR(10));

SELECT * FROM exam;
DELETE FROM exam;

INSERT INTO exam (question, option1, option2, option3, option4, option5, answer) VALUES 
('O que é encapsulamento em Programação Orientada a Objetos?', 'a) Um princípio que permite ocultar a implementação interna de um objeto e expor apenas sua interface.', 'b) Um conceito que permite a criação de múltiplas instâncias de uma classe.', 'c) Uma técnica para herança múltipla em Java.', 'd) Uma forma de organizar código em métodos e atributos.', 'e) Um tipo de polimorfismo em Java.', 'a'),
('Qual é o principal objetivo da herança em Programação Orientada a Objetos?', 'a) Permitir a reutilização de código.', 'b) Permitir a criação de objetos.', 'c) Permitir a criação de interfaces.', 'd) Permitir a implementação de polimorfismo.', 'e) Permitir a sobrecarga de métodos.', 'a'),
('Em Java, qual é a diferença entre uma classe abstrata e uma interface?', 'a) Uma classe abstrata pode conter implementações de métodos, enquanto uma interface não pode.', 'b) Uma interface pode conter variáveis de instância, enquanto uma classe abstrata não pode.', 'c) Uma classe abstrata pode ser instanciada, enquanto uma interface não pode.', 'd) Uma interface pode ter modificadores de acesso, enquanto uma classe abstrata não pode.', 'e) Não há diferença, as duas são usadas para definir contratos em Java.', 'a'),
('O que é polimorfismo em Programação Orientada a Objetos?', 'a) É a capacidade de uma classe herdar de várias superclasses.', 'b) É a capacidade de uma classe substituir a implementação de um método herdado.', 'c) É a capacidade de uma classe ter vários construtores.', 'd) É a capacidade de uma classe encapsular seus atributos.', 'e) É a capacidade de uma classe criar múltiplas instâncias.', 'b'),
('Qual é o conceito de associação em Programação Orientada a Objetos?', 'a) É uma relação entre classes em que uma classe é parte de outra classe.', 'b) É uma relação entre classes em que uma classe possui outra classe como membro.', 'c) É uma relação entre classes em que uma classe herda outra classe.', 'd) É uma relação entre classes em que uma classe é uma instância de outra classe.', 'e) É uma relação entre classes em que uma classe implementa uma interface.', 'b'),
('O que é sobrecarga de métodos em Programação Orientada a Objetos?', 'a) É a capacidade de uma classe herdar métodos de várias superclasses.', 'b) É a capacidade de uma classe substituir a implementação de um método herdado.', 'c) É a capacidade de uma classe ter vários construtores com diferentes assinaturas.', 'd) É a capacidade de uma classe ocultar a implementação de seus métodos.', 'e) É a capacidade de uma classe criar múltiplas instâncias.', 'c'),
('O que é um construtor em Programação Orientada a Objetos?', 'a) É um método que retorna um valor.', 'b) É um método que inicializa objetos de uma classe.', 'c) É um método que destrói objetos de uma classe.', 'd) É um método que acessa os atributos privados de uma classe.', 'e) É um método que realiza operações matemáticas.', 'b'),
('Qual é a diferença entre uma classe e um objeto em Programação Orientada a Objetos?', 'a) Uma classe é uma instância de um objeto.', 'b) Uma classe é uma estrutura que define atributos e métodos, enquanto um objeto é uma instância dessa estrutura.', 'c) Uma classe é um tipo primitivo em Java, enquanto um objeto não é.', 'd) Uma classe contém apenas métodos, enquanto um objeto contém apenas atributos.', 'e) Uma classe é utilizada para encapsular código, enquanto um objeto é utilizado para encapsular dados.', 'b'),
('O que é composição em Programação Orientada a Objetos?', 'a) É uma forma de relacionamento entre classes em que uma classe é parte de outra classe.', 'b) É uma forma de relacionamento entre classes em que uma classe possui outra classe como membro.', 'c) É uma forma de relacionamento entre classes em que uma classe herda outra classe.', 'd) É uma forma de relacionamento entre classes em que uma classe é uma instância de outra classe.', 'e) É uma forma de relacionamento entre classes em que uma classe implementa uma interface.', 'a'),
('Qual é o objetivo do polimorfismo de sobrescrita em Programação Orientada a Objetos?', 'a) Permitir que uma classe tenha múltiplas formas.', 'b) Permitir que uma classe herde de várias superclasses.', 'c) Permitir que uma classe substitua a implementação de um método herdado.', 'd) Permitir que uma classe tenha vários construtores com diferentes assinaturas.', 'e) Permitir que uma classe tenha métodos com o mesmo nome, mas com diferentes parâmetros.', 'c');




-- -- Questão 18
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'A engenharia de requisitos é uma área que inclui quatro subprocessos relacionados de alto nível. Esses subprocessos são: 1) avaliação se o sistema será útil para a empresa (estudo de viabilidade); 2) obtenção de requisitos (elicitação de requisitos); 3) conversão desses requisitos em alguma forma padrão (especificação); 4) verificação se os requisitos realmente definem o sistema que o cliente deseja (validação). Uma equipe de Tecnologia da Informação de uma empresa de consultoria desenvolverá um software de Suporte Técnico para uma grande empresa fornecedora de equipamentos eletrônicos. O estudo de viabilidade do software já foi realizado e aprovado. A equipe de Tecnologia da Informação seguirá os três subprocessos seguintes de alto nível de engenharia de requisitos descritos no texto de Sommerville, ou seja, os subprocessos de elicitação de requisitos, especificação e validação. Para esses três subprocessos, quais são os artefatos que podem ser utilizados por essa equipe de Tecnologia da Informação?',
--     'Documento de entrevista com usuários; modelo de caso de uso para os requisitos funcionais; prototipação de telas',
--     'Documento de estudo de viabilidade; modelo de caso de uso para os requisitos funcionais; prototipação de telas',
--     'Matriz de rastreabilidade; modelo de caso de uso para os requisitos não-funcionais; prototipação de telas',
--     'Documento de entrevista com usuários; modelo de caso de uso para os requisitos não-funcionais; matriz de rastreabilidade',
--     'Documento de estudo de viabilidade; modelo de caso de uso para os requisitos funcionais; matriz de rastreabilidade',
--     'A'
-- );

-- -- Questão 21
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'No decorrer de um projeto de desenvolvimento de software é compreensível que mudanças venham a ocorrer, sejam por novos entendimentos dos atores envolvidos ou até mesmo de novas demandas apresentadas pelos clientes. Nesta perspectiva, a Gestão de Configuração de Software estabelece um conjunto de atividades para gerenciar alterações através de todo o ciclo de vida de um software. Com base no texto, assinale a opção correta acerca das atividades de gestão de configuração de software.',
--     'Identificação de itens na configuração de software, gerenciamento de alterações, validação de versões e controle de qualidade',
--     'Identificação de objetos na configuração de software, controle de versão, controle de alterações, auditoria de configuração e relatório de status',
--     'Gerência de projeto, gerência de configuração de software, ciclo de vida do projeto, processo de software e evolução das configurações',
--     'Construção de modelo de requisitos, métricas para modelo de projeto, métricas de controle de versão e relatório de manutenção',
--     'Identificação de alterações, controle de versão, mapeamento de alteração e notificação da alteração aos envolvidos',
--     'A'
-- );

-- -- Questão 26
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Empreender em computação não se resume apenas ao fato de ter uma ideia sobre um aplicativo, implementá-la e disponibilizá-la aos seus usuários finais. Esse conceito vai além, é preciso analisar uma série de variáveis, como questões sociais e humanísticas, profissionais, ambientais, legais, políticas e tecnológicas. Dentre as ações necessárias para empreender em computação, é imprescindível observar a legislação vigente. No Brasil, a Lei Geral de Proteção de Dados Pessoais (LGPD), n. 13.709/2018, dispõe sobre o tratamento de dados pessoais, inclusive nos meios digitais, por pessoa natural ou por pessoa jurídica de direito público ou privado, com o objetivo de proteger os direitos fundamentais de liberdade e de privacidade e o livre desenvolvimento da personalidade da pessoa natural. Acerca das providências dispostas no art. 2º da LGPD, assinale os fundamentos da disciplina da proteção de dados pessoais.',
--     'O direito à revogação de um consentimento; a transferência de dados para outro fornecedor de serviços; a solicitação de remoção de dados pessoais; a inviolabilidade da intimidade, da honra e da imagem; o desenvolvimento econômico e tecnológico e inovação; a preservação da vida e da integridade física de uma pessoa',
--     'O direito ao usuário; das obrigações das organizações nacionais ou estrangeiras; obrigatoriedade do consentimento; a livre iniciativa, a livre concorrência e a defesa do consumidor; os direitos humanos, o livre desenvolvimento da personalidade, a dignidade e o exercício da cidadania pelas pessoas naturais e regulação da Autoridade Nacional de Proteção de Dados Pessoais (ANPD)',
--     'O respeito à privacidade; obrigatoriedade do consentimento; os deveres e obrigações dos usuários finais; os deveres e obrigações das organizações nacionais ou estrangeiras; a observação ao código de defesa do consumidor; e, a obrigatoriedade do respeito à honra e à imagem',
--     'O direito ao anonimato; a liberdade de expressão; a inviolabilidade da intimidade; a adoção de medidas preventivas de segurança; o direito ao recurso e revisão; a administração de riscos e falhas; o estabelecimento de agentes de tratamento; e, regulação da Autoridade Nacional de Proteção de Dados Pessoais (ANPD)',
--     'O respeito à privacidade; a autodeterminação informativa; a liberdade de expressão, de informação, de comunicação e de opinião; a inviolabilidade da intimidade, da honra e da imagem; o desenvolvimento econômico e tecnológico e a inovação; a livre iniciativa, a livre concorrência e a defesa do consumidor; e, os direitos humanos, o livre desenvolvimento da personalidade, dignidade e o exercício da cidadania pelas pessoas naturais',
--     'B'
-- );

-- -- Questão 32
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Um modelo de negócios descreve a lógica de criação, entrega e captura de valor por parte de uma organização. A ferramenta de geração de modelo de negócios Canvas, desenvolvida por Osterwalder, tem sido uma das mais utilizadas, principalmente entre as startups. O Canvas é dividido em nove componentes básicos, que cobrem as quatro áreas principais de um negócio: clientes, oferta, infraestrutura e viabilidade financeira. Os componentes são os seguintes: 1) segmentos de clientes; 2) proposta de valor; 3) canais; 4) relacionamento com cliente; 5) fontes de receita; 6) recursos principais; 7) atividades-chave; 8) parcerias principais; e 9) estrutura de custo. Diante deste contexto, conclui-se que as startups',
--     'financeiras desenvolvem primeiro o plano de negócios, para em seguida partir para o Canvas',
--     'de big data utilizam o Canvas para a modelagem da validação da ideia de negócio, ou seja, do problema a ser resolvido',
--     'de educação dispensam a utilização do Canvas, ou seja, os modelos de negócios deste segmento já nascem validados',
--     'de logística utilizam o plano de negócios ao invés do Canvas, ou seja, elas nascem a partir de um produto mínimo viável (MVP)',
--     'de impacto social podem desconsiderar o componente 1 (segmentos de clientes), pois possuem somente um segmento',
--     'B'
-- );

-- -- Questão 34
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Sistemas especialistas são aqueles que fazem uso intensivo do conhecimento especializado para resolver problemas de modo semelhante àquele de um especialista humano. Uma das diversas utilizações de sistemas especialistas é na elaboração de diagnósticos destinados a inferir sobre o mau funcionamento de um sistema, a partir de observações, de modo a prescrever soluções para a anomalia detectada. A medicina, atualmente, já se beneficia do uso de sistemas especialistas em conjunto com técnicas de inferência estatística. Uma das formas de trabalhar com sistemas especialistas é por meio do uso de “regras de produção”, que são instruções do tipo “se - então”. As regras de produção aplicam-se à memória de trabalho, que contém dados, e se tiverem êxito, contribuirão com alguma nova informação para a memória. A metodologia de trabalho de um médico do serviço de emergência inclui a utilização de um sistema especialista para diagnóstico de dengue, para o qual se encontra a seguinte regra de produção. Se ((temperatura > 38º) e (dores musculares intensas)) então (quadro de dengue, com 70% de chance); senão(quadro de resfriado comum com 30% de chance); Levando em conta a regra de produção do sistema especialista utilizado pelo médico, é correto afirmar que',
--     'cada pessoa que procura atendimento apresentando ambos os sintomas, possui a probabilidade “0,7” de estar contaminada pela dengue',
--     'se 50 pessoas procurarem o atendimento apresentando um dos dois sintomas, provavelmente 15 pessoas estarão com resfriado comum',
--     'se 100 pessoas procurarem o atendimento apresentando ambos os sintomas, a quantidade de pessoas com dengue será igual a 70',
--     'cada pessoa que chega apresentando um dos dois sintomas estará com resfriado comum',
--     'a cada 100 pessoas que procuram atendimento, no máximo 30 estarão doentes',
--     'A'
-- );

-- -- Questão 09
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'A etapa de definição de requisitos é voltada para estabelecer quais as funções são requeridas pelo sistema e as restrições sobre a operação e o desenvolvimento do software. Os requisitos de software podem ser classificados como requisitos funcionais e não funcionais. Considerando as informações do texto, assinale a alternativa em que o item é um requisito funcional.',
--     'O software deve ser operacionalizado no sistema Linux',
--     'O tempo de desenvolvimento não deve ultrapassar seis meses',
--     'O software deve emitir relatórios de compras a cada quinze dias',
--     'O tempo de resposta do sistema não deve ultrapassar 30 segundos',
--     'A base de dados deve ser protegida para acesso apenas de usuários autorizados',
--     'C'
-- );

-- -- Questão 13
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Considere que as variáveis pilha e fila correspondem, respectivamente, às estruturas de dados do tipo Pilha e Fila. Para testar as duas estruturas, um programador realizou a série de operações a seguir. Pilha pilha = new Pilha(); Fila fila = new Fila(); pilha.push(‘A’); pilha.push(‘B’); pilha.push(‘C’); fila.enqueue(pilha.top()); fila.enqueue(pilha.top()); fila.enqueue(‘D’); pilha.push(fila.dequeue()); fila.enqueue(fila.dequeue()); fila.enqueue(pilha.pop()); pilha.push(‘E’); fila.enqueue(‘E’); pilha.pop(); Após essas operações, ao imprimir o conteúdo de pilha e fila, respectivamente, seria exibido:',
--     'pilha: topo → C → A → E. fila: início → D → A → A → E.',
--     'pilha: topo →A. fila: início → D → B → C → E.',
--     'pilha: topo → C → B → A. fila: início → D → C → C → E.',
--     'pilha: topo → B → A. fila: início → D → B → C → E.',
--     'pilha: topo → C → B → A. fila: início → D → B → C → E.',
--     'E'
-- );

-- -- Questão 14
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Um projeto de integração de um ERP com um CRM não implementou todos os serviços esperados e há falhas nos serviços já implementados. Uma auditoria avaliou a situação e identificou que há desentendimentos entre os membros da equipe; os membros da qualidade não compreendem o que deve ser avaliado; demandas de novos solicitantes aparecem constantemente; e o patrocinador demora muito a responder às solicitações da equipe. Tudo isso fez com que o projeto ficasse bastante atrasado e com orçamento excedido. Considerando o cenário descrito, o gerente de projeto deve priorizar o gerenciamento de',
--     'custo',
--     'tempo',
--     'escopo',
--     'qualidade',
--     'partes interessadas',
--     'E'
-- );
-- -- Questão 28
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'O modo clássico de encarar um sistema operacional é como um gerenciador de recursos. Desse ponto de vista, o sistema operacional é responsável pelo hardware do sistema. Nesse papel, ele recebe solicitações de acesso a recursos por parte das aplicações e concede ou nega tais acessos. Ao conceder solicitações de alocação, ele deve dispor com cuidado os recursos, de modo que os programas não interfiram uns nos outros. Por exemplo, é uma péssima ideia permitir que os programas tenham acesso sem restrição à memória uns dos outros. Se um programa com defeito (ou malicioso) escreve no espaço de memória do outro programa, o segundo programa travará, na melhor das hipóteses, ou produzirá resultados incorretos, na pior das hipóteses. Ou ainda, se o programa ofensivo modificar a memória do sistema operacional poderá afetar o comportamento de todo o sistema. Considerando que o texto alerta para a possibilidade de um programa interferir no outro, a atividade que um sistema operacional garante essa proteção é',
--     'o gerenciamento de memória',
--     'o programa antivírus',
--     'o gerenciamento de arquivos',
--     'o gerenciamento de processos',
--     'o gerenciamento de entrada e saída',
--     'A'
-- );

-- -- Questão 22
-- INSERT INTO exam (question, option1, option2, option3, option4, option5, answer)
-- VALUES (
--     'Um ponto importante para fábricas de software é a garantia de que seus produtos e/ou serviços acompanhem as diversas mudanças ocasionadas pelo mundo corporativo. As restrições de orçamento ou cronograma, reestruturação do negócio, modificações de regras de negócio ou novas necessidades do cliente, geram mudanças inevitáveis. Nesse cenário, a utilização de um processo de Gerência de Configuração de Software (GCS) que contemple características necessárias para gerenciar e controlar a evolução de um software, através do controle formal de versão e solicitação de mudanças, é extremamente importante. Sobre o processo de Gerência de Configuração de Software (GCS), avalie as afirmações a seguir. I. O controle de versão possibilita o compartilhamento de dados e a edição colaborativa, permitindo a gestão de diferentes ramos de desenvolvimento e possibilitando a existência de diferentes versões de forma simultânea. II. A auditoria de configuração é uma atividade de garantia de qualidade do sistema que tem por objetivo assegurar que a qualidade do software seja mantida quando feitas alterações requisitadas. III. O relatório de status de configuração possui informações sobre o GCS, tendo por objetivo manter o cliente informado sobre as alterações, e deve ser gerado ao final do processo. IV. A GCS proporciona um conjunto de atividades de acompanhamento e controle de mudanças que é iniciado logo depois que o software for fornecido ao cliente e colocado em operação. É correto apenas o que se afirma em',
--     'I e II',
--     'II e III',
--     'III e IV',
--     'I, II e IV',
--     'I, III e IV',
--     'D'
-- );
