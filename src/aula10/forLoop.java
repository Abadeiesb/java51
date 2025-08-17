package aula10;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int f = 1;
        for(int i=n;i>=1;i--){
            f = f * i; //f = 1 * 5 f = 5 * 4 = 20 f= 20 * 3 = 60 f=60 f= 60 = 120 f= 120 * 1 = 120
            System.out.println("indice: "+i);
            System.out.println("factorial: "+f);
        }
       // System.out.println(f);


    }
}
