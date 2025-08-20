package aula10.Challegers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int scannerInput;
        int scannerInput2;
        int result = 0;
        boolean tru = true;
        do {
            System.out.println("Enter a number 1: ");
            scannerInput = s.nextInt();
            System.out.println("Enter a number 2: ");
            scannerInput2 = s.nextInt();
            if (scannerInput <= 1 && scannerInput2 <= 1) {
                tru = false;
            } else if (scannerInput == 2 && scannerInput2 == 2) {
                System.out.println("It's a prime number!");
                tru = true;

            } else {
                for (int i = 2; i < scannerInput; i++) {
                    if (scannerInput % i == 0) {

                    }
                    for (int j = 2; j < scannerInput2; j++) {
                        if (scannerInput2 % j == 0) {
                            tru = false;
                            break;
                        }
                    }
                }

            }

        } while (!tru);
    }
}