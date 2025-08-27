package aula10.Challegers;


import java.util.Scanner;

public class GerenteDePrimos {

    public static int ObterNumero(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args){
        Scanner scannerInput = new Scanner(System.in);
        int num1 = ObterNumero(scannerInput,"Digite o primeiro número primo: ");
    }


}