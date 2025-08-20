package aula10.Challegers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int scannerInput;
        int result=0;
        boolean tru=true;
        do {
            System.out.println("Enter a number: ");
            scannerInput=s.nextInt();
            if(scannerInput <=1){
                tru=false;
            } else if (scannerInput == 2) {
                System.out.println("It's a prime number!");
                tru=true;

            }else{
                for(int i=2; i < scannerInput;i++){
                    if(scannerInput % i ==0){
                        tru=false;
                    }
                }
            }
        }while(tru==false);
    }
}
