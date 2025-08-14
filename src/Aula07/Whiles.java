package Aula07;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int n, i=1,sum=0;

        while(i <= 5){
            System.out.println("Input the number: ");
            n = s.nextInt();
             sum = sum + n;
             i += 1;/*

             0 = 0 + 1
             1 = 1 + 2
             3 = 3 + 3
             6 = 6 + 4
             10 = 10 + 5 = 15


             */
        }
        System.out.println(sum);
    }
}
