package Aula07;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreve a fruta: ");
        String fruta = scanner.next();

        switch (fruta) {
            case "banana":
                System.out.println("A fruta é uma banana");
                break;
            case "maçã":
                System.out.println("A fruta é uma maçã");
                break;

            default:
                System.out.println("Isso nem é fruta.");
                break;
        }



    }

}
