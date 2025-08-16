package Aula07;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bal, amt, ch=0;
        System.out.println("Enter current balance");
        bal=s.nextInt();
        do {
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. display balance ");
            System.out.println("4. exit");
            ch = s.nextInt();


            switch (ch){
                case 1:  System.out.println("Enter amount to deposit");
                amt = s.nextInt();
                bal += amt; break;
                case 2: System.out.println("Enter amount to withdraw");
                amt = s.nextInt();
                if (amt > bal){
                    System.out.println("Insuficinte balence");
                }else {
                    bal -= amt;
                }break;
                //bal -= amt; break;
                case 3: System.out.println("Current balance: "+bal);break;
                case 4: System.out.println("Thank you for baking!");break;
                default:
                    System.out.println("invalid choice");




            }


        }while(ch != 4);
    }
}
