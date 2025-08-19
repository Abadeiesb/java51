package aula10.Challegers;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        //1  O objetivo é criar um programa em Java que exiba as tabuadas de 1 a 10.
        Scanner w = new Scanner(System.in);
        int soma=1;
        int total=0;
        int inputValue1 = w.nextInt();
        //nt inputValue2 = w.nextInt();
        for(int i=1; i<=10; i++){
          total = inputValue1 * i;

            System.out.println(inputValue1+" x " + i  + " = "+ total);

        }
        System.out.println(soma);
    }
}
