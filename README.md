# Exercícios de Java - Projeto de Orientação a Objetos

Este repositório contém uma série de exercícios resolvidos em Java, elaborados como parte do processo de aprendizado e prática em programação orientada a objetos. Cada exercício está organizado em um pacote separado, seguindo uma estrutura que facilita a compreensão e revisão do código.


## Exercícios

- **O que é esse número?**
    
    Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    
    ```java
    // Exemplos de Saída
    -5 é ímpar e negativo.
    10 é par e positivo.
    ```
    
- **Fibonacci**
    
    Dado um número inteiro `x`, imprima uma sequência de Fibonacci de tamanho `x`.
    
    ```java
    // Exemplo de saída para uma sequência de tamanho 5
    0 1 1 2 3
    
    // Exemplo de saída para uma sequência de tamanho 10
    0 1 1 2 3 5 8 13 21 34
    
    // Exemplo de saída para uma sequência de tamanho 10
    0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
    ```
    
- **MultiplicaAí**
    
    Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome `Tabela de multiplicação de X`, onde X é o número a ser multiplicado.
    
    ```java
    // Exemplo de saída
    Tabela de multiplicação por 5
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    ```
    
- **Pirâmide de números**
    
    Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento. 
    
    Por exemplo, se a sua iteração for de 5 elementos, o resultado final ficaria assim:
    
    ```java
    1
    22
    333
    4444
    55555
    ```
    
- **Duplicados não!**
    
    Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.
    
    ```java
    // Exemplo com as seguintes entradas:
    
    array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
    array2 => "Manga", "Caqui", "Morango", "Amora"
    
    // A saída seria:
    Morango
    Caqui
    ```
    
- **Holidayzer**
    
    Vamos criar uma aplicação Java que será um calendário de feriados! Para isso, queremos:
    
    - Uma função que imprime a lista com todos os feriados
    - Uma função que recebe uma data como parâmerto e retorna uma mensagem.
        - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
        - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”
    - Os feriados devem ser objetos criados a partir de uma classe. Lembre-se de utilizar o conceito de encapsulamento (com `getters` e `setters` conforme a necessidade).
    - Utilize mais parâmetros e funções caso sinta necessidade.
    
    - 📅 Lista de Feriados
        
        ```java
        "01-01-2024" => "Confraternização Mundial"
        "12-02-2024" => "Carnaval"
        "13-02-2024" => "Carnaval"
        "29-03-2024" => "Sexta-feira Santa"
        "21-04-2024" => "Tiradentes"
        "01-05-2024" => "Dia do Trabalho"
        "30-05-2024" => "Corpus Christi"
        "07-09-2024" => "Independência do Brasil"
        "12-10-2024" => "Nossa Senhora Aparecida"
        "02-11-2024" => "Finados"
        "15-11-2024" => "Proclamação da República"
        "20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
        "25-12-2024" => "Natal"
        ```
        
    - 💡 Dicas
        - Para criar uma função na classe App ⇒ `public static <tipo> <nome-da-funcao> (params) { … }`
        - Para criar uma variável que pode ser usada globalmente no App, adicione a palavra static antes da declaração ⇒ Ex: `static int numero = 5;`
        - Essas dicas são necessárias pois o método `main()` precisa ser estático 😄
- **APItização dos Feriados**
    
    Transforme o exercício anterior em uma API! As rotas à seguir são correspondentes às funções descritas:
    
    - **GET** `/holidays`
    - **GET** `/holidays/:date` (data no formato `30-05-2024`)

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **src**: Contém o código-fonte dos exercícios.

## Como Usar

Para usar este projeto, siga as etapas abaixo:

1. Clone este repositório em sua máquina local.
   
   git clone https://github.com/leopsam/oo-java-exercise.git

3. Abra o projeto em sua IDE Java preferida.
4. Navegue até os pacotes correspondentes aos exercícios que deseja revisar.
5. Execute os exercícios e verifique os resultados.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias ou adicionar novos exercícios através de pull requests.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
