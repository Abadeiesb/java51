package Aula07;

import java.util.Scanner;

public class Scanners {
    int age;

    public static void main(String[] args) {
        Scanners s = new Scanners();

        int reciveSAage = s.age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age:");
        int age = scanner.nextInt();
        reciveSAage = age;
        System.out.println("Your age is :"+reciveSAage);


    }
}
