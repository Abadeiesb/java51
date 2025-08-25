package aula10.Challegers;

import java.util.Scanner;

public class GerenteDePrimos {

    // 1. Responsabilidade: Interagir com o usuário e obter um número.
    public static int obterNumero(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    // 2. Responsabilidade: Validar se um número é primo.
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 3. Responsabilidade: Realizar a soma de dois números.
    public static int somarNumeros(int num1, int num2) {
        return num1 + num2;
    }

    // 4. Responsabilidade: Exibir o resultado ou uma mensagem de erro.
    public static void exibirResultado(int num1, int num2) {
        if (ehPrimo(num1) && ehPrimo(num2)) {
            int soma = somarNumeros(num1, num2);
            System.out.printf("✅ Ambos os números são primos. A soma é: %d%n", soma);
        } else {
            System.out.println("❌ Pelo menos um dos números não é primo. Tente novamente.");
        }
    }

    // O método main é o "gerente". Sua responsabilidade é coordenar as operações.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soma de Números Primos");

        while (true) {
            System.out.println("-------------------------------------");

            // O main só chama os métodos de ação
            int num1 = obterNumero(scanner, "Digite o primeiro número (ou 0 para sair):");
            if (num1 == 0) {
                System.out.println("Programa encerrado. Até mais! 👋");
                break;
            }

            int num2 = obterNumero(scanner, "Digite o segundo número:");

            exibirResultado(num1, num2);
        }

        scanner.close();
    }
}