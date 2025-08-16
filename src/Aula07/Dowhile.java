package Aula07;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bal, amt, ch=0;
        bal=s.nextInt();
        do {
            System.out.println("1. withdraw");
            System.out.println("2. display balance");
            System.out.println("3. deposit");
            System.out.println("4. exit");

        }while(ch != 4);
    }
}
