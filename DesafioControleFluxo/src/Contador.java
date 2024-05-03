import java.util.Scanner;

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

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O parâmetroUm é maior que o parâmetroDois");
    }
    for (int i = parametroUm; i <= parametroDois; i++) {
        System.out.println("Imprimindo o número " + i);
    }
    System.out.println("Quantidade de iterações: " + (parametroDois - parametroUm + 1));
}
