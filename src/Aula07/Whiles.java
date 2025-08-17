package Aula07;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        //Scanner s =  new Scanner(System.in);
        sout("Enter 5 numbers ");
        //int inputNumber=0;

        int loop = whilee();
        sout("Valor da soma é: " + loop);
        //System.out.println(" Valor da soma é: "+loop);
    }

    static int whilee() {
        Scanner s2 = new Scanner(System.in);
        System.out.println("soma 1: ");
        int number1= s2.nextInt();
        System.out.println("soma 2: ");
        int number2= s2.nextInt();
        System.out.println("soma 3: ");
        int number3= s2.nextInt();
        System.out.println("soma 4: ");
        int number4= s2.nextInt();
        System.out.println("soma 5: ");
        int number5= s2.nextInt();
        int i=1;
        int sum= number1 + number2 + number3 + number4 + number5;

           // System.out.println(sum);

        return sum;
    }

    static void sout (String texto){
        System.out.println(texto);


    }
}
