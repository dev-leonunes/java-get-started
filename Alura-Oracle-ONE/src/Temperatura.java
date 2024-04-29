// # 5
// Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
// Utilize variáveis para representar os valores das temperaturas e imprima no
// console o valor convertido de Celsius para Fahrenheit.

// Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é:
// (temperatura * 1.8) + 32.

// Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
// crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.

public class Temperatura {
    public static void main(String[] args) {
        double celsius = 29.2;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = """
                Temperatura em graus Celcius: %.1f °C
                Temperatura em Fahrenheit: %.2f °F
                """.formatted(celsius, fahrenheit);

        System.out.println(mensagem);

        int fahrenheitInteira = (int) fahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenheitInteira + " °F");
    }
}
