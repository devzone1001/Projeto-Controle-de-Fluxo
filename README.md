
# Documentação: Contador

## Visão Geral

Este programa em Java solicita dois números inteiros ao usuário e imprime todos os números no intervalo entre esses dois números, incluindo eles próprios. Ele também inclui uma exceção personalizada, ParametrosInvalidosException, que é lançada quando os parâmetros fornecidos pelo usuário não estão corretos.

## Funcionamento

1. **Entrada de Dados:** Solicita ao usuário dois números inteiros através do terminal.
2. **Verificação de Parâmetros:** Verifica se o primeiro parâmetro é maior que o segundo. Se não for, lança a exceção ParametrosInvalidosException.
3. **Iteração e Impressão:** Imprime todos os números no intervalo especificado e exibe a quantidade de iterações.

## Método Principal

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
```


## Método Contar

```

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo.");
    }
    for (int i = parametroUm; i <= parametroDois; i++) {
        System.out.println("Imprimindo o número " + i);
    }
    System.out.println("Quantidade de iterações: " + (parametroDois - parametroUm + 1));
}

```


## Exceção Personalizada

```
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

```


## Contribuições

Sinta-se à vontade para contribuir com melhorias neste código! Se você encontrar bugs, problemas ou sugestões de novos recursos, por favor, abra um issue ou envie um pull request para o repositório no GitHub. Juntos podemos tornar este programa ainda melhor!
