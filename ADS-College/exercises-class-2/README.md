## Aula 2

Essa pasta contém atividades da segunda aula da matéria de Programação Orientada a Objetos com Java, no curso de Análise e Desenvolvimento de Sistemas, na UNINTER.

### Sobre a Matéria

Programação Orientada a Objetos com Java é uma disciplina que aborda os conceitos fundamentais da programação orientada a objetos utilizando a linguagem Java. Os alunos aprendem sobre classes, objetos, herança, polimorfismo, encapsulamento, entre outros conceitos essenciais.

### Exercícios

#### Ex01

Crie uma classe Avaliacao, com três atributos reais chamados nota1, nota2, nota3 e crie dois metódos para calcular e retornar diferentes tipos de médida.
 - Média aritmética
 - Média ponderada (peso 2, 3 e 4)

Arquivo: `/ex01/App.java`

#### Ex02

- Crie uma classe Aluno com atributos string nome, curso. Crie também um atributo da classe Avaliacao. Cada aluno deve ter uma Avaliacao associada. Crie uma mensagem que imprima as informações completas desse aluno.

Arquivo: `/ex02/App.java`

#### Ex03

- Crie uma classe Conta para administrar contas correntes de um banco.
    - int numero
    - String titular
    - float saldo
    - float limite
- Crie os métodos:
    - bool sacar()
    - bool depositar()
    - void info()

Arquivo: `/ex03/App.java`

#### Ex04

- Complete o exercício anterior criando um metódo de transferir que receba uma conta destino e um valor.

Arquivo: `/ex03/App.java`

### Como executar

1. **Compile todas as classes**:<br>
   Navegue até o diretório raiz do projeto `.../java-get-started/ADS-College/exercises-class-2` e compile todas as classes Java no pacote `ex02`:

   ```sh
   javac -d bin src/ex01/*.java
   javac -d bin src/ex02/*.java
   javac -d bin src/ex03/*.java
   ```

2. **Execute a classe principal**:<br>
    Após a compilação, execute a classe principal App a partir do diretório raiz do projeto, especificando o pacote correspondente:

    ```sh
    java -cp bin ex01.App
    java -cp bin ex02.App
    java -cp bin ex03.App
    ```   

### Estrutura de Pastas

O workspace contém duas pastas por padrão, onde:

- `src`: a pasta para manter os códigos-fonte
- `lib`: a pasta para manter as dependências

Enquanto isso, os arquivos compilados serão gerados na pasta `bin` por padrão.

> Se você quiser personalizar a estrutura de pastas, abra `.vscode/settings.json` e atualize as configurações relacionadas lá.
