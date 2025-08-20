package Aula07;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Escreve a fruta: ");
        //String fruta = scanner.next();

       /* switch (fruta) {
            case "banana":
                System.out.println("A fruta é uma banana");
                break;
            case "maçã":
                System.out.println("A fruta é uma maçã");
                break;

            default:
                System.out.println("Isso nem é fruta.");
                break;
        }*/

        //int nm1;
        //int nm2;
        double calc = 0;
        System.out.println("Escreve os números: ");
        System.out.println("número 1: ");
        double result1 = scanner.nextDouble();
        System.out.println("número 2: ");
        double result2 = scanner.nextDouble();
        System.out.println("Escolha uma opção: ");
        System.out.println("Soma 1: ");
        System.out.println("Divisão 2: ");
        int somaDosResults = scanner.nextInt();
        //int resultResposta = result1 + result2;


        switch (somaDosResults) {
            case 1:
               calc = result1 + result2;
                break;
            case 2:
                calc = result1 / result2;
                break;

            default:
                System.out.println("Também não complica, né!!");
                break;
        }

        System.out.println(calc);





    }

}
